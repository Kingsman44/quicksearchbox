package com.google.p3723ar.imp.core.media;

import android.media.MediaPlayer;

/* renamed from: com.google.ar.imp.core.media.OnCompletionListener */
/* compiled from: PG */
class OnCompletionListener implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    private final long f124151a;

    public OnCompletionListener(long j) {
        this.f124151a = j;
    }

    private static native void nOnCompletion(long j);

    public final void onCompletion(MediaPlayer mediaPlayer) {
        nOnCompletion(this.f124151a);
    }
}
