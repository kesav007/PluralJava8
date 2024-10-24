package chap02;

import java.util.List;

public class ChainFunction {
    public static void main(String[] args) {
        var strings = List.of("one", "two", "three", "four", "five");
        MyFunction<String, String> toUpperCase = s -> s.toUpperCase();
        MyFunction<String, Integer> toLength = s -> s.length();
        MyFunction<String, String> pad =
                s -> {
                    if (s.length() > 4) {
                        return s.substring(0, 4);
                    } else {
                        return s + "-".repeat(4 - s.length());
                    }
                };
        MyFunction<String, String> chain = toUpperCase.andThen(pad);
        MyFunction<String, Integer> chain2 = toUpperCase.andThen(toLength);
        MyFunction<String, Integer> chain3 = toLength.compose(toUpperCase);
        MyFunction<String, Integer> chain4 = toLength.compose(pad);
//        strings.forEach(s -> System.out.println(toUpperCase.apply(s)));
//        strings.forEach(s -> System.out.println(toLength.apply(s)));
//        strings.forEach(s -> System.out.println(pad.apply(s)));
//        strings.forEach(s -> System.out.println(chain.apply(s)));
//        strings.forEach(s -> System.out.println(s + ": " + chain2.apply(s)));
//        strings.forEach(s -> System.out.println(s + ": " + chain3.apply(s)));
        strings.forEach(s -> System.out.println(s + ": " + chain4.apply(s)));
    }
}
