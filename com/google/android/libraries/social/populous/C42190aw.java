package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.C42264aq;
import com.google.android.libraries.social.populous.core.C42284bj;
import com.google.android.libraries.social.populous.p3295d.C42375i;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.aw */
/* compiled from: PG */
final class C42190aw implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C42188au f110493a;

    /* renamed from: b */
    final /* synthetic */ C58872ci f110494b;

    /* renamed from: c */
    final /* synthetic */ C42201bf f110495c;

    /* renamed from: d */
    final /* synthetic */ List f110496d;

    /* renamed from: e */
    final /* synthetic */ C42193az f110497e;

    public C42190aw(C42193az azVar, C42188au auVar, C58872ci ciVar, C42201bf bfVar, List list) {
        this.f110497e = azVar;
        this.f110493a = auVar;
        this.f110494b = ciVar;
        this.f110495c = bfVar;
        this.f110496d = list;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C42264aq c = C42264aq.m74421c(9, C42284bj.m74440a(th));
        C42188au auVar = this.f110493a;
        C58495hd hdVar = C58729pv.f156485a;
        C42198bc f = C42199bd.m74152f();
        f.mo44887c(true);
        f.mo44888d(C58528ij.m90006F(this.f110496d));
        f.mo44886b(C58485gu.m89846n(c));
        C42593n nVar = (C42593n) f;
        nVar.f111760b = 3;
        nVar.f111759a = 0;
        auVar.mo44880b(hdVar, f.mo44885a());
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar;
        C42375i iVar = (C42375i) obj;
        if (iVar.f111124d.isEmpty()) {
            guVar = iVar.f111123c.mo55229u();
        } else {
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(iVar.f111123c);
            e.mo55396h(iVar.f111124d);
            guVar = e.mo55394f();
        }
        C58485gu guVar2 = guVar;
        C58495hd b = this.f110497e.mo44882b(iVar, C58733pz.f156496a);
        C42198bc f = C42199bd.m74152f();
        f.mo44887c(iVar.f111123c.isEmpty());
        f.mo44888d(iVar.f111122b);
        C42593n nVar = (C42593n) f;
        nVar.f111760b = 3;
        nVar.f111759a = 0;
        f.mo44886b(C58485gu.m89845m());
        this.f110493a.mo44880b(b, f.mo44885a());
        if (!guVar2.isEmpty()) {
            C42193az azVar = this.f110497e;
            C58528ij ijVar = iVar.f111123c;
            C58528ij ijVar2 = iVar.f111124d;
            C42188au auVar = this.f110493a;
            C58872ci ciVar = this.f110494b;
            C42201bf bfVar = this.f110495c;
            C60870cx a = azVar.f110510b.mo45357a(azVar.f110509a, guVar2);
            azVar.mo44884d(a, 10, ciVar);
            C60856cj.m92911t(a, new C42191ax(azVar, ijVar, guVar2, bfVar, ijVar2, auVar, ciVar), azVar.f110512d);
        }
    }
}
