package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alk */
/* compiled from: PG */
public final class alk implements AdErrorEvent {

    /* renamed from: a */
    private final AdError f20884a;

    /* renamed from: b */
    private final Object f20885b;

    public alk(AdError adError) {
        this.f20884a = adError;
        this.f20885b = null;
    }

    public alk(AdError adError, Object obj) {
        this.f20884a = adError;
        this.f20885b = obj;
    }

    public final AdError getError() {
        return this.f20884a;
    }

    public final Object getUserRequestContext() {
        return this.f20885b;
    }
}
