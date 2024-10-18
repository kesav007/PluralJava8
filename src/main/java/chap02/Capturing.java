package chap02;

import java.util.ArrayList;
import java.util.List;

public class Capturing {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        var ints = List.of(0, 1, 2, 3, 4);
        var counter = new Object(){int counter = 0;};
        ints.forEach((Integer i ) -> {
            strings.add(Integer.toString(i));
            counter.counter++;
        });
        strings.add("Hello");
        System.out.println(strings);
        System.out.println(counter.counter);
    }
}
