package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.cr */
/* compiled from: PG */
public final class C62972cr {

    /* renamed from: a */
    public static final Charset f170009a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f170010b;

    /* renamed from: c */
    public static final ByteBuffer f170011c;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f170010b = bArr;
        f170011c = ByteBuffer.wrap(bArr);
        int i = C62897ae.f169827g;
        C62897ae.m95112O(bArr, 0, 0);
    }

    /* renamed from: a */
    public static int m95541a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m95542b(byte[] bArr) {
        int length = bArr.length;
        int d = m95544d(length, bArr, 0, length);
        if (d == 0) {
            return 1;
        }
        return d;
    }

    /* renamed from: c */
    public static int m95543c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: d */
    static int m95544d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: e */
    static Object m95545e(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    /* renamed from: f */
    public static String m95546f(byte[] bArr) {
        return new String(bArr, f170009a);
    }

    /* renamed from: g */
    public static boolean m95547g(byte[] bArr) {
        return C63059fx.f170178a.mo59150h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    static void m95548h(Object obj) {
        obj.getClass();
    }

    /* renamed from: i */
    static void m95549i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: j */
    static void m95550j(MessageLite messageLite) {
        if (messageLite instanceof C62981d) {
            C62981d dVar = (C62981d) messageLite;
            throw null;
        }
    }
}
