package com.google.android.material.p3512i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.support.p033v7.widget.C0735ip;
import android.util.TypedValue;
import androidx.core.content.C1882h;

/* renamed from: com.google.android.material.i.d */
/* compiled from: PG */
public final class C44694d {
    /* renamed from: a */
    public static int m79229a(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: b */
    public static ColorStateList m79230b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList d;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = C1882h.m5138d(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return d;
    }

    /* renamed from: c */
    public static ColorStateList m79231c(Context context, C0735ip ipVar, int i) {
        int resourceId;
        ColorStateList d;
        if (!ipVar.f2596b.hasValue(i) || (resourceId = ipVar.f2596b.getResourceId(i, 0)) == 0 || (d = C1882h.m5138d(context, resourceId)) == null) {
            return ipVar.mo3245a(i);
        }
        return d;
    }

    /* renamed from: d */
    public static Drawable m79232d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable c;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = C0678gm.m2375e().mo3100c(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return c;
    }

    /* renamed from: e */
    public static boolean m79233e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: f */
    public static boolean m79234f(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
