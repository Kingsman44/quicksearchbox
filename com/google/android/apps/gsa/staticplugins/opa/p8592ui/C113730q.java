package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.q */
/* compiled from: PG */
final class C113730q extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ValueAnimator f314962a;

    public C113730q(ValueAnimator valueAnimator) {
        this.f314962a = valueAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f314962a.removeAllListeners();
        this.f314962a.removeAllUpdateListeners();
    }
}
