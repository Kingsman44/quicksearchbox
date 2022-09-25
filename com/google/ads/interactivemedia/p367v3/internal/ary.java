package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ary */
/* compiled from: PG */
public final class ary {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m19448a(java.lang.Iterable r2) {
        /*
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L_0x001b
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0015
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r2 = r2.get(r0)
            return r2
        L_0x0015:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L_0x001b:
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L_0x001f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.ary.m19448a(java.lang.Iterable):java.lang.Object");
    }

    /* renamed from: b */
    static int m19449b(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: c */
    static int m19450c(Object obj) {
        return m19449b(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: d */
    static int m19451d(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) ((double) highestOneBit))) {
            return highestOneBit;
        }
        int i2 = highestOneBit + highestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: e */
    static Object m19452e(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            return i <= 65536 ? new short[i] : new int[i];
        }
    }

    /* renamed from: f */
    static int m19453f(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: g */
    static void m19454g(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: h */
    static int m19455h(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: i */
    static int m19456i(int i, int i2) {
        return i & (i2 ^ -1);
    }

    /* renamed from: j */
    static int m19457j(int i, int i2, int i3) {
        return (i & (i3 ^ -1)) | (i2 & i3);
    }

    /* renamed from: k */
    static int m19458k(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int c = m19450c(obj);
        int i4 = c & i;
        int f = m19453f(obj3, i4);
        if (f == 0) {
            return -1;
        }
        int i5 = m19456i(c, i);
        int i6 = -1;
        while (true) {
            i2 = f - 1;
            i3 = iArr[i2];
            if (m19456i(i3, i) != i5 || !apz.m19253b(obj, objArr[i2]) || (objArr2 != null && !apz.m19253b(obj2, objArr2[i2]))) {
                int i7 = i3 & i;
                if (i7 == 0) {
                    return -1;
                }
                int i8 = i7;
                i6 = i2;
                f = i8;
            }
        }
        int i9 = i3 & i;
        if (i6 == -1) {
            m19454g(obj3, i4, i9);
        } else {
            iArr[i6] = m19457j(iArr[i6], i9, i);
        }
        return i2;
    }

    /* renamed from: l */
    static void m19459l(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            String.valueOf(valueOf).length();
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(valueOf)));
        } else if (obj2 == null) {
            String obj3 = obj.toString();
            StringBuilder sb = new StringBuilder(obj3.length() + 26);
            sb.append("null value in entry: ");
            sb.append(obj3);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: m */
    static void m19460m(boolean z) {
        aqd.m19279g(z, "no calls to next() since the last call to remove()");
    }

    /* renamed from: n */
    static void m19461n(int i, String str) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(str.length() + 40);
            sb.append(str);
            sb.append(" cannot be negative but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: o */
    public static void m19462o(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: p */
    public static void m19463p(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: q */
    public static void m19464q(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    public static void m19465r(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: s */
    public static Object m19466s(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t */
    public static Object m19467t(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: u */
    public static void m19468u(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: v */
    public static void m19469v(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: w */
    public static void m19470w(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalStateException((String) obj2);
        }
    }
}
