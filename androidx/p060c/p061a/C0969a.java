package androidx.p060c.p061a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.c.a.a */
/* compiled from: PG */
public final class C0969a {

    /* renamed from: a */
    public static final int[] f3084a = new int[0];

    /* renamed from: b */
    public static final long[] f3085b = new long[0];

    /* renamed from: c */
    public static final Object[] f3086c = new Object[0];

    /* renamed from: a */
    public static final int m2915a(int[] iArr, int i, int i2) {
        C69664n.m101061g(iArr, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    /* renamed from: b */
    public static final int m2916b(long[] jArr, int i, long j) {
        C69664n.m101061g(jArr, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: c */
    public static final int m2917c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static final int m2918d(int i) {
        return m2917c(i * 4) / 4;
    }

    /* renamed from: e */
    public static final int m2919e(int i) {
        return m2917c(i * 8) / 8;
    }
}
