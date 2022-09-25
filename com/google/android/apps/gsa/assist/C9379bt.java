package com.google.android.apps.gsa.assist;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;

/* renamed from: com.google.android.apps.gsa.assist.bt */
/* compiled from: PG */
final class C9379bt extends C9396ca {

    /* renamed from: d */
    private final VoiceInteractionSession.AbortVoiceRequest f32539d;

    public C9379bt(C9397cb cbVar, VoiceInteractionSession.AbortVoiceRequest abortVoiceRequest) {
        super(cbVar, abortVoiceRequest);
        this.f32539d = abortVoiceRequest;
        this.f32565b = true;
    }

    /* renamed from: a */
    public final int mo17556a() {
        return 0;
    }

    /* renamed from: b */
    public final VoiceInteractor.Prompt mo17557b() {
        return this.f32539d.getVoicePrompt();
    }

    /* renamed from: c */
    public final void mo17558c() {
        if (mo17592m()) {
            this.f32539d.sendAbortResult((Bundle) null);
        }
    }
}
