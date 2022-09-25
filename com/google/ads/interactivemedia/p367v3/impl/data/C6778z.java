package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.p367v3.internal.alt;
import com.google.ads.interactivemedia.p367v3.internal.aly;
import com.google.ads.interactivemedia.p367v3.internal.alz;
import com.google.ads.interactivemedia.p367v3.internal.ama;
import com.google.ads.interactivemedia.p367v3.internal.aon;
import com.google.ads.interactivemedia.p367v3.internal.arn;
import com.google.ads.interactivemedia.p367v3.internal.ars;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.z */
/* compiled from: PG */
final class C6778z extends C6738bd {
    private final ars adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final ars companionSlots;
    private final C6728au consentSettings;
    private final Float contentDuration;
    private final arn contentKeywords;
    private final String contentSourceId;
    private final String contentTitle;
    private final String contentUrl;
    private final String env;
    private final ars experimentState;
    private final ars extraParameters;
    private final String format;
    private final aon identifierInfo;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final Float liveStreamPrefetchSeconds;
    private final alt marketAppInfo;
    private final String msParameter;
    private final String network;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final ImaSdkSettings settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeXhr;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final alz videoContinuousPlay;
    private final String videoId;
    private final aly videoPlayActivation;
    private final ama videoPlayMuted;

    private C6778z(String str, ars ars, String str2, String str3, String str4, String str5, ars ars2, Float f, arn arn, String str6, String str7, String str8, C6728au auVar, String str9, ars ars3, ars ars4, String str10, aon aon, Boolean bool, Integer num, Integer num2, Float f2, alt alt, String str11, String str12, Boolean bool2, ImaSdkSettings imaSdkSettings, Boolean bool3, Boolean bool4, Boolean bool5, String str13, Boolean bool6, Boolean bool7, Boolean bool8, Float f3, String str14, aly aly, alz alz, ama ama) {
        this.adTagUrl = str;
        this.adTagParameters = ars;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = ars2;
        this.contentDuration = f;
        this.contentKeywords = arn;
        this.contentTitle = str6;
        this.contentUrl = str7;
        this.contentSourceId = str8;
        this.consentSettings = auVar;
        this.env = str9;
        this.experimentState = ars3;
        this.extraParameters = ars4;
        this.format = str10;
        this.identifierInfo = aon;
        this.isTv = bool;
        this.linearAdSlotWidth = num;
        this.linearAdSlotHeight = num2;
        this.liveStreamPrefetchSeconds = f2;
        this.marketAppInfo = alt;
        this.msParameter = str11;
        this.network = str12;
        this.omidAdSessionsOnStartedOnly = bool2;
        this.settings = imaSdkSettings;
        this.supportsExternalNavigation = bool3;
        this.supportsIconClickFallback = bool4;
        this.supportsNativeXhr = bool5;
        this.streamActivityMonitorId = str13;
        this.supportsResizing = bool6;
        this.useQAStreamBaseUrl = bool7;
        this.usesCustomVideoPlayback = bool8;
        this.vastLoadTimeout = f3;
        this.videoId = str14;
        this.videoPlayActivation = aly;
        this.videoContinuousPlay = alz;
        this.videoPlayMuted = ama;
    }

    public ars adTagParameters() {
        return this.adTagParameters;
    }

    public String adTagUrl() {
        return this.adTagUrl;
    }

    public String adsResponse() {
        return this.adsResponse;
    }

    public String apiKey() {
        return this.apiKey;
    }

    public String assetKey() {
        return this.assetKey;
    }

    public String authToken() {
        return this.authToken;
    }

    public ars companionSlots() {
        return this.companionSlots;
    }

    public C6728au consentSettings() {
        return this.consentSettings;
    }

    public Float contentDuration() {
        return this.contentDuration;
    }

    public arn contentKeywords() {
        return this.contentKeywords;
    }

    public String contentSourceId() {
        return this.contentSourceId;
    }

    public String contentTitle() {
        return this.contentTitle;
    }

