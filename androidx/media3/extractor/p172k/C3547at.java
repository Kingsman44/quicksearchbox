package androidx.media3.extractor.p172k;

import androidx.media3.common.p136b.C2604ac;

/* renamed from: androidx.media3.extractor.k.at */
/* compiled from: PG */
public final class C3547at {
    /* renamed from: a */
    public static int m10226a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m10227b(C2604ac acVar, int i, int i2) {
        acVar.mo6131A(i);
        if (acVar.f7236c - acVar.f7235b < 5) {
            return -9223372036854775807L;
        }
        int b = acVar.mo6134b();
        if ((8388608 & b) != 0 || ((b >> 8) & 8191) != i2 || (b & 32) == 0 || acVar.mo6139g() < 7 || acVar.f7236c - acVar.f7235b < 7 || (acVar.mo6139g() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        acVar.mo6155w(bArr, 0, 6);
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        byte b4 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b3) & 255) << 17) | ((((long) b2) & 255) << 25) | ((((long) b4) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
