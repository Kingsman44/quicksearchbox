package androidx.media3.extractor.p159f;

import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.f.g */
/* compiled from: PG */
final class C3402g {

    /* renamed from: b */
    private static final long[] f10410b = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public int f10411a;

    /* renamed from: c */
    private final byte[] f10412c = new byte[8];

    /* renamed from: d */
    private int f10413d;

    /* renamed from: a */
    public static int m9840a(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f10410b[i2] & ((long) i)) > 0 ? 1 : ((f10410b[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static long m9841b(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f10410b[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: c */
    public final long mo7375c(C3327ab abVar, boolean z, boolean z2, int i) {
        if (this.f10413d == 0) {
            if (!abVar.mo7321p(this.f10412c, 0, 1, z)) {
                return -1;
            }
            int a = m9840a(this.f10412c[0] & 255);
            this.f10411a = a;
            if (a != -1) {
                this.f10413d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f10411a;
        if (i2 > i) {
            this.f10413d = 0;
            return -2;
        }
        if (i2 != 1) {
            ((C3627q) abVar).mo7321p(this.f10412c, 1, i2 - 1, false);
        }
        this.f10413d = 0;
        return m9841b(this.f10412c, this.f10411a, z2);
    }

    /* renamed from: d */
    public final void mo7376d() {
        this.f10413d = 0;
        this.f10411a = 0;
    }
}
