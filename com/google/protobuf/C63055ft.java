package com.google.protobuf;

/* renamed from: com.google.protobuf.ft */
/* compiled from: PG */
final class C63055ft {
    /* renamed from: a */
    public static void m95976a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m95982g(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m95982g(b3) || m95982g(b4)) {
            throw C62974ct.m95553c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: c */
    public static void m95978c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m95982g(b2)) {
            throw C62974ct.m95553c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    public static boolean m95979d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m95980e(byte b) {
        return b < -16;
    }

    /* renamed from: f */
    public static boolean m95981f(byte b) {
        return b < -32;
    }

    /* renamed from: g */
    private static boolean m95982g(byte b) {
        return b > -65;
    }

    /* renamed from: b */
    public static void m95977b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m95982g(b2)) {
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
            if (!m95982g(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C62974ct.m95553c();
    }
}
