package p3186j$.util.stream;

import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.c */
abstract class C41232c extends C41241e0 implements BaseStream {

    /* renamed from: h */
    private final C41232c f107852h;

    /* renamed from: i */
    private final C41232c f107853i;

    /* renamed from: j */
    protected final int f107854j;

    /* renamed from: k */
    private C41232c f107855k;

    /* renamed from: l */
    private int f107856l;

    /* renamed from: m */
    private int f107857m;

    /* renamed from: n */
    private Spliterator f107858n;

    /* renamed from: o */
    private boolean f107859o;

    /* renamed from: p */
    private boolean f107860p;

    /* renamed from: q */
    private Runnable f107861q;

    /* renamed from: r */
    private boolean f107862r;

    C41232c(Spliterator spliterator, int i, boolean z) {
        this.f107853i = null;
        this.f107858n = spliterator;
        this.f107852h = this;
        int i2 = C41259i2.f107923g & i;
        this.f107854j = i2;
        this.f107857m = ((i2 << 1) ^ -1) & C41259i2.f107928l;
        this.f107856l = 0;
        this.f107862r = z;
    }

    C41232c(C41232c cVar, int i) {
        if (!cVar.f107859o) {
            cVar.f107859o = true;
            cVar.f107855k = this;
            this.f107853i = cVar;
            this.f107854j = C41259i2.f107924h & i;
            this.f107857m = C41259i2.m72149b(i, cVar.f107857m);
            C41232c cVar2 = cVar.f107852h;
            this.f107852h = cVar2;
            if (mo43657k0()) {
                cVar2.f107860p = true;
            }
            this.f107856l = cVar.f107856l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* renamed from: m0 */
    private Spliterator m72018m0(int i) {
        int i2;
        int i3;
        C41232c cVar = this.f107852h;
        Spliterator spliterator = cVar.f107858n;
        if (spliterator != null) {
            cVar.f107858n = null;
            if (cVar.f107862r && cVar.f107860p) {
                C41232c cVar2 = cVar.f107855k;
                int i4 = 1;
                while (cVar != this) {
                    int i5 = cVar2.f107854j;
                    if (cVar2.mo43657k0()) {
                        if (C41259i2.SHORT_CIRCUIT.mo43855g(i5)) {
                            i5 &= C41259i2.f107937u ^ -1;
                        }
                        spliterator = cVar2.mo43780j0(cVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i3 = (C41259i2.f107936t ^ -1) & i5;
                            i2 = C41259i2.f107935s;
                        } else {
                            i3 = (C41259i2.f107935s ^ -1) & i5;
                            i2 = C41259i2.f107936t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    cVar2.f107856l = i4;
                    cVar2.f107857m = C41259i2.m72149b(i5, cVar.f107857m);
                    i4++;
                    C41232c cVar3 = cVar2;
                    cVar2 = cVar2.f107855k;
                    cVar = cVar3;
                }
            }
            if (i != 0) {
                this.f107857m = C41259i2.m72149b(i, this.f107857m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo43812G(Spliterator spliterator, C41171L1 l1) {
        Objects.requireNonNull(l1);
        if (!C41259i2.SHORT_CIRCUIT.mo43855g(this.f107857m)) {
            l1.mo43663c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(l1);
            l1.end();
            return;
        }
        mo43813H(spliterator, l1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean mo43813H(Spliterator spliterator, C41171L1 l1) {
        C41232c cVar = this;
        while (cVar.f107856l > 0) {
            cVar = cVar.f107853i;
        }
        l1.mo43663c(spliterator.getExactSizeIfKnown());
        boolean d0 = cVar.mo43708d0(spliterator, l1);
        l1.end();
        return d0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final long mo43814K(Spliterator spliterator) {
        if (C41259i2.SIZED.mo43855g(this.f107857m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final int mo43815P() {
        return this.f107857m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final C41171L1 mo43816X(Spliterator spliterator, C41171L1 l1) {
        mo43812G(spliterator, mo43817Y((C41171L1) Objects.requireNonNull(l1)));
        return l1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final C41171L1 mo43817Y(C41171L1 l1) {
        Objects.requireNonNull(l1);
        C41232c cVar = this;
        while (cVar.f107856l > 0) {
            C41232c cVar2 = cVar.f107853i;
            l1 = cVar.mo43658l0(cVar2.f107857m, l1);
            cVar = cVar2;
        }
        return l1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final C41277n0 mo43818Z(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.f107852h.f107862r) {
            return mo43705c0(this, spliterator, z, intFunction);
        }
        C41257i0 T = mo43702T(mo43814K(spliterator), intFunction);
        mo43816X(spliterator, T);
        return T.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final Object mo43819a0(C41199S2 s2) {
        if (!this.f107859o) {
            this.f107859o = true;
            if (this.f107852h.f107862r) {
                return s2.mo43758a(this, m72018m0(s2.mo43759b()));
            }
            return s2.mo43760f(this, m72018m0(s2.mo43759b()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final C41277n0 mo43820b0(IntFunction intFunction) {
        C41232c cVar;
        if (!this.f107859o) {
            this.f107859o = true;
            if (!this.f107852h.f107862r || (cVar = this.f107853i) == null || !mo43657k0()) {
                return mo43818Z(m72018m0(0), true, intFunction);
            }
            this.f107856l = 0;
            return mo43779i0(cVar.m72018m0(0), intFunction, cVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public abstract C41277n0 mo43705c0(C41241e0 e0Var, Spliterator spliterator, boolean z, IntFunction intFunction);

    public final void close() {
        this.f107859o = true;
        this.f107858n = null;
        C41232c cVar = this.f107852h;
        Runnable runnable = cVar.f107861q;
        if (runnable != null) {
            cVar.f107861q = null;
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public abstract boolean mo43708d0(Spliterator spliterator, C41171L1 l1);

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public abstract C41263j2 mo43710e0();

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final C41263j2 mo43821f0() {
        C41232c cVar = this;
        while (cVar.f107856l > 0) {
            cVar = cVar.f107853i;
        }
        return cVar.mo43710e0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final boolean mo43822g0() {
        return C41259i2.ORDERED.mo43855g(this.f107857m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ Spliterator mo43823h0() {
        return m72018m0(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public C41277n0 mo43779i0(Spliterator spliterator, IntFunction intFunction, C41232c cVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public final boolean isParallel() {
        return this.f107852h.f107862r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public Spliterator mo43780j0(C41232c cVar, Spliterator spliterator) {
        return mo43779i0(spliterator, new C41228b(0), cVar).spliterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public abstract boolean mo43657k0();

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public abstract C41171L1 mo43658l0(int i, C41171L1 l1);

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final Spliterator mo43824n0() {
        C41232c cVar = this.f107852h;
        if (this != cVar) {
            throw new IllegalStateException();
        } else if (!this.f107859o) {
            this.f107859o = true;
            Spliterator spliterator = cVar.f107858n;
            if (spliterator != null) {
                cVar.f107858n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public abstract Spliterator mo43723o0(C41241e0 e0Var, C41224a aVar, boolean z);

    public final BaseStream onClose(Runnable runnable) {
        if (!this.f107859o) {
            Objects.requireNonNull(runnable);
            C41232c cVar = this.f107852h;
            Runnable runnable2 = cVar.f107861q;
            if (runnable2 != null) {
                runnable = new C41180N2(0, runnable2, runnable);
            }
            cVar.f107861q = runnable;
            return this;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final Spliterator mo43825p0(Spliterator spliterator) {
        if (this.f107856l == 0) {
            return spliterator;
        }
        return mo43723o0(this, new C41224a(0, spliterator), this.f107852h.f107862r);
    }

    public final BaseStream sequential() {
        this.f107852h.f107862r = false;
        return this;
    }

    public final Spliterator spliterator() {
        if (!this.f107859o) {
            this.f107859o = true;
            C41232c cVar = this.f107852h;
            if (this != cVar) {
                return mo43723o0(this, new C41224a(1, this), cVar.f107862r);
            }
            Spliterator spliterator = cVar.f107858n;
            if (spliterator != null) {
                cVar.f107858n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
