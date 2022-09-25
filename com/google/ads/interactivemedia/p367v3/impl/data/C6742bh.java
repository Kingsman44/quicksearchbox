package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6708aa.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bh */
/* compiled from: PG */
public abstract class C6742bh {
    public static C6742bh create(C6741bg bgVar, String str, String str2, String str3, int i, int i2) {
        return new C6708aa(bgVar, str, str2, str3, i, i2);
    }

    public abstract int connectionTimeoutMs();

    /* renamed from: id */
    public abstract String mo14021id();

    public abstract int readTimeoutMs();

    public abstract C6741bg requestType();

    public abstract String url();

    public abstract String userAgent();
}
