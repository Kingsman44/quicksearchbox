package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p367v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alj */
/* compiled from: PG */
public final class alj extends amg implements AdDisplayContainer {

    /* renamed from: a */
    private VideoAdPlayer f20883a;

    public alj(Context context, VideoAdPlayer videoAdPlayer) {
        this((ViewGroup) new amc(context), videoAdPlayer);
    }

    public final VideoAdPlayer getPlayer() {
        return this.f20883a;
    }

    public final void setPlayer(VideoAdPlayer videoAdPlayer) {
        aqd.m19282j(videoAdPlayer);
        this.f20883a = videoAdPlayer;
    }

    public alj(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        super(viewGroup);
        this.f20883a = videoAdPlayer;
    }
}
