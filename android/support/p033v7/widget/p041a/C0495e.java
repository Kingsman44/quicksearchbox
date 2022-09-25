package android.support.p033v7.widget.p041a;

import android.view.animation.Interpolator;

/* renamed from: android.support.v7.widget.a.e */
/* compiled from: PG */
final class C0495e implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