    public String contentUrl() {
        return this.contentUrl;
    }

    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6738bd) {
            C6738bd bdVar = (C6738bd) obj;
            String str = this.adTagUrl;
            if (str != null ? str.equals(bdVar.adTagUrl()) : bdVar.adTagUrl() == null) {
                ars ars = this.adTagParameters;
                if (ars != null ? ars.equals(bdVar.adTagParameters()) : bdVar.adTagParameters() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(bdVar.adsResponse()) : bdVar.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(bdVar.apiKey()) : bdVar.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(bdVar.assetKey()) : bdVar.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(bdVar.authToken()) : bdVar.authToken() == null) {
                                    ars ars2 = this.companionSlots;
                                    if (ars2 != null ? ars2.equals(bdVar.companionSlots()) : bdVar.companionSlots() == null) {
                                        Float f = this.contentDuration;
                                        if (f != null ? f.equals(bdVar.contentDuration()) : bdVar.contentDuration() == null) {
                                            arn arn = this.contentKeywords;
                                            if (arn != null ? arn.equals(bdVar.contentKeywords()) : bdVar.contentKeywords() == null) {
                                                String str6 = this.contentTitle;
                                                if (str6 != null ? str6.equals(bdVar.contentTitle()) : bdVar.contentTitle() == null) {
                                                    String str7 = this.contentUrl;
                                                    if (str7 != null ? str7.equals(bdVar.contentUrl()) : bdVar.contentUrl() == null) {
                                                        String str8 = this.contentSourceId;
                                                        if (str8 != null ? str8.equals(bdVar.contentSourceId()) : bdVar.contentSourceId() == null) {
                                                            C6728au auVar = this.consentSettings;
                                                            if (auVar != null ? auVar.equals(bdVar.consentSettings()) : bdVar.consentSettings() == null) {
                                                                String str9 = this.env;
                                                                if (str9 != null ? str9.equals(bdVar.env()) : bdVar.env() == null) {
                                                                    ars ars3 = this.experimentState;
                                                                    if (ars3 != null ? ars3.equals(bdVar.experimentState()) : bdVar.experimentState() == null) {
                                                                        ars ars4 = this.extraParameters;
                                                                        if (ars4 != null ? ars4.equals(bdVar.extraParameters()) : bdVar.extraParameters() == null) {
                                                                            String str10 = this.format;
                                                                            if (str10 != null ? str10.equals(bdVar.format()) : bdVar.format() == null) {
                                                                                aon aon = this.identifierInfo;
                                                                                if (aon != null ? aon.equals(bdVar.identifierInfo()) : bdVar.identifierInfo() == null) {
                                                                                    Boolean bool = this.isTv;
                                                                                    if (bool != null ? bool.equals(bdVar.isTv()) : bdVar.isTv() == null) {
                                                                                        Integer num = this.linearAdSlotWidth;
                                                                                        if (num != null ? num.equals(bdVar.linearAdSlotWidth()) : bdVar.linearAdSlotWidth() == null) {
                                                                                            Integer num2 = this.linearAdSlotHeight;
                                                                                            if (num2 != null ? num2.equals(bdVar.linearAdSlotHeight()) : bdVar.linearAdSlotHeight() == null) {
                                                                                                Float f2 = this.liveStreamPrefetchSeconds;
                                                                                                if (f2 != null ? f2.equals(bdVar.liveStreamPrefetchSeconds()) : bdVar.liveStreamPrefetchSeconds() == null) {
                                                                                                    alt alt = this.marketAppInfo;
                                                                                                    if (alt != null ? alt.equals(bdVar.marketAppInfo()) : bdVar.marketAppInfo() == null) {
                                                                                                        String str11 = this.msParameter;
                                                                                                        if (str11 != null ? str11.equals(bdVar.msParameter()) : bdVar.msParameter() == null) {
                                                                                                            String str12 = this.network;
                                                                                                            if (str12 != null ? str12.equals(bdVar.network()) : bdVar.network() == null) {
                                                                                                                Boolean bool2 = this.omidAdSessionsOnStartedOnly;
                                                                                                                if (bool2 != null ? bool2.equals(bdVar.omidAdSessionsOnStartedOnly()) : bdVar.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                    ImaSdkSettings imaSdkSettings = this.settings;
                                                                                                                    if (imaSdkSettings != null ? imaSdkSettings.equals(bdVar.settings()) : bdVar.settings() == null) {
                                                                                                                        Boolean bool3 = this.supportsExternalNavigation;
                                                                                                                        if (bool3 != null ? bool3.equals(bdVar.supportsExternalNavigation()) : bdVar.supportsExternalNavigation() == null) {
                                                                                                                            Boolean bool4 = this.supportsIconClickFallback;
                                                                                                                            if (bool4 != null ? bool4.equals(bdVar.supportsIconClickFallback()) : bdVar.supportsIconClickFallback() == null) {
                                                                                                                                Boolean bool5 = this.supportsNativeXhr;
                                                                                                                                if (bool5 != null ? bool5.equals(bdVar.supportsNativeXhr()) : bdVar.supportsNativeXhr() == null) {
                                                                                                                                    String str13 = this.streamActivityMonitorId;
                                                                                                                                    if (str13 != null ? str13.equals(bdVar.streamActivityMonitorId()) : bdVar.streamActivityMonitorId() == null) {
                                                                                                                                        Boolean bool6 = this.supportsResizing;
                                                                                                                                        if (bool6 != null ? bool6.equals(bdVar.supportsResizing()) : bdVar.supportsResizing() == null) {
                                                                                                                                            Boolean bool7 = this.useQAStreamBaseUrl;
                                                                                                                                            if (bool7 != null ? bool7.equals(bdVar.useQAStreamBaseUrl()) : bdVar.useQAStreamBaseUrl() == null) {
                                                                                                                                                Boolean bool8 = this.usesCustomVideoPlayback;
                                                                                                                                                if (bool8 != null ? bool8.equals(bdVar.usesCustomVideoPlayback()) : bdVar.usesCustomVideoPlayback() == null) {
                                                                                                                                                    Float f3 = this.vastLoadTimeout;
                                                                                                                                                    if (f3 != null ? f3.equals(bdVar.vastLoadTimeout()) : bdVar.vastLoadTimeout() == null) {
                                                                                                                                                        String str14 = this.videoId;
                                                                                                                                                        if (str14 != null ? str14.equals(bdVar.videoId()) : bdVar.videoId() == null) {
                                                                                                                                                            aly aly = this.videoPlayActivation;
                                                                                                                                                            if (aly != null ? aly.equals(bdVar.videoPlayActivation()) : bdVar.videoPlayActivation() == null) {
                                                                                                                                                                alz alz = this.videoContinuousPlay;
                                                                                                                                                                if (alz != null ? alz.equals(bdVar.videoContinuousPlay()) : bdVar.videoContinuousPlay() == null) {
                                                                                                                                                                    ama ama = this.videoPlayMuted;
                                                                                                                                                                    if (ama != null ? ama.equals(bdVar.videoPlayMuted()) : bdVar.videoPlayMuted() == null) {
                                                                                                                                                                        return true;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public ars experimentState() {
        return this.experimentState;
    }

    public ars extraParameters() {
        return this.extraParameters;
    }

    public String format() {
        return this.format;
    }

    public aon identifierInfo() {
        return this.identifierInfo;
    }

    public Boolean isTv() {
        return this.isTv;
    }

    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    public alt marketAppInfo() {
        return this.marketAppInfo;
    }

    public String msParameter() {
        return this.msParameter;
    }

    public String network() {
        return this.network;
    }

    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    public ImaSdkSettings settings() {
        return this.settings;
    }

    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    public Boolean supportsNativeXhr() {
        return this.supportsNativeXhr;
    }

    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        String str = this.adTagUrl;
        String valueOf = String.valueOf(this.adTagParameters);
        String str2 = this.adsResponse;
        String str3 = this.apiKey;
        String str4 = this.assetKey;
        String str5 = this.authToken;
        String valueOf2 = String.valueOf(this.companionSlots);
        String valueOf3 = String.valueOf(this.contentDuration);
        String valueOf4 = String.valueOf(this.contentKeywords);
        String str6 = this.contentTitle;
        String str7 = this.contentUrl;
        String str8 = this.contentSourceId;
        String valueOf5 = String.valueOf(this.consentSettings);
        String str9 = this.env;
        String valueOf6 = String.valueOf(this.experimentState);
        String valueOf7 = String.valueOf(this.extraParameters);
        String str10 = this.format;
        String valueOf8 = String.valueOf(this.identifierInfo);
        String valueOf9 = String.valueOf(this.isTv);
        String valueOf10 = String.valueOf(this.linearAdSlotWidth);
        String valueOf11 = String.valueOf(this.linearAdSlotHeight);
        String valueOf12 = String.valueOf(this.liveStreamPrefetchSeconds);
        String valueOf13 = String.valueOf(this.marketAppInfo);
        String str11 = this.msParameter;
        String str12 = this.network;
        String valueOf14 = String.valueOf(this.omidAdSessionsOnStartedOnly);
        String valueOf15 = String.valueOf(this.settings);
        String valueOf16 = String.valueOf(this.supportsExternalNavigation);
        String valueOf17 = String.valueOf(this.supportsIconClickFallback);
        String valueOf18 = String.valueOf(this.supportsNativeXhr);
        String str13 = this.streamActivityMonitorId;
        String valueOf19 = String.valueOf(this.supportsResizing);
        String valueOf20 = String.valueOf(this.useQAStreamBaseUrl);
        String valueOf21 = String.valueOf(this.usesCustomVideoPlayback);
        String valueOf22 = String.valueOf(this.vastLoadTimeout);
        String str14 = this.videoId;
        String valueOf23 = String.valueOf(this.videoPlayActivation);
        String valueOf24 = String.valueOf(this.videoContinuousPlay);
        String valueOf25 = String.valueOf(this.videoPlayMuted);
        int length = String.valueOf(str).length() + 689 + String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(str8).length();
        int length2 = String.valueOf(valueOf5).length();
        int length3 = String.valueOf(str9).length();
        int length4 = String.valueOf(valueOf6).length();
        int length5 = String.valueOf(valueOf7).length();
        int length6 = String.valueOf(str10).length();
        int length7 = String.valueOf(valueOf8).length();
        int length8 = String.valueOf(valueOf9).length();
        int length9 = String.valueOf(valueOf10).length();
        int length10 = String.valueOf(valueOf11).length();
        int length11 = String.valueOf(valueOf12).length();
        int length12 = String.valueOf(valueOf13).length();
        int length13 = String.valueOf(str11).length();
        int length14 = String.valueOf(str12).length();
        int length15 = String.valueOf(valueOf14).length();
        int length16 = String.valueOf(valueOf15).length();
        int length17 = String.valueOf(valueOf16).length();
        int length18 = String.valueOf(valueOf17).length();
        int length19 = String.valueOf(valueOf18).length();
        int length20 = String.valueOf(str13).length();
        int length21 = String.valueOf(valueOf19).length();
        int length22 = String.valueOf(valueOf20).length();
        int length23 = String.valueOf(valueOf21).length();
        int length24 = String.valueOf(valueOf22).length();
        int length25 = String.valueOf(str14).length();
        int length26 = String.valueOf(valueOf23).length();
        String str15 = valueOf25;
        StringBuilder sb = new StringBuilder(length + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + length19 + length20 + length21 + length22 + length23 + length24 + length25 + length26 + String.valueOf(valueOf24).length() + String.valueOf(valueOf25).length());
        sb.append("GsonAdsRequest{adTagUrl=");
        sb.append(str);
        sb.append(", adTagParameters=");
        sb.append(valueOf);
        sb.append(", adsResponse=");
        sb.append(str2);
        sb.append(", apiKey=");
        sb.append(str3);
        sb.append(", assetKey=");
        sb.append(str4);
        sb.append(", authToken=");
        sb.append(str5);
        sb.append(", companionSlots=");
        sb.append(valueOf2);
        sb.append(", contentDuration=");
        sb.append(valueOf3);
        sb.append(", contentKeywords=");
        sb.append(valueOf4);
        sb.append(", contentTitle=");
        sb.append(str6);
        sb.append(", contentUrl=");
        sb.append(str7);
        sb.append(", contentSourceId=");
        sb.append(str8);
        sb.append(", consentSettings=");
        sb.append(valueOf5);
        sb.append(", env=");
        sb.append(str9);
        sb.append(", experimentState=");
        sb.append(valueOf6);
        sb.append(", extraParameters=");
        sb.append(valueOf7);
        sb.append(", format=");
        sb.append(str10);
        sb.append(", identifierInfo=");
        sb.append(valueOf8);
        sb.append(", isTv=");
        sb.append(valueOf9);
        sb.append(", linearAdSlotWidth=");
        sb.append(valueOf10);
        sb.append(", linearAdSlotHeight=");
        sb.append(valueOf11);
        sb.append(", liveStreamPrefetchSeconds=");
        sb.append(valueOf12);
        sb.append(", marketAppInfo=");
        sb.append(valueOf13);
        sb.append(", msParameter=");
        sb.append(str11);
        sb.append(", network=");
        sb.append(str12);
        sb.append(", omidAdSessionsOnStartedOnly=");
        sb.append(valueOf14);
        sb.append(", settings=");
        sb.append(valueOf15);
        sb.append(", supportsExternalNavigation=");
        sb.append(valueOf16);
        sb.append(", supportsIconClickFallback=");
        sb.append(valueOf17);
        sb.append(", supportsNativeXhr=");
        sb.append(valueOf18);
        sb.append(", streamActivityMonitorId=");
        sb.append(str13);
        sb.append(", supportsResizing=");
        sb.append(valueOf19);
        sb.append(", useQAStreamBaseUrl=");
        sb.append(valueOf20);
        sb.append(", usesCustomVideoPlayback=");
        sb.append(valueOf21);
        sb.append(", vastLoadTimeout=");
        sb.append(valueOf22);
        sb.append(", videoId=");
        sb.append(str14);
        sb.append(", videoPlayActivation=");
        sb.append(valueOf23);
        sb.append(", videoContinuousPlay=");
        sb.append(valueOf24);
        sb.append(", videoPlayMuted=");
        sb.append(str15);
        sb.append("}");
        return sb.toString();
    }

    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    public alz videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    public String videoId() {
        return this.videoId;
    }

    public aly videoPlayActivation() {
        return this.videoPlayActivation;
    }

    public ama videoPlayMuted() {
        return this.videoPlayMuted;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.adTagUrl;
        int i5 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        ars ars = this.adTagParameters;
        int hashCode2 = (hashCode ^ (ars == null ? 0 : ars.hashCode())) * 1000003;
        String str2 = this.adsResponse;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.apiKey;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.assetKey;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.authToken;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        ars ars2 = this.companionSlots;
        int hashCode7 = (hashCode6 ^ (ars2 == null ? 0 : ars2.hashCode())) * 1000003;
        Float f = this.contentDuration;
        int hashCode8 = (hashCode7 ^ (f == null ? 0 : f.hashCode())) * 1000003;
        arn arn = this.contentKeywords;
        int hashCode9 = (hashCode8 ^ (arn == null ? 0 : arn.hashCode())) * 1000003;
        String str6 = this.contentTitle;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.contentUrl;
        int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.contentSourceId;
        int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        C6728au auVar = this.consentSettings;
        int hashCode13 = (hashCode12 ^ (auVar == null ? 0 : auVar.hashCode())) * 1000003;
        String str9 = this.env;
        int hashCode14 = (hashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        ars ars3 = this.experimentState;
        int hashCode15 = (hashCode14 ^ (ars3 == null ? 0 : ars3.hashCode())) * 1000003;
        ars ars4 = this.extraParameters;
        int hashCode16 = (hashCode15 ^ (ars4 == null ? 0 : ars4.hashCode())) * 1000003;
        String str10 = this.format;
        int hashCode17 = (hashCode16 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        aon aon = this.identifierInfo;
        int hashCode18 = (hashCode17 ^ (aon == null ? 0 : aon.hashCode())) * 1000003;
        Boolean bool = this.isTv;
        int hashCode19 = (hashCode18 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Integer num = this.linearAdSlotWidth;
        int hashCode20 = (hashCode19 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.linearAdSlotHeight;
        int hashCode21 = (hashCode20 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Float f2 = this.liveStreamPrefetchSeconds;
        int hashCode22 = (hashCode21 ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        alt alt = this.marketAppInfo;
        int hashCode23 = (hashCode22 ^ (alt == null ? 0 : alt.hashCode())) * 1000003;
        String str11 = this.msParameter;
        int hashCode24 = (hashCode23 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.network;
        int hashCode25 = (hashCode24 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        Boolean bool2 = this.omidAdSessionsOnStartedOnly;
        int hashCode26 = (hashCode25 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        ImaSdkSettings imaSdkSettings = this.settings;
        int hashCode27 = (hashCode26 ^ (imaSdkSettings == null ? 0 : imaSdkSettings.hashCode())) * 1000003;
        Boolean bool3 = this.supportsExternalNavigation;
        int hashCode28 = (hashCode27 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.supportsIconClickFallback;
        int hashCode29 = (hashCode28 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.supportsNativeXhr;
        int hashCode30 = (hashCode29 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        String str13 = this.streamActivityMonitorId;
        int hashCode31 = (hashCode30 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        Boolean bool6 = this.supportsResizing;
        int hashCode32 = (hashCode31 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.useQAStreamBaseUrl;
        int hashCode33 = (hashCode32 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Boolean bool8 = this.usesCustomVideoPlayback;
        int hashCode34 = (hashCode33 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Float f3 = this.vastLoadTimeout;
        if (f3 == null) {
            i = 0;
        } else {
            i = f3.hashCode();
        }
        int i6 = (hashCode34 ^ i) * 1000003;
        String str14 = this.videoId;
        if (str14 == null) {
            i2 = 0;
        } else {
            i2 = str14.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        aly aly = this.videoPlayActivation;
        if (aly == null) {
            i3 = 0;
        } else {
            i3 = aly.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        alz alz = this.videoContinuousPlay;
        if (alz == null) {
            i4 = 0;
        } else {
            i4 = alz.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        ama ama = this.videoPlayMuted;
        if (ama != null) {
            i5 = ama.hashCode();
        }
        return i9 ^ i5;
    }
}
