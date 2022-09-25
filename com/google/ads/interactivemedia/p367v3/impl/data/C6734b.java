package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6762j.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.b */
/* compiled from: PG */
public abstract class C6734b {
    public static C6707a builder() {
        return new C6761i();
    }

    public abstract String appState();

    public abstract String eventId();

    public abstract long nativeTime();

    public abstract boolean nativeViewAttached();

    public abstract C6726as nativeViewBounds();

    public abstract boolean nativeViewHidden();

    public abstract C6726as nativeViewVisibleBounds();

    public abstract double nativeVolume();

    public abstract String queryId();
}
