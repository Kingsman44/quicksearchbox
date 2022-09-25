package com.google.android.libraries.assistant.p1614t;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: com.google.android.libraries.assistant.t.a */
/* compiled from: PG */
public final class C19391a {
    /* renamed from: a */
    public static int m36980a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new IllegalArgumentException("The passed attribute does not exist in context theme");
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            return typedValue.data;
        } else {
            int i2 = typedValue.type;
            throw new IllegalArgumentException("Passed attribute is not a color, actual type " + i2);
        }
    }
}
