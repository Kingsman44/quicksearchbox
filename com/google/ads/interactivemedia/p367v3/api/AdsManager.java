package com.google.ads.interactivemedia.p367v3.api;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdsManager */
/* compiled from: PG */
public interface AdsManager extends BaseManager {
    void clicked();

    void discardAdBreak();

    List getAdCuePoints();

    void pause();

    @Deprecated
    void requestNextAdBreak();

    void resume();

    void skip();

    void start();
}
