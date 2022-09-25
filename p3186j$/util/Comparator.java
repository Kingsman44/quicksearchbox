package p3186j$.util;

import java.util.Collections;
import p3186j$.util.function.Function;
import p3186j$.util.function.ToDoubleFunction;
import p3186j$.util.function.ToIntFunction;
import p3186j$.util.function.ToLongFunction;

/* renamed from: j$.util.Comparator */
public interface Comparator<T> {

    /* renamed from: j$.util.Comparator$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, Function function) {
            return EL.thenComparing(comparator, comparing(function));
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, Function function, java.util.Comparator comparator2) {
            return EL.thenComparing(comparator, comparing(function, comparator2));
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            Objects.requireNonNull(comparator2);
            return new C41062c(comparator, comparator2, 0);
        }

        public static java.util.Comparator $default$thenComparingDouble(java.util.Comparator comparator, ToDoubleFunction toDoubleFunction) {
            return EL.thenComparing(comparator, comparingDouble(toDoubleFunction));
        }

        public static java.util.Comparator $default$thenComparingInt(java.util.Comparator comparator, ToIntFunction toIntFunction) {
            return EL.thenComparing(comparator, comparingInt(toIntFunction));
        }

        public static java.util.Comparator $default$thenComparingLong(java.util.Comparator comparator, ToLongFunction toLongFunction) {
            return EL.thenComparing(comparator, comparingLong(toLongFunction));
        }

        public static <T, U extends Comparable<? super U>> java.util.Comparator<T> comparing(Function<? super T, ? extends U> function) {
            Objects.requireNonNull(function);
            return new C41060b(3, function);
        }

        public static <T, U> java.util.Comparator<T> comparing(Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator) {
            Objects.requireNonNull(function);
            Objects.requireNonNull(comparator);
            return new C41062c(comparator, function, 1);
        }

        public static <T> java.util.Comparator<T> comparingDouble(ToDoubleFunction<? super T> toDoubleFunction) {
            Objects.requireNonNull(toDoubleFunction);
            return new C41060b(0, toDoubleFunction);
        }

        public static <T> java.util.Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
            Objects.requireNonNull(toIntFunction);
            return new C41060b(1, toIntFunction);
        }

        public static <T> java.util.Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
            Objects.requireNonNull(toLongFunction);
            return new C41060b(2, toLongFunction);
        }

        public static <T extends Comparable<? super T>> java.util.Comparator<T> naturalOrder() {
            return C41086d.INSTANCE;
        }

        public static <T extends Comparable<? super T>> java.util.Comparator<T> reverseOrder() {
            return Collections.reverseOrder();
        }
    }

    /* renamed from: j$.util.Comparator$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        public static java.util.Comparator reversed(java.util.Comparator comparator) {
            if (comparator instanceof Comparator) {
                return ((Comparator) comparator).reversed();
            }
            return Collections.reverseOrder(comparator);
        }

        public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, Function function) {
            return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(function) : CC.$default$thenComparing(comparator, function);
        }

        public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, Function function, java.util.Comparator comparator2) {
            return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(function, comparator2) : CC.$default$thenComparing(comparator, function, comparator2);
        }

        public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : CC.$default$thenComparing(comparator, comparator2);
        }

        public static /* synthetic */ java.util.Comparator thenComparingDouble(java.util.Comparator comparator, ToDoubleFunction toDoubleFunction) {
            return comparator instanceof Comparator ? ((Comparator) comparator).thenComparingDouble(toDoubleFunction) : CC.$default$thenComparingDouble(comparator, toDoubleFunction);
        }

        public static /* synthetic */ java.util.Comparator thenComparingInt(java.util.Comparator comparator, ToIntFunction toIntFunction) {
            return comparator instanceof Comparator ? ((Comparator) comparator).thenComparingInt(toIntFunction) : CC.$default$thenComparingInt(comparator, toIntFunction);
        }
    }

    int compare(T t, T t2);

    java.util.Comparator<T> reversed();

    <U extends Comparable<? super U>> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> function);

    <U> java.util.Comparator<T> thenComparing(Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator);

    java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> comparator);

    java.util.Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> toDoubleFunction);

    java.util.Comparator<T> thenComparingInt(ToIntFunction<? super T> toIntFunction);

    java.util.Comparator<T> thenComparingLong(ToLongFunction<? super T> toLongFunction);
}
