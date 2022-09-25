package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ds */
/* compiled from: PG */
final class C105572ds implements Interpolator {

    /* renamed from: a */
    private final double f294503a;

    /* renamed from: b */
    private final double f294504b;

    public C105572ds(float f, float f2) {
        this.f294503a = (Math.sqrt((double) f) * 3.141592653589793d) / 2.0d;
        double d = (double) (-f2);
        Double.isNaN(d);
        this.f294504b = (d * 2.15d) / 2.0d;
    }

    public final float getInterpolation(float f) {
        double d = (double) f;
        double d2 = this.f294504b;
        Double.isNaN(d);
        double exp = Math.exp(d2 * d);
        double d3 = this.f294503a;
        Double.isNaN(d);
        return (float) ((exp * (-Math.cos(d3 * d))) + 1.0d);
    }
}
