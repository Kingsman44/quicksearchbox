package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acp */
/* compiled from: PG */
public final class acp {

    /* renamed from: a */
    private final Map f20321a = new HashMap();

    /* renamed from: b */
    private Map f20322b;

    /* renamed from: a */
    public final synchronized Map mo14454a() {
        if (this.f20322b == null) {
            this.f20322b = Collections.unmodifiableMap(new HashMap(this.f20321a));
        }
        return this.f20322b;
    }
}
