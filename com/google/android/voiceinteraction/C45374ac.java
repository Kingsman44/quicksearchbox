package com.google.android.voiceinteraction;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.ac */
/* compiled from: PG */
public final /* synthetic */ class C45374ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45378ag f118746a;

    public /* synthetic */ C45374ac(C45378ag agVar) {
        this.f118746a = agVar;
    }

    public final void run() {
        boolean z;
        String str;
        C45378ag agVar = this.f118746a;
        synchronized (agVar.f118751a.f118701aw) {
            GsaVoiceInteractionService gsaVoiceInteractionService = agVar.f118751a;
            String str2 = gsaVoiceInteractionService.f118658aD;
            if (str2 == null || (str = gsaVoiceInteractionService.f118659aE) == null) {
                C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c).mo56372aa(54438)).mo56386p("Missing locale and/or hotword phrase, so cannot recreate AlwaysOnHotwordDetector");
                z = false;
            } else {
                z = gsaVoiceInteractionService.mo49418ag(str2, str, true);
            }
        }
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54439)).mo56389s("Creating new detector? %b", Boolean.valueOf(z));
    }
}
