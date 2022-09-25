package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dj */
/* compiled from: PG */
final class C114044dj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f315724a;

    /* renamed from: b */
    final /* synthetic */ AnimatorListenerAdapter f315725b;

    public C114044dj(View view, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f315724a = view;
        this.f315725b = animatorListenerAdapter;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f315724a.getAlpha() == 0.0f) {
            this.f315724a.setVisibility(8);
            this.f315725b.onAnimationEnd(animator);
        }
    }
}
