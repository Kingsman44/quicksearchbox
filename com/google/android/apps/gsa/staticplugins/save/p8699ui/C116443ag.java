package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.ag */
/* compiled from: PG */
final class C116443ag extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f322879a;

    /* renamed from: b */
    final /* synthetic */ C116444ah f322880b;

    public C116443ag(C116444ah ahVar, boolean z) {
        this.f322880b = ahVar;
        this.f322879a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f322879a) {
            this.f322880b.f322881a.mo102715g();
        }
    }
}
