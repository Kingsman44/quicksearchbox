package androidx.viewpager.widget;

import android.view.animation.Interpolator;

/* renamed from: androidx.viewpager.widget.c */
/* compiled from: PG */
final class C4270c implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
