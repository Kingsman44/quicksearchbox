package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6772t.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.aw */
/* compiled from: PG */
public abstract class C6730aw {
    static C6730aw create(int i, boolean z) {
        return new C6772t(i, z);
    }

    public abstract int experimentId();

    public abstract boolean shouldReport();
}
