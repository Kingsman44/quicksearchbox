package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dk */
/* compiled from: PG */
final class C114045dk extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315726a;

    public C114045dk(C114071eg egVar) {
        this.f315726a = egVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C114071eg egVar = this.f315726a;
        egVar.f315980p = egVar.mo100995aY().getMinimumHeight();
        this.f315726a.mo100995aY().setMinimumHeight(0);
        this.f315726a.mo100995aY().getLayoutParams().height = -2;
        this.f315726a.mo100995aY().requestLayout();
    }
}
