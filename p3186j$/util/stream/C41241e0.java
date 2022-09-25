package p3186j$.util.stream;

import p3186j$.util.C41038F;
import p3186j$.util.C41039G;
import p3186j$.util.C41040H;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.LongConsumer;
import p3186j$.util.function.Predicate;

/* renamed from: j$.util.stream.e0 */
public abstract /* synthetic */ class C41241e0 implements C41199S2 {

    /* renamed from: a */
    private static final C41150G0 f107881a = new C41150G0();

    /* renamed from: b */
    private static final C41265k0 f107882b = new C41142E0();

    /* renamed from: c */
    private static final C41269l0 f107883c = new C41146F0();

    /* renamed from: d */
    private static final C41261j0 f107884d = new C41138D0();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f107885e = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final long[] f107886f = new long[0];
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final double[] f107887g = new double[0];

    public C41241e0() {
    }

    public C41241e0(C41263j2 j2Var) {
    }

    /* renamed from: A */
    static long m72069A(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: B */
    static Spliterator m72070B(C41263j2 j2Var, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = C41191Q1.f107788a[j2Var.ordinal()];
        if (i == 1) {
            return new C41144E2(spliterator, j, j4);
        }
        if (i == 2) {
            return new C41128A2((C41039G) spliterator, j, j4);
        }
        if (i == 3) {
            return new C41136C2((C41040H) spliterator, j, j4);
        }
        if (i == 4) {
            return new C41323y2((C41038F) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(j2Var)));
    }

    /* renamed from: C */
    static C41257i0 m72071C(long j, IntFunction intFunction) {
        if (j < 0 || j >= 2147483639) {
            return new C41226a1();
        }
        return new C41158I0(j, intFunction);
    }

    /* renamed from: D */
    public static C41277n0 m72072D(C41241e0 e0Var, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long K = e0Var.mo43814K(spliterator);
        if (K < 0 || !spliterator.hasCharacteristics(16384)) {
            C41277n0 n0Var = (C41277n0) new C41301t0(spliterator, intFunction, e0Var).invoke();
            if (z) {
                return m72077L(n0Var, intFunction);
            }
            return n0Var;
        } else if (K < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) K);
            new C41219Y0(spliterator, e0Var, objArr).invoke();
            return new C41293r0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: E */
    public static C41265k0 m72073E(C41241e0 e0Var, Spliterator spliterator, boolean z) {
        long K = e0Var.mo43814K(spliterator);
        if (K < 0 || !spliterator.hasCharacteristics(16384)) {
            C41265k0 k0Var = (C41265k0) new C41301t0(1, spliterator, e0Var).invoke();
            if (z) {
                return m72079N(k0Var);
            }
            return k0Var;
        } else if (K < 2147483639) {
            int[] iArr = new int[((int) K)];
            new C41213W0(spliterator, e0Var, iArr).invoke();
            return new C41162J0(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: F */
    static C41289q0 m72074F(C41263j2 j2Var, C41277n0 n0Var, C41277n0 n0Var2) {
        int i = C41285p0.f107994a[j2Var.ordinal()];
        if (i == 1) {
            return new C41325z0(n0Var, n0Var2);
        }
        if (i == 2) {
            return new C41313w0((C41265k0) n0Var, (C41265k0) n0Var2);
        }
        if (i == 3) {
            return new C41317x0((C41269l0) n0Var, (C41269l0) n0Var2);
        }
        if (i == 4) {
            return new C41309v0((C41261j0) n0Var, (C41261j0) n0Var2);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(j2Var)));
    }

    /* renamed from: I */
    static C41245f0 m72075I(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C41134C0();
        }
        return new C41130B0(j);
    }

    /* renamed from: J */
    static C41154H0 m72076J(C41263j2 j2Var) {
        Object obj;
        int i = C41285p0.f107994a[j2Var.ordinal()];
        if (i == 1) {
            return f107881a;
        }
        if (i == 2) {
            obj = f107882b;
        } else if (i == 3) {
            obj = f107883c;
        } else if (i == 4) {
            obj = f107884d;
        } else {
            throw new IllegalStateException("Unknown shape ".concat(String.valueOf(j2Var)));
        }
        return (C41154H0) obj;
    }

    /* renamed from: L */
    public static C41277n0 m72077L(C41277n0 n0Var, IntFunction intFunction) {
        if (n0Var.mo43651l() <= 0) {
            return n0Var;
        }
        long count = n0Var.count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            new C41234c1(n0Var, objArr).invoke();
            return new C41293r0(objArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: M */
    public static C41261j0 m72078M(C41261j0 j0Var) {
        if (j0Var.mo43651l() <= 0) {
            return j0Var;
        }
        long count = j0Var.count();
        if (count < 2147483639) {
            double[] dArr = new double[((int) count)];
            new C41230b1(j0Var, dArr).invoke();
            return new C41126A0(dArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: N */
    public static C41265k0 m72079N(C41265k0 k0Var) {
        if (k0Var.mo43651l() <= 0) {
            return k0Var;
        }
        long count = k0Var.count();
        if (count < 2147483639) {
            int[] iArr = new int[((int) count)];
            new C41230b1(k0Var, iArr).invoke();
            return new C41162J0(iArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: O */
    public static C41269l0 m72080O(C41269l0 l0Var) {
        if (l0Var.mo43651l() <= 0) {
            return l0Var;
        }
        long count = l0Var.count();
        if (count < 2147483639) {
            long[] jArr = new long[((int) count)];
            new C41230b1(l0Var, jArr).invoke();
            return new C41197S0(jArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: Q */
    static C41249g0 m72081Q(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C41170L0();
        }
        return new C41166K0(j);
    }

    /* renamed from: R */
    static C41253h0 m72082R(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C41205U0();
        }
        return new C41201T0(j);
    }

    /* renamed from: S */
    public static IntStream m72083S(C41232c cVar, long j) {
        int i;
        C41263j2 j2Var = C41263j2.REFERENCE;
        int i2 = C41259i2.f107936t;
        if (j != -1) {
            i = C41259i2.f107937u;
        } else {
            i = 0;
        }
        return new C41187P1(cVar, i2 | i, j);
    }

    /* renamed from: U */
    public static C41233c0 m72084U(Predicate predicate, C41229b0 b0Var) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(b0Var);
        return new C41233c0(C41263j2.REFERENCE, b0Var, new C41252h(6, b0Var, predicate));
    }

    /* renamed from: V */
    public static Stream m72085V(C41232c cVar, long j, long j2) {
        int i;
        if (j >= 0) {
            C41263j2 j2Var = C41263j2.REFERENCE;
            int i2 = C41259i2.f107936t;
            if (j2 != -1) {
                i = C41259i2.f107937u;
            } else {
                i = 0;
            }
            return new C41179N1(cVar, i | i2, j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: c */
    public static void m72086c() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: d */
    public static void m72087d(C41159I1 i1, Double d) {
        if (!C41211V2.f107820a) {
            i1.accept(d.doubleValue());
        } else {
            C41211V2.m71971a(i1.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    /* renamed from: g */
    public static void m72089g(C41163J1 j1, Integer num) {
        if (!C41211V2.f107820a) {
            j1.accept(num.intValue());
        } else {
            C41211V2.m71971a(j1.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    /* renamed from: i */
    public static void m72091i(C41167K1 k1, Long l) {
        if (!C41211V2.f107820a) {
            k1.accept(l.longValue());
        } else {
            C41211V2.m71971a(k1.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    /* renamed from: k */
    public static void m72093k() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: l */
    public static void m72094l() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: m */
    public static Object[] m72095m(C41273m0 m0Var, IntFunction intFunction) {
        if (C41211V2.f107820a) {
            C41211V2.m71971a(m0Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (m0Var.count() < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) m0Var.count());
            m0Var.mo43650i(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: n */
    public static void m72096n(C41261j0 j0Var, Double[] dArr, int i) {
        if (!C41211V2.f107820a) {
            double[] dArr2 = (double[]) j0Var.mo43645b();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
            return;
        }
        C41211V2.m71971a(j0Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    /* renamed from: o */
    public static void m72097o(C41265k0 k0Var, Integer[] numArr, int i) {
        if (!C41211V2.f107820a) {
            int[] iArr = (int[]) k0Var.mo43645b();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
            return;
        }
        C41211V2.m71971a(k0Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    /* renamed from: p */
    public static void m72098p(C41269l0 l0Var, Long[] lArr, int i) {
        if (!C41211V2.f107820a) {
            long[] jArr = (long[]) l0Var.mo43645b();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
            return;
        }
        C41211V2.m71971a(l0Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    /* renamed from: q */
    public static void m72099q(C41261j0 j0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            j0Var.mo43649g((DoubleConsumer) consumer);
        } else if (!C41211V2.f107820a) {
            ((C41038F) j0Var.spliterator()).forEachRemaining(consumer);
        } else {
            C41211V2.m71971a(j0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: r */
    public static void m72100r(C41265k0 k0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            k0Var.mo43649g((IntConsumer) consumer);
        } else if (!C41211V2.f107820a) {
            ((C41039G) k0Var.spliterator()).forEachRemaining(consumer);
        } else {
            C41211V2.m71971a(k0Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: s */
    public static void m72101s(C41269l0 l0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            l0Var.mo43649g((LongConsumer) consumer);
        } else if (!C41211V2.f107820a) {
            ((C41040H) l0Var.spliterator()).forEachRemaining(consumer);
        } else {
            C41211V2.m71971a(l0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: t */
    public static C41261j0 m72102t(C41261j0 j0Var, long j, long j2) {
        if (j == 0 && j2 == j0Var.count()) {
            return j0Var;
        }
        long j3 = j2 - j;
        C41038F f = (C41038F) j0Var.spliterator();
        C41245f0 I = m72075I(j3);
        I.mo43663c(j3);
        for (int i = 0; ((long) i) < j && f.mo43447i(new C41319x2(1)); i++) {
        }
        if (j2 == j0Var.count()) {
            f.mo43448l(I);
        } else {
            for (int i2 = 0; ((long) i2) < j3 && f.mo43447i(I); i2++) {
            }
        }
        I.end();
        return I.build();
    }

    /* renamed from: u */
    public static C41265k0 m72103u(C41265k0 k0Var, long j, long j2) {
        if (j == 0 && j2 == k0Var.count()) {
            return k0Var;
        }
        long j3 = j2 - j;
        C41039G g = (C41039G) k0Var.spliterator();
        C41249g0 Q = m72081Q(j3);
        Q.mo43663c(j3);
        for (int i = 0; ((long) i) < j && g.mo43449f(new C41327z2(1)); i++) {
        }
        if (j2 == k0Var.count()) {
            g.mo43450g(Q);
        } else {
            for (int i2 = 0; ((long) i2) < j3 && g.mo43449f(Q); i2++) {
            }
        }
        Q.end();
        return Q.build();
    }

    /* renamed from: v */
    public static C41269l0 m72104v(C41269l0 l0Var, long j, long j2) {
        if (j == 0 && j2 == l0Var.count()) {
            return l0Var;
        }
        long j3 = j2 - j;
        C41040H h = (C41040H) l0Var.spliterator();
        C41253h0 R = m72082R(j3);
        R.mo43663c(j3);
        for (int i = 0; ((long) i) < j && h.mo43452b(new C41132B2(1)); i++) {
        }
        if (j2 == l0Var.count()) {
            h.mo43451a(R);
        } else {
            for (int i2 = 0; ((long) i2) < j3 && h.mo43452b(R); i2++) {
            }
        }
        R.end();
        return R.build();
    }

    /* renamed from: w */
    public static C41277n0 m72105w(C41277n0 n0Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == n0Var.count()) {
            return n0Var;
        }
        Spliterator spliterator = n0Var.spliterator();
        long j3 = j2 - j;
        C41257i0 C = m72071C(j3, intFunction);
        C.mo43663c(j3);
        for (int i = 0; ((long) i) < j && spliterator.tryAdvance(new C41129B(7)); i++) {
        }
        if (j2 == n0Var.count()) {
            spliterator.forEachRemaining(C);
        } else {
            for (int i2 = 0; ((long) i2) < j3 && spliterator.tryAdvance(C); i2++) {
            }
        }
        C.end();
        return C.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public abstract void mo43812G(Spliterator spliterator, C41171L1 l1);

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract boolean mo43813H(Spliterator spliterator, C41171L1 l1);

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public abstract long mo43814K(Spliterator spliterator);

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public abstract int mo43815P();

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public abstract C41257i0 mo43702T(long j, IntFunction intFunction);

    /* renamed from: W */
    public abstract C41310v1 mo43844W();

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public abstract C41171L1 mo43816X(Spliterator spliterator, C41171L1 l1);

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public abstract C41171L1 mo43817Y(C41171L1 l1);

    /* renamed from: a */
    public Object mo43758a(C41241e0 e0Var, Spliterator spliterator) {
        return ((C41310v1) new C41322y1(this, e0Var, spliterator).invoke()).get();
    }

    /* renamed from: b */
    public /* synthetic */ int mo43759b() {
        return 0;
    }

    /* renamed from: f */
    public Object mo43760f(C41241e0 e0Var, Spliterator spliterator) {
        C41310v1 W = mo43844W();
        e0Var.mo43816X(spliterator, W);
        return W.get();
    }
}
