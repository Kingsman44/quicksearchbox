package com.google.android.apps.gsa.assist;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;

/* renamed from: com.google.android.apps.gsa.assist.bw */
/* compiled from: PG */
final class C9382bw extends C9396ca {

    /* renamed from: d */
    private final VoiceInteractionSession.ConfirmationRequest f32542d;

    public C9382bw(C9397cb cbVar, VoiceInteractionSession.ConfirmationRequest confirmationRequest) {
        super(cbVar, confirmationRequest);
        this.f32542d = confirmationRequest;
    }

    /* renamed from: a */
    public final int mo17556a() {
        return 3;
    }

    /* renamed from: b */
    public final VoiceInteractor.Prompt mo17557b() {
        return this.f32542d.getVoicePrompt();
    }

    /* renamed from: h */
    public final void mo17563h(boolean z, Bundle bundle) {
        if (mo17592m()) {
            this.f32542d.sendConfirmationResult(z, bundle);
        }
    }
}
