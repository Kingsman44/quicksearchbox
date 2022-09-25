package com.google.android.libraries.lens.view.weblrp;

import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.web.base.C43271v;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.weblrp.q */
/* compiled from: PG */
public final /* synthetic */ class C28203q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C28205s f76768a;

    public /* synthetic */ C28203q(C28205s sVar) {
        this.f76768a = sVar;
    }

    public final Object apply(Object obj) {
        C28205s sVar = this.f76768a;
        Void voidR = (Void) obj;
        sVar.f76773d.mo19974a(C37194a.f98614do.mo40815i(C62722b.OK));
        if ((!sVar.f76775f.mo30591a() || !sVar.f76771b.mo31462g(C26239a.ONELRP_DOMAIN_PREWARM)) && (!sVar.f76775f.mo30592b() || !sVar.f76771b.mo31462g(C26239a.ONELRP_DOMAIN_PREWARM_POSTCAPTURE))) {
            return null;
        }
        String f = sVar.f76771b.mo31461f(C26239a.ONELRP_PREWARM_URL);
        if (true == f.isEmpty()) {
            f = "about:blank";
        }
        ((C59052c) ((C59052c) C28205s.f76770a.mo56224b()).mo56372aa(50331)).mo56389s("Prewarming domain: %s", f);
        sVar.f76773d.mo19974a(C37194a.f98615dp);
        sVar.f76777h.mo69424a(sVar.f76774e.mo47043a(C43271v.WEB_VIEW)).mo46502a(f);
        sVar.f76773d.mo19974a(C37194a.f98616dq);
        return null;
    }
}
