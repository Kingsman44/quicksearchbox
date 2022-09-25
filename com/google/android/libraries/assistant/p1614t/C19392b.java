package com.google.android.libraries.assistant.p1614t;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: com.google.android.libraries.assistant.t.b */
/* compiled from: PG */
public final class C19392b {
    /* renamed from: a */
    public static final int m36981a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new IllegalArgumentException("The passed attribute does not exist in context theme");
        } else if (typedValue.type == 16) {
            return typedValue.data;
        } else {
            int i2 = typedValue.type;
            throw new IllegalArgumentException("Passed attribute is not decimal integer, actual type " + i2);
        }
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
