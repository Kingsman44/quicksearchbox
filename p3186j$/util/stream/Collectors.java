package p3186j$.util.stream;

import com.evernote.android.state.BuildConfig;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.C41092d;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Collector;

/* renamed from: j$.util.stream.Collectors */
public final class Collectors {

    /* renamed from: a */
    static final Set f107719a;

    /* renamed from: b */
    static final Set f107720b;

    /* renamed from: c */
    static final Set f107721c = Collections.emptySet();

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        f107719a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        f107720b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    /* renamed from: a */
    static void m71776a(Function function, Function function2, Map map, Object obj) {
        Object apply = function.apply(obj);
        Object requireNonNull = Objects.requireNonNull(function2.apply(obj));
        Object putIfAbsent = Map.EL.putIfAbsent(map, apply, requireNonNull);
        if (putIfAbsent != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", new Object[]{apply, putIfAbsent, requireNonNull}));
        }
    }

    /* renamed from: b */
    static void m71777b(java.util.Map map, java.util.Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object requireNonNull = Objects.requireNonNull(entry.getValue());
            Object putIfAbsent = Map.EL.putIfAbsent(map, key, requireNonNull);
            if (putIfAbsent != null) {
                throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", new Object[]{key, putIfAbsent, requireNonNull}));
            }
        }
    }

    /* renamed from: c */
    static void m71778c(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [j$.util.function.Function, j$.util.function.Function<R, RR>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T, A, R, RR> p3186j$.util.stream.Collector<T, A, RR> collectingAndThen(p3186j$.util.stream.Collector<T, A, R> r7, p3186j$.util.function.Function<R, RR> r8) {
        /*
            java.util.Set r0 = r7.characteristics()
            j$.util.stream.Collector$Characteristics r1 = p3186j$.util.stream.Collector.Characteristics.IDENTITY_FINISH
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L_0x0021
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L_0x0016
            java.util.Set r0 = f107721c
            goto L_0x0021
        L_0x0016:
            java.util.EnumSet r0 = java.util.EnumSet.copyOf(r0)
            r0.remove(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
        L_0x0021:
            r6 = r0
            j$.util.stream.m r0 = new j$.util.stream.m
            j$.util.function.Supplier r2 = r7.supplier()
            j$.util.function.BiConsumer r3 = r7.accumulator()
            j$.util.function.BinaryOperator r4 = r7.combiner()
            j$.util.function.Function r7 = r7.finisher()
            j$.util.function.Function r5 = r7.andThen(r8)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.stream.Collectors.collectingAndThen(j$.util.stream.Collector, j$.util.function.Function):j$.util.stream.Collector");
    }

    public static <T> Collector<T, ?, Long> counting() {
        return new C41272m(new C41228b(14), new C41224a(4, new C41228b(11)), new C41228b(15), new C41228b(16), f107721c);
    }

    public static <T, K> Collector<T, ?, java.util.Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> function) {
        return groupingBy(function, toList());
    }

    public static <T, K, D, A, M extends java.util.Map<K, D>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K> function, Supplier<M> supplier, Collector<? super T, A, D> collector) {
        C41260j jVar = new C41260j(function, collector.supplier(), collector.accumulator(), 2);
        C41248g gVar = new C41248g(collector.combiner(), 1);
        if (collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return new C41272m(supplier, jVar, gVar, f107719a);
        }
        return new C41272m(supplier, jVar, gVar, new C41264k(collector.finisher()), f107721c);
    }

    public static <T, K, A, D> Collector<T, ?, java.util.Map<K, D>> groupingBy(Function<? super T, ? extends K> function, Collector<? super T, A, D> collector) {
        return groupingBy(function, new C41281o0(18), collector);
    }

    public static Collector<CharSequence, ?, String> joining() {
        return new C41272m(new C41281o0(21), new C41281o0(22), new C41228b(12), new C41281o0(23), f107721c);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return joining(charSequence, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new C41272m(new C41260j(charSequence, charSequence2, charSequence3, 1), new C41281o0(15), new C41281o0(16), new C41281o0(17), f107721c);
    }

    public static <T, U, A, R> Collector<T, ?, R> mapping(Function<? super T, ? extends U> function, Collector<? super U, A, R> collector) {
        return new C41272m(collector.supplier(), new C41252h(1, collector.accumulator(), function), collector.combiner(), collector.finisher(), collector.characteristics());
    }

    public static <T> Collector<T, ?, Optional<T>> maxBy(Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator);
        return reducing(new C41092d(comparator, 0));
    }

    public static <T> Collector<T, ?, java.util.Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate) {
        Collector list = toList();
        C41252h hVar = new C41252h(0, list.accumulator(), predicate);
        C41248g gVar = new C41248g(list.combiner(), 2);
        C41256i iVar = new C41256i(list);
        if (list.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return new C41272m(iVar, hVar, gVar, f107719a);
        }
        return new C41272m(iVar, hVar, gVar, new C41256i(list), f107721c);
    }

    public static <T> Collector<T, ?, Optional<T>> reducing(BinaryOperator<T> binaryOperator) {
        return new C41272m(new C41248g(binaryOperator, 0), new C41228b(2), new C41228b(3), new C41228b(4), f107721c);
    }

    public static <T> Collector<T, ?, T> reducing(T t, BinaryOperator<T> binaryOperator) {
        return new C41272m(new C41224a(3, t), new C41248g(binaryOperator, 3), new C41248g(binaryOperator, 4), new C41228b(6), f107721c);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new C41272m(supplier, new C41281o0(12), new C41228b(5), f107719a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C41272m(new C41281o0(19), new C41281o0(20), new C41228b(8), f107719a);
    }

    public static <T, K, U> Collector<T, ?, java.util.Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C41272m(new C41281o0(18), new C41252h(3, function, function2), new C41228b(17), f107719a);
    }

    public static <T, K, U> Collector<T, ?, java.util.Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator) {
        return toMap(function, function2, binaryOperator, new C41281o0(18));
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new C41272m(new C41281o0(13), new C41281o0(14), new C41228b(13), f107720b);
    }

    public static <T> Collector<T, ?, List<T>> toUnmodifiableList() {
        return new C41272m(new C41281o0(19), new C41281o0(20), new C41228b(9), new C41228b(10), f107721c);
    }

    public static <T, U> Collector<T, ?, U> reducing(U u, Function<? super T, ? extends U> function, BinaryOperator<U> binaryOperator) {
        return new C41272m(new C41224a(3, u), new C41252h(2, binaryOperator, function), new C41248g(binaryOperator, 5), new C41228b(7), f107721c);
    }

    public static <T, K, U, M extends java.util.Map<K, U>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new C41272m(supplier, new C41260j(function, function2, binaryOperator, 0), new C41248g(binaryOperator, 1), f107719a);
    }
}
