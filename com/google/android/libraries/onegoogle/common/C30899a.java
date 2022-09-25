package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.onegoogle.common.a */
/* compiled from: PG */
public final class C30899a {
    /* renamed from: a */
    public static int m57682a(Context context, int i) {
        return context.getResources().getColor(m57683b(context, i).resourceId);
    }

    /* renamed from: b */
    public static TypedValue m57683b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        throw new IllegalStateException("Attribute not available.");
    }

    /* renamed from: c */
    public static float m57684c(Context context) {
        return m57683b(context, R.attr.ogDialogCornerRadius).getDimension(context.getResources().getDisplayMetrics());
    }
}
