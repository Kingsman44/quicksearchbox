package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.as */
/* compiled from: PG */
final class C109923as extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f306279a;

    public C109923as(ValueAnimator valueAnimator) {
        this.f306279a = valueAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f306279a.removeAllListeners();
        this.f306279a.removeAllUpdateListeners();
    }
}
