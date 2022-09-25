package com.google.p370af;

/* renamed from: com.google.af.f */
/* compiled from: PG */
final class C7493f {
    /* renamed from: a */
    static void m22753a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m22759g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m22759g(b3) || m22759g(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: c */
    static void m22755c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (!m22759g(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        } else {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
    }

    /* renamed from: d */
    static boolean m22756d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    static boolean m22757e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    static boolean m22758f(byte b) {
        return b < -32;
    }

    /* renamed from: g */
    private static boolean m22759g(byte b) {
        return b > -65;
    }

    /* renamed from: b */
    static void m22754b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m22759g(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m22759g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
}
