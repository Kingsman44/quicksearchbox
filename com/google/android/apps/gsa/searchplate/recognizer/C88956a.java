package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.a */
/* compiled from: PG */
final class C88956a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88961f f241046a;

    public C88956a(C88961f fVar) {
        this.f241046a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241046a.f241059g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
