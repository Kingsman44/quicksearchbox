package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.c */
/* compiled from: PG */
final class C44872c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117119a;

    public C44872c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117119a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f117119a.f117089j.setScaleX(floatValue);
        this.f117119a.f117089j.setScaleY(floatValue);
    }
}
