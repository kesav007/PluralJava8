package chap02;

@FunctionalInterface
public interface MyConsumer<T> {
    void accept(T t);

    default MyConsumer<T> andThen(MyConsumer<T> other) {
        return (T t) -> {
            this.accept(t);
            other.accept(t);
        };
    }
}
