package com.google.ads.interactivemedia.p367v3.internal;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.me */
/* compiled from: PG */
class C7114me {

    /* renamed from: d */
    public final int f22911d;

    public C7114me(int i) {
        this.f22911d = i;
    }

    /* renamed from: e */
    public static int m21130e(int i) {
        return (i >> 24) & PrivateKeyType.INVALID;
    }

    /* renamed from: f */
    public static int m21131f(int i) {
        return i & 16777215;
    }

    /* renamed from: g */
    public static String m21132g(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 16) & PrivateKeyType.INVALID));
        sb.append((char) ((i >> 8) & PrivateKeyType.INVALID));
        sb.append((char) (i & PrivateKeyType.INVALID));
        return sb.toString();
    }

    public String toString() {
        return m21132g(this.f22911d);
    }
}
