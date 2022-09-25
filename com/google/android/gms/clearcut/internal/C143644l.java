package com.google.android.gms.clearcut.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.clearcut.internal.l */
/* compiled from: PG */
public final class C143644l {
    /* renamed from: a */
    public static long m233348a(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        int i2 = i;
        if (i2 <= bArr2.length) {
            int i3 = 37;
            if (i2 <= 32) {
                if (i2 > 16) {
                    long j = ((long) (i2 + i2)) - 7286425919675154353L;
                    long d = m233351d(bArr2, 0) * -5435081209227447693L;
                    long d2 = m233351d(bArr2, 8);
                    long d3 = m233351d(bArr2, i2 - 8) * j;
                    return m233350c(Long.rotateRight(d + d2, 43) + Long.rotateRight(d3, 30) + (m233351d(bArr2, i2 - 16) * -7286425919675154353L), d + Long.rotateRight(d2 - 7286425919675154353L, 18) + d3, j);
                } else if (i2 >= 8) {
                    long j2 = ((long) (i2 + i2)) - 7286425919675154353L;
                    long d4 = m233351d(bArr2, 0) - 7286425919675154353L;
                    long d5 = m233351d(bArr2, i2 - 8);
                    return m233350c((Long.rotateRight(d5, 37) * j2) + d4, (Long.rotateRight(d4, 25) + d5) * j2, j2);
                } else if (i2 >= 4) {
                    return m233350c(((long) i2) + ((((long) m233349b(bArr2, 0)) & 4294967295L) << 3), ((long) m233349b(bArr2, i2 - 4)) & 4294967295L, ((long) (i2 + i2)) - 7286425919675154353L);
                } else {
                    if (i2 <= 0) {
                        return -7286425919675154353L;
                    }
                    long j3 = (((long) ((bArr2[0] & 255) + ((bArr2[i2 >> 1] & 255) << 8))) * -7286425919675154353L) ^ (((long) (i2 + ((bArr2[i2 - 1] & 255) << 2))) * -4348849565147123417L);
                    return -7286425919675154353L * (j3 ^ (j3 >>> 47));
                }
            } else if (i2 <= 64) {
                long j4 = ((long) (i2 + i2)) - 7286425919675154353L;
                long d6 = m233351d(bArr2, 0) * -7286425919675154353L;
                long d7 = m233351d(bArr2, 8);
                long d8 = m233351d(bArr2, i2 - 8) * j4;
                long j5 = j4;
                long rotateRight = Long.rotateRight(d6 + d7, 43) + Long.rotateRight(d8, 30) + (m233351d(bArr2, i2 - 16) * -7286425919675154353L);
                long rotateRight2 = Long.rotateRight(d7 - 7286425919675154353L, 18);
                long d9 = m233351d(bArr2, 16) * j5;
                long d10 = m233351d(bArr2, 24);
                long d11 = (rotateRight + m233351d(bArr2, i2 - 32)) * j5;
                long j6 = j5;
                return m233350c(Long.rotateRight(d9 + d10, 43) + Long.rotateRight(d11, 30) + ((m233350c(rotateRight, rotateRight2 + d6 + d8, j6) + m233351d(bArr2, i2 - 24)) * j5), d9 + Long.rotateRight(d10 + d6, 18) + d11, j6);
            } else {
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                long d12 = m233351d(bArr2, 0) + 95310865018149119L;
                int i4 = i2 - 1;
                int i5 = (i4 >> 6) * 64;
                int i6 = i4 & 63;
                int i7 = (i5 + i6) - 63;
                long j7 = 2480279821605975764L;
                long j8 = 1390051526045402406L;
                int i8 = 0;
                while (true) {
                    long rotateRight3 = Long.rotateRight(d12 + j7 + jArr[0] + m233351d(bArr2, i8 + 8), i3);
                    long rotateRight4 = Long.rotateRight(j7 + jArr[1] + m233351d(bArr2, i8 + 48), 42);
                    long j9 = (rotateRight3 * -5435081209227447693L) ^ jArr2[1];
                    long d13 = (rotateRight4 * -5435081209227447693L) + jArr[0] + m233351d(bArr2, i8 + 40);
                    long rotateRight5 = Long.rotateRight(j8 + jArr2[0], 33) * -5435081209227447693L;
                    int i9 = i6;
                    int i10 = i5;
                    m233352e(bArr, i8, jArr[1] * -5435081209227447693L, j9 + jArr2[0], jArr);
                    m233352e(bArr, i8 + 32, rotateRight5 + jArr2[1], d13 + m233351d(bArr2, i8 + 16), jArr2);
                    int i11 = i8 + 64;
                    if (i11 == i10) {
                        long j10 = j9 & 255;
                        long j11 = -5435081209227447693L + j10 + j10;
                        long j12 = jArr2[0] + ((long) i9);
                        long j13 = jArr[0] + j12;
                        jArr[0] = j13;
                        jArr2[0] = j12 + j13;
                        long rotateRight6 = Long.rotateRight(rotateRight5 + d13 + j13 + m233351d(bArr2, i7 + 8), 37);
                        long rotateRight7 = Long.rotateRight(d13 + jArr[1] + m233351d(bArr2, i7 + 48), 42);
                        long j14 = (rotateRight6 * j11) ^ (jArr2[1] * 9);
                        long d14 = (rotateRight7 * j11) + (jArr[0] * 9) + m233351d(bArr2, i7 + 40);
                        long rotateRight8 = Long.rotateRight(j9 + jArr2[0], 33) * j11;
                        m233352e(bArr, i7, jArr[1] * j11, j14 + jArr2[0], jArr);
                        m233352e(bArr, i7 + 32, rotateRight8 + jArr2[1], m233351d(bArr2, i7 + 16) + d14, jArr2);
                        long j15 = j11;
                        return m233350c(m233350c(jArr[0], jArr2[0], j15) + (((d14 >>> 47) ^ d14) * -4348849565147123417L) + j14, m233350c(jArr[1], jArr2[1], j15) + rotateRight8, j15);
                    }
                    i8 = i11;
                    i5 = i10;
                    i6 = i9;
                    d12 = rotateRight5;
                    i3 = 37;
                    j8 = j9;
                    j7 = d13;
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Out of bound index with offput: 0 and length: " + i2);
        }
    }

    /* renamed from: b */
    private static int m233349b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    private static long m233350c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: d */
    private static long m233351d(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    /* renamed from: e */
    private static void m233352e(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long d = m233351d(bArr, i);
        long d2 = m233351d(bArr, i + 8);
        long d3 = m233351d(bArr, i + 16);
        long d4 = m233351d(bArr, i + 24);
        long j3 = j + d;
        long rotateRight = Long.rotateRight(j2 + j3 + d4, 21);
        long j4 = d2 + j3 + d3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + d4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }
}
