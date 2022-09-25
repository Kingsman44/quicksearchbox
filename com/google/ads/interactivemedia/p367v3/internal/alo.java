package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdProgressInfo;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alo */
/* compiled from: PG */
public final class alo implements AdProgressInfo {

    /* renamed from: a */
    private final double f20892a;

    /* renamed from: b */
    private final double f20893b;

    /* renamed from: c */
    private final int f20894c;

    /* renamed from: d */
    private final int f20895d;

    /* renamed from: e */
    private final double f20896e;

    /* renamed from: f */
    private final double f20897f;

    public alo(double d, double d2, int i, int i2, double d3, double d4) {
        this.f20892a = d;
        this.f20893b = d2;
        this.f20894c = i;
        this.f20895d = i2;
        this.f20896e = d3;
        this.f20897f = d4;
    }

    public final double getAdBreakDuration() {
        return this.f20896e;
    }

    public final double getAdPeriodDuration() {
        return this.f20897f;
    }

    public final int getAdPosition() {
        return this.f20894c;
    }

    public final double getCurrentTime() {
        return this.f20892a;
    }

    public final double getDuration() {
        return this.f20893b;
    }

    public final int getTotalAds() {
        return this.f20895d;
    }
}
