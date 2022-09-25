package com.google.android.material.card;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.card.a */
/* compiled from: PG */
public final /* synthetic */ class C44583a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C44585c f116034a;

    public /* synthetic */ C44583a(C44585c cVar) {
        this.f116034a = cVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C44585c cVar = this.f116034a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.f116045j.setAlpha((int) (255.0f * floatValue));
        cVar.f116055t = floatValue;
    }
}
