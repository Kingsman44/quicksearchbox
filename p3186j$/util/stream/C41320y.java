package p3186j$.util.stream;

import com.google.common.p4535g.C59203do;
import java.util.Iterator;
import java.util.Set;
import p3186j$.util.C41038F;
import p3186j$.util.C41059a0;
import p3186j$.util.Objects;
import p3186j$.util.OptionalDouble;
import p3186j$.util.Spliterator;
import p3186j$.util.function.DoubleConsumer;
import p3186j$.util.function.DoubleUnaryOperator;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.y */
abstract class C41320y extends C41232c implements DoubleStream {
    C41320y(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    C41320y(C41232c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static C41038F m72272r0(Spliterator spliterator) {
        if (spliterator instanceof C41038F) {
            return (C41038F) spliterator;
        }
        if (C41211V2.f107820a) {
            C41211V2.m71971a(C41232c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final C41257i0 mo43702T(long j, IntFunction intFunction) {
        return C41241e0.m72075I(j);
    }

    public final OptionalDouble average() {
        double[] dArr = (double[]) mo43870s0(new C41228b(21), new C41228b(22), new C41228b(23));
        if (dArr[2] <= C59203do.f157270a) {
            return OptionalDouble.empty();
        }
        Set set = Collectors.f107719a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return OptionalDouble.m71639of(d / dArr[2]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final C41277n0 mo43705c0(C41241e0 e0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long K = e0Var.mo43814K(spliterator);
        if (K < 0 || !spliterator.hasCharacteristics(16384)) {
            C41261j0 j0Var = (C41261j0) new C41301t0(0, spliterator, e0Var).invoke();
            if (z) {
                return C41241e0.m72078M(j0Var);
            }
            return j0Var;
        } else if (K < 2147483639) {
            double[] dArr = new double[((int) K)];
            new C41209V0(spliterator, e0Var, dArr).invoke();
            return new C41126A0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public final boolean mo43708d0(Spliterator spliterator, C41171L1 l1) {
        DoubleConsumer doubleConsumer;
        boolean e;
        C41038F r0 = m72272r0(spliterator);
        if (l1 instanceof DoubleConsumer) {
            doubleConsumer = (DoubleConsumer) l1;
        } else if (!C41211V2.f107820a) {
            Objects.requireNonNull(l1);
            doubleConsumer = new C41300t(l1);
        } else {
            C41211V2.m71971a(C41232c.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        }
        do {
            e = l1.mo43664e();
            if (e || !r0.mo43447i(doubleConsumer)) {
                return e;
            }
            e = l1.mo43664e();
            break;
        } while (!r0.mo43447i(doubleConsumer));
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final C41263j2 mo43710e0() {
        return C41263j2.DOUBLE_VALUE;
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        mo43819a0(new C41145F(doubleConsumer));
    }

    public final Iterator iterator() {
        return C41059a0.m71665f(m72272r0(spliterator()));
    }

    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        Objects.requireNonNull(doubleUnaryOperator);
        C41263j2 j2Var = C41263j2.REFERENCE;
        return new C41308v(this, C41259i2.f107932p | C41259i2.f107930n, doubleUnaryOperator, 0);
    }

    public final OptionalDouble max() {
        C41281o0 o0Var = new C41281o0(28);
        Objects.requireNonNull(o0Var);
        return (OptionalDouble) mo43819a0(new C41246f1(C41263j2.DOUBLE_VALUE, o0Var, 1));
    }

    public final OptionalDouble min() {
        C41281o0 o0Var = new C41281o0(27);
        Objects.requireNonNull(o0Var);
        return (OptionalDouble) mo43819a0(new C41246f1(C41263j2.DOUBLE_VALUE, o0Var, 1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public final Spliterator mo43723o0(C41241e0 e0Var, C41224a aVar, boolean z) {
        return new C41295r2(e0Var, aVar, z);
    }

    /* renamed from: s0 */
    public final Object mo43870s0(C41228b bVar, C41228b bVar2, C41228b bVar3) {
        Objects.requireNonNull(bVar3);
        C41296s sVar = new C41296s(bVar3, 0);
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(bVar2);
        Objects.requireNonNull(sVar);
        return mo43819a0(new C41258i1(C41263j2.DOUBLE_VALUE, sVar, bVar2, bVar, 0));
    }

    public final double sum() {
        double[] dArr = (double[]) mo43870s0(new C41228b(24), new C41228b(19), new C41228b(20));
        Set set = Collectors.f107719a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (!Double.isNaN(d) || !Double.isInfinite(d2)) {
            return d;
        }
        return d2;
    }

    public final double[] toArray() {
        return (double[]) C41241e0.m72078M((C41261j0) mo43820b0(new C41228b(18))).mo43645b();
    }
}
