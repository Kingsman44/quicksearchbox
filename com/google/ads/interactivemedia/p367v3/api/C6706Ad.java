package com.google.ads.interactivemedia.p367v3.api;

import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.api.Ad */
/* compiled from: PG */
public interface C6706Ad {
    String getAdId();

    AdPodInfo getAdPodInfo();

    String getAdSystem();

    String[] getAdWrapperCreativeIds();

    String[] getAdWrapperIds();

    String[] getAdWrapperSystems();

    String getAdvertiserName();

    List getCompanionAds();

    String getContentType();

    String getCreativeAdId();

    String getCreativeId();

    String getDealId();

    String getDescription();

    double getDuration();

    int getHeight();

    double getSkipTimeOffset();

    String getSurveyUrl();

    String getTitle();

    String getTraffickingParameters();

    Set getUiElements();

    @Deprecated
    String getUniversalAdIdRegistry();

    @Deprecated
    String getUniversalAdIdValue();

    UniversalAdId[] getUniversalAdIds();

    int getVastMediaBitrate();

    int getVastMediaHeight();

    int getVastMediaWidth();

    int getWidth();

    boolean isLinear();

    boolean isSkippable();

    boolean isUiDisabled();
}
