package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pf */
/* compiled from: PG */
public final class C7196pf {

    /* renamed from: a */
    private final List f23468a;

    /* renamed from: b */
    private final C7073kr[] f23469b;

    public C7196pf(List list) {
        this.f23468a = list;
        this.f23469b = new C7073kr[list.size()];
    }

    /* renamed from: a */
    public final void mo16272a(C7056ka kaVar, C7207pq pqVar) {
        for (int i = 0; i < this.f23469b.length; i++) {
            pqVar.mo16278a();
            C7073kr ak = kaVar.mo16113ak(pqVar.mo16279b(), 3);
            C6864cy cyVar = (C6864cy) this.f23468a.get(i);
            String str = cyVar.f21812l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            ary.m19463p(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = cyVar.f21801a;
            if (str2 == null) {
                str2 = pqVar.mo16280c();
            }
            C6863cx cxVar = new C6863cx();
            cxVar.mo15617S(str2);
            cxVar.mo15630ae(str);
            cxVar.mo15632ag(cyVar.f21804d);
            cxVar.mo15620V(cyVar.f21803c);
            cxVar.mo15604F(cyVar.f21798D);
            cxVar.mo15618T(cyVar.f21814n);
            ak.mo16102a(cxVar.mo15625a());
            this.f23469b[i] = ak;
        }
    }

    /* renamed from: b */
    public final void mo16273b(long j, aee aee) {
        asn.m19528o(j, aee, this.f23469b);
    }
}
