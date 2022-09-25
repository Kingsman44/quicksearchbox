package com.google.ads.interactivemedia.p367v3.api;

import com.google.ads.interactivemedia.p367v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.api.AdsRequest */
/* compiled from: PG */
public interface AdsRequest {
    void forceExperimentId(Integer num);

    String getAdTagUrl();

    String getAdsResponse();

    ContentProgressProvider getContentProgressProvider();

    String getExtraParameter(String str);

    Map getExtraParameters();

    Integer getForcedExperimentId();

    Object getUserRequestContext();

    void setAdTagUrl(String str);

    void setAdWillAutoPlay(boolean z);

    void setAdWillPlayMuted(boolean z);

    void setAdsResponse(String str);

    void setContentDuration(float f);

    void setContentKeywords(List list);

    void setContentProgressProvider(ContentProgressProvider contentProgressProvider);

    void setContentTitle(String str);

    void setContentUrl(String str);

    void setContinuousPlayback(boolean z);

    void setExtraParameter(String str, String str2);

    void setLiveStreamPrefetchSeconds(float f);

    void setUserRequestContext(Object obj);

    void setVastLoadTimeout(float f);
}
