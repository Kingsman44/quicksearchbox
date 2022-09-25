package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aul */
/* compiled from: PG */
public final class aul {

    /* renamed from: a */
    private static final ThreadLocal f21566a = new ThreadLocal();

    /* renamed from: b */
    private int f21567b = 17;

    public aul() {
    }

    public aul(byte[] bArr) {
    }

    /* renamed from: a */
    static Set m19676a() {
        return (Set) f21566a.get();
    }

    /* renamed from: b */
    public static int m19677b(Object obj, String... strArr) {
        aul aul = new aul((byte[]) null);
        Class cls = obj.getClass();
        m19679f(obj, cls, aul, strArr);
        while (cls.getSuperclass() != null && cls != null) {
            cls = cls.getSuperclass();
            m19679f(obj, cls, aul, strArr);
        }
        return aul.f21567b;
    }

    /* renamed from: e */
    private static void m19678e(Object obj) {
        Set a = m19676a();
        if (a != null) {
            a.remove(new aun(obj));
            if (a.isEmpty()) {
                f21566a.remove();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0073 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19679f(java.lang.Object r5, java.lang.Class r6, com.google.ads.interactivemedia.p367v3.internal.aul r7, java.lang.String[] r8) {
        /*
            java.util.Set r0 = m19676a()
            if (r0 == 0) goto L_0x0013
            com.google.ads.interactivemedia.v3.internal.aun r1 = new com.google.ads.interactivemedia.v3.internal.aun
            r1.<init>(r5)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            return
        L_0x0013:
            java.util.Set r0 = m19676a()     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0023
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0082 }
            r0.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.ThreadLocal r1 = f21566a     // Catch:{ all -> 0x0082 }
            r1.set(r0)     // Catch:{ all -> 0x0082 }
        L_0x0023:
            com.google.ads.interactivemedia.v3.internal.aun r1 = new com.google.ads.interactivemedia.v3.internal.aun     // Catch:{ all -> 0x0082 }
            r1.<init>(r5)     // Catch:{ all -> 0x0082 }
            r0.add(r1)     // Catch:{ all -> 0x0082 }
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()     // Catch:{ all -> 0x0082 }
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r6, r0)     // Catch:{ all -> 0x0082 }
            int r0 = r6.length     // Catch:{ all -> 0x0082 }
            r1 = 0
        L_0x0035:
            if (r1 >= r0) goto L_0x007e
            r2 = r6[r1]     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0082 }
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.asn.m19517d(r8, r3)     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x007b
            java.lang.String r3 = r2.getName()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = "$"
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x007b
            int r3 = r2.getModifiers()     // Catch:{ all -> 0x0082 }
            boolean r3 = java.lang.reflect.Modifier.isTransient(r3)     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x007b
            int r3 = r2.getModifiers()     // Catch:{ all -> 0x0082 }
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x007b
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.aum> r3 = com.google.ads.interactivemedia.p367v3.internal.aum.class
            boolean r3 = r2.isAnnotationPresent(r3)     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x007b
            java.lang.Object r2 = r2.get(r5)     // Catch:{ IllegalAccessException -> 0x0073 }
            r7.mo15460d(r2)     // Catch:{ IllegalAccessException -> 0x0073 }
            goto L_0x007b
        L_0x0073:
            java.lang.InternalError r6 = new java.lang.InternalError     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = "Unexpected IllegalAccessException"
            r6.<init>(r7)     // Catch:{ all -> 0x0082 }
            throw r6     // Catch:{ all -> 0x0082 }
        L_0x007b:
            int r1 = r1 + 1
            goto L_0x0035
        L_0x007e:
            m19678e(r5)
            return
        L_0x0082:
            r6 = move-exception
            m19678e(r5)
            goto L_0x0088
        L_0x0087:
            throw r6
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aul.m19679f(java.lang.Object, java.lang.Class, com.google.ads.interactivemedia.v3.internal.aul, java.lang.String[]):void");
    }

    /* renamed from: c */
    public final void mo15459c(long j) {
        this.f21567b = (this.f21567b * 37) + ((int) (j ^ (j >> 32)));
    }

    /* renamed from: d */
    public final void mo15460d(Object obj) {
        if (obj == null) {
            this.f21567b *= 37;
        } else if (obj.getClass().isArray()) {
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length = jArr.length;
                while (i < length) {
                    mo15459c(jArr[i]);
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length2 = iArr.length;
                while (i < length2) {
                    this.f21567b = (this.f21567b * 37) + iArr[i];
                    i++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length3 = sArr.length;
                while (i < length3) {
                    this.f21567b = (this.f21567b * 37) + sArr[i];
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length4 = cArr.length;
                while (i < length4) {
                    this.f21567b = (this.f21567b * 37) + cArr[i];
                    i++;
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length5 = bArr.length;
                while (i < length5) {
                    this.f21567b = (this.f21567b * 37) + bArr[i];
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length6 = dArr.length;
                while (i < length6) {
                    mo15459c(Double.doubleToLongBits(dArr[i]));
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length7 = fArr.length;
                while (i < length7) {
                    this.f21567b = (this.f21567b * 37) + Float.floatToIntBits(fArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length8 = zArr.length;
                while (i < length8) {
                    this.f21567b = (this.f21567b * 37) + (zArr[i] ^ true ? 1 : 0);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length9 = objArr.length;
                while (i < length9) {
                    mo15460d(objArr[i]);
                    i++;
                }
            }
        } else {
            this.f21567b = (this.f21567b * 37) + obj.hashCode();
        }
    }

    public final int hashCode() {
        return this.f21567b;
    }
}
