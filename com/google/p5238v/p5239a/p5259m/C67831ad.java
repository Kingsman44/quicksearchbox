package com.google.p5238v.p5239a.p5259m;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.v.a.m.ad */
/* compiled from: PG */
public final class C67831ad {

    /* renamed from: a */
    static final byte[] f183929a = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* renamed from: b */
    private static final C67895y f183930b = new C67895y(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: c */
    private static final C67828aa f183931c = new C67828aa(new C67829ab(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: a */
    public static int m97982a(long[] jArr) {
        return C67848au.m98038k(jArr)[0] & 1;
    }

    /* renamed from: b */
    public static C67829ab m97983b(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        byte b = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + b);
            bArr2[i4] = b2;
            int i5 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i5 << 4));
            i4++;
            b = i5;
        }
        bArr2[63] = (byte) (bArr2[63] + b);
        C67828aa aaVar = new C67828aa(f183931c);
        C67830ac acVar = new C67830ac();
        for (i = 1; i < 64; i += 2) {
            C67895y yVar = new C67895y(f183930b);
            m97993l(yVar, i / 2, bArr2[i]);
            C67830ac.m97981a(acVar, aaVar);
            m97991j(aaVar, acVar, yVar);
        }
        C67829ab abVar = new C67829ab();
        C67829ab.m97979b(abVar, aaVar);
        m97992k(aaVar, abVar);
        C67829ab.m97979b(abVar, aaVar);
        m97992k(aaVar, abVar);
        C67829ab.m97979b(abVar, aaVar);
        m97992k(aaVar, abVar);
        C67829ab.m97979b(abVar, aaVar);
        m97992k(aaVar, abVar);
        for (int i6 = 0; i6 < 64; i6 += 2) {
            C67895y yVar2 = new C67895y(f183930b);
            m97993l(yVar2, i6 / 2, bArr2[i6]);
            C67830ac.m97981a(acVar, aaVar);
            m97991j(aaVar, acVar, yVar2);
        }
        C67829ab abVar2 = new C67829ab(aaVar);
        long[] jArr = new long[10];
        C67848au.m98035h(jArr, abVar2.f183924a);
        long[] jArr2 = new long[10];
        C67848au.m98035h(jArr2, abVar2.f183925b);
        long[] jArr3 = new long[10];
        C67848au.m98035h(jArr3, abVar2.f183926c);
        long[] jArr4 = new long[10];
        C67848au.m98035h(jArr4, jArr3);
        long[] jArr5 = new long[10];
        C67848au.m98036i(jArr5, jArr2, jArr);
        C67848au.m98029b(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        C67848au.m98029b(jArr6, jArr, jArr2);
        C67848au.m98029b(jArr6, jArr6, C67833af.f183934a);
        C67848au.m98037j(jArr6, jArr6, jArr4);
        C67848au.m98031d(jArr6, jArr6);
        if (C67886p.m98134b(C67848au.m98038k(jArr5), C67848au.m98038k(jArr6))) {
            return abVar2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* renamed from: c */
    public static void m97984c(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    /* renamed from: d */
    public static boolean m97985d(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        C67848au.m98032e(jArr2);
        byte[] k = C67848au.m98038k(jArr2);
        for (int i = 0; i < 32; i++) {
            if (k[i] != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    static boolean m97986e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte b;
        byte b2;
        char c;
        byte b3;
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        int i = 0;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i2 = 31;
        int i3 = 31;
        while (i3 >= 0) {
            byte b4 = copyOfRange[i3] & 255;
            byte b5 = f183929a[i3] & 255;
            if (b4 == b5) {
                byte[] bArr6 = bArr;
                i3--;
                bArr4 = bArr2;
                copyOfRange = copyOfRange;
                i2 = 31;
                i = 0;
            } else if (b4 >= b5) {
                return false;
            } else {
                MessageDigest messageDigest = (MessageDigest) C67838ak.f183951d.mo59993a("SHA-512");
                messageDigest.update(bArr4, i, 32);
                messageDigest.update(bArr5);
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                long h = m97989h(digest, 39);
                long h2 = m97989h(digest, 42);
                long i4 = m97990i(digest, 44);
                long h3 = (m97989h(digest, 47) >> 2) & 2097151;
                long i5 = (m97990i(digest, 49) >> 7) & 2097151;
                long i6 = (m97990i(digest, 52) >> 4) & 2097151;
                long h4 = (m97989h(digest, 55) >> 1) & 2097151;
                long i7 = (m97990i(digest, 57) >> 6) & 2097151;
                long i8 = m97990i(digest, 60) >> 3;
                long j = (h2 & 2097151) - (i8 * 683901);
                long i9 = ((((m97990i(digest, 36) >> 6) & 2097151) - (i8 * 997805)) + (i7 * 136657)) - (h4 * 683901);
                long i10 = ((((((m97990i(digest, i2) >> 4) & 2097151) + (i8 * 470296)) + (i7 * 654183)) - (h4 * 997805)) + (i6 * 136657)) - (i5 * 683901);
                long i11 = ((m97990i(digest, 15) >> 6) & 2097151) + (h3 * 666643);
                long h5 = (m97989h(digest, 21) & 2097151) + (i6 * 666643) + (i5 * 470296) + (h3 * 654183);
                long h6 = ((((((m97989h(digest, 26) >> 2) & 2097151) + (i7 * 666643)) + (h4 * 470296)) + (i6 * 654183)) - (i5 * 997805)) + (h3 * 136657);
                long j2 = (i11 + 1048576) >> 21;
                long h7 = (m97989h(digest, 18) >> 3) + (i5 * 666643) + (h3 * 470296) + j2;
                long j3 = (h5 + 1048576) >> 21;
                long i12 = ((((((m97990i(digest, 23) >> 5) & 2097151) + (h4 * 666643)) + (i6 * 470296)) + (i5 * 654183)) - (h3 * 997805)) + j3;
                long j4 = (h6 + 1048576) >> 21;
                long i13 = ((((((((m97990i(digest, 28) >> 7) & 2097151) + (i8 * 666643)) + (i7 * 470296)) + (h4 * 654183)) - (i6 * 997805)) + (i5 * 136657)) - (h3 * 683901)) + j4;
                long j5 = (i10 + 1048576) >> 21;
                long h8 = ((((((m97989h(digest, 34) >> 1) & 2097151) + (i8 * 654183)) - (i7 * 997805)) + (h4 * 136657)) - (i6 * 683901)) + j5;
                long j6 = (i9 + 1048576) >> 21;
                long j7 = (((h >> 3) + (i8 * 136657)) - (i7 * 683901)) + j6;
                long j8 = (j + 1048576) >> 21;
                long j9 = ((i4 >> 5) & 2097151) + j8;
                long j10 = (h7 + 1048576) >> 21;
                long j11 = (i12 + 1048576) >> 21;
                long j12 = (i13 + 1048576) >> 21;
                long j13 = (i10 - (j5 << 21)) + j12;
                long j14 = (h8 + 1048576) >> 21;
                long j15 = (i9 - (j6 << 21)) + j14;
                long j16 = h8 - (j14 << 21);
                long j17 = (j7 + 1048576) >> 21;
                long j18 = (j - (j8 << 21)) + j17;
                long j19 = j7 - (j17 << 21);
                long j20 = ((h6 - (j4 << 21)) + j11) - (j9 * 683901);
                long j21 = ((((h5 - (j3 << 21)) + j10) - (j9 * 997805)) + (j18 * 136657)) - (j19 * 683901);
                long j22 = (((((i11 - (j2 << 21)) + (j9 * 470296)) + (j18 * 654183)) - (j19 * 997805)) + (j15 * 136657)) - (j16 * 683901);
                long h9 = (m97989h(digest, i) & 2097151) + (j13 * 666643);
                long h10 = ((m97989h(digest, 5) >> 2) & 2097151) + (j15 * 666643) + (j16 * 470296) + (j13 * 654183);
                long i14 = ((((((m97990i(digest, 10) >> 4) & 2097151) + (j18 * 666643)) + (j19 * 470296)) + (j15 * 654183)) - (j16 * 997805)) + (j13 * 136657);
                long j23 = (h9 + 1048576) >> 21;
                long i15 = ((m97990i(digest, 2) >> 5) & 2097151) + (j16 * 666643) + (j13 * 470296) + j23;
                long j24 = (h10 + 1048576) >> 21;
                long i16 = ((((((m97990i(digest, 7) >> 7) & 2097151) + (j19 * 666643)) + (j15 * 470296)) + (j16 * 654183)) - (j13 * 997805)) + j24;
                long j25 = (i14 + 1048576) >> 21;
                long h11 = ((((((((m97989h(digest, 13) >> 1) & 2097151) + (j9 * 666643)) + (j18 * 470296)) + (j19 * 654183)) - (j15 * 997805)) + (j16 * 136657)) - (j13 * 683901)) + j25;
                long j26 = (j22 + 1048576) >> 21;
                long j27 = (((((h7 - (j10 << 21)) + (j9 * 654183)) - (j18 * 997805)) + (j19 * 136657)) - (j15 * 683901)) + j26;
                long j28 = (j21 + 1048576) >> 21;
                long j29 = (((i12 - (j11 << 21)) + (j9 * 136657)) - (j18 * 683901)) + j28;
                long j30 = (j20 + 1048576) >> 21;
                long j31 = (i13 - (j12 << 21)) + j30;
                long j32 = (i15 + 1048576) >> 21;
                long j33 = (i16 + 1048576) >> 21;
                long j34 = (h11 + 1048576) >> 21;
                long j35 = (j27 + 1048576) >> 21;
                long j36 = (j29 + 1048576) >> 21;
                long j37 = (j31 + 1048576) >> 21;
                long j38 = (h9 - (j23 << 21)) + (j37 * 666643);
                long j39 = j38 >> 21;
                long j40 = (i15 - (j32 << 21)) + (j37 * 470296) + j39;
                long j41 = j40 >> 21;
                long j42 = (h10 - (j24 << 21)) + j32 + (j37 * 654183) + j41;
                long j43 = j42 >> 21;
                long j44 = ((i16 - (j33 << 21)) - (j37 * 997805)) + j43;
                long j45 = j44 >> 21;
                long j46 = (i14 - (j25 << 21)) + j33 + (j37 * 136657) + j45;
                long j47 = j46 >> 21;
                long j48 = ((h11 - (j34 << 21)) - (j37 * 683901)) + j47;
                long j49 = j48 >> 21;
                long j50 = (j22 - (j26 << 21)) + j34 + j49;
                long j51 = j50 >> 21;
                long j52 = (j27 - (j35 << 21)) + j51;
                long j53 = j52 >> 21;
                long j54 = (j21 - (j28 << 21)) + j35 + j53;
                long j55 = j54 >> 21;
                long j56 = (j29 - (j36 << 21)) + j55;
                long j57 = j56 >> 21;
                long j58 = (j20 - (j30 << 21)) + j36 + j57;
                long j59 = j58 >> 21;
                long j60 = (j31 - (j37 << 21)) + j59;
                long j61 = j60 >> 21;
                long j62 = (j38 - (j39 << 21)) + (666643 * j61);
                long j63 = j62 >> 21;
                long j64 = (j40 - (j41 << 21)) + (470296 * j61) + j63;
                long j65 = j62 - (j63 << 21);
                long j66 = j64 >> 21;
                long j67 = (j42 - (j43 << 21)) + (654183 * j61) + j66;
                long j68 = j64 - (j66 << 21);
                long j69 = j67 >> 21;
                long j70 = ((j44 - (j45 << 21)) - (997805 * j61)) + j69;
                long j71 = j67 - (j69 << 21);
                long j72 = j70 >> 21;
                long j73 = (j46 - (j47 << 21)) + (136657 * j61) + j72;
                long j74 = j70 - (j72 << 21);
                long j75 = j73 >> 21;
                long j76 = ((j48 - (j49 << 21)) - (683901 * j61)) + j75;
                long j77 = j73 - (j75 << 21);
                long j78 = j76 >> 21;
                long j79 = (j50 - (j51 << 21)) + j78;
                long j80 = j76 - (j78 << 21);
                long j81 = j79 >> 21;
                long j82 = (j52 - (j53 << 21)) + j81;
                long j83 = j79 - (j81 << 21);
                long j84 = j82 >> 21;
                long j85 = (j54 - (j55 << 21)) + j84;
                long j86 = j82 - (j84 << 21);
                long j87 = j85 >> 21;
                long j88 = (j56 - (j57 << 21)) + j87;
                long j89 = j85 - (j87 << 21);
                long j90 = j88 >> 21;
                long j91 = (j58 - (j59 << 21)) + j90;
                long j92 = j88 - (j90 << 21);
                long j93 = j91 >> 21;
                long j94 = (j60 - (j61 << 21)) + j93;
                long j95 = j91 - (j93 << 21);
                digest[0] = (byte) ((int) j65);
                digest[1] = (byte) ((int) (j65 >> 8));
                digest[2] = (byte) ((int) ((j65 >> 16) | (j68 << 5)));
                digest[3] = (byte) ((int) (j68 >> 3));
                digest[4] = (byte) ((int) (j68 >> 11));
                digest[5] = (byte) ((int) ((j68 >> 19) | (j71 << 2)));
                digest[6] = (byte) ((int) (j71 >> 6));
                digest[7] = (byte) ((int) ((j71 >> 14) | (j74 << 7)));
                digest[8] = (byte) ((int) (j74 >> 1));
                digest[9] = (byte) ((int) (j74 >> 9));
                digest[10] = (byte) ((int) ((j74 >> 17) | (j77 << 4)));
                digest[11] = (byte) ((int) (j77 >> 4));
                digest[12] = (byte) ((int) (j77 >> 12));
                digest[13] = (byte) ((int) ((j77 >> 20) | (j80 + j80)));
                digest[14] = (byte) ((int) (j80 >> 7));
                digest[15] = (byte) ((int) ((j80 >> 15) | (j83 << 6)));
                digest[16] = (byte) ((int) (j83 >> 2));
                digest[17] = (byte) ((int) (j83 >> 10));
                digest[18] = (byte) ((int) ((j83 >> 18) | (j86 << 3)));
                digest[19] = (byte) ((int) (j86 >> 5));
                digest[20] = (byte) ((int) (j86 >> 13));
                digest[21] = (byte) ((int) j89);
                digest[22] = (byte) ((int) (j89 >> 8));
                digest[23] = (byte) ((int) ((j89 >> 16) | (j92 << 5)));
                digest[24] = (byte) ((int) (j92 >> 3));
                digest[25] = (byte) ((int) (j92 >> 11));
                digest[26] = (byte) ((int) ((j92 >> 19) | (j95 << 2)));
                digest[27] = (byte) ((int) (j95 >> 6));
                digest[28] = (byte) ((int) ((j95 >> 14) | (j94 << 7)));
                digest[29] = (byte) ((int) (j94 >> 1));
                digest[30] = (byte) ((int) (j94 >> 9));
                digest[i2] = (byte) ((int) (j94 >> 17));
                long[] jArr = new long[10];
                long[] l = C67848au.m98039l(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                C67848au.m98035h(jArr4, l);
                C67848au.m98029b(jArr5, jArr4, C67833af.f183934a);
                C67848au.m98036i(jArr4, jArr4, jArr2);
                C67848au.m98037j(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                C67848au.m98035h(jArr8, jArr5);
                C67848au.m98029b(jArr8, jArr8, jArr5);
                C67848au.m98035h(jArr, jArr8);
                C67848au.m98029b(jArr, jArr, jArr5);
                C67848au.m98029b(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                C67848au.m98035h(jArr9, jArr);
                C67848au.m98035h(jArr10, jArr9);
                C67848au.m98035h(jArr10, jArr10);
                C67848au.m98029b(jArr10, jArr, jArr10);
                C67848au.m98029b(jArr9, jArr9, jArr10);
                C67848au.m98035h(jArr9, jArr9);
                C67848au.m98029b(jArr9, jArr10, jArr9);
                C67848au.m98035h(jArr10, jArr9);
                byte[] bArr7 = copyOfRange;
                for (int i17 = 1; i17 < 5; i17++) {
                    C67848au.m98035h(jArr10, jArr10);
                }
                C67848au.m98029b(jArr9, jArr10, jArr9);
                C67848au.m98035h(jArr10, jArr9);
                for (int i18 = 1; i18 < 10; i18++) {
                    C67848au.m98035h(jArr10, jArr10);
                }
                C67848au.m98029b(jArr10, jArr10, jArr9);
                C67848au.m98035h(jArr11, jArr10);
                for (int i19 = 1; i19 < 20; i19++) {
                    C67848au.m98035h(jArr11, jArr11);
                }
                C67848au.m98029b(jArr10, jArr11, jArr10);
                C67848au.m98035h(jArr10, jArr10);
                for (int i20 = 1; i20 < 10; i20++) {
                    C67848au.m98035h(jArr10, jArr10);
                }
                C67848au.m98029b(jArr9, jArr10, jArr9);
                C67848au.m98035h(jArr10, jArr9);
                for (int i21 = 1; i21 < 50; i21++) {
                    C67848au.m98035h(jArr10, jArr10);
                }
                C67848au.m98029b(jArr10, jArr10, jArr9);
                C67848au.m98035h(jArr11, jArr10);
                for (int i22 = 1; i22 < 100; i22++) {
                    C67848au.m98035h(jArr11, jArr11);
                }
                C67848au.m98029b(jArr10, jArr11, jArr10);
                C67848au.m98035h(jArr10, jArr10);
                for (int i23 = 1; i23 < 50; i23++) {
                    C67848au.m98035h(jArr10, jArr10);
                }
                C67848au.m98029b(jArr9, jArr10, jArr9);
                C67848au.m98035h(jArr9, jArr9);
                C67848au.m98035h(jArr9, jArr9);
                C67848au.m98029b(jArr, jArr9, jArr);
                C67848au.m98029b(jArr, jArr, jArr8);
                C67848au.m98029b(jArr, jArr, jArr4);
                C67848au.m98035h(jArr6, jArr);
                C67848au.m98029b(jArr6, jArr6, jArr5);
                C67848au.m98036i(jArr7, jArr6, jArr4);
                if (m97985d(jArr7)) {
                    C67848au.m98037j(jArr7, jArr6, jArr4);
                    if (!m97985d(jArr7)) {
                        C67848au.m98029b(jArr, jArr, C67833af.f183936c);
                    } else {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                }
                if (!m97985d(jArr)) {
                    c = 31;
                    b2 = 255;
                    b = 7;
                    if (((bArr5[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                } else {
                    c = 31;
                    b2 = 255;
                    b = 7;
                }
                if (m97982a(jArr) == ((bArr5[c] & b2) >> b)) {
                    m97984c(jArr, jArr);
                }
                C67848au.m98029b(jArr3, jArr, l);
                C67830ac acVar = new C67830ac(new C67829ab(jArr, l, jArr2), jArr3);
                C67896z[] zVarArr = new C67896z[8];
                zVarArr[0] = new C67896z(acVar);
                C67828aa aaVar = new C67828aa(new C67829ab(), new long[10]);
                m97992k(aaVar, acVar.f183927a);
                C67830ac acVar2 = new C67830ac(aaVar);
                for (int i24 = 1; i24 < 8; i24++) {
                    m97991j(aaVar, acVar2, zVarArr[i24 - 1]);
                    zVarArr[i24] = new C67896z(new C67830ac(aaVar));
                }
                byte[] n = m97995n(digest);
                byte[] n2 = m97995n(bArr7);
                C67828aa aaVar2 = new C67828aa(f183931c);
                C67830ac acVar3 = new C67830ac();
                int i25 = PrivateKeyType.INVALID;
                while (i25 >= 0 && n[i25] == 0 && n2[i25] == 0) {
                    i25--;
                }
                while (i25 >= 0) {
                    m97992k(aaVar2, new C67829ab(aaVar2));
                    byte b6 = n[i25];
                    if (b6 > 0) {
                        C67830ac.m97981a(acVar3, aaVar2);
                        b3 = 2;
                        m97991j(aaVar2, acVar3, zVarArr[n[i25] / 2]);
                    } else {
                        b3 = 2;
                        if (b6 < 0) {
                            C67830ac.m97981a(acVar3, aaVar2);
                            m97994m(aaVar2, acVar3, zVarArr[(-n[i25]) / 2]);
                        }
                    }
                    byte b7 = n2[i25];
                    if (b7 > 0) {
                        C67830ac.m97981a(acVar3, aaVar2);
                        m97991j(aaVar2, acVar3, C67833af.f183938e[n2[i25] / b3]);
                    } else if (b7 < 0) {
                        C67830ac.m97981a(acVar3, aaVar2);
                        m97994m(aaVar2, acVar3, C67833af.f183938e[(-n2[i25]) / b3]);
                    }
                    i25--;
                }
                byte[] a = new C67829ab(aaVar2).mo59992a();
                for (int i26 = 0; i26 < 32; i26++) {
                    if (a[i26] != bArr2[i26]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static byte[] m97987f(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) C67838ak.f183951d.mo59993a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        byte b = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) b;
        digest[31] = (byte) (b | 64);
        return digest;
    }

    /* renamed from: g */
    private static int m97988g(int i, int i2) {
        int i3 = ((i ^ i2) ^ -1) & PrivateKeyType.INVALID;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    /* renamed from: h */
    private static long m97989h(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    /* renamed from: i */
    private static long m97990i(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | m97989h(bArr, i);
    }

    /* renamed from: j */
    private static void m97991j(C67828aa aaVar, C67830ac acVar, C67895y yVar) {
        long[] jArr = new long[10];
        long[] jArr2 = aaVar.f183922a.f183924a;
        C67829ab abVar = acVar.f183927a;
        C67848au.m98037j(jArr2, abVar.f183925b, abVar.f183924a);
        long[] jArr3 = aaVar.f183922a.f183925b;
        C67829ab abVar2 = acVar.f183927a;
        C67848au.m98036i(jArr3, abVar2.f183925b, abVar2.f183924a);
        long[] jArr4 = aaVar.f183922a.f183925b;
        C67848au.m98029b(jArr4, jArr4, yVar.f184071b);
        C67829ab abVar3 = aaVar.f183922a;
        C67848au.m98029b(abVar3.f183926c, abVar3.f183924a, yVar.f184070a);
        C67848au.m98029b(aaVar.f183923b, acVar.f183928b, yVar.f184072c);
        yVar.mo60030b(aaVar.f183922a.f183924a, acVar.f183927a.f183926c);
        long[] jArr5 = aaVar.f183922a.f183924a;
        C67848au.m98037j(jArr, jArr5, jArr5);
        C67829ab abVar4 = aaVar.f183922a;
        C67848au.m98036i(abVar4.f183924a, abVar4.f183926c, abVar4.f183925b);
        C67829ab abVar5 = aaVar.f183922a;
        long[] jArr6 = abVar5.f183925b;
        C67848au.m98037j(jArr6, abVar5.f183926c, jArr6);
        C67848au.m98037j(aaVar.f183922a.f183926c, jArr, aaVar.f183923b);
        long[] jArr7 = aaVar.f183923b;
        C67848au.m98036i(jArr7, jArr, jArr7);
    }

    /* renamed from: k */
    private static void m97992k(C67828aa aaVar, C67829ab abVar) {
        long[] jArr = new long[10];
        C67848au.m98035h(aaVar.f183922a.f183924a, abVar.f183924a);
        C67848au.m98035h(aaVar.f183922a.f183926c, abVar.f183925b);
        C67848au.m98035h(aaVar.f183923b, abVar.f183926c);
        long[] jArr2 = aaVar.f183923b;
        C67848au.m98037j(jArr2, jArr2, jArr2);
        C67848au.m98037j(aaVar.f183922a.f183925b, abVar.f183924a, abVar.f183925b);
        C67848au.m98035h(jArr, aaVar.f183922a.f183925b);
        C67829ab abVar2 = aaVar.f183922a;
        C67848au.m98037j(abVar2.f183925b, abVar2.f183926c, abVar2.f183924a);
        C67829ab abVar3 = aaVar.f183922a;
        long[] jArr3 = abVar3.f183926c;
        C67848au.m98036i(jArr3, jArr3, abVar3.f183924a);
        C67829ab abVar4 = aaVar.f183922a;
        C67848au.m98036i(abVar4.f183924a, jArr, abVar4.f183925b);
        long[] jArr4 = aaVar.f183923b;
        C67848au.m98036i(jArr4, jArr4, aaVar.f183922a.f183926c);
    }

    /* renamed from: l */
    private static void m97993l(C67895y yVar, int i, byte b) {
        int i2 = (b & 255) >> 7;
        byte b2 = (-i2) & b;
        int i3 = b - (b2 + b2);
        yVar.mo60029a(C67833af.f183937d[i][0], m97988g(i3, 1));
        yVar.mo60029a(C67833af.f183937d[i][1], m97988g(i3, 2));
        yVar.mo60029a(C67833af.f183937d[i][2], m97988g(i3, 3));
        yVar.mo60029a(C67833af.f183937d[i][3], m97988g(i3, 4));
        yVar.mo60029a(C67833af.f183937d[i][4], m97988g(i3, 5));
        yVar.mo60029a(C67833af.f183937d[i][5], m97988g(i3, 6));
        yVar.mo60029a(C67833af.f183937d[i][6], m97988g(i3, 7));
        yVar.mo60029a(C67833af.f183937d[i][7], m97988g(i3, 8));
        long[] copyOf = Arrays.copyOf(yVar.f184071b, 10);
        long[] copyOf2 = Arrays.copyOf(yVar.f184070a, 10);
        long[] copyOf3 = Arrays.copyOf(yVar.f184072c, 10);
        m97984c(copyOf3, copyOf3);
        yVar.mo60029a(new C67895y(copyOf, copyOf2, copyOf3), i2);
    }

    /* renamed from: m */
    private static void m97994m(C67828aa aaVar, C67830ac acVar, C67895y yVar) {
        long[] jArr = new long[10];
        long[] jArr2 = aaVar.f183922a.f183924a;
        C67829ab abVar = acVar.f183927a;
        C67848au.m98037j(jArr2, abVar.f183925b, abVar.f183924a);
        long[] jArr3 = aaVar.f183922a.f183925b;
        C67829ab abVar2 = acVar.f183927a;
        C67848au.m98036i(jArr3, abVar2.f183925b, abVar2.f183924a);
        long[] jArr4 = aaVar.f183922a.f183925b;
        C67848au.m98029b(jArr4, jArr4, yVar.f184070a);
        C67829ab abVar3 = aaVar.f183922a;
        C67848au.m98029b(abVar3.f183926c, abVar3.f183924a, yVar.f184071b);
        C67848au.m98029b(aaVar.f183923b, acVar.f183928b, yVar.f184072c);
        yVar.mo60030b(aaVar.f183922a.f183924a, acVar.f183927a.f183926c);
        long[] jArr5 = aaVar.f183922a.f183924a;
        C67848au.m98037j(jArr, jArr5, jArr5);
        C67829ab abVar4 = aaVar.f183922a;
        C67848au.m98036i(abVar4.f183924a, abVar4.f183926c, abVar4.f183925b);
        C67829ab abVar5 = aaVar.f183922a;
        long[] jArr6 = abVar5.f183925b;
        C67848au.m98037j(jArr6, abVar5.f183926c, jArr6);
        C67848au.m98036i(aaVar.f183922a.f183926c, jArr, aaVar.f183923b);
        long[] jArr7 = aaVar.f183923b;
        C67848au.m98037j(jArr7, jArr, jArr7);
    }

    /* renamed from: n */
    private static byte[] m97995n(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        int i3 = 0;
        while (i3 < 256) {
            if (bArr2[i3] != 0) {
                int i4 = 1;
                while (i4 <= 6 && (i = i3 + i4) < 256) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        int i5 = b << i4;
                        int i6 = b2 + i5;
                        if (i6 > 15) {
                            int i7 = b2 - i5;
                            if (i7 < -15) {
                                break;
                            }
                            bArr2[i3] = (byte) i7;
                            while (true) {
                                if (i >= 256) {
                                    break;
                                } else if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                } else {
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        } else {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        }
                    }
                    i4++;
                }
            }
            i3++;
        }
        return bArr2;
    }
}
