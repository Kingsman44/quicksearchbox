package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.assistant.shared.p5812e.C73858p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.x */
/* compiled from: PG */
public final class C45416x {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118791a;

    public C45416x(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118791a = gsaVoiceInteractionService;
    }

    /* renamed from: a */
    public final void mo49530a(String str) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        C73858p pVar = new C73858p();
        pVar.f195165a = false;
        pVar.f195166b = str;
        mo49531b(pVar);
    }

    /* renamed from: b */
    public final void mo49531b(C73858p pVar) {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118791a;
        if (gsaVoiceInteractionService.f118730z != null) {
            gsaVoiceInteractionService.f118694ap.add(pVar);
            if (this.f118791a.f118730z.mo81951w()) {
                this.f118791a.mo49400O();
            } else {
                this.f118791a.f118660aF.sendEmptyMessage(5);
            }
        }
    }
}
