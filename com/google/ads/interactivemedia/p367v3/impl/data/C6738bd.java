package com.google.ads.interactivemedia.p367v3.impl.data;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.p367v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.AdsRequest;
import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p367v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.StreamRequest;
import com.google.ads.interactivemedia.p367v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p367v3.internal.alj;
import com.google.ads.interactivemedia.p367v3.internal.alt;
import com.google.ads.interactivemedia.p367v3.internal.aly;
import com.google.ads.interactivemedia.p367v3.internal.alz;
import com.google.ads.interactivemedia.p367v3.internal.ama;
import com.google.ads.interactivemedia.p367v3.internal.amb;
import com.google.ads.interactivemedia.p367v3.internal.amg;
import com.google.ads.interactivemedia.p367v3.internal.anv;
import com.google.ads.interactivemedia.p367v3.internal.aoi;
import com.google.ads.interactivemedia.p367v3.internal.aon;
import com.google.ads.interactivemedia.p367v3.internal.aqa;
import com.google.ads.interactivemedia.p367v3.internal.arn;
import com.google.ads.interactivemedia.p367v3.internal.arq;
import com.google.ads.interactivemedia.p367v3.internal.ars;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bd */
/* compiled from: PG */
public abstract class C6738bd {
    public static C6737bc builder() {
        return new C6777y();
    }

    public static C6738bd create(AdsRequest adsRequest, String str, C6728au auVar, String str2, ImaSdkSettings imaSdkSettings, alt alt, boolean z, aon aon, AdDisplayContainer adDisplayContainer) {
        String adTagUrl = adsRequest.getAdTagUrl();
        String adsResponse = adsRequest.getAdsResponse();
        Map extraParameters = adsRequest.getExtraParameters();
        amb amb = (amb) adsRequest;
        aly a = amb.mo14939a();
        ama b = amb.mo14940b();
        alz c = amb.mo14941c();
        Float d = amb.mo14942d();
        List e = amb.mo14943e();
        String f = amb.mo14944f();
        String g = amb.mo14945g();
        Float h = amb.mo14946h();
        Float i = amb.mo14947i();
        Map companionSlots = getCompanionSlots((alj) adDisplayContainer);
        ViewGroup adContainer = adDisplayContainer.getAdContainer();
        C6737bc builder = builder();
        builder.adTagUrl(adTagUrl);
        builder.adsResponse(adsResponse);
        builder.companionSlots(companionSlots);
        builder.consentSettings(auVar);
        builder.contentDuration(d);
        builder.contentKeywords(e);
        builder.contentTitle(f);
        builder.contentUrl(g);
        builder.env(str);
        builder.experimentState((ars) aqa.m19267c(adsRequest.getForcedExperimentId()).mo15156b(C6735ba.$instance).mo15155a());
        builder.extraParameters(extraParameters);
        builder.identifierInfo(aon);
        Boolean valueOf = Boolean.valueOf(z);
        builder.isTv(valueOf);
        builder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        builder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        builder.liveStreamPrefetchSeconds(i);
        builder.marketAppInfo(alt);
        builder.network(str2);
        builder.omidAdSessionsOnStartedOnly(true);
        builder.settings(imaSdkSettings);
        builder.supportsExternalNavigation(Boolean.valueOf(!z));
        builder.supportsIconClickFallback(valueOf);
        builder.supportsNativeXhr(true);
        builder.supportsResizing(Boolean.valueOf(adDisplayContainer.getPlayer() instanceof ResizablePlayer));
        builder.usesCustomVideoPlayback(Boolean.valueOf(!(adDisplayContainer.getPlayer() instanceof aoi)));
        builder.vastLoadTimeout(h);
        builder.videoContinuousPlay(c);
        builder.videoPlayActivation(a);
        builder.videoPlayMuted(b);
        return builder.build();
    }

