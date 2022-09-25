package com.google.android.gms.common;

/* renamed from: com.google.android.gms.common.e */
/* compiled from: PG */
public final class C143870e {
    /* renamed from: a */
    static int m233879a(int i) {
        int[] iArr = {1, 2, 3};
        int i2 = 0;
        while (i2 < 3) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == i) {
                return i3;
            } else {
                i2++;
            }
        }
        return 1;
    }
}
