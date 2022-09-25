package com.google.android.libraries.search.p2904c.p2929h.p2930a;

import android.media.AudioTrack;
import p5462h.p5473f.p5474a.C69626l;

/* renamed from: com.google.android.libraries.search.c.h.a.d */
/* compiled from: PG */
public final class C37653d implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C69626l f100024a;

    public C37653d(C69626l lVar) {
        this.f100024a = lVar;
    }

    public final void onMarkerReached(AudioTrack audioTrack) {
        this.f100024a.mo5761a(audioTrack);
        if (audioTrack != null) {
            audioTrack.setPlaybackPositionUpdateListener((AudioTrack.OnPlaybackPositionUpdateListener) null);
        }
    }

    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
