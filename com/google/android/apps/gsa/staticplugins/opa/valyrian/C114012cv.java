package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cv */
/* compiled from: PG */
final class C114012cv extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315656a;

    public C114012cv(C114071eg egVar) {
        this.f315656a = egVar;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.f315656a.f315793C;
        view.getClass();
        view.setVisibility(8);
    }
}
