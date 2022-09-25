package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.configs.C42141b;

/* renamed from: com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.b */
/* compiled from: PG */
public final class C42025b {
    /* renamed from: a */
    static float m73579a(Context context, String str, int i) {
        Resources resources = context.getResources();
        float fraction = resources.getFraction(R.fraction.monogram_letter_to_size_ratio, 1, 1);
        float fraction2 = resources.getFraction(R.fraction.monogram_letter_to_size_ratio_two_chars, 1, 1);
        float fraction3 = resources.getFraction(R.fraction.monogram_letter_to_size_ratio_three_chars, 1, 1);
        if (str.length() == 3) {
            fraction = fraction3;
        } else if (str.length() == 2) {
            fraction = fraction2;
        }
        return fraction * ((float) i);
    }

    /* renamed from: b */
    public static int m73580b(Context context, String str, C42141b bVar) {
        TypedArray typedArray;
        C42131a.m73918a(context);
        if (bVar == null) {
            typedArray = context.getResources().obtainTypedArray(R.array.light_monogram_colors);
        } else if (bVar.f110300s) {
            typedArray = context.getResources().obtainTypedArray(R.array.dark_monogram_colors);
        } else {
            typedArray = context.getResources().obtainTypedArray(R.array.light_monogram_colors);
        }
        if (typedArray.length() == 0) {
            return -7829368;
        }
        if (!TextUtils.isEmpty(str)) {
            int color = typedArray.getColor(Math.abs(str.hashCode()) % typedArray.length(), -1);
            typedArray.recycle();
            return color;
        }
        int color2 = typedArray.getColor(0, -1);
        typedArray.recycle();
        return color2;
    }
}
