package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.StreamRequest;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anx */
/* compiled from: PG */
public final class anx implements StreamRequest {

    /* renamed from: a */
    private String f21070a;

    /* renamed from: b */
    private String f21071b;

    /* renamed from: c */
    private String f21072c;

    /* renamed from: d */
    private String f21073d;

    /* renamed from: e */
    private Map f21074e;

    /* renamed from: f */
    private String f21075f;

    /* renamed from: g */
    private String f21076g;

    /* renamed from: h */
    private String f21077h;

    /* renamed from: i */
    private String f21078i;

    /* renamed from: j */
    private Integer f21079j;

    /* renamed from: k */
    private StreamRequest.StreamFormat f21080k;

    /* renamed from: l */
    private Boolean f21081l;

    /* renamed from: m */
    private transient Object f21082m;

    /* renamed from: a */
    public final void mo15052a(String str) {
        this.f21070a = str;
    }

    /* renamed from: b */
    public final void mo15053b(String str) {
        this.f21072c = str;
    }

    /* renamed from: c */
    public final void mo15054c(String str) {
        this.f21073d = str;
    }

    /* renamed from: d */
    public final void mo15055d(String str) {
        this.f21071b = str;
    }

    public final void forceExperimentId(Integer num) {
        this.f21079j = num;
    }

    public final Map getAdTagParameters() {
        return this.f21074e;
    }

    public final String getApiKey() {
        return this.f21071b;
    }

    public final String getAssetKey() {
        return this.f21070a;
    }

    public final String getAuthToken() {
        return this.f21077h;
    }

    public final String getContentSourceId() {
        return this.f21072c;
    }

    public final String getContentUrl() {
        return this.f21076g;
    }

    public final Integer getForcedExperimentId() {
        return this.f21079j;
    }

    public final StreamRequest.StreamFormat getFormat() {
        return this.f21080k;
    }

    public final String getManifestSuffix() {
        return this.f21075f;
    }

    public final String getStreamActivityMonitorId() {
        return this.f21078i;
    }

    public final Boolean getUseQAStreamBaseUrl() {
        return this.f21081l;
    }

    public final Object getUserRequestContext() {
        return this.f21082m;
    }

    public final String getVideoId() {
        return this.f21073d;
    }

    public final void setAdTagParameters(Map map) {
        this.f21074e = map;
    }

    public final void setAuthToken(String str) {
        this.f21077h = str;
    }

    public final void setContentUrl(String str) {
        this.f21076g = str;
    }

    public final void setFormat(StreamRequest.StreamFormat streamFormat) {
        this.f21080k = streamFormat;
    }

    public final void setManifestSuffix(String str) {
        this.f21075f = str;
    }

    public final void setStreamActivityMonitorId(String str) {
        this.f21078i = str;
    }

    public final void setUseQAStreamBaseUrl(Boolean bool) {
        this.f21081l = bool;
    }

    public final void setUserRequestContext(Object obj) {
        this.f21082m = obj;
    }
}
