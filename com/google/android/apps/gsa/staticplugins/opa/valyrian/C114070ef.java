package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ef */
/* compiled from: PG */
final class C114070ef extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315779a;

    /* renamed from: b */
    private final int f315780b;

    public C114070ef(C114071eg egVar, int i) {
        this.f315779a = egVar;
        this.f315780b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        int i = this.f315780b;
        C114071eg egVar = this.f315779a;
        if (i != egVar.f315825aI) {
            ViewGroup aY = egVar.mo100995aY();
            C114071eg egVar2 = this.f315779a;
            int i2 = egVar2.f315825aI;
            egVar.f315826aJ = egVar.mo100992aR(aY, i2, new C114070ef(egVar2, i2));
        }
    }
}
