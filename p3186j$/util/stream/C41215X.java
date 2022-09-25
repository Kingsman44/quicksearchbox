package p3186j$.util.stream;

import java.util.Iterator;
import p3186j$.util.C41040H;
import p3186j$.util.C41059a0;
import p3186j$.util.Objects;
import p3186j$.util.OptionalLong;
import p3186j$.util.Spliterator;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.X */
abstract class C41215X extends C41232c implements LongStream {
    C41215X(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    C41215X(C41232c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static C41040H m71977r0(Spliterator spliterator) {
        if (spliterator instanceof C41040H) {
            return (C41040H) spliterator;
        }
        if (C41211V2.f107820a) {
            C41211V2.m71971a(C41232c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final C41257i0 mo43702T(long j, IntFunction intFunction) {
        return C41241e0.m72082R(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C41277n0 mo43705c0(C41241e0 e0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long K = e0Var.mo43814K(spliterator);
        if (K < 0 || !spliterator.hasCharacteristics(16384)) {
            C41269l0 l0Var = (C41269l0) new C41301t0(2, spliterator, e0Var).invoke();
            if (z) {
                return C41241e0.m72080O(l0Var);
            }
            return l0Var;
        } else if (K < 2147483639) {
            long[] jArr = new long[((int) K)];
            new C41216X0(spliterator, e0Var, jArr).invoke();
            return new C41197S0(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean mo43708d0(Spliterator spliterator, C41171L1 l1) {
        LongConsumer longConsumer;
        boolean e;
        C41040H r0 = m71977r0(spliterator);
        if (l1 instanceof LongConsumer) {
            longConsumer = (LongConsumer) l1;
        } else if (!C41211V2.f107820a) {
            Objects.requireNonNull(l1);
            longConsumer = new C41208V(l1);
        } else {
            C41211V2.m71971a(C41232c.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        }
        do {
            e = l1.mo43664e();
            if (e || !r0.mo43452b(longConsumer)) {
                return e;
            }
            e = l1.mo43664e();
            break;
        } while (!r0.mo43452b(longConsumer));
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final C41263j2 mo43710e0() {
        return C41263j2.LONG_VALUE;
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        mo43819a0(new C41153H(longConsumer));
    }

    public final Iterator iterator() {
        return C41059a0.m71667h(m71977r0(spliterator()));
    }

    public final OptionalLong max() {
        C41129B b = new C41129B(5);
        Objects.requireNonNull(b);
        return (OptionalLong) mo43819a0(new C41246f1(C41263j2.LONG_VALUE, b, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final Spliterator mo43723o0(C41241e0 e0Var, C41224a aVar, boolean z) {
        return new C41315w2(e0Var, aVar, z);
    }

    public final long sum() {
        C41129B b = new C41129B(6);
        Objects.requireNonNull(b);
        return ((Long) mo43819a0(new C41242e1(C41263j2.LONG_VALUE, b))).longValue();
    }

    public final long[] toArray() {
        return (long[]) C41241e0.m72080O((C41269l0) mo43820b0(new C41228b(29))).mo43645b();
    }
}
