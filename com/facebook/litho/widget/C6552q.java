package com.facebook.litho.widget;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.facebook.litho.widget.q */
/* compiled from: PG */
public final class C6552q {
    /* renamed from: a */
    public static int m17846a(int[] iArr) {
        int i = LinearLayoutManager.INVALID_OFFSET;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m17847b(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }
}
