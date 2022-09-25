package p3186j$.util;

import java.util.NoSuchElementException;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Stream;

/* renamed from: j$.util.Optional */
public final class Optional<T> {

    /* renamed from: b */
    private static final Optional f107514b = new Optional();

    /* renamed from: a */
    private final Object f107515a;

    private Optional() {
        this.f107515a = null;
    }

    private Optional(Object obj) {
        this.f107515a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> empty() {
        return f107514b;
    }

    /* renamed from: of */
    public static <T> Optional<T> m71637of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : m71637of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return Objects.equals(this.f107515a, ((Optional) obj).f107515a);
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return !isPresent() ? this : predicate.test(this.f107515a) ? this : empty();
    }

    public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> function) {
        Objects.requireNonNull(function);
        return !isPresent() ? empty() : (Optional) Objects.requireNonNull((Optional) function.apply(this.f107515a));
    }

    public T get() {
        T t = this.f107515a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.f107515a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        Object obj = this.f107515a;
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable runnable) {
        Object obj = this.f107515a;
        if (obj != null) {
            consumer.accept(obj);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.f107515a == null;
    }

    public boolean isPresent() {
        return this.f107515a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        return !isPresent() ? empty() : ofNullable(function.apply(this.f107515a));
    }

    /* renamed from: or */
    public Optional<T> mo43489or(Supplier<? extends Optional<? extends T>> supplier) {
        Objects.requireNonNull(supplier);
        return isPresent() ? this : (Optional) Objects.requireNonNull((Optional) supplier.get());
    }

    public T orElse(T t) {
        T t2 = this.f107515a;
        return t2 != null ? t2 : t;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t = this.f107515a;
        return t != null ? t : supplier.get();
    }

    public T orElseThrow() {
        T t = this.f107515a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) {
        T t = this.f107515a;
        if (t != null) {
            return t;
        }
        throw ((Throwable) supplier.get());
    }

    public Stream<T> stream() {
        return !isPresent() ? Stream.CC.empty() : Stream.CC.m71935of(this.f107515a);
    }

    public String toString() {
        Object obj = this.f107515a;
        if (obj == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{obj});
    }
}
