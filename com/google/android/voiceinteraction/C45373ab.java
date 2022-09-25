package com.google.android.voiceinteraction;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.ab */
/* compiled from: PG */
public final /* synthetic */ class C45373ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45378ag f118744a;

    /* renamed from: b */
    public final /* synthetic */ int f118745b;

    public /* synthetic */ C45373ab(C45378ag agVar, int i) {
        this.f118744a = agVar;
        this.f118745b = i;
    }

    public final void run() {
        C45378ag agVar = this.f118744a;
        int i = this.f118745b;
        agVar.f118751a.f118669aO.onAvailabilityChanged(i);
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) c).mo56372aa(54432)).mo56387q("onAvailabilityChanged checkpoint: %d", i);
        if (i == 2) {
            agVar.f118751a.mo49449u();
            agVar.f118751a.f118721q.execute(C47810es.m84977q(new C45377af(agVar)));
        } else if (i != 1) {
            GsaVoiceInteractionService gsaVoiceInteractionService = agVar.f118751a;
            gsaVoiceInteractionService.f118704az = false;
            gsaVoiceInteractionService.f118702ax = null;
            gsaVoiceInteractionService.f118703ay = 0;
            agVar.f118751a.mo49454z(i, "deleted trusted detector");
            agVar.f118751a.mo49453y(true);
        }
    }
}
