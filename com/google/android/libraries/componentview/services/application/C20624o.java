package com.google.android.libraries.componentview.services.application;

import android.speech.tts.TextToSpeech;
import com.google.android.libraries.componentview.p1699f.C20520h;

/* renamed from: com.google.android.libraries.componentview.services.application.o */
/* compiled from: PG */
final class C20624o implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    final /* synthetic */ C20628s f57855a;

    public C20624o(C20628s sVar) {
        this.f57855a = sVar;
    }

    public final void onInit(int i) {
        if (i == 0) {
            this.f57855a.f57863i = true;
        } else if (i == -1) {
            C20520h.m38497b(6, "DefaultAudioService", (Throwable) null, "TextToSpeech init failed.", new Object[0]);
        }
    }
}
