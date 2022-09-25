package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p367v3.internal.alt;
import com.google.ads.interactivemedia.p367v3.internal.aly;
import com.google.ads.interactivemedia.p367v3.internal.alz;
import com.google.ads.interactivemedia.p367v3.internal.ama;
import com.google.ads.interactivemedia.p367v3.internal.aon;
import com.google.ads.interactivemedia.p367v3.internal.ars;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bc */
/* compiled from: PG */
public interface C6737bc {
    C6737bc adTagParameters(Map map);

    C6737bc adTagUrl(String str);

    C6737bc adsResponse(String str);

    C6737bc apiKey(String str);

    C6737bc assetKey(String str);

    C6737bc authToken(String str);

    C6738bd build();

    C6737bc companionSlots(Map map);

    C6737bc consentSettings(C6728au auVar);

    C6737bc contentDuration(Float f);

    C6737bc contentKeywords(List list);

    C6737bc contentSourceId(String str);

    C6737bc contentTitle(String str);

    C6737bc contentUrl(String str);

    C6737bc env(String str);

    C6737bc experimentState(ars ars);

    C6737bc extraParameters(Map map);

    C6737bc format(String str);

    C6737bc identifierInfo(aon aon);

    C6737bc isTv(Boolean bool);

    C6737bc linearAdSlotHeight(Integer num);

    C6737bc linearAdSlotWidth(Integer num);

    C6737bc liveStreamPrefetchSeconds(Float f);

    C6737bc marketAppInfo(alt alt);

    C6737bc msParameter(String str);

    C6737bc network(String str);

    C6737bc omidAdSessionsOnStartedOnly(Boolean bool);

    C6737bc settings(ImaSdkSettings imaSdkSettings);

    C6737bc streamActivityMonitorId(String str);

    C6737bc supportsExternalNavigation(Boolean bool);

    C6737bc supportsIconClickFallback(Boolean bool);

    C6737bc supportsNativeXhr(Boolean bool);

    C6737bc supportsResizing(Boolean bool);

    C6737bc useQAStreamBaseUrl(Boolean bool);

    C6737bc usesCustomVideoPlayback(Boolean bool);

    C6737bc vastLoadTimeout(Float f);

    C6737bc videoContinuousPlay(alz alz);

    C6737bc videoId(String str);

    C6737bc videoPlayActivation(aly aly);

    C6737bc videoPlayMuted(ama ama);
}
