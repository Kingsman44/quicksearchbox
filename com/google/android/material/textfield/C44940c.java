package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: PG */
public final /* synthetic */ class C44940c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C44945h f117398a;

    public /* synthetic */ C44940c(C44945h hVar) {
        this.f117398a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C44945h hVar = this.f117398a;
        hVar.f117465h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
