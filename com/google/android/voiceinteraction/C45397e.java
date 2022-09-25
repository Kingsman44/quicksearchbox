package com.google.android.voiceinteraction;

import com.google.android.hotword.service.HotwordService;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.e */
/* compiled from: PG */
public final /* synthetic */ class C45397e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GsaVoiceInteractionService f118767a;

    public /* synthetic */ C45397e(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118767a = gsaVoiceInteractionService;
    }

    public final void run() {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118767a;
        synchronized (gsaVoiceInteractionService.f118725u) {
            if (gsaVoiceInteractionService.f118661aG == null) {
                gsaVoiceInteractionService.bindService(HotwordService.m238802b(gsaVoiceInteractionService.f118637I.getPackageName()), gsaVoiceInteractionService.f118671aQ, 1);
            } else if (!gsaVoiceInteractionService.f118660aF.hasMessages(9)) {
                C58976aa aaVar = C58975e.f156826a;
                gsaVoiceInteractionService.f118660aF.sendEmptyMessageDelayed(9, 5000);
            }
        }
    }
}
