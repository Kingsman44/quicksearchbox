package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cs */
/* compiled from: PG */
final class C108512cs extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C109040fj f301921a;

    public C108512cs(C109040fj fjVar) {
        this.f301921a = fjVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f301921a.f303279am.start();
    }
}
