package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.C41059a0;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.Supplier;
import p3186j$.util.function.ToDoubleFunction;
import p3186j$.util.function.ToIntFunction;
import p3186j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.Stream */
public interface Stream<T> extends BaseStream<T, Stream<T>> {

    /* renamed from: j$.util.stream.Stream$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static <T> Builder<T> builder() {
            return new C41195R2();
        }

        public static <T> Stream<T> concat(Stream<? extends T> stream, Stream<? extends T> stream2) {
            boolean z;
            Objects.requireNonNull(stream);
            Objects.requireNonNull(stream2);
            C41188P2 p2 = new C41188P2(stream.spliterator(), stream2.spliterator());
            if (stream.isParallel() || stream2.isParallel()) {
                z = true;
            } else {
                z = false;
            }
            return (Stream) StreamSupport.stream(p2, z).onClose(new C41180N2(1, stream, stream2));
        }

        public static <T> Stream<T> empty() {
            return StreamSupport.stream(C41059a0.m71664e(), false);
        }

        public static <T> Stream<T> generate(Supplier<? extends T> supplier) {
            Objects.requireNonNull(supplier);
            return StreamSupport.stream(new C41299s2(Long.MAX_VALUE, supplier), false);
        }

        /* renamed from: of */
        public static <T> Stream<T> m71935of(T t) {
            return StreamSupport.stream(new C41195R2(t), false);
        }

        /* renamed from: of */
        public static <T> Stream<T> m71936of(T... tArr) {
            return DesugarArrays.stream(tArr);
        }
    }

    /* renamed from: j$.util.stream.Stream$Builder */
    public interface Builder<T> extends Consumer<T> {
        Builder<T> add(T t);

        Stream<T> build();
    }

    boolean allMatch(Predicate<? super T> predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream<T> distinct();

    Stream<T> filter(Predicate<? super T> predicate);

    Optional<T> findAny();

    Optional<T> findFirst();

    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(Consumer<? super T> consumer);

    void forEachOrdered(Consumer<? super T> consumer);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    DoubleStream mapToDouble(ToDoubleFunction<? super T> toDoubleFunction);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    LongStream mapToLong(ToLongFunction<? super T> toLongFunction);

    Optional<T> max(Comparator<? super T> comparator);

    Optional<T> min(Comparator<? super T> comparator);

    boolean noneMatch(Predicate<? super T> predicate);

    Stream<T> peek(Consumer<? super T> consumer);

    Optional<T> reduce(BinaryOperator<T> binaryOperator);

    T reduce(T t, BinaryOperator<T> binaryOperator);

    Stream<T> skip(long j);

    Stream<T> sorted();

    Stream<T> sorted(Comparator<? super T> comparator);

    Object[] toArray();

    <A> A[] toArray(IntFunction<A[]> intFunction);
}
