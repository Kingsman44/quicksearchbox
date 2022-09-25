package com.google.android.libraries.p1963i;

import android.os.Build;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.i.s */
/* compiled from: PG */
public final class C23915s {

    /* renamed from: a */
    private static final int[] f65396a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};

    static {
        "ranchu".equals(Build.HARDWARE);
    }

    /* renamed from: a */
    static int m44502a(int i) {
        int i2;
        int i3 = 0;
        do {
            int[] iArr = f65396a;
            int length = iArr.length;
            if (i3 >= 10) {
                return 10;
            }
            i2 = iArr[i3];
            i3++;
        } while (i < i2);
        return i3;
    }

    /* renamed from: b */
    static int m44503b(int i) {
        if (i > 0 && i <= 10) {
            return f65396a[i - 1];
        }
        throw new IllegalArgumentException("Invalid java priority: " + i);
    }

    /* renamed from: c */
    public static ThreadFactory m44504c(int i) {
        return new C23914r(i);
    }
}
