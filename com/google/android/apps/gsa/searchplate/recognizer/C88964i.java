package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.i */
/* compiled from: PG */
final class C88964i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88970o f241081a;

    public C88964i(C88970o oVar) {
        this.f241081a = oVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241081a.f241100m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C88970o oVar = this.f241081a;
        oVar.f241091d.setColorFilter(oVar.f241100m, PorterDuff.Mode.MULTIPLY);
    }
}
