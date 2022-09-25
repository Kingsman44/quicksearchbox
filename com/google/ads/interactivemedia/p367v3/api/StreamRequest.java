package com.google.ads.interactivemedia.p367v3.api;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.api.StreamRequest */
/* compiled from: PG */
public interface StreamRequest {

    /* renamed from: com.google.ads.interactivemedia.v3.api.StreamRequest$StreamFormat */
    /* compiled from: PG */
    public enum StreamFormat {
        DASH,
        HLS
    }

    void forceExperimentId(Integer num);

    Map getAdTagParameters();

    String getApiKey();

    String getAssetKey();

    String getAuthToken();

    String getContentSourceId();

    String getContentUrl();

    Integer getForcedExperimentId();

    StreamFormat getFormat();

    String getManifestSuffix();

    String getStreamActivityMonitorId();

    Boolean getUseQAStreamBaseUrl();

    Object getUserRequestContext();

    String getVideoId();

    void setAdTagParameters(Map map);

    void setAuthToken(String str);

    void setContentUrl(String str);

    void setFormat(StreamFormat streamFormat);

    void setManifestSuffix(String str);

    void setStreamActivityMonitorId(String str);

    void setUseQAStreamBaseUrl(Boolean bool);

    void setUserRequestContext(Object obj);
}
