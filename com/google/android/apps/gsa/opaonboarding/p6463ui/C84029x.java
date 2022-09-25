package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.media.MediaPlayer;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.x */
/* compiled from: PG */
public final /* synthetic */ class C84029x implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public final /* synthetic */ C84031z f228876a;

    public /* synthetic */ C84029x(C84031z zVar) {
        this.f228876a = zVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C84031z zVar = this.f228876a;
        mediaPlayer.setLooping(true);
        mediaPlayer.setOnInfoListener(new C84030y(zVar));
    }
}
