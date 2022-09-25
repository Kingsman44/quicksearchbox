package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cy */
/* compiled from: PG */
final class C114015cy extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315659a;

    public C114015cy(C114071eg egVar) {
        this.f315659a = egVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f315659a.f315985u.getViewTreeObserver().addOnPreDrawListener(new C114014cx(this));
    }
}
