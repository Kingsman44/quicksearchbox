package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ph */
/* compiled from: PG */
final class C7198ph extends C7047js {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7198ph(aes aes, long j, long j2) {
        super(new C7042jn(), new C7188oy(aes), j, j + 1, 0, j2, 188, 1000);
        aes aes2 = aes;
    }

    /* renamed from: h */
    static /* synthetic */ int m21468h(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7198ph(aes aes, long j, long j2, int i, int i2) {
        super(new C7042jn(), new C7197pg(i, aes, i2), j, j + 1, 0, j2, 188, 940);
        aes aes2 = aes;
    }
}
