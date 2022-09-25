package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.navigation.c */
/* compiled from: PG */
final class C44816c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ float f116890a;

    /* renamed from: b */
    final /* synthetic */ C44819f f116891b;

    public C44816c(C44819f fVar, float f) {
        this.f116891b = fVar;
        this.f116890a = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f116891b.mo48210l(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f116890a);
    }
}
