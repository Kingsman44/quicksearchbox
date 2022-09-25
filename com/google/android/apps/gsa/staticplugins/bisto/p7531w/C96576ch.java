package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ch */
/* compiled from: PG */
public final /* synthetic */ class C96576ch implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96577ci f270178a;

    public /* synthetic */ C96576ch(C96577ci ciVar) {
        this.f270178a = ciVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96577ci ciVar = this.f270178a;
        Exception exc = (Exception) obj;
        if (exc instanceof C96584cp) {
            C59104x c = C96577ci.f270179a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaStateWFAU");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(16675)).mo56386p("Failed to apply OTA. Fatal error");
            ciVar.mo90226c();
        } else if (!ciVar.mo90244t()) {
            C59104x c2 = C96577ci.f270179a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OtaStateWFAU");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(exc)).mo56372aa(16674)).mo56386p("Failed to apply OTA. Fatal error");
            ciVar.mo90240o(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER);
        }
    }
}
