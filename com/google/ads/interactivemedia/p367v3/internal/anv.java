package com.google.ads.interactivemedia.p367v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.p367v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoStreamPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anv */
/* compiled from: PG */
public final class anv extends amg implements StreamDisplayContainer {

    /* renamed from: a */
    private VideoStreamPlayer f21066a;

    public anv(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        super(viewGroup);
        this.f21066a = videoStreamPlayer;
    }

    public final VideoStreamPlayer getVideoStreamPlayer() {
        return this.f21066a;
    }

    public final void setVideoStreamPlayer(VideoStreamPlayer videoStreamPlayer) {
        aqd.m19282j(videoStreamPlayer);
        this.f21066a = videoStreamPlayer;
    }
}
