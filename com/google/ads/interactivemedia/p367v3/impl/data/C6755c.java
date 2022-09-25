package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.AdPodInfo;
import com.google.ads.interactivemedia.p367v3.api.C6706Ad;
import com.google.ads.interactivemedia.p367v3.api.CompanionAd;
import com.google.ads.interactivemedia.p367v3.api.UniversalAdId;
import com.google.ads.interactivemedia.p367v3.internal.auj;
import com.google.ads.interactivemedia.p367v3.internal.auk;
import com.google.ads.interactivemedia.p367v3.internal.aul;
import com.google.ads.interactivemedia.p367v3.internal.aum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.c */
/* compiled from: PG */
public final class C6755c implements C6706Ad {
    private String adId;
    @aum
    @auk
    private C6756d adPodInfo = new C6756d();
    private String adSystem;
    @aum
    @auk
    private String[] adWrapperCreativeIds;
    @aum
    @auk
    private String[] adWrapperIds;
    @aum
    @auk
    private String[] adWrapperSystems;
    private String advertiserName;
    private String clickThroughUrl;
    @aum
    @auk
    private List companions;
    private String contentType;
    private String creativeAdId;
    private String creativeId;
    private String dealId;
    private String description;
    private boolean disableUi;
    private double duration;
    private int height;
    private boolean isUiDisabled_ = false;
    private boolean linear;
    private double skipTimeOffset = -1.0d;
    private boolean skippable;
    private String surveyUrl;
    private String title;
    private String traffickingParameters;
    @aum
    @auk
    private Set uiElements;
    private String universalAdIdRegistry;
    private String universalAdIdValue;
    @aum
    @auk
    private C6752br[] universalAdIds;
    private int vastMediaBitrate;
    private int vastMediaHeight;
    private int vastMediaWidth;
    private int width;

    public boolean canDisableUi() {
        return this.disableUi;
    }

    public boolean equals(Object obj) {
        return auj.m19669c(this, obj, "vastMediaBitrate", "vastMediaHeight", "vastMediaWidth");
    }

    public String getAdId() {
        return this.adId;
    }

    public AdPodInfo getAdPodInfo() {
        return this.adPodInfo;
    }

    public String getAdSystem() {
        return this.adSystem;
    }

    public String[] getAdWrapperCreativeIds() {
        return this.adWrapperCreativeIds;
    }

    public String[] getAdWrapperIds() {
        return this.adWrapperIds;
    }

    public String[] getAdWrapperSystems() {
        return this.adWrapperSystems;
    }

    public String getAdvertiserName() {
        return this.advertiserName;
    }

    public String getClickThruUrl() {
        return this.clickThroughUrl;
    }

