package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bm */
/* compiled from: PG */
final class C6825bm implements adw {

    /* renamed from: a */
    private final aeo f21626a;

    /* renamed from: b */
    private final C6824bl f21627b;

    /* renamed from: c */
    private C6897ed f21628c;

    /* renamed from: d */
    private adw f21629d;

    /* renamed from: e */
    private boolean f21630e = true;

    /* renamed from: f */
    private boolean f21631f;

    public C6825bm(C6824bl blVar, adk adk) {
        this.f21627b = blVar;
        this.f21626a = new aeo(adk);
    }

    /* renamed from: a */
    public final void mo15541a() {
        this.f21631f = true;
        this.f21626a.mo14589a();
    }

    /* renamed from: b */
    public final void mo15542b() {
        this.f21631f = false;
        this.f21626a.mo14590b();
    }

    /* renamed from: c */
    public final void mo15543c(long j) {
        this.f21626a.mo14591c(j);
    }

    /* renamed from: d */
    public final void mo15544d(C6897ed edVar) {
        adw adw;
        adw d = edVar.mo15515d();
        if (d != null && d != (adw = this.f21629d)) {
            if (adw == null) {
                this.f21629d = d;
                this.f21628c = edVar;
                d.mo14521h(this.f21626a.mo14522i());
                return;
            }
            throw C6826bn.m19782c(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: e */
    public final void mo15545e(C6897ed edVar) {
        if (edVar == this.f21628c) {
            this.f21629d = null;
            this.f21628c = null;
            this.f21630e = true;
        }
    }

    /* renamed from: f */
    public final long mo15546f(boolean z) {
        C6897ed edVar = this.f21628c;
        if (edVar == null || edVar.mo15783N() || (!this.f21628c.mo14621M() && (z || this.f21628c.mo15518j()))) {
            this.f21630e = true;
            if (this.f21631f) {
                this.f21626a.mo14589a();
            }
        } else {
            adw adw = this.f21629d;
            ary.m19467t(adw);
            long g = adw.mo14520g();
            if (this.f21630e) {
                if (g < this.f21626a.mo14520g()) {
                    this.f21626a.mo14590b();
                } else {
                    this.f21630e = false;
                    if (this.f21631f) {
                        this.f21626a.mo14589a();
                    }
                }
            }
            this.f21626a.mo14591c(g);
            C6888dv i = adw.mo14522i();
            if (!i.equals(this.f21626a.mo14522i())) {
                this.f21626a.mo14521h(i);
                this.f21627b.mo15540a(i);
            }
        }
        return mo14520g();
    }

    /* renamed from: g */
    public final long mo14520g() {
        if (this.f21630e) {
            return this.f21626a.mo14520g();
        }
        adw adw = this.f21629d;
        ary.m19467t(adw);
        return adw.mo14520g();
    }

    /* renamed from: h */
    public final void mo14521h(C6888dv dvVar) {
        adw adw = this.f21629d;
        if (adw != null) {
            adw.mo14521h(dvVar);
            dvVar = this.f21629d.mo14522i();
        }
        this.f21626a.mo14521h(dvVar);
    }

    /* renamed from: i */
    public final C6888dv mo14522i() {
        adw adw = this.f21629d;
        return adw != null ? adw.mo14522i() : this.f21626a.mo14522i();
    }
}
