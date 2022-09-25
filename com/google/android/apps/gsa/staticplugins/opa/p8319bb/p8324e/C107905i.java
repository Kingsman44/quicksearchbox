package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.p6486s.C84268h;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.i */
/* compiled from: PG */
public final /* synthetic */ class C107905i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107849aa f300247a;

    public /* synthetic */ C107905i(C107849aa aaVar) {
        this.f300247a = aaVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107849aa aaVar = this.f300247a;
        C84268h hVar = (C84268h) obj;
        aaVar.mo96310d(C58833ax.m90834k(hVar), C58836b.f156633a);
        if (!hVar.mo77750c().equals("opa")) {
            C59104x d = C107849aa.f300101a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AudioPlayerSubCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(26239)).mo56386p("Current active media session is not for opa.");
        } else if (hVar.mo77749b() == null) {
            C59104x d2 = C107849aa.f300101a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AudioPlayerSubCtrl");
            ((C59052c) ((C59052c) d2).mo56372aa(26238)).mo56386p("Requested OPA media session is null.");
        } else {
            C87684al alVar = new C87684al(C88244um.SEND_MEDIA_SESSION_TOKEN);
            alVar.mo81966c(hVar.mo77749b());
            ((C107932g) aaVar.f300105e.mo27525b()).mo96337a(alVar.mo81964a());
        }
    }
}
