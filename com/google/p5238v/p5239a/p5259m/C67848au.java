package com.google.p5238v.p5239a.p5259m;

import java.util.Arrays;

/* renamed from: com.google.v.a.m.au */
/* compiled from: PG */
final class C67848au {

    /* renamed from: a */
    private static final int[] f183959a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b */
    private static final int[] f183960b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c */
    private static final int[] f183961c = {67108863, 33554431};

    /* renamed from: d */
    private static final int[] f183962d = {26, 25};

    /* renamed from: a */
    static void m98028a(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        m98035h(jArr3, jArr2);
        m98035h(jArr12, jArr3);
        m98035h(jArr11, jArr12);
        m98029b(jArr4, jArr11, jArr2);
        m98029b(jArr5, jArr4, jArr3);
        m98035h(jArr11, jArr5);
        m98029b(jArr6, jArr11, jArr4);
        m98035h(jArr11, jArr6);
        m98035h(jArr12, jArr11);
        m98035h(jArr11, jArr12);
        m98035h(jArr12, jArr11);
        m98035h(jArr11, jArr12);
        m98029b(jArr7, jArr11, jArr6);
        m98035h(jArr11, jArr7);
        m98035h(jArr12, jArr11);
        for (int i = 2; i < 10; i += 2) {
            m98035h(jArr11, jArr12);
            m98035h(jArr12, jArr11);
        }
        m98029b(jArr8, jArr12, jArr7);
        m98035h(jArr11, jArr8);
        m98035h(jArr12, jArr11);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            m98035h(jArr11, jArr12);
            m98035h(jArr12, jArr11);
        }
        m98029b(jArr11, jArr12, jArr8);
        m98035h(jArr12, jArr11);
        m98035h(jArr11, jArr12);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            m98035h(jArr12, jArr11);
            m98035h(jArr11, jArr12);
        }
        m98029b(jArr9, jArr11, jArr7);
        m98035h(jArr11, jArr9);
        m98035h(jArr12, jArr11);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            m98035h(jArr11, jArr12);
            m98035h(jArr12, jArr11);
        }
        m98029b(jArr10, jArr12, jArr9);
        m98035h(jArr12, jArr10);
        m98035h(jArr11, jArr12);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            m98035h(jArr12, jArr11);
            m98035h(jArr11, jArr12);
        }
        m98029b(jArr12, jArr11, jArr10);
        m98035h(jArr11, jArr12);
        m98035h(jArr12, jArr11);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            m98035h(jArr11, jArr12);
            m98035h(jArr12, jArr11);
        }
        m98029b(jArr11, jArr12, jArr9);
        m98035h(jArr12, jArr11);
        m98035h(jArr11, jArr12);
        m98035h(jArr12, jArr11);
        m98035h(jArr11, jArr12);
        m98035h(jArr12, jArr11);
        m98029b(jArr, jArr12, jArr5);
    }

    /* renamed from: b */
    static void m98029b(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        m98030c(jArr4, jArr2, jArr3);
        m98031d(jArr4, jArr);
    }

    /* JADX WARNING: type inference failed for: r42v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m98030c(long[] r42, long[] r43, long[] r44) {
        /*
            r0 = 0
            r1 = r43[r0]
            r3 = r44[r0]
            long r1 = r1 * r3
            r42[r0] = r1
            r1 = r43[r0]
            r3 = 1
            r4 = r44[r3]
            long r4 = r4 * r1
            r6 = r43[r3]
            r8 = r44[r0]
            long r6 = r6 * r8
            long r4 = r4 + r6
            r42[r3] = r4
            r4 = r43[r3]
            long r6 = r4 + r4
            r10 = r44[r3]
            long r6 = r6 * r10
            r0 = 2
            r12 = r44[r0]
            long r12 = r12 * r1
            long r6 = r6 + r12
            r12 = r43[r0]
            long r12 = r12 * r8
            long r6 = r6 + r12
            r42[r0] = r6
            r6 = r44[r0]
            long r12 = r4 * r6
            r14 = r43[r0]
            long r16 = r14 * r10
            long r12 = r12 + r16
            r0 = 3
            r16 = r44[r0]
            long r16 = r16 * r1
            long r12 = r12 + r16
            r16 = r43[r0]
            long r16 = r16 * r8
            long r12 = r12 + r16
            r42[r0] = r12
            r12 = r44[r0]
            long r16 = r4 * r12
            r18 = r43[r0]
            long r20 = r18 * r10
            long r16 = r16 + r20
            long r20 = r14 * r6
            long r16 = r16 + r16
            long r20 = r20 + r16
            r0 = 4
            r16 = r44[r0]
            long r16 = r16 * r1
            long r20 = r20 + r16
            r16 = r43[r0]
            long r16 = r16 * r8
            long r20 = r20 + r16
            r42[r0] = r20
            long r16 = r14 * r12
            long r20 = r18 * r6
            long r16 = r16 + r20
            r20 = r44[r0]
            long r22 = r4 * r20
            long r16 = r16 + r22
            r22 = r43[r0]
            long r24 = r22 * r10
            long r16 = r16 + r24
            r0 = 5
            r24 = r44[r0]
            long r24 = r24 * r1
            long r16 = r16 + r24
            r24 = r43[r0]
            long r24 = r24 * r8
            long r16 = r16 + r24
            r42[r0] = r16
            long r16 = r18 * r12
            r24 = r44[r0]
            long r26 = r4 * r24
            long r16 = r16 + r26
            r26 = r43[r0]
            long r28 = r26 * r10
            long r16 = r16 + r28
            long r16 = r16 + r16
            long r28 = r14 * r20
            long r16 = r16 + r28
            long r28 = r22 * r6
            long r16 = r16 + r28
            r0 = 6
            r28 = r44[r0]
            long r28 = r28 * r1
            long r16 = r16 + r28
            r28 = r43[r0]
            long r28 = r28 * r8
            long r16 = r16 + r28
            r42[r0] = r16
            long r16 = r18 * r20
            long r28 = r22 * r12
            long r16 = r16 + r28
            long r28 = r14 * r24
            long r16 = r16 + r28
            long r28 = r26 * r6
            long r16 = r16 + r28
            r28 = r44[r0]
            long r30 = r4 * r28
            long r16 = r16 + r30
            r30 = r43[r0]
            long r32 = r30 * r10
            long r16 = r16 + r32
            r0 = 7
            r32 = r44[r0]
            long r32 = r32 * r1
            long r16 = r16 + r32
            r32 = r43[r0]
            long r32 = r32 * r8
            long r16 = r16 + r32
            r42[r0] = r16
            long r16 = r18 * r24
            long r32 = r26 * r12
            long r16 = r16 + r32
            r32 = r44[r0]
            long r34 = r4 * r32
            long r16 = r16 + r34
            r34 = r43[r0]
            long r36 = r34 * r10
            long r16 = r16 + r36
            long r36 = r22 * r20
            long r16 = r16 + r16
            long r36 = r36 + r16
            long r16 = r14 * r28
            long r36 = r36 + r16
            long r16 = r30 * r6
            long r36 = r36 + r16
            r0 = 8
            r16 = r44[r0]
            long r16 = r16 * r1
            long r36 = r36 + r16
            r16 = r43[r0]
            long r16 = r16 * r8
            long r36 = r36 + r16
            r42[r0] = r36
            long r16 = r22 * r24
            long r36 = r26 * r20
            long r16 = r16 + r36
            long r36 = r18 * r28
            long r16 = r16 + r36
            long r36 = r30 * r12
            long r16 = r16 + r36
            long r36 = r14 * r32
            long r16 = r16 + r36
            long r36 = r34 * r6
            long r16 = r16 + r36
            r36 = r44[r0]
            long r38 = r4 * r36
            long r16 = r16 + r38
            r38 = r43[r0]
            long r40 = r38 * r10
            long r16 = r16 + r40
            r0 = 9
            r40 = r44[r0]
            long r1 = r1 * r40
            long r16 = r16 + r1
            r1 = r43[r0]
            long r1 = r1 * r8
            long r16 = r16 + r1
            r42[r0] = r16
            long r1 = r26 * r24
            long r8 = r18 * r32
            long r1 = r1 + r8
            long r8 = r34 * r12
            long r1 = r1 + r8
            r8 = r44[r0]
            long r4 = r4 * r8
            long r1 = r1 + r4
            r3 = r43[r0]
            long r10 = r10 * r3
            long r1 = r1 + r10
            long r1 = r1 + r1
            long r10 = r22 * r28
            long r1 = r1 + r10
            long r10 = r30 * r20
            long r1 = r1 + r10
            long r10 = r14 * r36
            long r1 = r1 + r10
            long r10 = r38 * r6
            long r1 = r1 + r10
            r0 = 10
            r42[r0] = r1
            long r0 = r26 * r28
            long r10 = r30 * r24
            long r0 = r0 + r10
            long r10 = r22 * r32
            long r0 = r0 + r10
            long r10 = r34 * r20
            long r0 = r0 + r10
            long r10 = r18 * r36
            long r0 = r0 + r10
            long r10 = r38 * r12
            long r0 = r0 + r10
            long r14 = r14 * r8
            long r0 = r0 + r14
            long r6 = r6 * r3
            long r0 = r0 + r6
            r2 = 11
            r42[r2] = r0
            long r0 = r26 * r32
            long r5 = r34 * r24
            long r0 = r0 + r5
            long r18 = r18 * r8
            long r0 = r0 + r18
            long r12 = r12 * r3
            long r0 = r0 + r12
            long r5 = r30 * r28
            long r0 = r0 + r0
            long r5 = r5 + r0
            long r0 = r22 * r36
            long r5 = r5 + r0
            long r0 = r38 * r20
            long r5 = r5 + r0
            r0 = 12
            r42[r0] = r5
            long r0 = r30 * r32
            long r5 = r34 * r28
            long r0 = r0 + r5
            long r5 = r26 * r36
            long r0 = r0 + r5
            long r5 = r38 * r24
            long r0 = r0 + r5
            long r22 = r22 * r8
            long r0 = r0 + r22
            long r20 = r20 * r3
            long r0 = r0 + r20
            r2 = 13
            r42[r2] = r0
            long r0 = r34 * r32
            long r26 = r26 * r8
            long r0 = r0 + r26
            long r24 = r24 * r3
            long r0 = r0 + r24
            long r0 = r0 + r0
            long r5 = r30 * r36
            long r0 = r0 + r5
            long r5 = r38 * r28
            long r0 = r0 + r5
            r2 = 14
            r42[r2] = r0
            long r0 = r34 * r36
            long r5 = r38 * r32
            long r0 = r0 + r5
            long r30 = r30 * r8
            long r0 = r0 + r30
            long r28 = r28 * r3
            long r0 = r0 + r28
            r2 = 15
            r42[r2] = r0
            long r0 = r38 * r36
            long r34 = r34 * r8
            long r32 = r32 * r3
            long r34 = r34 + r32
            long r34 = r34 + r34
            long r0 = r0 + r34
            r2 = 16
            r42[r2] = r0
            long r38 = r38 * r8
            long r36 = r36 * r3
            long r38 = r38 + r36
            r0 = 17
            r42[r0] = r38
            long r3 = r3 + r3
            long r3 = r3 * r8
            r0 = 18
            r42[r0] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5259m.C67848au.m98030c(long[], long[], long[]):void");
    }

    /* renamed from: d */
    static void m98031d(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        m98033f(jArr);
        m98032e(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* renamed from: e */
    static void m98032e(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + j6 + j6;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    /* renamed from: f */
    static void m98033f(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + j2 + j2;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + j6 + j6;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + j10 + j10;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + j14 + j14;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + j18 + j18;
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + j22 + j22;
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + j26 + j26;
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + j30 + j30;
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + j34 + j34;
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    /* renamed from: g */
    static void m98034g(long[] jArr, long[] jArr2, long j) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j;
        }
    }

    /* renamed from: h */
    static void m98035h(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = (j3 * j3) + (jArr2[2] * j2);
        long j5 = jArr2[2];
        long j6 = (j3 * j5) + (jArr2[3] * j2);
        long j7 = jArr2[3];
        long j8 = jArr2[4];
        long j9 = (j5 * j7) + (j3 * j8) + (jArr2[5] * j2);
        long j10 = jArr2[5];
        long j11 = (j7 * j7) + (j5 * j8) + (jArr2[6] * j2) + ((j3 + j3) * j10);
        long j12 = jArr2[6];
        long j13 = (j7 * j8) + (j5 * j10) + (j3 * j12) + (jArr2[7] * j2);
        long j14 = jArr2[8];
        long j15 = jArr2[7];
        long j16 = (j3 * j15) + (j7 * j10);
        long j17 = (j5 * j12) + (j14 * j2) + j16 + j16;
        long j18 = jArr2[8];
        long j19 = (j8 * j10) + (j7 * j12) + (j5 * j15) + (j3 * j18) + (j2 * jArr2[9]);
        long j20 = jArr2[9];
        long j21 = (j7 * j15) + (j3 * j20);
        long j22 = (j10 * j10) + (j8 * j12) + (j5 * j18) + j21 + j21;
        long j23 = (j10 * j12) + (j8 * j15) + (j7 * j18) + (j5 * j20);
        long j24 = (j10 * j15) + (j7 * j20);
        long j25 = (j8 * j18) + j24 + j24;
        long j26 = (j12 * j15) + (j10 * j18) + (j8 * j20);
        long j27 = (j15 * j15) + (j12 * j18) + ((j10 + j10) * j20);
        long j28 = (j15 * j18) + (j12 * j20);
        m98031d(new long[]{j * j, (j2 + j2) * jArr2[1], j4 + j4, j6 + j6, (j5 * j5) + (j3 * 4 * j7) + ((j2 + j2) * jArr2[4]), j9 + j9, j11 + j11, j13 + j13, (j8 * j8) + j17 + j17, j19 + j19, j22 + j22, j23 + j23, (j12 * j12) + j25 + j25, j26 + j26, j27 + j27, j28 + j28, (j18 * j18) + (j15 * 4 * j20), (j18 + j18) * j20, (j20 + j20) * j20}, jArr);
    }

    /* renamed from: i */
    static void m98036i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    /* renamed from: j */
    static void m98037j(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    /* renamed from: k */
    static byte[] m98038k(long[] jArr) {
        int i;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            int i3 = 0;
            while (i3 < 9) {
                long j = copyOf[i3];
                int i4 = f183962d[i3 & 1];
                int i5 = -((int) (((j >> 31) & j) >> i4));
                copyOf[i3] = j + ((long) (i5 << i4));
                i3++;
                copyOf[i3] = copyOf[i3] - ((long) i5);
            }
            long j2 = copyOf[9];
            int i6 = -((int) (((j2 >> 31) & j2) >> 25));
            copyOf[9] = j2 + ((long) (i6 << 25));
            copyOf[0] = copyOf[0] - ((long) (i6 * 19));
            i2++;
        }
        long j3 = copyOf[0];
        int i7 = -((int) (((j3 >> 31) & j3) >> 26));
        copyOf[0] = j3 + ((long) (i7 << 26));
        copyOf[1] = copyOf[1] - ((long) i7);
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 9) {
                long j4 = copyOf[i9];
                int i10 = i9 & 1;
                int i11 = f183962d[i10];
                copyOf[i9] = ((long) f183961c[i10]) & j4;
                i9++;
                copyOf[i9] = copyOf[i9] + ((long) ((int) (j4 >> i11)));
            }
        }
        long j5 = copyOf[9];
        copyOf[9] = 33554431 & j5;
        long j6 = copyOf[0] + ((long) (((int) (j5 >> 25)) * 19));
        copyOf[0] = j6;
        int i12 = ((((int) j6) - 67108845) >> 31) ^ -1;
        for (int i13 = 1; i13 < 10; i13++) {
            int i14 = (((int) copyOf[i13]) ^ f183961c[i13 & 1]) ^ -1;
            int i15 = i14 & (i14 << 16);
            int i16 = i15 & (i15 << 8);
            int i17 = i16 & (i16 << 4);
            int i18 = i17 & (i17 << 2);
            i12 &= (i18 & (i18 + i18)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i12));
        long j7 = (long) (33554431 & i12);
        copyOf[1] = copyOf[1] - j7;
        for (i = 2; i < 10; i += 2) {
            copyOf[i] = copyOf[i] - ((long) (67108863 & i12));
            int i19 = i + 1;
            copyOf[i19] = copyOf[i19] - j7;
        }
        for (int i20 = 0; i20 < 10; i20++) {
            copyOf[i20] = copyOf[i20] << f183960b[i20];
        }
        byte[] bArr = new byte[32];
        for (int i21 = 0; i21 < 10; i21++) {
            int i22 = f183959a[i21];
            byte b = bArr[i22];
            long j8 = copyOf[i21];
            bArr[i22] = (byte) ((int) (((long) b) | (j8 & 255)));
            int i23 = i22 + 1;
            bArr[i23] = (byte) ((int) (((long) bArr[i23]) | ((j8 >> 8) & 255)));
            int i24 = i22 + 2;
            bArr[i24] = (byte) ((int) (((long) bArr[i24]) | ((j8 >> 16) & 255)));
            int i25 = i22 + 3;
            bArr[i25] = (byte) ((int) (((j8 >> 24) & 255) | ((long) bArr[i25])));
        }
        return bArr;
    }

    /* renamed from: l */
    static long[] m98039l(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = f183959a[i];
            jArr[i] = ((((((long) (bArr[i2] & 255)) | (((long) (bArr[i2 + 1] & 255)) << 8)) | (((long) (bArr[i2 + 2] & 255)) << 16)) | (((long) (bArr[i2 + 3] & 255)) << 24)) >> f183960b[i]) & ((long) f183961c[i & 1]);
        }
        return jArr;
    }
}
