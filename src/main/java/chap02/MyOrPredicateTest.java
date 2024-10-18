package chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyOrPredicateTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "", "***", "", "***");
        List<String> myListOfString = new ArrayList<>(list);

        MyPredicate<String> isEmpty = s -> s.isEmpty();
        MyPredicate<String> isCorrupted = s -> s.contains("*");
        MyPredicate<String> makeNull = null;

        MyPredicate<String> isEmptyOrCorrupted = isEmpty.or(isCorrupted);
        list.forEach(s -> System.out.println(s + ": " + isEmptyOrCorrupted.test(s)));
    }
}
