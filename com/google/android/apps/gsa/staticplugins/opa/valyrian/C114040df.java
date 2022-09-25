package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.df */
/* compiled from: PG */
final class C114040df extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f315721a;

    public C114040df(View view) {
        this.f315721a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.f315721a;
        view.setTranslationY((float) (-view.getHeight()));
        this.f315721a.setAlpha(0.0f);
        this.f315721a.setVisibility(4);
    }

    public final void onAnimationStart(Animator animator) {
        this.f315721a.setVisibility(0);
    }
}
