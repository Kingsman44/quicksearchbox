package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdsRequest;
import com.google.ads.interactivemedia.p367v3.api.player.ContentProgressProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amb */
/* compiled from: PG */
public final class amb implements AdsRequest {

    /* renamed from: a */
    private String f20931a;

    /* renamed from: b */
    private Map f20932b;

    /* renamed from: c */
    private String f20933c;

    /* renamed from: d */
    private ContentProgressProvider f20934d;

    /* renamed from: e */
    private aly f20935e = aly.UNKNOWN;

    /* renamed from: f */
    private ama f20936f = ama.UNKNOWN;

    /* renamed from: g */
    private alz f20937g = alz.UNKNOWN;

    /* renamed from: h */
    private Float f20938h;

    /* renamed from: i */
    private List f20939i;

    /* renamed from: j */
    private String f20940j;

    /* renamed from: k */
    private String f20941k;

    /* renamed from: l */
    private Integer f20942l;

    /* renamed from: m */
    private Float f20943m;

    /* renamed from: n */
    private Float f20944n;

    /* renamed from: o */
    private transient Object f20945o;

    /* renamed from: a */
    public final aly mo14939a() {
        return this.f20935e;
    }

    /* renamed from: b */
    public final ama mo14940b() {
        return this.f20936f;
    }

    /* renamed from: c */
    public final alz mo14941c() {
        return this.f20937g;
    }

    /* renamed from: d */
    public final Float mo14942d() {
        return this.f20938h;
    }

    /* renamed from: e */
    public final List mo14943e() {
        return this.f20939i;
    }

    /* renamed from: f */
    public final String mo14944f() {
        return this.f20940j;
    }

    public final void forceExperimentId(Integer num) {
        this.f20942l = num;
    }

    /* renamed from: g */
    public final String mo14945g() {
        return this.f20941k;
    }

    public final String getAdTagUrl() {
        return this.f20931a;
    }

    public final String getAdsResponse() {
        return this.f20933c;
    }

    public final ContentProgressProvider getContentProgressProvider() {
        return this.f20934d;
    }

    public final String getExtraParameter(String str) {
        Map map = this.f20932b;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public final Map getExtraParameters() {
        return this.f20932b;
    }

    public final Integer getForcedExperimentId() {
        return this.f20942l;
    }

    public final Object getUserRequestContext() {
        return this.f20945o;
    }

    /* renamed from: h */
    public final Float mo14946h() {
        return this.f20943m;
    }

    /* renamed from: i */
    public final Float mo14947i() {
        return this.f20944n;
    }

    public final void setAdTagUrl(String str) {
        this.f20931a = str;
    }

    public final void setAdWillAutoPlay(boolean z) {
        this.f20935e = z ? aly.AUTO : aly.CLICK;
    }

    public final void setAdWillPlayMuted(boolean z) {
        this.f20936f = z ? ama.MUTED : ama.UNMUTED;
    }

    public final void setAdsResponse(String str) {
        this.f20933c = str;
    }

    public final void setContentDuration(float f) {
        this.f20938h = Float.valueOf(f);
    }

    public final void setContentKeywords(List list) {
        this.f20939i = list;
    }

    public final void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        this.f20934d = contentProgressProvider;
    }

    public final void setContentTitle(String str) {
        this.f20940j = str;
    }

    public final void setContentUrl(String str) {
        this.f20941k = str;
    }

    public final void setContinuousPlayback(boolean z) {
        this.f20937g = z ? alz.ON : alz.OFF;
    }

    public final void setExtraParameter(String str, String str2) {
        if (this.f20932b == null) {
            this.f20932b = new HashMap();
        }
        this.f20932b.put(str, str2);
    }

    public final void setLiveStreamPrefetchSeconds(float f) {
        this.f20944n = Float.valueOf(f);
    }

    public final void setUserRequestContext(Object obj) {
        this.f20945o = obj;
    }

    public final void setVastLoadTimeout(float f) {
        this.f20943m = Float.valueOf(f);
    }
}
