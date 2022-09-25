package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.al */
/* compiled from: PG */
final class C93534al implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TintableImageButton f261173a;

    /* renamed from: b */
    final /* synthetic */ ValueAnimator f261174b;

    public C93534al(TintableImageButton tintableImageButton, ValueAnimator valueAnimator) {
        this.f261173a = tintableImageButton;
        this.f261174b = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f261173a.setColorFilter(((Integer) this.f261174b.getAnimatedValue()).intValue());
    }
}
