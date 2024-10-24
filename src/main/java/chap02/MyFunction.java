package chap02;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T t);

    default <S> MyFunction<T, S> andThen(MyFunction<R, S> other) {
        return (T t) -> {
            var r = this.apply(t);
            var s = other.apply(r);
            return s;
        };
    }
    default <S> MyFunction<S, R> compose(MyFunction<S, T> other) {
        return (S s) -> {
            var t = other.apply(s);
            var r = this.apply(t);
            return r;
        };
    }
}
