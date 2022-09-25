package com.google.apps.p3589d.p3600k;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.apps.d.k.f */
/* compiled from: PG */
public abstract class C45941f {
    static {
        m82028e(0, 0, 0, PrivateKeyType.INVALID);
        m82028e(68, 68, 68, PrivateKeyType.INVALID);
        m82028e(136, 136, 136, PrivateKeyType.INVALID);
        m82028e(204, 204, 204, PrivateKeyType.INVALID);
        m82028e(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID);
        m82028e(PrivateKeyType.INVALID, 0, 0, PrivateKeyType.INVALID);
        m82028e(0, PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID);
        m82028e(0, 0, PrivateKeyType.INVALID, PrivateKeyType.INVALID);
        m82028e(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID);
        m82028e(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID);
        m82028e(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID, PrivateKeyType.INVALID);
        m82028e(0, 0, 0, 0);
    }

    /* renamed from: b */
    private static int m82026b(String str, int i) {
        char charAt = str.charAt(i);
        if (charAt >= '0' && charAt <= '9') {
            return charAt - '0';
        }
        if (charAt >= 'a' && charAt <= 'f') {
            return charAt - 'W';
        }
        if (charAt >= 'A' && charAt <= 'F') {
            return charAt - '7';
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    private static void m82027c(int i) {
        if (i < 0 || i >= 256) {
            throw new AssertionError("Invalid color byte " + i);
        }
    }

    /* renamed from: e */
    public static C45940e m82028e(int i, int i2, int i3, int i4) {
        m82027c(i);
        m82027c(i2);
        m82027c(i3);
        m82027c(i4);
        return new C45936a(i, i2, i3, i4);
    }

    /* renamed from: f */
    public static C45941f m82029f() {
        return C45939d.f120731a;
    }

    /* renamed from: g */
    public static C45941f m82030g(String str) {
        if (str.charAt(0) != '#') {
            return null;
        }
        try {
            int length = str.length();
            if (length == 4) {
                return m82028e(m82026b(str, 1) * 17, m82026b(str, 2) * 17, m82026b(str, 3) * 17, PrivateKeyType.INVALID);
            }
            if (length == 5) {
                return m82028e(m82026b(str, 1) * 17, m82026b(str, 2) * 17, m82026b(str, 3) * 17, m82026b(str, 4) * 17);
            }
            if (length == 7) {
                return m82028e((m82026b(str, 1) * 16) + m82026b(str, 2), (m82026b(str, 3) * 16) + m82026b(str, 4), (m82026b(str, 5) * 16) + m82026b(str, 6), PrivateKeyType.INVALID);
            }
            if (length != 9) {
                return null;
            }
            return m82028e((m82026b(str, 1) * 16) + m82026b(str, 2), (m82026b(str, 3) * 16) + m82026b(str, 4), (m82026b(str, 5) * 16) + m82026b(str, 6), (m82026b(str, 7) * 16) + m82026b(str, 8));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public abstract String mo50054h();
}
