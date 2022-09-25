package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ar */
/* compiled from: PG */
final class C114113ar extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114116au f316293a;

    /* renamed from: b */
    private final C0673gh f316294b;

    public C114113ar(C114116au auVar, C0673gh ghVar) {
        this.f316293a = auVar;
        this.f316294b = ghVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C114116au.m189284b(this.f316294b, "AddItemAnimationListener.onAnimationEnd");
        this.f316294b.itemView.setAlpha(1.0f);
        this.f316293a.mo2889m(this.f316294b);
        synchronized (this.f316293a) {
            this.f316293a.f316464a.remove(this.f316294b);
        }
        this.f316293a.mo101203a();
        this.f316294b.itemView.sendAccessibilityEvent(32768);
    }

    public final void onAnimationStart(Animator animator) {
        C114116au.m189284b(this.f316294b, "AddItemAnimationListener.onAnimationStart");
    }
}
