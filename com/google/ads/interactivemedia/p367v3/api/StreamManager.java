package com.google.ads.interactivemedia.p367v3.api;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.api.StreamManager */
/* compiled from: PG */
public interface StreamManager extends BaseManager {
    double getContentTimeForStreamTime(double d);

    List getCuePoints();

    CuePoint getPreviousCuePointForStreamTime(double d);

    String getStreamId();

    double getStreamTimeForContentTime(double d);

    void replaceAdTagParameters(Map map);
}
