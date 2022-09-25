package com.google.common.p4537i;

import sun.misc.Unsafe;

/* renamed from: com.google.common.i.x */
/* compiled from: PG */
enum C59299x implements C59297v {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;
    

    /* renamed from: c */
    private static final Unsafe f157428c = null;

    /* renamed from: d */
    private static final int f157429d = 0;

    static {
        Unsafe e = m92141e();
        f157428c = e;
        Class<byte[]> cls = byte[].class;
        f157429d = e.arrayBaseOffset(cls);
        if (e.arrayIndexScale(cls) != 1) {
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    public static final long m92139c(byte[] bArr, int i) {
        return f157428c.getLong(bArr, ((long) i) + ((long) f157429d));
    }

    /* renamed from: d */
    public static final long m92140d(byte[] bArr, int i) {
        return Long.reverseBytes(f157428c.getLong(bArr, ((long) i) + ((long) f157429d)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(com.google.common.p4537i.C59298w.f157425a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static sun.misc.Unsafe m92141e() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.i.w r0 = com.google.common.p4537i.C59298w.f157425a     // Catch:{ PrivilegedActionException -> 0x000e }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x000e }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x000e }
            return r0
        L_0x000e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4537i.C59299x.m92141e():sun.misc.Unsafe");
    }
}
