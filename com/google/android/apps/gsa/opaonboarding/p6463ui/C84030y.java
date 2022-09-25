package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.media.MediaPlayer;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.y */
/* compiled from: PG */
public final /* synthetic */ class C84030y implements MediaPlayer.OnInfoListener {

    /* renamed from: a */
    public final /* synthetic */ C84031z f228877a;

    public /* synthetic */ C84030y(C84031z zVar) {
        this.f228877a = zVar;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        C84031z zVar = this.f228877a;
        if (i != 3) {
            return false;
        }
        zVar.f228889l.setVisibility(8);
        return true;
    }
}
