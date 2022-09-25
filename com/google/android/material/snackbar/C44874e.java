package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.e */
/* compiled from: PG */
final class C44874e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117121a;

    public C44874e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117121a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        String str = BaseTransientBottomBar.f117074b;
        this.f117121a.f117089j.setTranslationY((float) intValue);
    }
}
