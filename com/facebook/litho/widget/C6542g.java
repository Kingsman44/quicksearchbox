package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0602dr;
import android.util.DisplayMetrics;

/* renamed from: com.facebook.litho.widget.g */
/* compiled from: PG */
public final class C6542g extends C0602dr {

    /* renamed from: f */
    private final int f19487f;

    public C6542g(Context context, int i) {
        super(context);
        this.f19487f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo2793a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: b */
    public final int mo2794b(int i, int i2, int i3, int i4, int i5) {
        return ((i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2))) + this.f19487f;
    }
}
