package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.CuePoint;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amn */
/* compiled from: PG */
public final class amn implements CuePoint {

    /* renamed from: a */
    private final double f20982a;

    /* renamed from: b */
    private final double f20983b;

    /* renamed from: c */
    private final boolean f20984c;

    public amn(double d, double d2, boolean z) {
        this.f20982a = d;
        this.f20983b = d2;
        this.f20984c = z;
    }

    public final double getEndTime() {
        return this.f20983b;
    }

    public final double getStartTime() {
        return this.f20982a;
    }

    public final boolean isPlayed() {
        return this.f20984c;
    }
}
