package com.google.p5238v.p5239a.p5259m;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: com.google.v.a.m.bo */
/* compiled from: PG */
public final class C67869bo {
    /* renamed from: a */
    public static BigInteger m98076a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* renamed from: c */
    public static boolean m98078c() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    /* renamed from: d */
    public static byte[] m98079d(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new GeneralSecurityException("integer too large");
        } else if (length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - length, length);
            return bArr;
        } else if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        } else {
            throw new GeneralSecurityException("integer too large");
        }
    }

    /* renamed from: e */
    public static String m98080e(int i) {
        int i2 = i - 1;
        return i2 != 2 ? i2 != 3 ? "SHA-512" : "SHA-384" : "SHA-256";
    }

    /* renamed from: f */
    public static String m98081f(int i) {
        int i2 = C67870bp.f184014a;
        return C67847at.m98027a(i).concat("withECDSA");
    }

    /* renamed from: g */
    public static byte[] m98082g(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = (MessageDigest) C67838ak.f183951d.mo59993a(m98080e(i2));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 <= (i - 1) / digestLength; i4++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(m98079d(BigInteger.valueOf((long) i4), 4));
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            System.arraycopy(digest, 0, bArr2, i3, Math.min(length, i - i3));
            i3 += length;
        }
        return bArr2;
    }

    /* renamed from: b */
    public static void m98077b(ByteBuffer byteBuffer, long j) {
        if (j < 0 || j >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j);
    }
}
