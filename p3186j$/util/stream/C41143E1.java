package p3186j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import p3186j$.util.C41059a0;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.Spliterator;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.C41092d;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.Supplier;
import p3186j$.util.function.ToDoubleFunction;
import p3186j$.util.function.ToIntFunction;
import p3186j$.util.function.ToLongFunction;
import p3186j$.util.stream.Collector;

/* renamed from: j$.util.stream.E1 */
abstract class C41143E1 extends C41232c implements Stream {
    C41143E1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    C41143E1(C41232c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final C41257i0 mo43702T(long j, IntFunction intFunction) {
        return C41241e0.m72071C(j, intFunction);
    }

    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) mo43819a0(C41241e0.m72084U(predicate, C41229b0.ALL))).booleanValue();
    }

    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) mo43819a0(C41241e0.m72084U(predicate, C41229b0.ANY))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C41277n0 mo43705c0(C41241e0 e0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return C41241e0.m72072D(e0Var, spliterator, z, intFunction);
    }

    public final Object collect(Collector collector) {
        Object obj;
        if (!isParallel() || !collector.characteristics().contains(Collector.Characteristics.CONCURRENT) || (mo43822g0() && !collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            BiConsumer accumulator = collector.accumulator();
            obj = mo43819a0(new C41270l1(C41263j2.REFERENCE, collector.combiner(), accumulator, supplier, collector));
        } else {
            obj = collector.supplier().get();
            forEach(new C41252h(7, collector.accumulator(), obj));
        }
        if (collector.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH)) {
            return obj;
        }
        return collector.finisher().apply(obj);
    }

    public final long count() {
        return ((Long) mo43819a0(new C41282o1(C41263j2.REFERENCE))).longValue();
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: d0 */
    final boolean mo43708d0(p3186j$.util.Spliterator r3, p3186j$.util.stream.C41171L1 r4) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r4.mo43664e()
            if (r0 != 0) goto L_0x000c
            boolean r1 = r3.tryAdvance(r4)
            if (r1 != 0) goto L_0x0000
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.stream.C41143E1.mo43708d0(j$.util.Spliterator, j$.util.stream.L1):boolean");
    }

    public final Stream distinct() {
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41292r(this, C41259i2.f107929m | C41259i2.f107936t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final C41263j2 mo43710e0() {
        return C41263j2.REFERENCE;
    }

    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41181O(this, C41259i2.f107936t, predicate, 2);
    }

    public final Optional findAny() {
        return (Optional) mo43819a0(C41133C.f107717d);
    }

    public final Optional findFirst() {
        return (Optional) mo43819a0(C41133C.f107716c);
    }

    public final Stream flatMap(Function function) {
        Objects.requireNonNull(function);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41326z1(this, C41259i2.f107932p | C41259i2.f107930n | C41259i2.f107936t, function, 1);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        mo43819a0(new C41157I(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        mo43819a0(new C41157I(consumer, true));
    }

    public final Iterator iterator() {
        return C41059a0.m71668i(spliterator());
    }

    public final Stream limit(long j) {
        if (j >= 0) {
            return C41241e0.m72085V(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41326z1(this, C41259i2.f107932p | C41259i2.f107930n, function, 0);
    }

    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41308v(this, C41259i2.f107932p | C41259i2.f107930n, toDoubleFunction, 2);
    }

    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41185P(this, C41259i2.f107932p | C41259i2.f107930n, toIntFunction, 1);
    }

    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41127A1(this, C41259i2.f107932p | C41259i2.f107930n, toLongFunction);
    }

    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new C41092d(comparator, 0));
    }

    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new C41092d(comparator, 1));
    }

    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) mo43819a0(C41241e0.m72084U(predicate, C41229b0.NONE))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final Spliterator mo43723o0(C41241e0 e0Var, C41224a aVar, boolean z) {
        return new C41176M2(e0Var, aVar, z);
    }

    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41181O(this, 0, consumer, 1);
    }

    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) mo43819a0(new C41246f1(C41263j2.REFERENCE, binaryOperator, 2));
    }

    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : C41241e0.m72085V(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final Stream sorted() {
        return new C41202T1(this);
    }

    public final Object[] toArray() {
        return toArray(new C41281o0(8));
    }

    public final Object[] toArray(IntFunction intFunction) {
        return C41241e0.m72077L(mo43820b0(intFunction), intFunction).mo43652m(intFunction);
    }

    public final Stream sorted(Comparator comparator) {
        return new C41202T1(this, comparator);
    }

    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return mo43819a0(new C41258i1(C41263j2.REFERENCE, binaryOperator, binaryOperator, obj, 1));
    }
}
