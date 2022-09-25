package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.apps.gsa.search.core.p.bq */
/* compiled from: PG */
public final /* synthetic */ class C86234bq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C86237bt f233059a;

    /* renamed from: b */
    public final /* synthetic */ C86221bd f233060b;

    /* renamed from: c */
    public final /* synthetic */ C86236bs f233061c;

    public /* synthetic */ C86234bq(C86237bt btVar, C86221bd bdVar, C86236bs bsVar) {
        this.f233059a = btVar;
        this.f233060b = bdVar;
        this.f233061c = bsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C86237bt btVar = this.f233059a;
        C86221bd bdVar = this.f233060b;
        C86236bs bsVar = this.f233061c;
        if (((C58833ax) obj).mo56113h() && !bdVar.mo79881Q()) {
            btVar.f233068d.add(bsVar);
            C58557jl.m90145z(btVar.f233068d, C86233bp.f233058a);
            int a = (int) btVar.f233066b.mo79743a(C90120fr.f250822an);
            while (btVar.f233068d.size() > a) {
                C86236bs bsVar2 = (C86236bs) btVar.f233068d.poll();
                if (bsVar2 != null && !bsVar2.f233063a.mo79881Q()) {
                    bsVar2.mo79903a();
                }
            }
        }
    }
}
