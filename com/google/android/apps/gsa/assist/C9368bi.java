package com.google.android.apps.gsa.assist;

import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120077w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assist.bi */
/* compiled from: PG */
public final /* synthetic */ class C9368bi implements C120077w {

    /* renamed from: a */
    public final /* synthetic */ C9397cb f32528a;

    public /* synthetic */ C9368bi(C9397cb cbVar) {
        this.f32528a = cbVar;
    }

    /* renamed from: a */
    public final void mo17549a() {
        C9397cb cbVar = this.f32528a;
        C59104x b = C9397cb.f32567a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSess");
        ((C59052c) ((C59052c) b).mo56372aa('s')).mo56386p("onSessionConformityCommand");
        cbVar.f32613j.mo28212l("[NGA] finishOnUiThread", new C9369bj(cbVar));
    }
}
