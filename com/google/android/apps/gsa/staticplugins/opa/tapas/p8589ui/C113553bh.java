package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bh */
/* compiled from: PG */
final class C113553bh extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C113558bm f314366a;

    public C113553bh(C113558bm bmVar) {
        this.f314366a = bmVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f314366a.f314414d.getLayoutParams().height = -2;
    }

    public final void onAnimationStart(Animator animator) {
        this.f314366a.mo100277B();
    }
}
