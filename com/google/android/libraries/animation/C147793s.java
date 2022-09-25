package com.google.android.libraries.animation;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.libraries.animation.s */
/* compiled from: PG */
public final /* synthetic */ class C147793s implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ float f398759a;

    /* renamed from: b */
    public final /* synthetic */ float f398760b;

    public /* synthetic */ C147793s(float f, float f2) {
        this.f398759a = f;
        this.f398760b = f2;
    }

    public final float getInterpolation(float f) {
        float f2 = this.f398759a;
        float f3 = this.f398760b;
        if (f <= f2) {
            return 0.0f;
        }
        if (f >= f3) {
            return 1.0f;
        }
        return (f - f2) / (f3 - f2);
    }
}
