package chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotMyPredicate {
    public static void main(String[] args) {

        var strings = List.of("One", "", "Two", "", "Three", "", "Four", "Five");
        List<String> myListOfString = new ArrayList<>(strings);
        MyPredicate<String> isEmpty = (s) -> s.isEmpty();
        MyPredicate<String> isNotEmpty = isEmpty.not();
        myListOfString.forEach(s -> System.out.println(s + ": " + isNotEmpty.test(s)));

    }
}
