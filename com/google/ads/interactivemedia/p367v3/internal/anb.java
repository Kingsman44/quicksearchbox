package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.p367v3.impl.data.C6755c;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anb */
/* compiled from: PG */
public final class anb {

    /* renamed from: a */
    public final AdEvent.AdEventType f21007a;

    /* renamed from: b */
    public final C6755c f21008b;

    /* renamed from: c */
    public Map f21009c;

    /* renamed from: d */
    public List f21010d;

    /* renamed from: e */
    AdProgressInfo f21011e;

    /* renamed from: f */
    public double f21012f;

    public anb(AdEvent.AdEventType adEventType, C6755c cVar) {
        this.f21007a = adEventType;
        this.f21008b = cVar;
    }

    public final boolean equals(Object obj) {
        return auj.m19669c(this, obj, new String[0]);
    }

    public final int hashCode() {
        return aul.m19677b(this, new String[0]);
    }
}
