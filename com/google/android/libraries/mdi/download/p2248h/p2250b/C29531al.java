package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28797cl;
import com.google.android.libraries.mdi.download.C28803cr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.mdi.download.h.b.al */
/* compiled from: PG */
public final /* synthetic */ class C29531al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80029a;

    public /* synthetic */ C29531al(C29538as asVar) {
        this.f80029a = asVar;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80029a;
        C28797cl clVar = (C28797cl) ((C58833ax) obj).mo56109e(C28797cl.f78255b);
        if (clVar.f78258a.isEmpty()) {
            C29045l.m53931c("%s: No Targeting Criteria found for Corpus %s, skipping sync", "GddFileGroupPopulator", asVar.f80055b.name());
            return C60866ct.f164955a;
        }
        String str = ((C28803cr) clVar.f78258a.get(0)).f78270d;
        if (str.isEmpty()) {
            C29045l.m53931c("%s: Empty configuration id found for corpus %s, skipping sync", "GddFileGroupPopulator", asVar.f80055b.name());
            return C60866ct.f164955a;
        }
        C65753ak akVar = asVar.f80055b;
        C29670b i = C29670b.m54719g(asVar.mo34764a((C60870cx) asVar.f80057d.mo6453a(), C28737bo.GDD_INVALID_ACCOUNT, akVar, str)).mo34822i(new C29528ai(asVar, akVar, str), asVar.f80054a);
        return C29670b.m54719g(C29670b.m54719g(C60856cj.m92897f(C29670b.m54719g(C60856cj.m92907p(i)).mo34822i(new C29529aj(asVar, akVar, str), asVar.f80054a).mo34822i(new C29530ak(asVar, akVar, str), asVar.f80054a), i))).mo34822i(C29577x.f80139a, asVar.f80054a);
    }
}
