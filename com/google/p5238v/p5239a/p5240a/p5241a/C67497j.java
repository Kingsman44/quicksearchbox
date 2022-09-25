package com.google.p5238v.p5239a.p5240a.p5241a;

import java.util.Arrays;

/* renamed from: com.google.v.a.a.a.j */
/* compiled from: PG */
public final class C67497j {
    /* renamed from: a */
    public static byte[] m97506a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        long b = m97507b(bArr3, 0, 0);
        long b2 = m97507b(bArr3, 3, 2) & 67108611;
        long b3 = m97507b(bArr3, 6, 4) & 67092735;
        long b4 = m97507b(bArr3, 9, 6) & 66076671;
        long b5 = m97507b(bArr3, 12, 8) & 1048575;
        long j = b2 * 5;
        long j2 = b3 * 5;
        long j3 = b4 * 5;
        long j4 = b5 * 5;
        int i = 17;
        byte[] bArr5 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr4.length;
            if (i2 < length) {
                int min = Math.min(16, length - i2);
                System.arraycopy(bArr4, i2, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i, (byte) 0);
                }
                long b6 = j9 + m97507b(bArr5, 0, 0);
                long b7 = j6 + m97507b(bArr5, 3, 2);
                long b8 = j5 + m97507b(bArr5, 6, 4);
                long b9 = j7 + m97507b(bArr5, 9, 6);
                long b10 = j8 + (m97507b(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j10 = (b6 * b) + (b7 * j4) + (b8 * j3) + (b9 * j2) + (b10 * j);
                long j11 = (b6 * b2) + (b7 * b) + (b8 * j4) + (b9 * j3) + (b10 * j2) + (j10 >> 26);
                long j12 = (b6 * b3) + (b7 * b2) + (b8 * b) + (b9 * j4) + (b10 * j3) + (j11 >> 26);
                long j13 = (b6 * b4) + (b7 * b3) + (b8 * b2) + (b9 * b) + (b10 * j4) + (j12 >> 26);
                long j14 = (b6 * b5) + (b7 * b4) + (b8 * b3) + (b9 * b2) + (b10 * b) + (j13 >> 26);
                j8 = j14 & 67108863;
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j9 = j15 & 67108863;
                j6 = (j11 & 67108863) + (j15 >> 26);
                i2 += 16;
                j7 = j13 & 67108863;
                j5 = j12 & 67108863;
                i = 17;
            } else {
                long j16 = j5 + (j6 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j7 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = j8 + (j18 >> 26);
                long j21 = j20 & 67108863;
                long j22 = j9 + ((j20 >> 26) * 5);
                long j23 = j22 & 67108863;
                long j24 = (j6 & 67108863) + (j22 >> 26);
                long j25 = j23 + 5;
                long j26 = (j25 >> 26) + j24;
                long j27 = j17 + (j26 >> 26);
                long j28 = j19 + (j27 >> 26);
                long j29 = (j21 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = j30 ^ -1;
                long j32 = (j24 & j30) | (j26 & 67108863 & j31);
                long j33 = (j17 & j30) | (j27 & 67108863 & j31);
                long j34 = (j19 & j30) | (j28 & 67108863 & j31);
                long c = (((j23 & j30) | (j25 & 67108863 & j31) | (j32 << 26)) & 4294967295L) + m97508c(bArr3, 16);
                long c2 = (((j32 >> 6) | (j33 << 20)) & 4294967295L) + m97508c(bArr3, 20) + (c >> 32);
                long c3 = (((j33 >> 12) | (j34 << 14)) & 4294967295L) + m97508c(bArr3, 24) + (c2 >> 32);
                long c4 = m97508c(bArr3, 28);
                byte[] bArr6 = new byte[16];
                m97509d(bArr6, c & 4294967295L, 0);
                m97509d(bArr6, c2 & 4294967295L, 4);
                m97509d(bArr6, c3 & 4294967295L, 8);
                m97509d(bArr6, ((((j34 >> 18) | (((j21 & j30) | (j29 & j31)) << 8)) & 4294967295L) + c4 + (c3 >> 32)) & 4294967295L, 12);
                return bArr6;
            }
        }
    }

    /* renamed from: b */
    private static long m97507b(byte[] bArr, int i, int i2) {
        return (m97508c(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: c */
    private static long m97508c(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* renamed from: d */
    private static void m97509d(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }
}
