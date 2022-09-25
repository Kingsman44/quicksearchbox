package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.search.shared.service.ClientEventData;

/* renamed from: com.google.android.voiceinteraction.h */
/* compiled from: PG */
public final /* synthetic */ class C45400h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GsaVoiceInteractionService f118771a;

    /* renamed from: b */
    public final /* synthetic */ ClientEventData f118772b;

    public /* synthetic */ C45400h(GsaVoiceInteractionService gsaVoiceInteractionService, ClientEventData clientEventData) {
        this.f118771a = gsaVoiceInteractionService;
        this.f118772b = clientEventData;
    }

    public final void run() {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118771a;
        gsaVoiceInteractionService.f118730z.mo81937i(this.f118772b);
    }
}
