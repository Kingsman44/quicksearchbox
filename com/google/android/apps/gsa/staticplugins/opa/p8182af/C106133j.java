package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.j */
/* compiled from: PG */
final class C106133j extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C106145v f296180a;

    public C106133j(C106145v vVar) {
        this.f296180a = vVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f296180a.f296198a.setVisibility(4);
        this.f296180a.f296199b.getLayoutParams().height = -2;
    }

    public final void onAnimationStart(Animator animator) {
        this.f296180a.f296199b.setVisibility(0);
    }
}
