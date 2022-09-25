package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p367v3.internal.alt;
import com.google.ads.interactivemedia.p367v3.internal.aly;
import com.google.ads.interactivemedia.p367v3.internal.alz;
import com.google.ads.interactivemedia.p367v3.internal.ama;
import com.google.ads.interactivemedia.p367v3.internal.aon;
import com.google.ads.interactivemedia.p367v3.internal.arn;
import com.google.ads.interactivemedia.p367v3.internal.ars;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.y */
/* compiled from: PG */
final class C6777y implements C6737bc {
    private ars adTagParameters;
    private String adTagUrl;
    private String adsResponse;
    private String apiKey;
    private String assetKey;
    private String authToken;
    private ars companionSlots;
    private C6728au consentSettings;
    private Float contentDuration;
    private arn contentKeywords;
    private String contentSourceId;
    private String contentTitle;
    private String contentUrl;
    private String env;
    private ars experimentState;
    private ars extraParameters;
    private String format;
    private aon identifierInfo;
    private Boolean isTv;
    private Integer linearAdSlotHeight;
    private Integer linearAdSlotWidth;
    private Float liveStreamPrefetchSeconds;
    private alt marketAppInfo;
    private String msParameter;
    private String network;
    private Boolean omidAdSessionsOnStartedOnly;
    private ImaSdkSettings settings;
    private String streamActivityMonitorId;
    private Boolean supportsExternalNavigation;
    private Boolean supportsIconClickFallback;
    private Boolean supportsNativeXhr;
    private Boolean supportsResizing;
    private Boolean useQAStreamBaseUrl;
    private Boolean usesCustomVideoPlayback;
    private Float vastLoadTimeout;
    private alz videoContinuousPlay;
    private String videoId;
    private aly videoPlayActivation;
    private ama videoPlayMuted;

    public C6737bc adTagParameters(Map map) {
        this.adTagParameters = map == null ? null : ars.m19430d(map);
        return this;
    }

    public C6737bc adTagUrl(String str) {
        this.adTagUrl = str;
        return this;
    }

    public C6737bc adsResponse(String str) {
        this.adsResponse = str;
        return this;
    }

    public C6737bc apiKey(String str) {
        this.apiKey = str;
        return this;
    }

    public C6737bc assetKey(String str) {
        this.assetKey = str;
        return this;
    }

    public C6737bc authToken(String str) {
        this.authToken = str;
        return this;
    }

    public C6738bd build() {
        return new C6778z(this.adTagUrl, this.adTagParameters, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.env, this.experimentState, this.extraParameters, this.format, this.identifierInfo, this.isTv, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.omidAdSessionsOnStartedOnly, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeXhr, this.streamActivityMonitorId, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted);
    }

    public C6737bc companionSlots(Map map) {
        this.companionSlots = map == null ? null : ars.m19430d(map);
        return this;
    }

    public C6737bc consentSettings(C6728au auVar) {
        this.consentSettings = auVar;
        return this;
    }

    public C6737bc contentDuration(Float f) {
        this.contentDuration = f;
        return this;
    }

    public C6737bc contentKeywords(List list) {
        this.contentKeywords = list == null ? null : arn.m19405l(list);
        return this;
    }

    public C6737bc contentSourceId(String str) {
        this.contentSourceId = str;
        return this;
    }

    public C6737bc contentTitle(String str) {
        this.contentTitle = str;
        return this;
    }

    public C6737bc contentUrl(String str) {
        this.contentUrl = str;
        return this;
    }

    public C6737bc env(String str) {
        this.env = str;
        return this;
    }

    public C6737bc experimentState(ars ars) {
        this.experimentState = ars;
        return this;
    }

    public C6737bc extraParameters(Map map) {
        this.extraParameters = map == null ? null : ars.m19430d(map);
        return this;
    }

    public C6737bc format(String str) {
        this.format = str;
        return this;
    }

    public C6737bc identifierInfo(aon aon) {
        this.identifierInfo = aon;
        return this;
    }

    public C6737bc isTv(Boolean bool) {
        this.isTv = bool;
        return this;
    }

    public C6737bc linearAdSlotHeight(Integer num) {
        this.linearAdSlotHeight = num;
        return this;
    }

    public C6737bc linearAdSlotWidth(Integer num) {
        this.linearAdSlotWidth = num;
        return this;
    }

    public C6737bc liveStreamPrefetchSeconds(Float f) {
        this.liveStreamPrefetchSeconds = f;
        return this;
    }

    public C6737bc marketAppInfo(alt alt) {
        this.marketAppInfo = alt;
        return this;
    }

    public C6737bc msParameter(String str) {
        this.msParameter = str;
        return this;
    }

    public C6737bc network(String str) {
        this.network = str;
        return this;
    }

    public C6737bc omidAdSessionsOnStartedOnly(Boolean bool) {
        this.omidAdSessionsOnStartedOnly = bool;
        return this;
    }

    public C6737bc settings(ImaSdkSettings imaSdkSettings) {
        this.settings = imaSdkSettings;
        return this;
    }

    public C6737bc streamActivityMonitorId(String str) {
        this.streamActivityMonitorId = str;
        return this;
    }

    public C6737bc supportsExternalNavigation(Boolean bool) {
        this.supportsExternalNavigation = bool;
        return this;
    }

    public C6737bc supportsIconClickFallback(Boolean bool) {
        this.supportsIconClickFallback = bool;
        return this;
    }

    public C6737bc supportsNativeXhr(Boolean bool) {
        this.supportsNativeXhr = bool;
        return this;
    }

    public C6737bc supportsResizing(Boolean bool) {
        this.supportsResizing = bool;
        return this;
    }

    public C6737bc useQAStreamBaseUrl(Boolean bool) {
        this.useQAStreamBaseUrl = bool;
        return this;
    }

    public C6737bc usesCustomVideoPlayback(Boolean bool) {
        this.usesCustomVideoPlayback = bool;
        return this;
    }

    public C6737bc vastLoadTimeout(Float f) {
        this.vastLoadTimeout = f;
        return this;
    }

    public C6737bc videoContinuousPlay(alz alz) {
        this.videoContinuousPlay = alz;
        return this;
    }

    public C6737bc videoId(String str) {
        this.videoId = str;
        return this;
    }

    public C6737bc videoPlayActivation(aly aly) {
        this.videoPlayActivation = aly;
        return this;
    }

    public C6737bc videoPlayMuted(ama ama) {
        this.videoPlayMuted = ama;
        return this;
    }
}
