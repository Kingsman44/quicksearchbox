package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dg */
/* compiled from: PG */
final class C114041dg extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f315722a;

    public C114041dg(View view) {
        this.f315722a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f315722a.setTranslationY(0.0f);
        this.f315722a.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f315722a.setVisibility(4);
    }
}
