package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.fs */
/* compiled from: PG */
final class C63054fs {

    /* renamed from: a */
    public static final C63053fr f170169a;

    /* renamed from: b */
    public static final boolean f170170b;

    /* renamed from: c */
    public static final boolean f170171c;

    /* renamed from: d */
    static final long f170172d = ((long) m95973l(byte[].class));

    /* renamed from: e */
    static final boolean f170173e;

    /* renamed from: f */
    private static final Unsafe f170174f;

    /* renamed from: g */
    private static final Class f170175g = Memory.class;

    /* renamed from: h */
    private static final boolean f170176h;

    /* renamed from: i */
    private static final long f170177i;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0156  */
    static {
        /*
            sun.misc.Unsafe r0 = m95965d()
            f170174f = r0
            java.lang.Class<libcore.io.Memory> r1 = libcore.io.Memory.class
            f170175g = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = m95970i(r1)
            f170176h = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = m95970i(r2)
            r3 = 0
            if (r0 != 0) goto L_0x001c
            goto L_0x002b
        L_0x001c:
            if (r1 == 0) goto L_0x0024
            com.google.protobuf.fq r3 = new com.google.protobuf.fq
            r3.<init>(r0)
            goto L_0x002b
        L_0x0024:
            if (r2 == 0) goto L_0x002b
            com.google.protobuf.fp r3 = new com.google.protobuf.fp
            r3.<init>(r0)
        L_0x002b:
            f170169a = r3
            java.lang.String r0 = "getLong"
            java.lang.String r1 = "objectFieldOffset"
            r2 = 2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0038
        L_0x0036:
            r3 = 0
            goto L_0x0062
        L_0x0038:
            sun.misc.Unsafe r3 = r3.f170168a
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x005d }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.reflect.Field> r7 = java.lang.reflect.Field.class
            r6[r5] = r7     // Catch:{ all -> 0x005d }
            r3.getMethod(r1, r6)     // Catch:{ all -> 0x005d }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r5] = r7     // Catch:{ all -> 0x005d }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x005d }
            r6[r4] = r7     // Catch:{ all -> 0x005d }
            r3.getMethod(r0, r6)     // Catch:{ all -> 0x005d }
            java.lang.reflect.Field r3 = m95964c()     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x005b
            goto L_0x0036
        L_0x005b:
            r3 = 1
            goto L_0x0062
        L_0x005d:
            r3 = move-exception
            m95966e(r3)
            goto L_0x0036
        L_0x0062:
            f170170b = r3
            com.google.protobuf.fr r3 = f170169a
            if (r3 != 0) goto L_0x006b
        L_0x0068:
            r0 = 0
            goto L_0x00fd
        L_0x006b:
            sun.misc.Unsafe r3 = r3.f170168a
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.reflect.Field> r7 = java.lang.reflect.Field.class
            r6[r5] = r7     // Catch:{ all -> 0x00f7 }
            r3.getMethod(r1, r6)     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r1[r5] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "arrayBaseOffset"
            r3.getMethod(r6, r1)     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r1[r5] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "arrayIndexScale"
            r3.getMethod(r6, r1)     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r1[r5] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f7 }
            r1[r4] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "getInt"
            r3.getMethod(r6, r1)     // Catch:{ all -> 0x00f7 }
            r1 = 3
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r5] = r7     // Catch:{ all -> 0x00f7 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f7 }
            r6[r4] = r7     // Catch:{ all -> 0x00f7 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f7 }
            r6[r2] = r7     // Catch:{ all -> 0x00f7 }
            java.lang.String r7 = "putInt"
            r3.getMethod(r7, r6)     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r5] = r7     // Catch:{ all -> 0x00f7 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f7 }
            r6[r4] = r7     // Catch:{ all -> 0x00f7 }
            r3.getMethod(r0, r6)     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r0[r5] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f7 }
            r0[r4] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f7 }
            r0[r2] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "putLong"
            r3.getMethod(r6, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r0[r5] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f7 }
            r0[r4] = r6     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "getObject"
            r3.getMethod(r6, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r5] = r1     // Catch:{ all -> 0x00f7 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f7 }
            r0[r4] = r1     // Catch:{ all -> 0x00f7 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r2] = r1     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "putObject"
            r3.getMethod(r1, r0)     // Catch:{ all -> 0x00f7 }
            r0 = 1
            goto L_0x00fd
        L_0x00f7:
            r0 = move-exception
            m95966e(r0)
            goto L_0x0068
        L_0x00fd:
            f170171c = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m95973l(r0)
            long r0 = (long) r0
            f170172d = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            m95973l(r0)
            m95975n(r0)
            java.lang.Class<int[]> r0 = int[].class
            m95973l(r0)
            m95975n(r0)
            java.lang.Class<long[]> r0 = long[].class
            m95973l(r0)
            m95975n(r0)
            java.lang.Class<float[]> r0 = float[].class
            m95973l(r0)
            m95975n(r0)
            java.lang.Class<double[]> r0 = double[].class
            m95973l(r0)
            m95975n(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m95973l(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m95975n(r0)
            java.lang.reflect.Field r0 = m95964c()
            r1 = -1
            if (r0 == 0) goto L_0x014b
            com.google.protobuf.fr r3 = f170169a
            if (r3 != 0) goto L_0x0147
            goto L_0x014b
        L_0x0147:
            long r1 = r3.mo59137o(r0)
        L_0x014b:
            f170177i = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r4 = 0
        L_0x0157:
            f170173e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63054fs.<clinit>():void");
    }

    private C63054fs() {
    }

    /* renamed from: a */
    static long m95962a(ByteBuffer byteBuffer) {
        return f170169a.mo59136n(byteBuffer, f170177i);
    }

    /* renamed from: b */
    static Object m95963b(Class cls) {
        try {
            return f170174f.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static Field m95964c() {
        Field m = m95974m(Buffer.class, "effectiveDirectAddress");
        if (m != null) {
            return m;
        }
        Field m2 = m95974m(Buffer.class, "address");
        if (m2 == null || m2.getType() != Long.TYPE) {
            return null;
        }
        return m2;
    }

    /* renamed from: d */
    static Unsafe m95965d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C63050fo());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m95966e(Throwable th) {
        Logger.getLogger(C63054fs.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: f */
    static void m95967f(byte[] bArr, long j, byte b) {
        f170169a.mo59130h(bArr, f170172d + j, b);
    }

    /* renamed from: g */
    public static void m95968g(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C63053fr frVar = f170169a;
        int i = ((((int) j) ^ -1) & 3) << 3;
        frVar.mo59139q(obj, j2, ((255 & b) << i) | (frVar.mo59135m(obj, j2) & ((PrivateKeyType.INVALID << i) ^ -1)));
    }

    /* renamed from: h */
    public static void m95969h(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C63053fr frVar = f170169a;
        int i = (((int) j) & 3) << 3;
        frVar.mo59139q(obj, j2, ((255 & b) << i) | (frVar.mo59135m(obj, j2) & ((PrivateKeyType.INVALID << i) ^ -1)));
    }

    /* renamed from: i */
    static boolean m95970i(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class cls3 = f170175g;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m95971j(Object obj, long j) {
        return ((byte) ((f170169a.mo59135m(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & PrivateKeyType.INVALID)) != 0;
    }

    /* renamed from: k */
    public static boolean m95972k(Object obj, long j) {
        return ((byte) ((f170169a.mo59135m(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & PrivateKeyType.INVALID)) != 0;
    }

    /* renamed from: l */
    private static int m95973l(Class cls) {
        if (f170171c) {
            return f170169a.mo59134l(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static Field m95974m(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    private static void m95975n(Class cls) {
        if (f170171c) {
            f170169a.mo59142t(cls);
        }
    }
}
