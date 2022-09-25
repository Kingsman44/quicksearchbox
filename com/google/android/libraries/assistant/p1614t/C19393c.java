package com.google.android.libraries.assistant.p1614t;

import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.t.c */
/* compiled from: PG */
public final class C19393c {
    /* renamed from: a */
    public static final Interpolator m36982a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new IllegalArgumentException("The passed attribute does not exist in context theme");
        } else if (typedValue.type == 3) {
            Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            C69664n.m101060f(loadInterpolator, "fromAttributeOrThrow(con…Value.resourceId)\n      }");
            return loadInterpolator;
        } else {
            int i2 = typedValue.type;
            throw new IllegalArgumentException("Passed attribute is not interpolator, actual type " + i2);
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
