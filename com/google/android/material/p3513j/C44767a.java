package com.google.android.material.p3513j;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import androidx.core.graphics.C1924a;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.j.a */
/* compiled from: PG */
public final class C44767a {

    /* renamed from: a */
    public static final /* synthetic */ int f116704a = 0;

    /* renamed from: b */
    private static final int[] f116705b = {16842919};

    /* renamed from: c */
    private static final int[] f116706c = {16842908};

    /* renamed from: d */
    private static final int[] f116707d = {16842913, 16842919};

    /* renamed from: e */
    private static final int[] f116708e = {16842913};

    private C44767a() {
    }

    /* renamed from: a */
    public static ColorStateList m79371a(ColorStateList colorStateList) {
        int[] iArr = f116706c;
        return new ColorStateList(new int[][]{f116708e, iArr, StateSet.NOTHING}, new int[]{m79373c(colorStateList, f116707d), m79373c(colorStateList, iArr), m79373c(colorStateList, f116705b)});
    }

    /* renamed from: b */
    public static ColorStateList m79372b(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    /* renamed from: c */
    private static int m79373c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int alpha = Color.alpha(colorForState);
        return C1924a.m5189h(colorForState, Math.min(alpha + alpha, PrivateKeyType.INVALID));
    }
}
