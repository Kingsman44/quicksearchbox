package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ps */
/* compiled from: PG */
final class C7209ps {

    /* renamed from: a */
    private final List f23523a;

    /* renamed from: b */
    private final C7073kr[] f23524b;

    public C7209ps(List list) {
        this.f23523a = list;
        this.f23524b = new C7073kr[list.size()];
    }

    /* renamed from: a */
    public final void mo16281a(C7056ka kaVar, C7207pq pqVar) {
        for (int i = 0; i < this.f23524b.length; i++) {
            pqVar.mo16278a();
            C7073kr ak = kaVar.mo16113ak(pqVar.mo16279b(), 3);
            C6864cy cyVar = (C6864cy) this.f23523a.get(i);
            String str = cyVar.f21812l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            ary.m19463p(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            C6863cx cxVar = new C6863cx();
            cxVar.mo15617S(pqVar.mo16280c());
            cxVar.mo15630ae(str);
            cxVar.mo15632ag(cyVar.f21804d);
            cxVar.mo15620V(cyVar.f21803c);
            cxVar.mo15604F(cyVar.f21798D);
            cxVar.mo15618T(cyVar.f21814n);
            ak.mo16102a(cxVar.mo15625a());
            this.f23524b[i] = ak;
        }
    }

    /* renamed from: b */
    public final void mo16282b(long j, aee aee) {
        if (aee.mo14550d() >= 9) {
            int v = aee.mo14568v();
            int v2 = aee.mo14568v();
            int n = aee.mo14560n();
            if (v == 434 && v2 == 1195456820 && n == 3) {
                asn.m19529p(j, aee, this.f23524b);
            }
        }
    }
}
