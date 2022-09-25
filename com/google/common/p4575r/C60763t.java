package com.google.common.p4575r;

/* renamed from: com.google.common.r.t */
/* compiled from: PG */
public final class C60763t {
    /* renamed from: a */
    public static int m92764a(long j, long j2) {
        return C60761r.m92755a(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static long m92765b(long j, long j2) {
        if (j2 < 0) {
            return m92764a(j, j2) < 0 ? 0 : 1;
        }
        if (j >= 0) {
            long j3 = 0 / j2;
            return 0;
        }
        int i = 1;
        long j4 = (j >>> 1) / j2;
        long j5 = j4 + j4;
        if (m92764a(j - (j5 * j2), j2) < 0) {
            i = 0;
        }
        return j5 + ((long) i);
    }

    /* renamed from: d */
    public static String m92767d(long j, int i) {
        long j2;
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                j2 = (j >>> 1) / ((long) (i >>> 1));
            } else {
                j2 = m92765b(j, (long) i);
            }
            long j3 = (long) i;
            cArr[63] = Character.forDigit((int) (j - (j2 * j3)), i);
            i2 = 63;
            while (j2 > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (j2 % j3), i);
                j2 /= j3;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }

    /* renamed from: c */
    public static long m92766c(String str, int i) {
        str.getClass();
        if (str.length() != 0) {
            int i2 = C60762s.f164808c[i] - 1;
            long j = 0;
            int i3 = 0;
            while (i3 < str.length()) {
                int digit = Character.digit(str.charAt(i3), i);
                if (digit == -1) {
                    throw new NumberFormatException(str);
                } else if (i3 <= i2 || !C60762s.m92763a(j, digit, i)) {
                    j = (j * ((long) i)) + ((long) digit);
                    i3++;
                } else {
                    throw new NumberFormatException("Too large for unsigned long: ".concat(str));
                }
            }
            return j;
        }
        throw new NumberFormatException("empty string");
    }
}
