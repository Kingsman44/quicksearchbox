package com.google.android.libraries.onegoogle.owners;

import android.content.Context;

/* renamed from: com.google.android.libraries.onegoogle.owners.c */
/* compiled from: PG */
public final class C30968c {
    /* renamed from: a */
    public static int m57808a(int i) {
        if (i == 32) {
            return 0;
        }
        if (i != 48) {
            return i != 120 ? 2 : 3;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m57809b(Context context, int i) {
        if (i <= 0) {
            return 64;
        }
        float f = ((float) i) / context.getResources().getDisplayMetrics().density;
        int[] iArr = {32, 48, 64, 120};
        int i2 = 0;
        while (i2 < 4) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                throw null;
            } else if (f <= ((float) i3)) {
                return i3;
            } else {
                i2++;
            }
        }
        return 120;
    }
}
