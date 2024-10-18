package chap02;

import java.util.Objects;

@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);

    default  MyPredicate<T> or( MyPredicate<T> other) {
        Objects.requireNonNull(other);
        return t -> this.test(t) || other.test(t);

    }

    default  MyPredicate<T> and( MyPredicate<T> other) {
        Objects.requireNonNull(other);
        return t -> this.test(t) && other.test(t);
    }
}
