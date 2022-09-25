package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lt */
/* compiled from: PG */
final class C7102lt {

    /* renamed from: a */
    private static final long[] f22864a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f22865b = new byte[8];

    /* renamed from: c */
    private int f22866c;

    /* renamed from: d */
    private int f22867d;

    /* renamed from: c */
    public static int m21078c(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f22864a[i2] & ((long) i)) > 0 ? 1 : ((f22864a[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static long m21079d(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f22864a[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final void mo16162a() {
        this.f22866c = 0;
        this.f22867d = 0;
    }

    /* renamed from: b */
    public final int mo16163b() {
        return this.f22867d;
    }

    /* renamed from: e */
    public final long mo16164e(C7050jv jvVar, boolean z, boolean z2, int i) {
        if (this.f22866c == 0) {
            if (!jvVar.mo16089b(this.f22865b, 0, 1, z)) {
                return -1;
            }
            int c = m21078c(this.f22865b[0] & 255);
            this.f22867d = c;
            if (c != -1) {
                this.f22866c = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f22867d;
        if (i2 > i) {
            this.f22866c = 0;
            return -2;
        }
        if (i2 != 1) {
            jvVar.mo16090c(this.f22865b, 1, i2 - 1);
        }
        this.f22866c = 0;
        return m21079d(this.f22865b, this.f22867d, z2);
    }
}
