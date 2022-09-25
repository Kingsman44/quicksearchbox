package com.google.p3723ar.imp.core.media;

import android.media.MediaPlayer;

/* renamed from: com.google.ar.imp.core.media.OnPreparedListener */
/* compiled from: PG */
class OnPreparedListener implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    private final long f124153a;

    public OnPreparedListener(long j) {
        this.f124153a = j;
    }

    private static native void nOnPrepared(long j);

    public final void onPrepared(MediaPlayer mediaPlayer) {
        nOnPrepared(this.f124153a);
    }
}
