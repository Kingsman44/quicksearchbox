package com.google.android.libraries.lens.view.utils;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.C1882h;
import androidx.p198v.p199a.p200a.C4261t;

/* renamed from: com.google.android.libraries.lens.view.utils.al */
/* compiled from: PG */
public final class C28110al {
    /* renamed from: a */
    public static int m52389a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return C1882h.m5138d(context, typedValue.resourceId).getDefaultColor();
        }
        return typedValue.data;
    }

    /* renamed from: b */
    public static Drawable m52390b(Context context, int i, int i2) {
        C4261t b = C4261t.m12180b(context.getResources(), i, context.getTheme());
        b.mutate();
        b.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        return b;
    }

    /* renamed from: c */
    public static boolean m52391c(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
