package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bj */
/* compiled from: PG */
final class C113555bj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C113558bm f314368a;

    public C113555bj(C113558bm bmVar) {
        this.f314368a = bmVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f314368a.f314414d.setVisibility(8);
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f314368a.f314414d.getAlpha() == 0.0f) {
            this.f314368a.f314414d.setVisibility(8);
        }
    }
}
