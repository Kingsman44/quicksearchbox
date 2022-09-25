package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ow */
/* compiled from: PG */
public final class C7186ow implements C7194pd {

    /* renamed from: a */
    private C6864cy f23412a;

    /* renamed from: b */
    private aes f23413b;

    /* renamed from: c */
    private C7073kr f23414c;

    public C7186ow(String str) {
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae(str);
        this.f23412a = cxVar.mo15625a();
    }

    /* renamed from: a */
    public final void mo16255a(aes aes, C7056ka kaVar, C7207pq pqVar) {
        this.f23413b = aes;
        pqVar.mo16278a();
        C7073kr ak = kaVar.mo16113ak(pqVar.mo16279b(), 4);
        this.f23414c = ak;
        ak.mo16102a(this.f23412a);
    }

    /* renamed from: b */
    public final void mo16256b(aee aee) {
        ary.m19466s(this.f23413b);
        int i = aeu.f20466a;
        long d = this.f23413b.mo14600d();
        if (d != -9223372036854775807L) {
            C6864cy cyVar = this.f23412a;
            if (d != cyVar.f21816p) {
                C6863cx a = cyVar.mo15636a();
                a.mo15634ai(d);
                C6864cy a2 = a.mo15625a();
                this.f23412a = a2;
                this.f23414c.mo16102a(a2);
            }
            int d2 = aee.mo14550d();
            this.f23414c.mo16105d(aee, d2);
            this.f23414c.mo16103b(this.f23413b.mo14599c(), 1, d2, 0, (C7072kq) null);
        }
    }
}
