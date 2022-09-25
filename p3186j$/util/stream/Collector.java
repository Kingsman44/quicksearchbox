package p3186j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import p3186j$.util.Objects;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.Collector */
public interface Collector<T, A, R> {

    /* renamed from: j$.util.stream.Collector$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T, A, R> {
        /* renamed from: of */
        public static <T, A, R> Collector<T, A, R> m71774of(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Characteristics... characteristicsArr) {
            Objects.requireNonNull(supplier);
            Objects.requireNonNull(biConsumer);
            Objects.requireNonNull(binaryOperator);
            Objects.requireNonNull(function);
            Objects.requireNonNull(characteristicsArr);
            Set<T> set = Collectors.f107721c;
            if (characteristicsArr.length > 0) {
                EnumSet<E> noneOf = EnumSet.noneOf(Characteristics.class);
                Collections.addAll(noneOf, characteristicsArr);
                set = Collections.unmodifiableSet(noneOf);
            }
            return new C41272m(supplier, biConsumer, binaryOperator, function, set);
        }

        /* renamed from: of */
        public static <T, R> Collector<T, R, R> m71775of(Supplier<R> supplier, BiConsumer<R, T> biConsumer, BinaryOperator<R> binaryOperator, Characteristics... characteristicsArr) {
            Objects.requireNonNull(supplier);
            Objects.requireNonNull(biConsumer);
            Objects.requireNonNull(binaryOperator);
            Objects.requireNonNull(characteristicsArr);
            return new C41272m(supplier, biConsumer, binaryOperator, characteristicsArr.length == 0 ? Collectors.f107719a : Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH, characteristicsArr)));
        }
    }

    /* renamed from: j$.util.stream.Collector$Characteristics */
    public enum Characteristics {
        CONCURRENT,
        UNORDERED,
        IDENTITY_FINISH
    }

    BiConsumer<A, T> accumulator();

    Set characteristics();

    BinaryOperator combiner();

    Function<A, R> finisher();

    Supplier<A> supplier();
}
