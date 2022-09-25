package com.google.android.apps.gsa.staticplugins.opa.imageviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.imageviewer.f */
/* compiled from: PG */
final class C109284f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C109285g f304424a;

    public C109284f(C109285g gVar) {
        this.f304424a = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f304424a.f304430f.setVisibility(8);
        this.f304424a.f304430f.setAlpha(1.0f);
        this.f304424a.f304426b.mo95376R(true);
    }
}
