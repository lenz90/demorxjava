package pe.com.reactivex.lenz.demorxjava.basic;


import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class OperadoresDemo {
    public static void main(String... args) {

//        Observable<String> source =
//                Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                        "Epsilon");
//        Observer<Integer> myObserver = new Observer<Integer>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//            @Override
//            public void onNext(Integer value) {
//                System.out.println("RECEIVED: " + value);
//            }
//            @Override
//            public void onError(Throwable e) {
//                e.printStackTrace();
//            }
//            @Override
//            public void onComplete() {
//                System.out.println("Done!");
//            }
//        };
//        source.map(String::length).filter(i -> i >= 5)
//                .subscribe(myObserver);

        /****************************************
         ******* Operadores de creación**********
         *****************************************/

        //Range
//        Observable.range(1,10)
//                .subscribe(s -> System.out.println("Numero: " + s));
        //Interval
//        Observable.interval(1, TimeUnit.SECONDS)
//                .subscribe(s -> System.out.println(s+1 + "º Segundo"));
//        sleep(5000);
        //Interval - 2
//        Observable<Long> seconds = Observable.interval(1,
//                TimeUnit.SECONDS);
//        //Observer 1
//        seconds.subscribe(l -> System.out.println("Observer 1: " + l));
//        //sleep 5 seconds
//        sleep(5000);
//        //Observer 2
//        seconds.subscribe(l -> System.out.println("Observer 2: " + l));
//        //sleep 5 seconds
//        sleep(5000);
        //Interval - Conectable Observable
//        ConnectableObservable<Long> seconds =
//                Observable.interval(1, TimeUnit.SECONDS).publish();
//        //observer 1
//        seconds.subscribe(l -> System.out.println("Observer 1: " + l));
//        seconds.connect();
//        //sleep 5 seconds
//        sleep(5000);
//        //observer 2
//        seconds.subscribe(l -> System.out.println("Observer 2: " + l));
//        sleep(5000);

        //SINGLE MAYBE COMPLETABLE


        /****************************************
         ******* Operadores de supresion**********
         *****************************************/


        //filter
//        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
//                .filter(s -> s.length() != 5)
//                .subscribe(s -> System.out.println("RECEIVED: " + s));

        //take
//        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
//                .take(3)
//                .subscribe(s -> System.out.println("RECEIVED: " + s));

        //take - 2
//        Observable.interval(300, TimeUnit.MILLISECONDS)
//                .take(5, TimeUnit.SECONDS)
//                .subscribe(i -> System.out.println("RECEIVED: " + i));
//        sleep(5000);

        //Skip
//        Observable.range(1, 100)
//                .skip(90)
//                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //takeWhile
//        Observable.range(1, 100)
//                .takeWhile(i -> i < 5)
//                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //SkipWhile
//        Observable.range(1, 100)
//                .skipWhile(i -> i <= 95)
//                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //distinct
//        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
//                .map(String::length)
//                .distinct()
//                .subscribe(i -> System.out.println("RECEIVED: " + i));
        //distinct - 2
//        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
//                .distinct(String::length)
//                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //distinctUntilChanged
//        Observable.just(1, 1, 1, 2, 2, 3, 3, 2, 1, 1)
//                .distinctUntilChanged()
//                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //elementAt
//        Observable.just("Alpha", "Beta", "Zeta", "Eta", "Gamma",
//                "Delta")
//                .elementAt(7)
//                .subscribe(i -> System.out.println("RECEIVED: " + i));


        /*****************************************
         ******* Operadores de transformacion*****
         *****************************************/

        //Map
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
//        Observable.just("1/3/2016", "5/9/2016", "10/12/2016")
//                .map(s -> LocalDate.parse(s, dtf))
//                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //startWith
//        Observable<String> menu =
//                Observable.just("Coffee", "Tea", "Espresso", "Latte");
//        menu.startWith("COFFEE SHOP MENU")
//        //menu.startWithArray("COFFEE SHOP MENU","----------------")
//                .subscribe(System.out::println);

        //defaultIfEmpty
//        Observable<String> items =
//                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
//        items.filter(s -> s.startsWith("Z"))
//                .defaultIfEmpty("None")
//                .subscribe(System.out::println);
        //switchIfEmpty
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon")
//                .filter(s -> s.startsWith("Z"))
//                .switchIfEmpty(Observable.just("Zeta", "Eta", "Theta"))
//                .subscribe(i -> System.out.println("RECEIVED: " + i),
//                        e -> System.out.println("RECEIVED ERROR: " + e)
//                );

        //sorted
//        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
//                .sorted()
//                .subscribe(System.out::println);
        //sorted - 2
//        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
//                .sorted(Comparator.reverseOrder())
//                .subscribe(System.out::println);
        //sorted - 3
//        Observable.just("Alpha", "Beta", "Gamma" ,"Delta",
//                "Epsilon")
//                .sorted((x,y) -> Integer.compare(x.length(), y.length()))
//                .subscribe(System.out::println);
        //Delay
//        Observable.just("Alpha", "Beta", "Gamma" ,"Delta",
//                "Epsilon")
//                .delay(4, TimeUnit.SECONDS)
//                .subscribe(s -> System.out.println("Received: " + s));
//        sleep(5000);

        //repeat
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon").repeat(2)
//                .subscribe(s -> System.out.println("Received: " + s));

        //scan
//        Observable.just(5, 3, 7, 10, 2, 14)
//                .scan((accumulator, next) -> accumulator + next)
//                .subscribe(s -> System.out.println("Received: " + s));

        /*****************************************
         ******* Operadores de reduccion*****
         *****************************************/

        //count
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon")
//                .count()
//                .subscribe(s -> System.out.println("Received: " + s));

        //reduce
//        Observable.just(5, 3, 7, 10, 2, 14)
//                .reduce((total, next) -> total + next)
//                .subscribe(s -> System.out.println("Received: " + s));

        //all
//        Observable.just(5, 3, 7, 11, 2, 14)
//                .all(i -> i < 10)
//                .subscribe(s -> System.out.println("Received: " + s));

        //any
//        Observable.just("2016-01-01", "2016-05-02", "2016-09-12", "2016-04-03")
//                .map(LocalDate::parse)
//                .any(dt -> dt.getMonthValue() >= 6)
//                .subscribe(s -> System.out.println("Received: " + s));

        //contains
//        Observable.range(1,10000)
//                .contains(9563)
//                .subscribe(s -> System.out.println("Received: " + s));

        /*****************************************
         ******* Operadores de coleccion*****
         *****************************************/

        //toList
//        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
//                .toList()
//                .subscribe(s -> System.out.println("Received: " + s));

        //toSortedList
//        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
//                .toSortedList()
//                .subscribe(s -> System.out.println("Received: " + s));

        //toMap
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon")
//                .toMap(s -> s.charAt(0))
//                .subscribe(s -> System.out.println("Received: " + s));

        //ToMultimap
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon")
//                .toMultimap(String::length)
//                .subscribe(s -> System.out.println("Received: " + s));


        /**************************************************
         ******* Operadores de recuperación de errores*****
         *************************************************/

        //onErrorReturn y onErrorReturnItem
//        Observable.just(5, 2, 4, 0, 3, 2, 8)
//                .map(i -> 10 / i)
//                .onErrorReturnItem(-1)
//                .subscribe(i -> System.out.println("RECEIVED: " + i),
//                        e -> System.out.println("RECEIVED ERROR: " + e));

        //onErrorResumeNext
//        Observable.just(5, 2, 4, 0, 3, 2, 8)
//                .map(i -> 10 / i)
//                .onErrorResumeNext(Observable.just(-1).repeat(3))
//                .subscribe(i -> System.out.println("RECEIVED: " + i),
//                        e -> System.out.println("RECEIVED ERROR: " + e));

        /***********************************
         ******* Operadores de accion*******
         ***********************************/

        //doOnNext
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon")
//                .doOnNext(s -> System.out.println("Processing: " + s))
//                .map(String::length)
//                .subscribe(i -> System.out.println("Received: " + i));

        //doOnComplete
//        Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                "Epsilon")
//                .doOnComplete(() -> System.out.println("Source is done emitting!"))
//                .map(String::length)
//                .subscribe(i -> System.out.println("Received: " + i));

        //doOnError
//        Observable.just(5, 2, 4, 0, 3, 2, 8)
//                .doOnError(e -> System.out.println("Source failed!"))
//                .map(i -> 10 / i)
//                .doOnError(e -> System.out.println("Division failed!"))
//                .subscribe(i -> System.out.println("RECEIVED: " + i),
//                        e -> System.out.println("RECEIVED ERROR: " + e)
//                );

        //doOnSuccess, doOnDispose, doOnSubscribe

        /***********************************
         ******* Operadores de combinacion*******
         ***********************************/
        //merge() y mergeWith()
//        Observable<String> source1 =
//                Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                        "Epsilon");
//        Observable<String> source2 =
//                Observable.just("Zeta", "Eta", "Theta");
//        Observable.merge(source1, source2)
//                .subscribe(i -> System.out.println("RECEIVED: " + i));

        //flatMap

//        Observable<String> source =
//                Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                        "Epsilon");
//        source.flatMap(s -> Observable.fromArray(s.split("")))
//                .subscribe(System.out::println);

        //Concat y ConcatMap

        //Amb - ambiguo - win the first

//        Observable<String> source1 =
//                Observable.interval(1, TimeUnit.SECONDS)
//                        .take(2)
//                        .map(l -> l + 1)
//                        .map(l -> "Source1: " + l + " seconds");
//
//        Observable<String> source2 =
//                Observable.interval(300, TimeUnit.MILLISECONDS)
//                        .map(l -> (l + 1) * 300)
//                        .map(l -> "Source2: " + l + "  milliseconds");
//
//        Observable.amb(Arrays.asList(source1, source2))
//                .subscribe(i -> System.out.println("RECEIVED: " + i));
//
//        sleep(5000);
        //Zip - ZipWith

//        Observable<String> source1 =
//                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
//
//        Observable<Integer> source2 = Observable.range(1,6);
//
//        Observable.zip(source1, source2, (s,i) -> s + "-" + i)
//                .subscribe(System.out::println);

        //groupBy
//        Observable<String> source =
//                Observable.just("Alpha", "Beta", "Gamma", "Delta",
//                        "Epsilon");
//        Observable<GroupedObservable<Integer,String>> byLengths =
//                source.groupBy(s -> s.length());
//
//        byLengths.flatMapSingle(grp -> grp.toList())
//                .subscribe(System.out::println);

    }


    public static int randomInt() {
        return ThreadLocalRandom.current().nextInt(100000);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
