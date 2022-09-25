package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6771s.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.av */
/* compiled from: PG */
public abstract class C6729av {
    private static C6729av create(double d, double d2, boolean z) {
        return new C6771s(d, d2, z);
    }

    public abstract double end();

    public abstract boolean played();

    public abstract double start();
}
