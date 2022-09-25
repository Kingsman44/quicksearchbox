package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import com.google.android.apps.gsa.assistant.shared.C73796a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.b */
/* compiled from: PG */
final class C107329b implements C73796a {
    /* renamed from: a */
    public final void mo65274a() {
        C59104x d = C107336f.f298704a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
        ((C59052c) ((C59052c) d).mo56372aa(23629)).mo56386p("connectionCallback is not set when try to notify onServiceConnected.");
    }

    /* renamed from: b */
    public final void mo65275b() {
        C59104x d = C107336f.f298704a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AppIntegCallbackCntlr");
        ((C59052c) ((C59052c) d).mo56372aa(23630)).mo56386p("connectionCallback is not set when try to notify onServiceDisconnected.");
    }
}
