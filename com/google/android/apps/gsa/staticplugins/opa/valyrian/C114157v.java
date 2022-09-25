package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.v */
/* compiled from: PG */
final class C114157v extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f316470a;

    public C114157v(View view) {
        this.f316470a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f316470a.setTranslationY(0.0f);
    }
}
