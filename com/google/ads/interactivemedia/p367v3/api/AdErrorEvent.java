package com.google.ads.interactivemedia.p367v3.api;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdErrorEvent */
/* compiled from: PG */
public interface AdErrorEvent {

    /* renamed from: com.google.ads.interactivemedia.v3.api.AdErrorEvent$AdErrorListener */
    /* compiled from: PG */
    public interface AdErrorListener {
        void onAdError(AdErrorEvent adErrorEvent);
    }

    AdError getError();

    Object getUserRequestContext();
}
