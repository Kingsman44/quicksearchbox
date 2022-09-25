package com.facebook.litho.widget;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.facebook.litho.widget.dd */
/* compiled from: PG */
public final class C6499dd {
    /* renamed from: a */
    public static int m17609a(int[] iArr) {
        int i = LinearLayoutManager.INVALID_OFFSET;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m17610b(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }
}
