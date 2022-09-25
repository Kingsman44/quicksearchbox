package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.impl.data.C6749bo;
import com.google.ads.interactivemedia.p367v3.impl.data.C6754bt;
import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aln */
/* compiled from: PG */
final class aln implements VideoAdPlayer.VideoAdPlayerCallback {

    /* renamed from: a */
    private final alm f20889a;

    /* renamed from: b */
    private final HashMap f20890b;

    /* renamed from: c */
    private boolean f20891c = false;

    public aln(alm alm) {
        this.f20889a = alm;
        this.f20890b = asn.m19520g(2);
    }

    /* renamed from: c */
    private final void m18946c(amw amw, AdMediaInfo adMediaInfo) {
        m18947d(amw, adMediaInfo, (Object) null);
    }

    /* renamed from: d */
    private final void m18947d(amw amw, AdMediaInfo adMediaInfo, Object obj) {
        this.f20889a.mo14920a(amw, adMediaInfo, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14922a() {
        this.f20891c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14923b() {
        this.f20891c = false;
    }

    public final void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate) {
        if (this.f20891c && videoProgressUpdate != null && videoProgressUpdate.getDuration() > 0.0f) {
            if (this.f20890b.get(adMediaInfo) == null && videoProgressUpdate.getCurrentTime() > 0.0f) {
                m18946c(amw.start, adMediaInfo);
                this.f20890b.put(adMediaInfo, true);
            }
            m18947d(amw.timeupdate, adMediaInfo, C6749bo.create(videoProgressUpdate));
        }
    }

    public final void onBuffering(AdMediaInfo adMediaInfo) {
        if (this.f20891c) {
            m18946c(amw.waiting, adMediaInfo);
        }
    }

    public final void onContentComplete() {
        this.f20889a.mo14921b(amv.adsLoader, amw.contentComplete);
    }

    public final void onEnded(AdMediaInfo adMediaInfo) {
        if (this.f20891c) {
            m18946c(amw.end, adMediaInfo);
            this.f20890b.remove(adMediaInfo);
        }
    }

    public final void onError(AdMediaInfo adMediaInfo) {
        if (this.f20891c) {
            m18946c(amw.error, adMediaInfo);
            this.f20890b.remove(adMediaInfo);
        }
    }

    public final void onLoaded(AdMediaInfo adMediaInfo) {
        if (this.f20891c) {
            m18946c(amw.loaded, adMediaInfo);
        }
    }

    public final void onPause(AdMediaInfo adMediaInfo) {
        if (this.f20891c) {
            m18946c(amw.pause, adMediaInfo);
        }
    }

    public final void onPlay(AdMediaInfo adMediaInfo) {
    }

    public final void onResume(AdMediaInfo adMediaInfo) {
        if (this.f20891c) {
            m18946c(amw.play, adMediaInfo);
        }
    }

    public final void onVolumeChanged(AdMediaInfo adMediaInfo, int i) {
        if (this.f20891c) {
            m18947d(amw.volumeChange, adMediaInfo, C6754bt.builder().volumePercentage(i).build());
        }
    }
}
