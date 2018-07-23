package pe.com.reactivex.lenz.demorxjava.basic;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.ThreadLocalRandom;

public class ConcurrenciaDemo {
    public static void main(String... arg){

        //Intro - onSubs
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon").subscribeOn(Schedulers.computation())
//                .map(s -> intenseCalculation((s)))
//                .subscribe(System.out::println);
//
//        Observable.range(1,6).subscribeOn(Schedulers.computation())
//                .map(s -> intenseCalculation((s)))
//                .subscribe(System.out::println);
//
//        sleep(20000);

        //Ejemplo Zip

//        Observable<String> source1 =
//                Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                        "Epsilon")
//                        .subscribeOn(Schedulers.computation())
//                        .map(s -> intenseCalculation((s)));
//        Observable<Integer> source2 =
//                Observable.range(1,6)
//                        .subscribeOn(Schedulers.computation())
//                        .map(s -> intenseCalculation((s)));
//        Observable.zip(source1, source2, (s,i) -> s + "-" + i)
//                .subscribe(System.out::println);
//        sleep(20000);


        //Happens on IO Scheduler
        Observable.just("WHISKEY/27653/TANGO", "6555/BRAVO",
                "232352/5675675/FOXTROT")
                .subscribeOn(Schedulers.io())
                .flatMap(s -> Observable.fromArray(s.split("/")))
                .doOnNext(s -> System.out.println("Split out " + s
                        + " on thread "
                        + Thread.currentThread().getName()))
                //Happens on Computation Scheduler
                .observeOn(Schedulers.computation())
                .filter(s -> s.matches("[0-9]+"))
                .map(Integer::valueOf)
                .reduce((total, next) -> total + next)
                .doOnSuccess(i -> System.out.println("Calculated sum " + i + " on thread "
                                + Thread.currentThread().getName()))
                //Switch back to IO Scheduler
                .observeOn(Schedulers.io())
                .map(i -> i.toString())
                .doOnSuccess(s -> System.out.println("Writing " + s + " to file on thread "
                        + Thread.currentThread().getName()))
                .subscribe(s ->
                        write(s,"\\output.txt"));
        sleep(1000);
    }


    public static void write(String text, String path) {
        BufferedWriter writer = null;
        try {
            //create a temporary file
            File file = new File(path);
            writer = new BufferedWriter(new FileWriter(file));
            writer.append(text);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {

    }}}

    public static <T> T intenseCalculation(T value) {
        sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
