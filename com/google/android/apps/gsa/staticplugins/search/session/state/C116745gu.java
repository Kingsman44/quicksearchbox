package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gu */
/* compiled from: PG */
public final /* synthetic */ class C116745gu implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116755hd f323837a;

    public /* synthetic */ C116745gu(C116755hd hdVar) {
        this.f323837a = hdVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116755hd hdVar = this.f323837a;
        Exception exc = (Exception) obj;
        if (hdVar.f323863H) {
            hdVar.f323863H = false;
            hdVar.f323877j.mo78795f();
        }
        C59104x c = C116755hd.f323854a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "S_SearchPlateState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(32211)).mo56386p("Unable to play TTS for the language switcher nudge");
    }
}
