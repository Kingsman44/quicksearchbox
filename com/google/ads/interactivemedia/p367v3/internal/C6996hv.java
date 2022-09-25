package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hv */
/* compiled from: PG */
final class C6996hv extends Thread {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f22322a;

    /* renamed from: b */
    final /* synthetic */ C7006ie f22323b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6996hv(C7006ie ieVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f22323b = ieVar;
        this.f22322a = audioTrack;
    }

    public final void run() {
        try {
            this.f22322a.flush();
            this.f22322a.release();
        } finally {
            this.f22323b.f22388g.open();
        }
    }
}
