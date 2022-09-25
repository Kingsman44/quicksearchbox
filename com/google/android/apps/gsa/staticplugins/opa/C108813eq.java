package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.eq */
/* compiled from: PG */
final class C108813eq extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f302560a;

    /* renamed from: b */
    final /* synthetic */ boolean f302561b;

    /* renamed from: c */
    final /* synthetic */ C109040fj f302562c;

    public C108813eq(C109040fj fjVar, View view, boolean z) {
        this.f302562c = fjVar;
        this.f302560a = view;
        this.f302561b = z;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f302560a.setTranslationY(0.0f);
        this.f302560a.setAlpha(1.0f);
        this.f302562c.mo97450aL(false);
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f302561b) {
            this.f302562c.f303262aV.mo95226h();
        }
        this.f302562c.f303376ch.mo83137k(false);
        this.f302562c.mo97512bd(false);
    }

    public final void onAnimationStart(Animator animator) {
        this.f302562c.mo97450aL(true);
    }
}
