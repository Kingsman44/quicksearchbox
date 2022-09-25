package com.google.android.voiceinteraction;

import android.content.Intent;

/* renamed from: com.google.android.voiceinteraction.j */
/* compiled from: PG */
public final /* synthetic */ class C45402j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GsaVoiceInteractionService f118774a;

    /* renamed from: b */
    public final /* synthetic */ Intent f118775b;

    public /* synthetic */ C45402j(GsaVoiceInteractionService gsaVoiceInteractionService, Intent intent) {
        this.f118774a = gsaVoiceInteractionService;
        this.f118775b = intent;
    }

    public final void run() {
        this.f118774a.mo49403R(this.f118775b);
    }
}
