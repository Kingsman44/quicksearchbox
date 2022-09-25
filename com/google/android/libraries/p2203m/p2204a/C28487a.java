package com.google.android.libraries.p2203m.p2204a;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: com.google.android.libraries.m.a.a */
/* compiled from: PG */
public final class C28487a {
    /* renamed from: a */
    public static int m53260a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
