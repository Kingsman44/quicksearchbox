package com.google.android.apps.gsa.p8889z.p8890a;

import android.media.MediaPlayer;

/* renamed from: com.google.android.apps.gsa.z.a.b */
/* compiled from: PG */
final class C118839b implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    final /* synthetic */ C118842e f331455a;

    public C118839b(C118842e eVar) {
        this.f331455a = eVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f331455a.f331460d.open();
        return true;
    }
}
