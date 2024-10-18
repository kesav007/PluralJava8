package chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyAndPredicateTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "", "***", "", "***");
        List<String> myListOfString = new ArrayList<>(list);
        myListOfString.add(null);
        myListOfString.add(null);
        MyPredicate<String> isNotEmpty = s -> !s.isEmpty();
        MyPredicate<String> isNotNull = s -> null != s;
        MyPredicate<String> makeNull = null;

        MyPredicate<String> isNotEmptyAndNotNull = isNotNull.and(isNotEmpty);
        myListOfString.forEach(s -> System.out.println(s + ": " + isNotEmptyAndNotNull.test(s)));
    }
}
