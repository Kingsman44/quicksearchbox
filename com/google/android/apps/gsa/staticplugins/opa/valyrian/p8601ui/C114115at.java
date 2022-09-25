package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.at */
/* compiled from: PG */
final class C114115at extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114116au f316297a;

    /* renamed from: b */
    private final C108241bl f316298b;

    public C114115at(C114116au auVar, C108241bl blVar) {
        this.f316297a = auVar;
        this.f316298b = blVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C114116au.m189284b(this.f316298b, "RemoveItemAnimationListener.onAnimationEnd");
        this.f316297a.mo2889m(this.f316298b);
        synchronized (this.f316297a) {
            this.f316297a.f316464a.remove(this.f316298b);
        }
        this.f316297a.mo101203a();
        this.f316298b.itemView.sendAccessibilityEvent(32768);
    }

    public final void onAnimationStart(Animator animator) {
        C114116au.m189284b(this.f316298b, "RemoveItemAnimationListener.onAnimationStart");
    }
}
