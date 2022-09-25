package com.google.common.p4575r;

/* renamed from: com.google.common.r.b */
/* compiled from: PG */
public final class C60745b {
    /* renamed from: a */
    public static int m92716a(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    /* renamed from: b */
    public static int m92717b(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static boolean m92718c(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
