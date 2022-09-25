package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yf */
/* compiled from: PG */
public final class C7439yf {

    /* renamed from: b */
    private static final C7067kl f24379b = new C7067kl();

    /* renamed from: a */
    final C7053jy f24380a;

    /* renamed from: c */
    private final C6864cy f24381c;

    /* renamed from: d */
    private final aes f24382d;

    public C7439yf(C7053jy jyVar, C6864cy cyVar, aes aes) {
        this.f24380a = jyVar;
        this.f24381c = cyVar;
        this.f24382d = aes;
    }

    /* renamed from: a */
    public final void mo16799a(C7056ka kaVar) {
        this.f24380a.mo16108d(kaVar);
    }

    /* renamed from: b */
    public final boolean mo16800b() {
        C7053jy jyVar = this.f24380a;
        return (jyVar instanceof C7166oc) || (jyVar instanceof C7159nw) || (jyVar instanceof C7162nz) || (jyVar instanceof C7107ly);
    }

    /* renamed from: c */
    public final boolean mo16801c() {
        C7053jy jyVar = this.f24380a;
        return (jyVar instanceof C7203pm) || (jyVar instanceof C7128ms);
    }

    /* renamed from: d */
    public final boolean mo16802d(C7050jv jvVar) {
        return this.f24380a.mo16112h(jvVar, f24379b) == 0;
    }

    /* renamed from: e */
    public final C7439yf mo16803e() {
        C7053jy jyVar;
        ary.m19464q(!mo16801c());
        C7053jy jyVar2 = this.f24380a;
        if (jyVar2 instanceof C7470zj) {
            jyVar = new C7470zj(this.f24381c.f21803c, this.f24382d);
        } else if (jyVar2 instanceof C7166oc) {
            jyVar = new C7166oc();
        } else if (jyVar2 instanceof C7159nw) {
            jyVar = new C7159nw();
        } else if (jyVar2 instanceof C7162nz) {
            jyVar = new C7162nz();
        } else if (jyVar2 instanceof C7107ly) {
            jyVar = new C7107ly();
        } else {
            String valueOf = String.valueOf(jyVar2.getClass().getSimpleName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected extractor type for recreation: ".concat(valueOf) : new String("Unexpected extractor type for recreation: "));
        }
        return new C7439yf(jyVar, this.f24381c, this.f24382d);
    }
}
