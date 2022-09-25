package com.google.common.p4537i;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.i.j */
/* compiled from: PG */
final class C59285j extends C59281f {

    /* renamed from: a */
    static final C59290o f157411a = new C59285j();

    /* renamed from: f */
    private static long m92091f(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: g */
    private static void m92092g(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = C59300y.m92144b(bArr, i);
        long b2 = C59300y.m92144b(bArr, i + 8);
        long b3 = C59300y.m92144b(bArr, i + 16);
        long b4 = C59300y.m92144b(bArr, i + 24);
        long j3 = j + b;
        long rotateRight = Long.rotateRight(j2 + j3 + b4, 21);
        long j4 = b2 + j3 + b3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + b4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    /* renamed from: d */
    public final C59289n mo56761d(byte[] bArr, int i) {
        long j;
        long b;
        long rotateRight;
        int i2;
        byte[] bArr2 = bArr;
        int i3 = i;
        C58838bb.m90882q(0, i3, bArr2.length);
        int i4 = 37;
        long j2 = -7286425919675154353L;
        if (i3 <= 32) {
            if (i3 > 16) {
                long j3 = (long) i3;
                long j4 = (j3 + j3) - 7286425919675154353L;
                long b2 = C59300y.m92144b(bArr2, 0) * -5435081209227447693L;
                long b3 = C59300y.m92144b(bArr2, 8);
                long b4 = C59300y.m92144b(bArr2, i3 - 8) * j4;
                j2 = m92091f(Long.rotateRight(b2 + b3, 43) + Long.rotateRight(b4, 30) + (C59300y.m92144b(bArr2, i3 - 16) * -7286425919675154353L), b2 + Long.rotateRight(b3 - 7286425919675154353L, 18) + b4, j4);
            } else if (i3 >= 8) {
                long j5 = (long) i3;
                long j6 = (j5 + j5) - 7286425919675154353L;
                long b5 = C59300y.m92144b(bArr2, 0) - 7286425919675154353L;
                long b6 = C59300y.m92144b(bArr2, i3 - 8);
                j2 = m92091f((Long.rotateRight(b6, 37) * j6) + b5, (Long.rotateRight(b5, 25) + b6) * j6, j6);
            } else if (i3 >= 4) {
                j2 = m92091f(((long) i3) + ((((long) C59300y.m92143a(bArr2, 0)) & 4294967295L) << 3), ((long) C59300y.m92143a(bArr2, i3 - 4)) & 4294967295L, ((long) (i3 + i3)) - 7286425919675154353L);
            } else if (i3 > 0) {
                long j7 = (((long) ((bArr2[0] & 255) + ((bArr2[i3 >> 1] & 255) << 8))) * -7286425919675154353L) ^ (((long) (i3 + ((bArr2[i3 - 1] & 255) << 2))) * -4348849565147123417L);
                j2 = -7286425919675154353L * (j7 ^ (j7 >>> 47));
            }
        } else if (i3 <= 64) {
            long j8 = (long) i3;
            long j9 = (j8 + j8) - 7286425919675154353L;
            long b7 = C59300y.m92144b(bArr2, 0) * -7286425919675154353L;
            long b8 = C59300y.m92144b(bArr2, 8);
            long b9 = C59300y.m92144b(bArr2, i3 - 8) * j9;
            long j10 = j9;
            long rotateRight2 = Long.rotateRight(b7 + b8, 43) + Long.rotateRight(b9, 30) + (C59300y.m92144b(bArr2, i3 - 16) * -7286425919675154353L);
            long rotateRight3 = Long.rotateRight(b8 - 7286425919675154353L, 18);
            long b10 = C59300y.m92144b(bArr2, 16) * j10;
            long b11 = C59300y.m92144b(bArr2, 24);
            long b12 = (C59300y.m92144b(bArr2, i3 - 32) + rotateRight2) * j10;
            long j11 = j10;
            j2 = m92091f(Long.rotateRight(b10 + b11, 43) + Long.rotateRight(b12, 30) + ((m92091f(rotateRight2, rotateRight3 + b7 + b9, j11) + C59300y.m92144b(bArr2, i3 - 24)) * j10), b10 + Long.rotateRight(b11 + b7, 18) + b12, j11);
        } else {
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long b13 = C59300y.m92144b(bArr2, 0) + 95310865018149119L;
            int i5 = i3 - 1;
            int i6 = (i5 >> 6) * 64;
            int i7 = i5 & 63;
            int i8 = (i6 + i7) - 63;
            long j12 = 2480279821605975764L;
            long j13 = 1390051526045402406L;
            int i9 = 0;
            while (true) {
                long rotateRight4 = Long.rotateRight(b13 + j12 + jArr[0] + C59300y.m92144b(bArr2, i9 + 8), i4);
                long rotateRight5 = Long.rotateRight(j12 + jArr[1] + C59300y.m92144b(bArr2, i9 + 48), 42);
                j = (rotateRight4 * -5435081209227447693L) ^ jArr2[1];
                b = (rotateRight5 * -5435081209227447693L) + jArr[0] + C59300y.m92144b(bArr2, i9 + 40);
                rotateRight = Long.rotateRight(j13 + jArr2[0], 33) * -5435081209227447693L;
                i2 = i7;
                m92092g(bArr, i9, jArr[1] * -5435081209227447693L, j + jArr2[0], jArr);
                m92092g(bArr, i9 + 32, rotateRight + jArr2[1], b + C59300y.m92144b(bArr2, i9 + 16), jArr2);
                int i10 = i9 + 64;
                if (i10 == i6) {
                    break;
                }
                i9 = i10;
                i7 = i2;
                b13 = rotateRight;
                j13 = j;
                j12 = b;
                i4 = 37;
            }
            long j14 = j & 255;
            long j15 = -5435081209227447693L + j14 + j14;
            long j16 = jArr2[0] + ((long) i2);
            long j17 = jArr[0] + j16;
            jArr[0] = j17;
            jArr2[0] = j16 + j17;
            long rotateRight6 = Long.rotateRight(rotateRight + b + j17 + C59300y.m92144b(bArr2, i8 + 8), 37);
            long rotateRight7 = Long.rotateRight(b + jArr[1] + C59300y.m92144b(bArr2, i8 + 48), 42);
            long j18 = (rotateRight6 * j15) ^ (jArr2[1] * 9);
            long b14 = (rotateRight7 * j15) + (jArr[0] * 9) + C59300y.m92144b(bArr2, i8 + 40);
            long rotateRight8 = Long.rotateRight(j + jArr2[0], 33) * j15;
            m92092g(bArr, i8, jArr[1] * j15, j18 + jArr2[0], jArr);
            m92092g(bArr, i8 + 32, rotateRight8 + jArr2[1], b14 + C59300y.m92144b(bArr2, i8 + 16), jArr2);
            long j19 = j15;
            j2 = m92091f(m92091f(jArr[0], jArr2[0], j19) + ((b14 ^ (b14 >>> 47)) * -4348849565147123417L) + j18, m92091f(jArr[1], jArr2[1], j19) + rotateRight8, j19);
        }
        return C59289n.m92112i(j2);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
