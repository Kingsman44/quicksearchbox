package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.b */
/* compiled from: PG */
final class C44871b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117118a;

    public C44871b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117118a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f117118a.f117089j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
