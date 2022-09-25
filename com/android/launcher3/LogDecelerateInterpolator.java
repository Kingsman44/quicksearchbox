package com.android.launcher3;

import android.animation.TimeInterpolator;

/* compiled from: PG */
public final class LogDecelerateInterpolator implements TimeInterpolator {
    final float mLogScale = (1.0f / computeLog$ar$ds$bdc92b5f_0(1.0f));

    static float computeLog$ar$ds$bdc92b5f_0(float f) {
        return ((float) (-Math.pow(100.0d, (double) (-f)))) + 1.0f + (f * 0.0f);
    }

    public final float getInterpolation(float f) {
        if (Float.compare(f, 1.0f) == 0) {
            return 1.0f;
        }
        return computeLog$ar$ds$bdc92b5f_0(f) * this.mLogScale;
    }
}
