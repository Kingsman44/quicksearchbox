package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.media.session.MediaController;
import android.media.session.PlaybackState;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.k */
/* compiled from: PG */
final class C76326k extends MediaController.Callback {

    /* renamed from: a */
    final /* synthetic */ int f211397a;

    /* renamed from: b */
    final /* synthetic */ C76327l f211398b;

    public C76326k(int i, C76327l lVar) {
        this.f211397a = i;
        this.f211398b = lVar;
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        if (!(playbackState == null || playbackState.getState() == 2 || playbackState.getState() == 1)) {
            C76330o.m122949c(this.f211397a, this.f211398b);
        }
        this.f211398b.f211399a.unregisterCallback(this);
    }
}
