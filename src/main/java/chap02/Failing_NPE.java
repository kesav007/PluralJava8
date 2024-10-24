package chap02;

public class Failing_NPE {
    public static void main(String[] args) {
        MyPredicate<String> isEmpty = s -> s.isEmpty();
        MyPredicate<String> isCorrupted = s -> s.contains("*");

        MyPredicate<String> isEmptyOrIsCorrupted = isEmpty.or(null);
//        MyPredicate<String> isEmptyOrIsCorrupted = isEmpty.or(isCorrupted);
        boolean test = isEmptyOrIsCorrupted.test("abc");
        System.out.println(test);
        System.out.println("Lambda Created");

    }
}
