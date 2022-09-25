package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.b */
/* compiled from: PG */
public final /* synthetic */ class C44939b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C44945h f117397a;

    public /* synthetic */ C44939b(C44945h hVar) {
        this.f117397a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C44945h hVar = this.f117397a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hVar.f117465h.setScaleX(floatValue);
        hVar.f117465h.setScaleY(floatValue);
    }
}
