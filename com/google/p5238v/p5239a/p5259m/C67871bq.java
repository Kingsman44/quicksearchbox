package com.google.p5238v.p5239a.p5259m;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* renamed from: com.google.v.a.m.bq */
/* compiled from: PG */
public final class C67871bq {
    /* renamed from: a */
    public static byte[] m98088a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            int i = C67888r.f184056b;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    if (!C67886p.m98134b(C67888r.f184055a[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(C67849av.m98040a(C67888r.f184055a[i2])));
                    }
                }
                long[] l = C67848au.m98039l(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(l, 0, jArr2, 0, 10);
                int i3 = 0;
                for (int i4 = 32; i3 < i4; i4 = 32) {
                    byte b2 = copyOf[(32 - i3) - 1] & 255;
                    int i5 = 0;
                    while (i5 < 8) {
                        int i6 = (b2 >> (7 - i5)) & 1;
                        C67888r.m98141b(jArr4, jArr2, i6);
                        C67888r.m98141b(jArr5, jArr3, i6);
                        byte[] bArr5 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i7 = i3;
                        long[] jArr12 = new long[19];
                        int i8 = i5;
                        long[] jArr13 = new long[19];
                        int i9 = i6;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        C67848au.m98037j(jArr4, jArr4, jArr5);
                        C67848au.m98036i(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        C67848au.m98037j(jArr2, jArr2, jArr3);
                        C67848au.m98036i(jArr3, copyOf4, jArr3);
                        C67848au.m98030c(jArr13, jArr2, jArr5);
                        C67848au.m98030c(jArr14, jArr4, jArr3);
                        C67848au.m98033f(jArr13);
                        C67848au.m98032e(jArr13);
                        C67848au.m98033f(jArr14);
                        C67848au.m98032e(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        C67848au.m98037j(jArr13, jArr13, jArr14);
                        C67848au.m98036i(jArr14, copyOf4, jArr14);
                        C67848au.m98035h(jArr17, jArr13);
                        C67848au.m98035h(jArr16, jArr14);
                        C67848au.m98030c(jArr14, jArr16, l);
                        C67848au.m98033f(jArr14);
                        C67848au.m98032e(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        C67848au.m98035h(jArr11, jArr4);
                        C67848au.m98035h(jArr12, jArr5);
                        C67848au.m98030c(jArr8, jArr11, jArr12);
                        C67848au.m98033f(jArr8);
                        C67848au.m98032e(jArr8);
                        C67848au.m98036i(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        C67848au.m98034g(jArr19, jArr12, 121665);
                        C67848au.m98032e(jArr19);
                        C67848au.m98037j(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        C67848au.m98030c(jArr20, jArr12, jArr19);
                        C67848au.m98033f(jArr20);
                        C67848au.m98032e(jArr20);
                        int i10 = i9;
                        C67888r.m98141b(jArr8, jArr6, i10);
                        C67888r.m98141b(jArr20, jArr7, i10);
                        i5 = i8 + 1;
                        byte[] bArr6 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i3 = i7;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr5;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr7 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i3++;
                    byte[] bArr8 = bArr2;
                    copyOf = bArr7;
                }
                long[] jArr26 = new long[10];
                C67848au.m98028a(jArr26, jArr5);
                long[] jArr27 = jArr;
                C67848au.m98029b(jArr27, jArr4, jArr26);
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[11];
                long[] jArr31 = new long[11];
                long[] jArr32 = new long[11];
                C67848au.m98029b(jArr28, l, jArr27);
                C67848au.m98037j(jArr29, l, jArr27);
                long[] jArr33 = new long[10];
                jArr33[0] = 486662;
                C67848au.m98037j(jArr31, jArr29, jArr33);
                C67848au.m98029b(jArr31, jArr31, jArr3);
                C67848au.m98037j(jArr31, jArr31, jArr2);
                C67848au.m98029b(jArr31, jArr31, jArr28);
                C67848au.m98029b(jArr31, jArr31, jArr2);
                C67848au.m98034g(jArr30, jArr31, 4);
                C67848au.m98032e(jArr30);
                C67848au.m98029b(jArr31, jArr28, jArr3);
                C67848au.m98036i(jArr31, jArr31, jArr3);
                C67848au.m98029b(jArr32, jArr29, jArr2);
                C67848au.m98037j(jArr31, jArr31, jArr32);
                C67848au.m98035h(jArr31, jArr31);
                if (C67886p.m98134b(C67848au.m98038k(jArr30), C67848au.m98038k(jArr31))) {
                    return C67848au.m98038k(jArr27);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(C67849av.m98040a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    /* renamed from: b */
    public static byte[] m98089b() {
        byte[] a = C67859be.m98062a(32);
        a[0] = (byte) (a[0] | 7);
        byte b = a[31] & 63;
        a[31] = (byte) b;
        a[31] = (byte) (b | 128);
        return a;
    }

    /* renamed from: c */
    public static byte[] m98090c(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m98088a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
