package com.google.ads.interactivemedia.p367v3.internal;

import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atg */
/* compiled from: PG */
final class atg extends asv {

    /* renamed from: a */
    static final Unsafe f21526a;

    /* renamed from: b */
    static final long f21527b;

    /* renamed from: c */
    static final long f21528c;

    /* renamed from: d */
    static final long f21529d;

    /* renamed from: e */
    static final long f21530e;

    /* renamed from: f */
    static final long f21531f;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
        r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.ads.interactivemedia.p367v3.internal.atf());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    static {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            goto L_0x0010
        L_0x0005:
            com.google.ads.interactivemedia.v3.internal.atf r0 = new com.google.ads.interactivemedia.v3.internal.atf     // Catch:{ PrivilegedActionException -> 0x005f }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005f }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005f }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005f }
        L_0x0010:
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.ati> r1 = com.google.ads.interactivemedia.p367v3.internal.ati.class
            java.lang.String r2 = "g"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
            long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
            f21528c = r2     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = "f"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
            long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
            f21527b = r2     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = "e"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
            long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
            f21529d = r1     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.ath> r1 = com.google.ads.interactivemedia.p367v3.internal.ath.class
            java.lang.String r2 = "b"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
            long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
            f21530e = r1     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.ath> r1 = com.google.ads.interactivemedia.p367v3.internal.ath.class
            java.lang.String r2 = "c"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
            long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
            f21531f = r1     // Catch:{ Exception -> 0x0055 }
            f21526a = r0     // Catch:{ Exception -> 0x0055 }
            return
        L_0x0055:
            r0 = move-exception
            com.google.ads.interactivemedia.p367v3.internal.aqf.m19295a(r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x005f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.atg.<clinit>():void");
    }

    private atg() {
    }

    public /* synthetic */ atg(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo15379a(ath ath, Thread thread) {
        f21526a.putObject(ath, f21530e, thread);
    }

    /* renamed from: b */
    public final void mo15380b(ath ath, ath ath2) {
        f21526a.putObject(ath, f21531f, ath2);
    }

    /* renamed from: c */
    public final boolean mo15381c(ati ati, ath ath, ath ath2) {
        return atg$$ExternalSyntheticBackportWithForwarding0.m19568m(f21526a, ati, f21528c, ath, ath2);
    }

    /* renamed from: d */
    public final boolean mo15382d(ati ati, asz asz, asz asz2) {
        return atg$$ExternalSyntheticBackportWithForwarding0.m19568m(f21526a, ati, f21527b, asz, asz2);
    }

    /* renamed from: e */
    public final boolean mo15383e(ati ati, Object obj, Object obj2) {
        return atg$$ExternalSyntheticBackportWithForwarding0.m19568m(f21526a, ati, f21529d, obj, obj2);
    }
}
