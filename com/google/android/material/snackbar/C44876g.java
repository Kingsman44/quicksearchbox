package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.g */
/* compiled from: PG */
final class C44876g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117124a;

    public C44876g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117124a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        String str = BaseTransientBottomBar.f117074b;
        this.f117124a.f117089j.setTranslationY((float) intValue);
    }
}
