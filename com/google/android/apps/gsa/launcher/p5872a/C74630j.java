package com.google.android.apps.gsa.launcher.p5872a;

import android.animation.TimeInterpolator;

/* renamed from: com.google.android.apps.gsa.launcher.a.j */
/* compiled from: PG */
final class C74630j implements TimeInterpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
