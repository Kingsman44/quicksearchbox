package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.b */
/* compiled from: PG */
final class C88957b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88961f f241047a;

    public C88957b(C88961f fVar) {
        this.f241047a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241047a.f241067o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
