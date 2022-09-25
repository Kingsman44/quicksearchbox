package com.google.android.material.p3512i;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: com.google.android.material.i.c */
/* compiled from: PG */
public final class C44693c {
    /* renamed from: a */
    public static int m79225a(Context context, int i, int i2) {
        TypedValue b = m79226b(context, i);
        return (b == null || b.type != 16) ? i2 : b.data;
    }

    /* renamed from: b */
    public static TypedValue m79226b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: c */
    public static TypedValue m79227c(Context context, int i, String str) {
        TypedValue b = m79226b(context, i);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: d */
    public static boolean m79228d(Context context, int i, boolean z) {
        TypedValue b = m79226b(context, i);
        if (b == null || b.type != 18) {
            return z;
        }
        return b.data != 0;
    }
}
