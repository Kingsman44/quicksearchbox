package com.google.android.libraries.material.featurehighlight;

import android.view.animation.Interpolator;
import com.google.android.libraries.material.p2207c.C28508a;

/* renamed from: com.google.android.libraries.material.featurehighlight.n */
/* compiled from: PG */
public final /* synthetic */ class C28532n implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ Interpolator f77561a;

    /* renamed from: b */
    public final /* synthetic */ float f77562b;

    /* renamed from: c */
    public final /* synthetic */ float f77563c;

    /* renamed from: d */
    public final /* synthetic */ float f77564d;

    public /* synthetic */ C28532n(Interpolator interpolator, float f, float f2, float f3) {
        this.f77561a = interpolator;
        this.f77562b = f;
        this.f77563c = f2;
        this.f77564d = f3;
    }

    public final float getInterpolation(float f) {
        Interpolator interpolator = this.f77561a;
        float f2 = this.f77562b;
        float f3 = this.f77563c;
        float f4 = this.f77564d;
        int i = C28512ac.f77390I;
        float interpolation = interpolator.getInterpolation(f);
        return C28508a.m53286b((((((1.0f - interpolation) * f2) + interpolation) * f3) - f4) / (f3 - f4));
    }
}
