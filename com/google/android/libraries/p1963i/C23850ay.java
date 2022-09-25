package com.google.android.libraries.p1963i;

/* renamed from: com.google.android.libraries.i.ay */
/* compiled from: PG */
public final class C23850ay {
    /* renamed from: a */
    public static final int m44397a(int i) {
        boolean d = m44400d(i);
        int b = m44398b(i, 2);
        int b2 = m44398b(i, 1);
        int b3 = m44398b(i, 0);
        if (b3 != -21) {
            if (b3 <= b) {
                b = b3;
            }
        } else if (b2 != -21) {
            b = b2;
        }
        return !d ? C23915s.m44503b(C23915s.m44502a(b)) : b;
    }

    /* renamed from: b */
    public static final int m44398b(int i, int i2) {
        return ((i >> (i2 * 6)) & 63) - 21;
    }

    /* renamed from: c */
    public static final boolean m44399c(int i) {
        return ((i >> 18) & 1) == 1;
    }

    /* renamed from: d */
    public static final boolean m44400d(int i) {
        return ((i >> 19) & 1) == 1;
    }

    /* renamed from: e */
    public static /* synthetic */ int m44401e(int i, boolean z, int i2, int i3, int i4) {
        boolean d = (i4 & 1) != 0 ? m44400d(i) : false;
        if ((i4 & 2) != 0) {
            z = m44399c(i);
        }
        int b = (i4 & 4) != 0 ? m44398b(i, 2) : 0;
        if ((i4 & 8) != 0) {
            i2 = m44398b(i, 1);
        }
        if ((i4 & 16) != 0) {
            i3 = m44398b(i, 0);
        }
        return C23860ba.m44417a(d, z, b, i2, i3);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
