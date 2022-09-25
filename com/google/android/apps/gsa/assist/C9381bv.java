package com.google.android.apps.gsa.assist;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;

/* renamed from: com.google.android.apps.gsa.assist.bv */
/* compiled from: PG */
final class C9381bv extends C9396ca {

    /* renamed from: d */
    private final VoiceInteractionSession.CompleteVoiceRequest f32541d;

    public C9381bv(C9397cb cbVar, VoiceInteractionSession.CompleteVoiceRequest completeVoiceRequest) {
        super(cbVar, completeVoiceRequest);
        this.f32541d = completeVoiceRequest;
        this.f32565b = true;
    }

    /* renamed from: a */
    public final int mo17556a() {
        return 2;
    }

    /* renamed from: b */
    public final VoiceInteractor.Prompt mo17557b() {
        return this.f32541d.getVoicePrompt();
    }

    /* renamed from: g */
    public final void mo17562g() {
        if (mo17592m()) {
            this.f32541d.sendCompleteResult((Bundle) null);
        }
    }
}
