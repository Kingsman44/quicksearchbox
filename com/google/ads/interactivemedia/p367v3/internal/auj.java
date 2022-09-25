package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.auj */
/* compiled from: PG */
public final class auj {

    /* renamed from: a */
    private static final ThreadLocal f21562a = new ThreadLocal();

    /* renamed from: b */
    private boolean f21563b = true;

    /* renamed from: c */
    private final List f21564c;

    /* renamed from: d */
    private String[] f21565d = null;

    public auj() {
        ArrayList arrayList = new ArrayList();
        this.f21564c = arrayList;
        arrayList.add(String.class);
    }

    /* renamed from: a */
    static Set m19667a() {
        return (Set) f21562a.get();
    }

    /* renamed from: b */
    static aup m19668b(Object obj, Object obj2) {
        return aup.m19684c(new aun(obj), new aun(obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2.isInstance(r5) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r7.isInstance(r6) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r3 = r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19669c(java.lang.Object r5, java.lang.Object r6, java.lang.String... r7) {
        /*
            if (r5 != r6) goto L_0x0005
            r5 = 1
            goto L_0x0077
        L_0x0005:
            r0 = 0
            if (r6 != 0) goto L_0x000b
            r5 = 0
            goto L_0x0077
        L_0x000b:
            com.google.ads.interactivemedia.v3.internal.auj r1 = new com.google.ads.interactivemedia.v3.internal.auj
            r1.<init>()
            r1.f21565d = r7
            boolean r7 = r1.f21563b
            if (r7 != 0) goto L_0x0017
            goto L_0x0075
        L_0x0017:
            if (r5 == r6) goto L_0x0075
            java.lang.Class r7 = r5.getClass()
            java.lang.Class r2 = r6.getClass()
            boolean r3 = r7.isInstance(r6)
            if (r3 == 0) goto L_0x002e
            boolean r3 = r2.isInstance(r5)
            if (r3 != 0) goto L_0x003a
            goto L_0x003c
        L_0x002e:
            boolean r3 = r2.isInstance(r5)
            if (r3 == 0) goto L_0x0073
            boolean r3 = r7.isInstance(r6)
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            r3 = r7
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            boolean r4 = r3.isArray()     // Catch:{ IllegalArgumentException -> 0x0073 }
            if (r4 == 0) goto L_0x0047
            r1.mo15457f(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0073 }
            goto L_0x0075
        L_0x0047:
            java.util.List r4 = r1.f21564c     // Catch:{ IllegalArgumentException -> 0x0073 }
            if (r4 == 0) goto L_0x0060
            boolean r7 = r4.contains(r7)     // Catch:{ IllegalArgumentException -> 0x0073 }
            if (r7 != 0) goto L_0x0059
            java.util.List r7 = r1.f21564c     // Catch:{ IllegalArgumentException -> 0x0073 }
            boolean r7 = r7.contains(r2)     // Catch:{ IllegalArgumentException -> 0x0073 }
            if (r7 == 0) goto L_0x0060
        L_0x0059:
            boolean r5 = r5.equals(r6)     // Catch:{ IllegalArgumentException -> 0x0073 }
            r1.f21563b = r5     // Catch:{ IllegalArgumentException -> 0x0073 }
            goto L_0x0075
        L_0x0060:
            r1.m19671i(r5, r6, r3)     // Catch:{ IllegalArgumentException -> 0x0073 }
        L_0x0063:
            java.lang.Class r7 = r3.getSuperclass()     // Catch:{ IllegalArgumentException -> 0x0073 }
            if (r7 == 0) goto L_0x0075
            if (r3 == 0) goto L_0x0075
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ IllegalArgumentException -> 0x0073 }
            r1.m19671i(r5, r6, r3)     // Catch:{ IllegalArgumentException -> 0x0073 }
            goto L_0x0063
        L_0x0073:
            r1.f21563b = r0
        L_0x0075:
            boolean r5 = r1.f21563b
        L_0x0077:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.auj.m19669c(java.lang.Object, java.lang.Object, java.lang.String[]):boolean");
    }

    /* renamed from: h */
    private static void m19670h(Object obj, Object obj2) {
        Set a = m19667a();
        if (a != null) {
            a.remove(m19668b(obj, obj2));
            if (a.isEmpty()) {
                f21562a.remove();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x008d */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19671i(java.lang.Object r5, java.lang.Object r6, java.lang.Class r7) {
        /*
            r4 = this;
            java.util.Set r0 = m19667a()
            com.google.ads.interactivemedia.v3.internal.aup r1 = m19668b(r5, r6)
            java.lang.Object r2 = r1.mo15465b()
            java.lang.Object r3 = r1.mo15464a()
            com.google.ads.interactivemedia.v3.internal.aup r2 = com.google.ads.interactivemedia.p367v3.internal.aup.m19684c(r2, r3)
            if (r0 == 0) goto L_0x0024
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L_0x0023
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            java.util.Set r0 = m19667a()     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0034
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
            java.lang.ThreadLocal r1 = f21562a     // Catch:{ all -> 0x009c }
            r1.set(r0)     // Catch:{ all -> 0x009c }
        L_0x0034:
            com.google.ads.interactivemedia.v3.internal.aup r1 = m19668b(r5, r6)     // Catch:{ all -> 0x009c }
            r0.add(r1)     // Catch:{ all -> 0x009c }
            java.lang.reflect.Field[] r7 = r7.getDeclaredFields()     // Catch:{ all -> 0x009c }
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r7, r0)     // Catch:{ all -> 0x009c }
            r0 = 0
        L_0x0044:
            int r1 = r7.length     // Catch:{ all -> 0x009c }
            if (r0 >= r1) goto L_0x0098
            boolean r1 = r4.f21563b     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0098
            r1 = r7[r0]     // Catch:{ all -> 0x009c }
            java.lang.String[] r2 = r4.f21565d     // Catch:{ all -> 0x009c }
            java.lang.String r3 = r1.getName()     // Catch:{ all -> 0x009c }
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.asn.m19517d(r2, r3)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = r1.getName()     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "$"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0095
            int r2 = r1.getModifiers()     // Catch:{ all -> 0x009c }
            boolean r2 = java.lang.reflect.Modifier.isTransient(r2)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0095
            int r2 = r1.getModifiers()     // Catch:{ all -> 0x009c }
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0095
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.auk> r2 = com.google.ads.interactivemedia.p367v3.internal.auk.class
            boolean r2 = r1.isAnnotationPresent(r2)     // Catch:{ all -> 0x009c }
            if (r2 != 0) goto L_0x0095
            java.lang.Object r2 = r1.get(r5)     // Catch:{ IllegalAccessException -> 0x008d }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ IllegalAccessException -> 0x008d }
            r4.mo15457f(r2, r1)     // Catch:{ IllegalAccessException -> 0x008d }
            goto L_0x0095
        L_0x008d:
            java.lang.InternalError r7 = new java.lang.InternalError     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "Unexpected IllegalAccessException"
            r7.<init>(r0)     // Catch:{ all -> 0x009c }
            throw r7     // Catch:{ all -> 0x009c }
        L_0x0095:
            int r0 = r0 + 1
            goto L_0x0044
        L_0x0098:
            m19670h(r5, r6)
            return
        L_0x009c:
            r7 = move-exception
            m19670h(r5, r6)
            goto L_0x00a2
        L_0x00a1:
            throw r7
        L_0x00a2:
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.auj.m19671i(java.lang.Object, java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: d */
    public final void mo15455d(int i, int i2) {
        if (this.f21563b) {
            this.f21563b = i == i2;
        }
    }

    /* renamed from: e */
    public final void mo15456e(long j, long j2) {
        if (this.f21563b) {
            this.f21563b = j == j2;
        }
    }

    /* renamed from: f */
    public final void mo15457f(Object obj, Object obj2) {
        if (!this.f21563b || obj == obj2) {
            return;
        }
        if (obj == null || obj2 == null) {
            mo15458g();
        } else if (!obj.getClass().isArray()) {
            this.f21563b = obj.equals(obj2);
        } else if (obj.getClass() != obj2.getClass()) {
            mo15458g();
        } else {
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (!this.f21563b || jArr == jArr2) {
                    return;
                }
                if (jArr.length == jArr2.length) {
                    while (i < jArr.length && this.f21563b) {
                        mo15456e(jArr[i], jArr2[i]);
                        i++;
                    }
                    return;
                }
                mo15458g();
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (this.f21563b && iArr != iArr2) {
                    if (iArr.length == iArr2.length) {
                        while (i < iArr.length && this.f21563b) {
                            mo15455d(iArr[i], iArr2[i]);
                            i++;
                        }
                        return;
                    }
                    mo15458g();
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (this.f21563b && sArr != sArr2) {
                    if (sArr.length == sArr2.length) {
                        for (int i2 = 0; i2 < sArr.length && this.f21563b; i2++) {
                            this.f21563b = sArr[i2] == sArr2[i2];
                        }
                        return;
                    }
                    mo15458g();
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (this.f21563b && cArr != cArr2) {
                    if (cArr.length == cArr2.length) {
                        for (int i3 = 0; i3 < cArr.length && this.f21563b; i3++) {
                            this.f21563b = cArr[i3] == cArr2[i3];
                        }
                        return;
                    }
                    mo15458g();
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (this.f21563b && bArr != bArr2) {
                    if (bArr.length == bArr2.length) {
                        for (int i4 = 0; i4 < bArr.length && this.f21563b; i4++) {
                            this.f21563b = bArr[i4] == bArr2[i4];
                        }
                        return;
                    }
                    mo15458g();
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (this.f21563b && dArr != dArr2) {
                    if (dArr.length == dArr2.length) {
                        while (i < dArr.length && this.f21563b) {
                            mo15456e(Double.doubleToLongBits(dArr[i]), Double.doubleToLongBits(dArr2[i]));
                            i++;
                        }
                        return;
                    }
                    mo15458g();
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (this.f21563b && fArr != fArr2) {
                    if (fArr.length == fArr2.length) {
                        while (i < fArr.length && this.f21563b) {
                            mo15455d(Float.floatToIntBits(fArr[i]), Float.floatToIntBits(fArr2[i]));
                            i++;
                        }
                        return;
                    }
                    mo15458g();
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (this.f21563b && zArr != zArr2) {
                    if (zArr.length == zArr2.length) {
                        for (int i5 = 0; i5 < zArr.length && this.f21563b; i5++) {
                            this.f21563b = zArr[i5] == zArr2[i5];
                        }
                        return;
                    }
                    mo15458g();
                }
            } else {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.f21563b && objArr != objArr2) {
                    if (objArr.length == objArr2.length) {
                        while (i < objArr.length && this.f21563b) {
                            mo15457f(objArr[i], objArr2[i]);
                            i++;
                        }
                        return;
                    }
                    mo15458g();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo15458g() {
        this.f21563b = false;
    }
}
