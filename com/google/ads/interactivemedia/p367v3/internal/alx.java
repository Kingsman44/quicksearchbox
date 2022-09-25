package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdsManager;
import com.google.ads.interactivemedia.p367v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p367v3.api.StreamManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alx */
/* compiled from: PG */
public final class alx implements AdsManagerLoadedEvent {

    /* renamed from: a */
    private final AdsManager f20927a;

    /* renamed from: b */
    private final StreamManager f20928b;

    /* renamed from: c */
    private final Object f20929c;

    public alx(AdsManager adsManager, Object obj) {
        this.f20927a = adsManager;
        this.f20928b = null;
        this.f20929c = obj;
    }

    public alx(StreamManager streamManager, Object obj) {
        this.f20927a = null;
        this.f20928b = streamManager;
        this.f20929c = obj;
    }

    public final AdsManager getAdsManager() {
        return this.f20927a;
    }

    public final StreamManager getStreamManager() {
        return this.f20928b;
    }

    public final Object getUserRequestContext() {
        return this.f20929c;
    }
}
