package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cm */
/* compiled from: PG */
final class C114003cm extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315646a;

    public C114003cm(C114071eg egVar) {
        this.f315646a = egVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f315646a.mo101013cB();
        animator.removeListener(this);
    }
}
