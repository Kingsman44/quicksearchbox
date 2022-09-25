package com.google.android.apps.gsa.shared.p7148ui;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.apps.gsa.shared.ui.af */
/* compiled from: PG */
final class C90630af implements Interpolator {

    /* renamed from: a */
    private final float f253431a = (1.0f / m147937a(1.0f, 1.0f));

    /* renamed from: a */
    private static float m147937a(float f, float f2) {
        float f3;
        float f4 = f * 8.0f;
        if (f4 < 1.0f) {
            f3 = f4 - (1.0f - ((float) Math.exp((double) (-f4))));
        } else {
            f3 = 0.36787945f + ((1.0f - ((float) Math.exp((double) (1.0f - f4)))) * 0.63212055f);
        }
        return f3 * f2;
    }

    public final float getInterpolation(float f) {
        return m147937a(f, this.f253431a);
    }
}
