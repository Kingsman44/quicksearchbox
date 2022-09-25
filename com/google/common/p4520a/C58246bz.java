package com.google.common.p4520a;

import java.util.Random;
import sun.misc.Unsafe;

/* renamed from: com.google.common.a.bz */
/* compiled from: PG */
abstract class C58246bz extends Number {

    /* renamed from: a */
    static final ThreadLocal f155771a = new ThreadLocal();

    /* renamed from: b */
    static final Random f155772b = new Random();

    /* renamed from: c */
    static final int f155773c = Runtime.getRuntime().availableProcessors();

    /* renamed from: e */
    private static final Unsafe f155774e;

    /* renamed from: f */
    private static final long f155775f;

    /* renamed from: g */
    private static final long f155776g;
    volatile transient long base;
    volatile transient int busy;

    /* renamed from: d */
    volatile transient C58245by[] f155777d;

    static {
        try {
            Unsafe d = m89178d();
            f155774e = d;
            Class<C58246bz> cls = C58246bz.class;
            f155775f = d.objectFieldOffset(cls.getDeclaredField("base"));
            f155776g = d.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.p4520a.C58244bx());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe m89178d() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.a.bx r0 = new com.google.common.a.bx     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58246bz.m89178d():sun.misc.Unsafe");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo54814e(long j, long j2) {
        return f155774e.compareAndSwapLong(this, f155775f, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo54815f() {
        return f155774e.compareAndSwapInt(this, f155776g, 0, 1);
    }
}
