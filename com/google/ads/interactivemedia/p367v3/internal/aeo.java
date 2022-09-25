package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aeo */
/* compiled from: PG */
public final class aeo implements adw {

    /* renamed from: a */
    private final adk f20452a;

    /* renamed from: b */
    private boolean f20453b;

    /* renamed from: c */
    private long f20454c;

    /* renamed from: d */
    private long f20455d;

    /* renamed from: e */
    private C6888dv f20456e = C6888dv.f21944a;

    public aeo(adk adk) {
        this.f20452a = adk;
    }

    /* renamed from: a */
    public final void mo14589a() {
        if (!this.f20453b) {
            this.f20455d = this.f20452a.mo14486a();
            this.f20453b = true;
        }
    }

    /* renamed from: b */
    public final void mo14590b() {
        if (this.f20453b) {
            mo14591c(mo14520g());
            this.f20453b = false;
        }
    }

    /* renamed from: c */
    public final void mo14591c(long j) {
        this.f20454c = j;
        if (this.f20453b) {
            this.f20455d = this.f20452a.mo14486a();
        }
    }

    /* renamed from: g */
    public final long mo14520g() {
        long j;
        long j2 = this.f20454c;
        if (!this.f20453b) {
            return j2;
        }
        long a = this.f20452a.mo14486a() - this.f20455d;
        C6888dv dvVar = this.f20456e;
        if (dvVar.f21945b == 1.0f) {
            j = C6821bi.m19755b(a);
        } else {
            j = dvVar.mo15739a(a);
        }
        return j2 + j;
    }

    /* renamed from: h */
    public final void mo14521h(C6888dv dvVar) {
        if (this.f20453b) {
            mo14591c(mo14520g());
        }
        this.f20456e = dvVar;
    }

    /* renamed from: i */
    public final C6888dv mo14522i() {
        return this.f20456e;
    }
}
