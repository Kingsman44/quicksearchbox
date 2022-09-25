package com.google.ads.interactivemedia.p367v3.api;

import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdsLoader */
/* compiled from: PG */
public interface AdsLoader {

    /* renamed from: com.google.ads.interactivemedia.v3.api.AdsLoader$AdsLoadedListener */
    /* compiled from: PG */
    public interface AdsLoadedListener {
        void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent);
    }

    void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener);

    void addAdsLoadedListener(AdsLoadedListener adsLoadedListener);

    @Deprecated
    void contentComplete();

    ImaSdkSettings getSettings();

    void release();

    void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener);

    void removeAdsLoadedListener(AdsLoadedListener adsLoadedListener);

    void requestAds(AdsRequest adsRequest);

    String requestStream(StreamRequest streamRequest);
}
