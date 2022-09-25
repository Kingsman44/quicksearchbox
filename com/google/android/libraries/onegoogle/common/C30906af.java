package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.core.content.C1882h;

/* renamed from: com.google.android.libraries.onegoogle.common.af */
/* compiled from: PG */
public final class C30906af {
    /* renamed from: a */
    public static ColorStateList m57697a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList d;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = C1882h.m5138d(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return d;
    }
}
