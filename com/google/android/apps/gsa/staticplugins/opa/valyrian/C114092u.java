package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.u */
/* compiled from: PG */
final class C114092u extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f316099a;

    public C114092u(View view) {
        this.f316099a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f316099a.setTranslationY(0.0f);
    }
}
