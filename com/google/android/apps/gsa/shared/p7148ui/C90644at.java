package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.at */
/* compiled from: PG */
final class C90644at extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f253496a;

    /* renamed from: b */
    final /* synthetic */ boolean f253497b;

    /* renamed from: c */
    final /* synthetic */ C90649ay f253498c;

    public C90644at(C90649ay ayVar, View view, boolean z) {
        this.f253498c = ayVar;
        this.f253496a = view;
        this.f253497b = z;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f253498c.f253509a.mo84930c(this.f253496a);
        if (this.f253498c.f253512d && this.f253497b) {
            this.f253496a.setAlpha(1.0f);
        }
    }
}
