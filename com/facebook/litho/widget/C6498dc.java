package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0603ds;
import android.support.p033v7.widget.C0628eq;
import android.support.p033v7.widget.C0669gd;
import android.support.p033v7.widget.C0710hr;

/* renamed from: com.facebook.litho.widget.dc */
/* compiled from: PG */
public final class C6498dc {
    /* renamed from: a */
    public static C0710hr m17607a(int i, int i2, int i3) {
        if (i == -1) {
            return new C6506dk(i3);
        }
        if (i == Integer.MAX_VALUE) {
            return new C0628eq();
        }
        switch (i) {
            case 2147483645:
                return new C6550o(i2);
            case 2147483646:
                return new C0603ds();
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C0669gd m17608b(Context context, int i, int i2) {
        if (i2 == 7 || i2 == 6 || i2 == 8) {
            return new C6555t(context, i2 - 7, i);
        }
        if (i2 == 1) {
            return new C6542g(context, i);
        }
        return new C0602dr(context);
    }
}
