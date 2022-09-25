package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.n */
/* compiled from: PG */
public final /* synthetic */ class C44951n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C44956s f117416a;

    public /* synthetic */ C44951n(C44956s sVar) {
        this.f117416a = sVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C44956s sVar = this.f117416a;
        sVar.f117465h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
