package chap02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MyConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1 , 2, 3);
        MyConsumer<Integer> myConsumer = (i) -> System.out.println(i);
//        list.forEach(i -> System.out.println(i));

        var map = Map.of(1, "One", 2, "Two", 3, "Three");
//        map.forEach((key, value) -> System.out.println(key + "::" + value));

        MyConsumer<String> print1 = s -> System.out.println("C1: " + s);
        MyConsumer<String> print2 = s -> System.out.println("C2: " + s);

        print1.accept("one");
        print2.accept("two");
        MyConsumer<String> print1AndThenPrint2 = print1.andThen(print2);
        print1AndThenPrint2.accept("ONE");
    }
}
