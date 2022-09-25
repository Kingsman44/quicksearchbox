package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.aq */
/* compiled from: PG */
final class C109921aq extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AnimatorSet f306277a;

    public C109921aq(AnimatorSet animatorSet) {
        this.f306277a = animatorSet;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f306277a.removeAllListeners();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f306277a.start();
    }
}
