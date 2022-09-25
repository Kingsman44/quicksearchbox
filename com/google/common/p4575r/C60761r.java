package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.r.r */
/* compiled from: PG */
public final class C60761r {
    /* renamed from: a */
    public static int m92755a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j <= j2 ? 0 : 1;
    }

    /* renamed from: b */
    public static int m92756b(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public static long m92757c(byte[] bArr) {
        int length = bArr.length;
        C58838bb.m90875j(length >= 8, "array too small: %s < %s", length, 8);
        return m92758d(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    /* renamed from: d */
    public static long m92758d(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* renamed from: e */
    public static List m92759e(long... jArr) {
        int length = jArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new C60760q(jArr, 0, length);
    }

    /* renamed from: f */
    public static byte[] m92760f(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
        }
        return bArr;
    }

    /* renamed from: g */
    public static long[] m92761g(Collection collection) {
        if (collection instanceof C60760q) {
            C60760q qVar = (C60760q) collection;
            return Arrays.copyOfRange(qVar.f164803a, qVar.f164804b, qVar.f164805c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }

    /* renamed from: h */
    public static Long m92762h(String str) {
        str.getClass();
        if (str.isEmpty()) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (charAt == '-') {
            i = 1;
        }
        if (i == str.length()) {
            return null;
        }
        int i2 = i + 1;
        int a = C60759p.m92754a(str.charAt(i));
        if (a < 0 || a >= 10) {
            return null;
        }
        long j = (long) (-a);
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            int a2 = C60759p.m92754a(str.charAt(i2));
            if (a2 < 0 || a2 >= 10) {
                return null;
            }
            long j2 = j * 10;
            long j3 = (long) a2;
            if (j2 < Long.MIN_VALUE + j3) {
                return null;
            }
            j = j2 - j3;
            i2 = i3;
        }
        if (charAt == '-') {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }
}
