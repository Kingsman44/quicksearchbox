package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.as */
/* compiled from: PG */
final class C114114as extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114116au f316295a;

    /* renamed from: b */
    private final C0673gh f316296b;

    public C114114as(C114116au auVar, C0673gh ghVar) {
        this.f316295a = auVar;
        this.f316296b = ghVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C114116au.m189284b(this.f316296b, "MoveItemAnimationListener.onAnimationEnd");
        this.f316296b.itemView.setTranslationY(0.0f);
        this.f316295a.mo2889m(this.f316296b);
        synchronized (this.f316295a) {
            this.f316295a.f316464a.remove(this.f316296b);
        }
        this.f316295a.mo101203a();
        this.f316296b.itemView.sendAccessibilityEvent(32768);
    }

    public final void onAnimationStart(Animator animator) {
        C114116au.m189284b(this.f316296b, "MoveItemAnimationListener.onAnimationStart");
    }
}
