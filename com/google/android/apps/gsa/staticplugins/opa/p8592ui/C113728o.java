package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.o */
/* compiled from: PG */
final class C113728o extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AnimatorSet f314960a;

    public C113728o(AnimatorSet animatorSet) {
        this.f314960a = animatorSet;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f314960a.removeAllListeners();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f314960a.start();
    }
}
