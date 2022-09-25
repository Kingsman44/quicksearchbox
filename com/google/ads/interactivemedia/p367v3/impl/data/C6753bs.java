package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bs */
/* compiled from: PG */
public abstract class C6753bs {
    public abstract C6754bt build();

    public abstract C6753bs volume(float f);

    public C6753bs volumePercentage(int i) {
        return volume(((float) i) / 100.0f);
    }
}
