package com.google.android.voiceinteraction;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.af */
/* compiled from: PG */
public final /* synthetic */ class C45377af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45378ag f118750a;

    public /* synthetic */ C45377af(C45378ag agVar) {
        this.f118750a = agVar;
    }

    public final void run() {
        C45378ag agVar = this.f118750a;
        if (agVar.f118751a.f118655aA.get() && agVar.f118751a.mo49413ab() && agVar.f118751a.mo49420ai()) {
            agVar.f118751a.f118712h = true;
            C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b).mo56372aa(54456)).mo56386p("Hotword Started for AlwaysRunDsp");
        }
    }
}
