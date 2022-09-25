package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hx */
/* compiled from: PG */
public final class C6998hx {

    /* renamed from: a */
    private final C6971gx[] f22334a;

    /* renamed from: b */
    private final C7015in f22335b;

    /* renamed from: c */
    private final C7017ip f22336c;

    public C6998hx(C6971gx... gxVarArr) {
        C7015in inVar = new C7015in();
        C7017ip ipVar = new C7017ip();
        C6971gx[] gxVarArr2 = new C6971gx[2];
        this.f22334a = gxVarArr2;
        System.arraycopy(gxVarArr, 0, gxVarArr2, 0, 0);
        this.f22335b = inVar;
        this.f22336c = ipVar;
        gxVarArr2[0] = inVar;
        gxVarArr2[1] = ipVar;
    }

    /* renamed from: a */
    public final C6971gx[] mo15995a() {
        return this.f22334a;
    }

    /* renamed from: b */
    public final C6888dv mo15996b(C6888dv dvVar) {
        C7017ip ipVar = this.f22336c;
        float f = dvVar.f21945b;
        ipVar.mo16026k(f);
        C7017ip ipVar2 = this.f22336c;
        float f2 = dvVar.f21946c;
        ipVar2.mo16025j(f2);
        return new C6888dv(f, f2);
    }

    /* renamed from: c */
    public final long mo15997c(long j) {
        return this.f22336c.mo16024i(j);
    }

    /* renamed from: d */
    public final long mo15998d() {
        return this.f22335b.mo16018p();
    }

    /* renamed from: e */
    public final void mo15999e(boolean z) {
        this.f22335b.mo16017o(z);
    }
}
