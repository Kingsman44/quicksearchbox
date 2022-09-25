package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dc */
/* compiled from: PG */
final class C114037dc extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f315719a;

    public C114037dc(View view) {
        this.f315719a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f315719a.setTranslationY(0.0f);
        this.f315719a.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f315719a.setVisibility(8);
    }
}
