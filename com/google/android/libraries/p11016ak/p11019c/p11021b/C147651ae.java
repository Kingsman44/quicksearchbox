package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.speech.tts.TextToSpeech;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.ak.c.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C147651ae implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f398502a;

    public /* synthetic */ C147651ae(SettableFuture settableFuture) {
        this.f398502a = settableFuture;
    }

    public final void onInit(int i) {
        SettableFuture settableFuture = this.f398502a;
        if (i == 0) {
            settableFuture.mo57356n((Object) null);
        } else {
            settableFuture.mo57357o(new IllegalStateException("TTS Initialization failed."));
        }
    }
}
