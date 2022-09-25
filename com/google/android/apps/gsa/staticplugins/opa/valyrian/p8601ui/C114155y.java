package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.y */
/* compiled from: PG */
final class C114155y extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114156z f316468a;

    public C114155y(C114156z zVar) {
        this.f316468a = zVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.f316468a.f316469a.f316181c) {
            animator.start();
        }
    }
}
