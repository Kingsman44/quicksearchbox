package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d;

import com.google.android.apps.gsa.p6486s.C84268h;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.d.a */
/* compiled from: PG */
public final /* synthetic */ class C94777a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94783g f265011a;

    public /* synthetic */ C94777a(C94783g gVar) {
        this.f265011a = gVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94783g gVar = this.f265011a;
        C84268h hVar = (C84268h) obj;
        if (!hVar.mo77750c().equals("opa")) {
            C59104x d = C94783g.f265020a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoAudioPlayerSubCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(16909)).mo56386p("Current active media session is not for opa.");
        } else if (hVar.mo77749b() == null) {
            C59104x d2 = C94783g.f265020a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "BistoAudioPlayerSubCtrl");
            ((C59052c) ((C59052c) d2).mo56372aa(16908)).mo56386p("Requested OPA media session is null.");
        } else {
            C87684al alVar = new C87684al(C88244um.SEND_MEDIA_SESSION_TOKEN);
            alVar.mo81966c(hVar.mo77749b());
            ((C107932g) gVar.f265024e.mo27525b()).mo96337a(alVar.mo81964a());
        }
    }
}
