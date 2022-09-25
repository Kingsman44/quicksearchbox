package com.google.android.libraries.material.featurehighlight;

import android.view.animation.Interpolator;
import com.google.android.libraries.material.p2207c.C28508a;

/* renamed from: com.google.android.libraries.material.featurehighlight.x */
/* compiled from: PG */
final class C28542x implements Interpolator {

    /* renamed from: a */
    final /* synthetic */ Interpolator f77576a;

    /* renamed from: b */
    final /* synthetic */ float f77577b;

    /* renamed from: c */
    final /* synthetic */ float f77578c;

    public C28542x(Interpolator interpolator, float f, float f2) {
        this.f77576a = interpolator;
        this.f77577b = f;
        this.f77578c = f2;
    }

    public final float getInterpolation(float f) {
        float interpolation = this.f77576a.getInterpolation(f);
        float f2 = this.f77577b;
        return C28508a.m53286b((interpolation * f2) / (f2 - this.f77578c));
    }
}
