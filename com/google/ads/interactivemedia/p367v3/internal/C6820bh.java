package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bh */
/* compiled from: PG */
public abstract class C6820bh implements C6897ed, C6898ee {

    /* renamed from: a */
    private final int f21594a;

    /* renamed from: b */
    private final C6865cz f21595b = new C6865cz();

    /* renamed from: c */
    private C6899ef f21596c;

    /* renamed from: d */
    private int f21597d;

    /* renamed from: e */
    private int f21598e;

    /* renamed from: f */
    private C7354vb f21599f;

    /* renamed from: g */
    private C6864cy[] f21600g;

    /* renamed from: h */
    private long f21601h;

    /* renamed from: i */
    private long f21602i = Long.MIN_VALUE;

    /* renamed from: j */
    private boolean f21603j;

    /* renamed from: k */
    private boolean f21604k;

    public C6820bh(int i) {
        this.f21594a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final C6865cz mo15500A() {
        this.f21595b.mo15646a();
        return this.f21595b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final C6864cy[] mo15501B() {
        return (C6864cy[]) ary.m19467t(this.f21600g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final C6899ef mo15502C() {
        C6899ef efVar = this.f21596c;
        ary.m19467t(efVar);
        return efVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final C6826bn mo15503D(Exception exc, C6864cy cyVar) {
        return mo15504E(exc, cyVar, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final C6826bn mo15504E(Exception exc, C6864cy cyVar, boolean z) {
        int i;
        if (cyVar != null && !this.f21604k) {
            this.f21604k = true;
            try {
                int r = asn.m19531r(mo15784O(cyVar));
                this.f21604k = false;
                i = r;
            } catch (C6826bn unused) {
                this.f21604k = false;
            } catch (Throwable th) {
                this.f21604k = false;
                throw th;
            }
            return C6826bn.m19781b(exc, mo14620K(), this.f21597d, cyVar, i, z);
        }
        i = 4;
        return C6826bn.m19781b(exc, mo14620K(), this.f21597d, cyVar, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final int mo15505F(C6865cz czVar, C7024iw iwVar, boolean z) {
        C7354vb vbVar = this.f21599f;
        ary.m19467t(vbVar);
        int d = vbVar.mo16495d(czVar, iwVar, z);
        if (d == -4) {
            if (iwVar.mo16032c()) {
                this.f21602i = Long.MIN_VALUE;
                if (this.f21603j) {
                    return -4;
                }
                return -3;
            }
            long j = iwVar.f22517d + this.f21601h;
            iwVar.f22517d = j;
            this.f21602i = Math.max(this.f21602i, j);
            return d;
        } else if (d != -5) {
            return d;
        } else {
            C6864cy cyVar = czVar.f21827a;
            ary.m19467t(cyVar);
            if (cyVar.f21816p == Long.MAX_VALUE) {
                return -5;
            }
            C6863cx a = cyVar.mo15636a();
            a.mo15634ai(cyVar.f21816p + this.f21601h);
            czVar.f21827a = a.mo15625a();
            return -5;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo15506G(long j) {
        C7354vb vbVar = this.f21599f;
        ary.m19467t(vbVar);
        return vbVar.mo16496e(j - this.f21601h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo15507H() {
        if (mo15518j()) {
            return this.f21603j;
        }
        C7354vb vbVar = this.f21599f;
        ary.m19467t(vbVar);
        return vbVar.mo16493b();
    }

    /* renamed from: I */
    public void mo14619I(float f) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo15508J(long j, long j2) {
        throw null;
    }

    /* renamed from: a */
    public final int mo15509a() {
        return this.f21594a;
    }

    /* renamed from: aX */
    public final void mo15510aX() {
        boolean z = true;
        if (this.f21598e != 1) {
            z = false;
        }
        ary.m19464q(z);
        this.f21598e = 2;
        mo14649w();
    }

    /* renamed from: aY */
    public final void mo15511aY(C6864cy[] cyVarArr, C7354vb vbVar, long j, long j2) {
        ary.m19464q(!this.f21603j);
        this.f21599f = vbVar;
        this.f21602i = j2;
        this.f21600g = cyVarArr;
        this.f21601h = j2;
        mo15508J(j, j2);
    }

    /* renamed from: aZ */
    public final C7354vb mo15512aZ() {
        return this.f21599f;
    }

    /* renamed from: b */
    public final C6898ee mo15513b() {
        return this;
    }

    /* renamed from: c */
    public final void mo15514c(int i) {
        this.f21597d = i;
    }

    /* renamed from: d */
    public adw mo15515d() {
        return null;
    }

    /* renamed from: e */
    public final int mo15516e() {
        return this.f21598e;
    }

    /* renamed from: f */
    public final void mo15517f(C6899ef efVar, C6864cy[] cyVarArr, C7354vb vbVar, long j, boolean z, boolean z2, long j2, long j3) {
        boolean z3 = z;
        ary.m19464q(this.f21598e == 0);
        this.f21596c = efVar;
        this.f21598e = 1;
        mo14647u(z, z2);
        mo15511aY(cyVarArr, vbVar, j2, j3);
        long j4 = j;
        mo14648v(j, z);
    }

    /* renamed from: j */
    public final boolean mo15518j() {
        return this.f21602i == Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final long mo15519k() {
        return this.f21602i;
    }

    /* renamed from: l */
    public final void mo15520l() {
        this.f21603j = true;
    }

    /* renamed from: m */
    public final boolean mo15521m() {
        return this.f21603j;
    }

    /* renamed from: n */
    public final void mo15522n() {
        C7354vb vbVar = this.f21599f;
        ary.m19467t(vbVar);
        vbVar.mo16494c();
    }

    /* renamed from: o */
    public final void mo15523o(long j) {
        this.f21603j = false;
        this.f21602i = j;
        mo14648v(j, false);
    }

    /* renamed from: p */
    public final void mo15524p() {
        ary.m19464q(this.f21598e == 2);
        this.f21598e = 1;
        mo14650x();
    }

    /* renamed from: q */
    public final void mo15525q() {
        boolean z = true;
        if (this.f21598e != 1) {
            z = false;
        }
        ary.m19464q(z);
        this.f21595b.mo15646a();
        this.f21598e = 0;
        this.f21599f = null;
        this.f21600g = null;
        this.f21603j = false;
        mo14651y();
    }

    /* renamed from: r */
    public final void mo15526r() {
        ary.m19464q(this.f21598e == 0);
        this.f21595b.mo15646a();
        mo14652z();
    }

    /* renamed from: s */
    public int mo15527s() {
        throw null;
    }

    /* renamed from: t */
    public void mo14646t(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo14647u(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo14648v(long j, boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo14649w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo14650x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo14651y() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo14652z() {
    }
}
