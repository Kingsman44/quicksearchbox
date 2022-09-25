package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.is */
/* compiled from: PG */
final class C7020is {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f22496a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f22497b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public /* synthetic */ C7020is(MediaCodec.CryptoInfo cryptoInfo) {
        this.f22496a = cryptoInfo;
    }

    /* renamed from: a */
    static /* synthetic */ void m20830a(C7020is isVar, int i, int i2) {
        isVar.f22497b.set(i, i2);
        isVar.f22496a.setPattern(isVar.f22497b);
    }
}