    public static C6738bd createFromStreamRequest(StreamRequest streamRequest, String str, C6728au auVar, String str2, ImaSdkSettings imaSdkSettings, alt alt, boolean z, String str3, aon aon, StreamDisplayContainer streamDisplayContainer) {
        Map companionSlots = getCompanionSlots((anv) streamDisplayContainer);
        ViewGroup adContainer = streamDisplayContainer.getAdContainer();
        ars ars = (ars) aqa.m19267c(streamRequest.getForcedExperimentId()).mo15156b(C6736bb.$instance).mo15155a();
        String str4 = streamRequest.getFormat() == StreamRequest.StreamFormat.DASH ? "dash" : "hls";
        C6737bc builder = builder();
        builder.adTagParameters(streamRequest.getAdTagParameters());
        builder.apiKey(streamRequest.getApiKey());
        builder.assetKey(streamRequest.getAssetKey());
        builder.authToken(streamRequest.getAuthToken());
        builder.companionSlots(companionSlots);
        builder.consentSettings(auVar);
        builder.contentSourceId(streamRequest.getContentSourceId());
        builder.contentUrl(streamRequest.getContentUrl());
        builder.env(str);
        builder.experimentState(ars);
        builder.format(str4);
        builder.identifierInfo(aon);
        builder.network(str2);
        builder.settings(imaSdkSettings);
        builder.marketAppInfo(alt);
        Boolean valueOf = Boolean.valueOf(z);
        builder.isTv(valueOf);
        builder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        builder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        builder.msParameter(str3);
        builder.omidAdSessionsOnStartedOnly(true);
        builder.streamActivityMonitorId(streamRequest.getStreamActivityMonitorId());
        builder.supportsExternalNavigation(Boolean.valueOf(true ^ z));
        builder.supportsIconClickFallback(valueOf);
        builder.supportsNativeXhr(true);
        builder.supportsResizing(Boolean.valueOf(streamDisplayContainer.getVideoStreamPlayer() instanceof ResizablePlayer));
        builder.useQAStreamBaseUrl(streamRequest.getUseQAStreamBaseUrl());
        builder.videoId(streamRequest.getVideoId());
        return builder.build();
    }

    private static Map getCompanionSlots(amg amg) {
        Map a = amg.mo14956a();
        if (a == null || a.isEmpty()) {
            return null;
        }
        arq arq = new arq();
        for (String str : a.keySet()) {
            CompanionAdSlot companionAdSlot = (CompanionAdSlot) a.get(str);
            int width = companionAdSlot.getWidth();
            int height = companionAdSlot.getHeight();
            StringBuilder sb = new StringBuilder(23);
            sb.append(width);
            sb.append("x");
            sb.append(height);
            arq.mo15311b(str, sb.toString());
        }
        return arq.mo15310a();
    }

    private static boolean supportsNativeNetworkRequests() {
        return true;
    }

    public abstract ars adTagParameters();

    public abstract String adTagUrl();

    public abstract String adsResponse();

    public abstract String apiKey();

    public abstract String assetKey();

    public abstract String authToken();

    public abstract ars companionSlots();

    public abstract C6728au consentSettings();

    public abstract Float contentDuration();

    public abstract arn contentKeywords();

    public abstract String contentSourceId();

    public abstract String contentTitle();

    public abstract String contentUrl();

    public abstract String env();

    public abstract ars experimentState();

    public abstract ars extraParameters();

    public abstract String format();

    public abstract aon identifierInfo();

    public abstract Boolean isTv();

    public abstract Integer linearAdSlotHeight();

    public abstract Integer linearAdSlotWidth();

    public abstract Float liveStreamPrefetchSeconds();

    public abstract alt marketAppInfo();

    public abstract String msParameter();

    public abstract String network();

    public abstract Boolean omidAdSessionsOnStartedOnly();

    public abstract ImaSdkSettings settings();

    public abstract String streamActivityMonitorId();

    public abstract Boolean supportsExternalNavigation();

    public abstract Boolean supportsIconClickFallback();

    public abstract Boolean supportsNativeXhr();

    public abstract Boolean supportsResizing();

    public abstract Boolean useQAStreamBaseUrl();

    public abstract Boolean usesCustomVideoPlayback();

    public abstract Float vastLoadTimeout();

    public abstract alz videoContinuousPlay();

    public abstract String videoId();

    public abstract aly videoPlayActivation();

    public abstract ama videoPlayMuted();
}
