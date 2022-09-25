package androidx.customview.p103b;

import android.view.animation.Interpolator;

/* renamed from: androidx.customview.b.e */
/* compiled from: PG */
final class C2147e implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
