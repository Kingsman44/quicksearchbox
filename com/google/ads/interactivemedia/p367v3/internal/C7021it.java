package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodec;

/* renamed from: com.google.ads.interactivemedia.v3.internal.it */
/* compiled from: PG */
public final class C7021it {

    /* renamed from: a */
    public byte[] f22498a;

    /* renamed from: b */
    public int[] f22499b;

    /* renamed from: c */
    public int[] f22500c;

    /* renamed from: d */
    private final MediaCodec.CryptoInfo f22501d;

    /* renamed from: e */
    private final C7020is f22502e;

    public C7021it() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f22501d = cryptoInfo;
        this.f22502e = aeu.f20466a >= 24 ? new C7020is(cryptoInfo) : null;
    }

    /* renamed from: a */
    public final void mo16038a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f22499b = iArr;
        this.f22500c = iArr2;
        this.f22498a = bArr2;
        this.f22501d.numSubSamples = i;
        this.f22501d.numBytesOfClearData = iArr;
        this.f22501d.numBytesOfEncryptedData = iArr2;
        this.f22501d.key = bArr;
        this.f22501d.iv = bArr2;
        this.f22501d.mode = i2;
        if (aeu.f20466a >= 24) {
            C7020is isVar = this.f22502e;
            ary.m19467t(isVar);
            C7020is.m20830a(isVar, i3, i4);
        }
    }

    /* renamed from: b */
    public final MediaCodec.CryptoInfo mo16039b() {
        return this.f22501d;
    }

    /* renamed from: c */
    public final void mo16040c(int i) {
        if (i != 0) {
            if (this.f22499b == null) {
                int[] iArr = new int[1];
                this.f22499b = iArr;
                this.f22501d.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f22499b;
            iArr2[0] = iArr2[0] + i;
        }
    }
}
