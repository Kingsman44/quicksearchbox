package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.l */
/* compiled from: PG */
final class C88967l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88970o f241084a;

    public C88967l(C88970o oVar) {
        this.f241084a = oVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241084a.f241089b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
