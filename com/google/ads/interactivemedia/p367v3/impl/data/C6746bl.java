package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6715ah.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bl */
/* compiled from: PG */
public abstract class C6746bl {
    public static C6745bk builder() {
        return new C6714ag();
    }

    public abstract boolean attached();

    public abstract C6726as bounds();

    public abstract String detailedReason();

    public abstract boolean hidden();

    public abstract FriendlyObstructionPurpose purpose();

    public abstract String type();
}
