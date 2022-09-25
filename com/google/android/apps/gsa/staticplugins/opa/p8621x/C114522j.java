package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.animation.Animator;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.j */
/* compiled from: PG */
final class C114522j implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ TextView f317590a;

    /* renamed from: b */
    final /* synthetic */ C114524l f317591b;

    public C114522j(C114524l lVar, TextView textView) {
        this.f317591b = lVar;
        this.f317590a = textView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f317590a.setText(this.f317591b.f317597e);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
