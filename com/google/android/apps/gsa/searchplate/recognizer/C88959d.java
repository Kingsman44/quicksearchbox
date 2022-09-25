package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.d */
/* compiled from: PG */
final class C88959d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88961f f241049a;

    public C88959d(C88961f fVar) {
        this.f241049a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241049a.f241066n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
