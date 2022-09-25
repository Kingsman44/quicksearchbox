package com.android.launcher3;

import android.animation.TimeInterpolator;

/* compiled from: PG */
final class InverseZInterpolator implements TimeInterpolator {
    private final ZInterpolator zInterpolator = new ZInterpolator();

    public final float getInterpolation(float f) {
        return 1.0f - this.zInterpolator.getInterpolation(1.0f - f);
    }
}
