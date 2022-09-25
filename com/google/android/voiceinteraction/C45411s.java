package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.voiceinteraction.hotword.C118719g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.s */
/* compiled from: PG */
public final /* synthetic */ class C45411s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45413u f118787a;

    public /* synthetic */ C45411s(C45413u uVar) {
        this.f118787a = uVar;
    }

    public final void run() {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118787a.f118789a;
        if (gsaVoiceInteractionService.f118703ay != 2) {
            C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c).mo56372aa(54578)).mo56386p("Can't start hotword. Availability is not enrolled");
        } else if (gsaVoiceInteractionService.f118702ax == null) {
            gsaVoiceInteractionService.f118655aA.set(true);
            synchronized (gsaVoiceInteractionService.f118701aw) {
                gsaVoiceInteractionService.mo49418ag(gsaVoiceInteractionService.f118658aD, gsaVoiceInteractionService.f118659aE, true);
            }
            C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b).mo56372aa(54581)).mo56386p("creating AlwaysOnHotwordDetector before starting hotword.");
        } else if (gsaVoiceInteractionService.mo49420ai()) {
            gsaVoiceInteractionService.f118712h = true;
            C58976aa aaVar = C58975e.f156826a;
            synchronized (gsaVoiceInteractionService.f118726v) {
                C118719g gVar = gsaVoiceInteractionService.f118632D;
                if (gVar != null) {
                    gVar.mo103910b();
                } else if (!gsaVoiceInteractionService.f118704az) {
                    C59104x c2 = GsaVoiceInteractionService.f118622a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                    ((C59052c) ((C59052c) c2).mo56372aa(54580)).mo56386p("Missing hotword detector.");
                }
            }
        }
    }
}
