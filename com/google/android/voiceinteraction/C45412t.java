package com.google.android.voiceinteraction;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.t */
/* compiled from: PG */
public final /* synthetic */ class C45412t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45413u f118788a;

    public /* synthetic */ C45412t(C45413u uVar) {
        this.f118788a = uVar;
    }

    public final void run() {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118788a.f118789a;
        gsaVoiceInteractionService.f118655aA.set(false);
        if (gsaVoiceInteractionService.f118703ay == 2) {
            gsaVoiceInteractionService.mo49421aj(true);
            gsaVoiceInteractionService.f118712h = false;
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) c).mo56372aa(54590)).mo56386p("Can't stop hotword. Availability is not enrolled");
    }
}
