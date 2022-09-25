package com.google.p3723ar.imp.core.media;

import android.media.MediaPlayer;

/* renamed from: com.google.ar.imp.core.media.OnErrorListener */
/* compiled from: PG */
public class OnErrorListener implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    private final long f124152a;

    public OnErrorListener(long j) {
        this.f124152a = j;
    }

    private static native boolean nOnError(long j, int i, int i2);

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return nOnError(this.f124152a, i, i2);
    }
}
