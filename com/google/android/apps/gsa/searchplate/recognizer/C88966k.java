package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.k */
/* compiled from: PG */
final class C88966k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88970o f241083a;

    public C88966k(C88970o oVar) {
        this.f241083a = oVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C88970o oVar = this.f241083a;
        oVar.f241090c.setTranslationY(floatValue * oVar.f241089b);
    }
}
