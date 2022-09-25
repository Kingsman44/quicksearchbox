package com.google.android.libraries.material.p2206b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* renamed from: com.google.android.libraries.material.b.b */
/* compiled from: PG */
public final class C28506b {
    static {
        Math.round(30.599998f);
        Math.round(127.5f);
        Math.round(96.9f);
    }

    /* renamed from: a */
    public static int m53284a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }
}
