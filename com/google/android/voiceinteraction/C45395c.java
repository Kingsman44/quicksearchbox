package com.google.android.voiceinteraction;

/* renamed from: com.google.android.voiceinteraction.c */
/* compiled from: PG */
public final /* synthetic */ class C45395c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GsaVoiceInteractionService f118764a;

    public /* synthetic */ C45395c(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118764a = gsaVoiceInteractionService;
    }

    public final void run() {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118764a;
        gsaVoiceInteractionService.mo49410Y();
        gsaVoiceInteractionService.f118660aF.sendEmptyMessageDelayed(15, GsaVoiceInteractionService.f118626c);
    }
}
