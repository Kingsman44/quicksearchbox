package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.ap */
/* compiled from: PG */
final class C44935ap implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f117395a;

    public C44935ap(TextInputLayout textInputLayout) {
        this.f117395a = textInputLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f117395a.f117323q.mo48071p(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
