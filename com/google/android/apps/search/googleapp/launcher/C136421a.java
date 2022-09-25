package com.google.android.apps.search.googleapp.launcher;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.apps.search.googleapp.launcher.a */
/* compiled from: PG */
public final class C136421a {
    /* renamed from: a */
    public static int m221661a(int i) {
        int[] iArr = {1, 2, 4};
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
        throw new NoSuchElementException("Unable to find an animation type corresponding to value: " + i);
    }
}
