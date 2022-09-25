package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.r */
/* compiled from: PG */
final class C88973r implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ RecognizerView f241110a;

    public C88973r(RecognizerView recognizerView) {
        this.f241110a = recognizerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241110a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
