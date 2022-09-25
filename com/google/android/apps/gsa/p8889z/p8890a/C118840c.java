package com.google.android.apps.gsa.p8889z.p8890a;

import android.media.MediaPlayer;

/* renamed from: com.google.android.apps.gsa.z.a.c */
/* compiled from: PG */
final class C118840c implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    final /* synthetic */ C118842e f331456a;

    public C118840c(C118842e eVar) {
        this.f331456a = eVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer.OnCompletionListener onCompletionListener = this.f331456a.f331466j;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
        this.f331456a.f331460d.open();
    }
}
