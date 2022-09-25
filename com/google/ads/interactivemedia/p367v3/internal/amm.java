package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.impl.data.C6749bo;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amm */
/* compiled from: PG */
final class amm implements ant {

    /* renamed from: a */
    private final apq f20976a;

    /* renamed from: b */
    private final SortedSet f20977b;

    /* renamed from: c */
    private final ane f20978c;

    /* renamed from: d */
    private final String f20979d;

    /* renamed from: e */
    private long f20980e = 0;

    /* renamed from: f */
    private VideoProgressUpdate f20981f = new VideoProgressUpdate(0, 0);

    public amm(ane ane, SortedSet sortedSet, String str) {
        apr apr = new apr();
        this.f20977b = sortedSet;
        this.f20976a = apr;
        this.f20978c = ane;
        this.f20979d = str;
    }

    /* renamed from: a */
    public final void mo14971a(VideoProgressUpdate videoProgressUpdate) {
        SortedSet sortedSet;
        if (videoProgressUpdate != null && videoProgressUpdate.getDuration() >= 0.0f && !videoProgressUpdate.equals(this.f20981f)) {
            float currentTime = this.f20981f.getCurrentTime();
            float currentTime2 = videoProgressUpdate.getCurrentTime();
            if (currentTime < currentTime2) {
                sortedSet = this.f20977b.subSet(Float.valueOf(currentTime), Float.valueOf(currentTime2));
            } else {
                sortedSet = this.f20977b.subSet(Float.valueOf(currentTime2), Float.valueOf(currentTime));
            }
            if (!sortedSet.isEmpty() || this.f20977b.contains(Float.valueOf(videoProgressUpdate.getCurrentTime())) || System.currentTimeMillis() - this.f20980e >= 1000) {
                this.f20980e = System.currentTimeMillis();
                this.f20981f = videoProgressUpdate;
                this.f20978c.mo15008n(new amx(amv.contentTimeUpdate, amw.contentTimeUpdate, this.f20979d, C6749bo.create(videoProgressUpdate)));
            }
        }
    }
}
