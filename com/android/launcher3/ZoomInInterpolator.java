package com.android.launcher3;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: PG */
final class ZoomInInterpolator implements TimeInterpolator {
    private final DecelerateInterpolator decelerate = new DecelerateInterpolator(3.0f);
    private final InverseZInterpolator inverseZInterpolator = new InverseZInterpolator();

    public final float getInterpolation(float f) {
        return this.decelerate.getInterpolation(this.inverseZInterpolator.getInterpolation(f));
    }
}
