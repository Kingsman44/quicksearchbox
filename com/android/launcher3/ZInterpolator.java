package com.android.launcher3;

import android.animation.TimeInterpolator;

/* compiled from: PG */
final class ZInterpolator implements TimeInterpolator {
    public final float getInterpolation(float f) {
        return (1.0f - (0.35f / (f + 0.35f))) / 0.7407408f;
    }
}
