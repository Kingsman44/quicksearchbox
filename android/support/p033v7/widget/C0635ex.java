package android.support.p033v7.widget;

import android.view.animation.Interpolator;

/* renamed from: android.support.v7.widget.ex */
/* compiled from: PG */
final class C0635ex implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
