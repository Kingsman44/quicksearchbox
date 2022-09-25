package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.eo */
/* compiled from: PG */
final class C108811eo extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f302557a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f302558b;

    public C108811eo(C109040fj fjVar, View view) {
        this.f302558b = fjVar;
        this.f302557a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.f302557a;
        view.setTranslationY((float) (-view.getHeight()));
        this.f302557a.setAlpha(0.0f);
        this.f302557a.setVisibility(8);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f302558b.mo97450aL(false);
    }
}
