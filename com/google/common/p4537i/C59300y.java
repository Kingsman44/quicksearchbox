package com.google.common.p4537i;

import java.nio.ByteOrder;

/* renamed from: com.google.common.i.y */
/* compiled from: PG */
final class C59300y {

    /* renamed from: a */
    private static final C59297v f157431a;

    static {
        C59297v vVar = C59296u.f157423a;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                vVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? C59299x.UNSAFE_LITTLE_ENDIAN : C59299x.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f157431a = vVar;
    }

    /* renamed from: a */
    static int m92143a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    static long m92144b(byte[] bArr, int i) {
        return f157431a.mo56780a(bArr, i);
    }
}
