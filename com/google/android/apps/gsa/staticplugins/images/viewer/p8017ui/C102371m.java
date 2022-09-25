package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.m */
/* compiled from: PG */
final class C102371m extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C102372n f285670a;

    public C102371m(C102372n nVar) {
        this.f285670a = nVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f285670a.f285673c.forceFinished(true);
        C102372n nVar = this.f285670a;
        nVar.f285674d = 0;
        nVar.f285675e = 0;
    }
}
