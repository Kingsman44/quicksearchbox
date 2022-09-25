package com.google.android.apps.gsa.shared.util.p7187ui;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.r */
/* compiled from: PG */
public final class C91119r implements Interpolator {

    /* renamed from: a */
    public static final C91119r f254433a = new C91119r();

    private C91119r() {
    }

    public final float getInterpolation(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) Math.sin(d * 6.283185307179586d);
    }
}
