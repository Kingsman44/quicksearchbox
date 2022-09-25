package p3186j$.util.stream;

import java.util.Iterator;
import p3186j$.util.C41039G;
import p3186j$.util.C41059a0;
import p3186j$.util.Objects;
import p3186j$.util.OptionalInt;
import p3186j$.util.Spliterator;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.IntPredicate;
import p3186j$.util.function.IntToDoubleFunction;
import p3186j$.util.function.ObjIntConsumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.T */
abstract class C41200T extends C41232c implements IntStream {
    C41200T(C41039G g, int i) {
        super(g, i, false);
    }

    C41200T(C41232c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static C41039G m71941r0(Spliterator spliterator) {
        if (spliterator instanceof C41039G) {
            return (C41039G) spliterator;
        }
        if (C41211V2.f107820a) {
            C41211V2.m71971a(C41232c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final C41257i0 mo43702T(long j, IntFunction intFunction) {
        return C41241e0.m72081Q(j);
    }

    public final boolean anyMatch(IntPredicate intPredicate) {
        C41229b0 b0Var = C41229b0.ANY;
        Objects.requireNonNull(intPredicate);
        Objects.requireNonNull(b0Var);
        return ((Boolean) mo43819a0(new C41233c0(C41263j2.INT_VALUE, b0Var, new C41252h(5, b0Var, intPredicate)))).booleanValue();
    }

    public final Stream boxed() {
        C41129B b = new C41129B(3);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41181O(this, 0, b, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C41277n0 mo43705c0(C41241e0 e0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return C41241e0.m72073E(e0Var, spliterator, z);
    }

    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C41296s sVar = new C41296s(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(sVar);
        return mo43819a0(new C41258i1(C41263j2.INT_VALUE, sVar, objIntConsumer, supplier, 3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean mo43708d0(Spliterator spliterator, C41171L1 l1) {
        IntConsumer intConsumer;
        boolean e;
        C41039G r0 = m71941r0(spliterator);
        if (l1 instanceof IntConsumer) {
            intConsumer = (IntConsumer) l1;
        } else if (!C41211V2.f107820a) {
            Objects.requireNonNull(l1);
            intConsumer = new C41173M(l1);
        } else {
            C41211V2.m71971a(C41232c.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        }
        do {
            e = l1.mo43664e();
            if (e || !r0.mo43449f(intConsumer)) {
                return e;
            }
            e = l1.mo43664e();
            break;
        } while (!r0.mo43449f(intConsumer));
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final C41263j2 mo43710e0() {
        return C41263j2.INT_VALUE;
    }

    public final IntStream filter(IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41185P(this, C41259i2.f107936t, intPredicate, 0);
    }

    public final OptionalInt findFirst() {
        return (OptionalInt) mo43819a0(C41125A.f107710c);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        mo43819a0(new C41149G(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        mo43819a0(new C41149G(intConsumer, true));
    }

    public final Iterator iterator() {
        return C41059a0.m71666g(m71941r0(spliterator()));
    }

    public final IntStream limit(long j) {
        if (j >= 0) {
            return C41241e0.m72083S(this, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        Objects.requireNonNull(intToDoubleFunction);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41308v(this, C41259i2.f107932p | C41259i2.f107930n, intToDoubleFunction, 1);
    }

    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41181O(this, C41259i2.f107932p | C41259i2.f107930n, intFunction, 0);
    }

    public final OptionalInt max() {
        C41129B b = new C41129B(4);
        Objects.requireNonNull(b);
        return (OptionalInt) mo43819a0(new C41246f1(C41263j2.INT_VALUE, b, 3));
    }

    public final OptionalInt min() {
        C41129B b = new C41129B(1);
        Objects.requireNonNull(b);
        return (OptionalInt) mo43819a0(new C41246f1(C41263j2.INT_VALUE, b, 3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final Spliterator mo43723o0(C41241e0 e0Var, C41224a aVar, boolean z) {
        return new C41307u2(e0Var, aVar, z);
    }

    public final int sum() {
        C41129B b = new C41129B(2);
        Objects.requireNonNull(b);
        return ((Integer) mo43819a0(new C41290q1(C41263j2.INT_VALUE, b))).intValue();
    }

    public final int[] toArray() {
        return (int[]) C41241e0.m72079N((C41265k0) mo43820b0(new C41228b(28))).mo43645b();
    }
}