    public List getCompanionAds() {
        ArrayList arrayList = new ArrayList();
        for (CompanionAd add : this.companions) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getCreativeAdId() {
        return this.creativeAdId;
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public String getDealId() {
        return this.dealId;
    }

    public String getDescription() {
        return this.description;
    }

    public double getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public double getSkipTimeOffset() {
        return this.skipTimeOffset;
    }

    public String getSurveyUrl() {
        return this.surveyUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTraffickingParameters() {
        return this.traffickingParameters;
    }

    public Set getUiElements() {
        return this.uiElements;
    }

    public String getUniversalAdIdRegistry() {
        return this.universalAdIdRegistry;
    }

    public String getUniversalAdIdValue() {
        return this.universalAdIdValue;
    }

    public UniversalAdId[] getUniversalAdIds() {
        return this.universalAdIds;
    }

    public int getVastMediaBitrate() {
        return this.vastMediaBitrate;
    }

    public int getVastMediaHeight() {
        return this.vastMediaHeight;
    }

    public int getVastMediaWidth() {
        return this.vastMediaWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return aul.m19677b(this, new String[0]);
    }

    public boolean isLinear() {
        return this.linear;
    }

    public boolean isSkippable() {
        return this.skippable;
    }

    public boolean isUiDisabled() {
        return this.isUiDisabled_;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAdPodInfo(C6756d dVar) {
        this.adPodInfo = dVar;
    }

    public void setAdSystem(String str) {
        this.adSystem = str;
    }

    public void setAdWrapperCreativeIds(String[] strArr) {
        this.adWrapperCreativeIds = strArr;
    }

    public void setAdWrapperIds(String[] strArr) {
        this.adWrapperIds = strArr;
    }

    public void setAdWrapperSystems(String[] strArr) {
        this.adWrapperSystems = strArr;
    }

    public void setAdvertiserName(String str) {
        this.advertiserName = str;
    }

    public void setCanDisableUi(boolean z) {
        this.disableUi = z;
    }

    public void setClickThruUrl(String str) {
        this.clickThroughUrl = str;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setCreativeAdId(String str) {
        this.creativeAdId = str;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public void setDealId(String str) {
        this.dealId = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLinear(boolean z) {
        this.linear = z;
    }

    public void setSkipTimeOffset(double d) {
        this.skipTimeOffset = d;
    }

    public void setSkippable(boolean z) {
        this.skippable = z;
    }

    public void setSurveyUrl(String str) {
        this.surveyUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTraffickingParameters(String str) {
        this.traffickingParameters = str;
    }

    public void setUiDisabled(boolean z) {
        this.isUiDisabled_ = z;
    }

    public void setUiElements(Set set) {
        this.uiElements = set;
    }

    public void setUniversalAdIdRegistry(String str) {
        this.universalAdIdRegistry = str;
    }

    public void setUniversalAdIdValue(String str) {
        this.universalAdIdValue = str;
    }

    public void setUniversalAdIds(C6752br[] brVarArr) {
        this.universalAdIds = brVarArr;
    }

    public void setVastMediaBitrate(int i) {
        this.vastMediaBitrate = i;
    }

    public void setVastMediaHeight(int i) {
        this.vastMediaHeight = i;
    }

    public void setVastMediaWidth(int i) {
        this.vastMediaWidth = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        String str = this.adId;
        String str2 = this.creativeId;
        String str3 = this.creativeAdId;
        String str4 = this.universalAdIdValue;
        String str5 = this.universalAdIdRegistry;
        String str6 = this.title;
        String str7 = this.description;
        String str8 = this.contentType;
        String arrays = Arrays.toString(this.adWrapperIds);
        String arrays2 = Arrays.toString(this.adWrapperSystems);
        String arrays3 = Arrays.toString(this.adWrapperCreativeIds);
        String str9 = this.adSystem;
        String str10 = this.advertiserName;
        String str11 = this.surveyUrl;
        String str12 = this.dealId;
        boolean z = this.linear;
        boolean z2 = this.skippable;
        int i = this.width;
        int i2 = this.height;
        int i3 = this.vastMediaHeight;
        int i4 = this.vastMediaWidth;
        int i5 = this.vastMediaBitrate;
        String str13 = this.traffickingParameters;
        String str14 = str11;
        String str15 = this.clickThroughUrl;
        double d = this.duration;
        String valueOf = String.valueOf(this.adPodInfo);
        String valueOf2 = String.valueOf(this.uiElements);
        String str16 = valueOf;
        double d2 = this.skipTimeOffset;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        int length6 = String.valueOf(str6).length();
        int length7 = String.valueOf(str7).length();
        int length8 = String.valueOf(str8).length();
        int length9 = String.valueOf(arrays).length();
        int length10 = String.valueOf(arrays2).length();
        int length11 = String.valueOf(arrays3).length();
        int length12 = String.valueOf(str9).length();
        int length13 = String.valueOf(str10).length();
        int length14 = String.valueOf(str14).length();
        int length15 = String.valueOf(str12).length();
        int length16 = String.valueOf(str13).length();
        int length17 = String.valueOf(str15).length();
        double d3 = d2;
        StringBuilder sb = new StringBuilder(length + 542 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + String.valueOf(str16).length() + String.valueOf(valueOf2).length());
        sb.append("Ad [adId=");
        sb.append(str);
        sb.append(", creativeId=");
        sb.append(str2);
        sb.append(", creativeAdId=");
        sb.append(str3);
        sb.append(", universalAdIdValue=");
        sb.append(str4);
        sb.append(", universalAdIdRegistry=");
        sb.append(str5);
        sb.append(", title=");
        sb.append(str6);
        sb.append(", description=");
        sb.append(str7);
        sb.append(", contentType=");
        sb.append(str8);
        sb.append(", adWrapperIds=");
        sb.append(arrays);
        sb.append(", adWrapperSystems=");
        sb.append(arrays2);
        sb.append(", adWrapperCreativeIds=");
        sb.append(arrays3);
        sb.append(", adSystem=");
        sb.append(str9);
        sb.append(", advertiserName=");
        sb.append(str10);
        sb.append(", surveyUrl=");
        sb.append(str14);
        sb.append(", dealId=");
        sb.append(str12);
        sb.append(", linear=");
        sb.append(z);
        sb.append(", skippable=");
        sb.append(z2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", vastMediaHeight=");
        sb.append(i3);
        sb.append(", vastMediaWidth=");
        sb.append(i4);
        sb.append(", vastMediaBitrate=");
        sb.append(i5);
        sb.append(", traffickingParameters=");
        sb.append(str13);
        sb.append(", clickThroughUrl=");
        sb.append(str15);
        sb.append(", duration=");
        sb.append(d);
        sb.append(", adPodInfo=");
        sb.append(str16);
        sb.append(", uiElements=");
        sb.append(valueOf2);
        sb.append(", disableUi=");
        sb.append(this.disableUi);
        sb.append(", skipTimeOffset=");
        sb.append(d3);
        sb.append("]");
        return sb.toString();
    }
}
