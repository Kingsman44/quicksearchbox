package com.google.android.apps.gsa.staticplugins.opa.imageviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.imageviewer.e */
/* compiled from: PG */
public final class C109283e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C109285g f304423a;

    public C109283e(C109285g gVar) {
        this.f304423a = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f304423a.f304430f.setVisibility(0);
    }
}
