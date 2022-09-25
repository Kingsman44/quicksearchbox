package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.j */
/* compiled from: PG */
final class C88965j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88970o f241082a;

    public C88965j(C88970o oVar) {
        this.f241082a = oVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241082a.f241102o = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C88970o oVar = this.f241082a;
        oVar.f241092e.setColorFilter(oVar.f241102o, PorterDuff.Mode.MULTIPLY);
    }
}
