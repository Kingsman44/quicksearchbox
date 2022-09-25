package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yu */
/* compiled from: PG */
final class C7454yu implements C7354vb {

    /* renamed from: a */
    private final int f24477a;

    /* renamed from: b */
    private final C7463zc f24478b;

    /* renamed from: c */
    private int f24479c = -1;

    public C7454yu(C7463zc zcVar, int i) {
        this.f24478b = zcVar;
        this.f24477a = i;
    }

    /* renamed from: g */
    private final boolean m22570g() {
        int i = this.f24479c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    /* renamed from: a */
    public final void mo16834a() {
        ary.m19462o(this.f24479c == -1);
        this.f24479c = this.f24478b.mo16854i(this.f24477a);
    }

    /* renamed from: b */
    public final boolean mo16493b() {
        int i = this.f24479c;
        if (i != -3) {
            return m22570g() && this.f24478b.mo16862u(i);
        }
        return true;
    }

    /* renamed from: c */
    public final void mo16494c() {
        int i = this.f24479c;
        if (i == -2) {
            throw new C7468zh(this.f24478b.mo16853g().mo16656a(this.f24477a).mo16648a(0).f21812l);
        } else if (i == -1) {
            this.f24478b.mo16864z();
        } else if (i != -3) {
            this.f24478b.mo16863y(i);
        }
    }

    /* renamed from: d */
    public final int mo16495d(C6865cz czVar, C7024iw iwVar, boolean z) {
        int i = this.f24479c;
        if (i == -3) {
            iwVar.mo16036g(4);
            return -4;
        } else if (m22570g()) {
            return this.f24478b.mo16843A(i, czVar, iwVar, z);
        } else {
            return -3;
        }
    }

    /* renamed from: e */
    public final int mo16496e(long j) {
        if (m22570g()) {
            return this.f24478b.mo16844B(this.f24479c, j);
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo16835f() {
        if (this.f24479c != -1) {
            this.f24478b.mo16855j(this.f24477a);
            this.f24479c = -1;
        }
    }
}
