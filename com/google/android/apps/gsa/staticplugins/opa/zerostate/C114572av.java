package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.av */
/* compiled from: PG */
final class C114572av extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114575ay f317708a;

    public C114572av(C114575ay ayVar) {
        this.f317708a = ayVar;
    }

    public final void onAnimationStart(Animator animator) {
        C114575ay ayVar = this.f317708a;
        if (!ayVar.f317761u) {
            ayVar.f317761u = true;
            ayVar.f317763w = ayVar.f317748h.mo26870b();
        }
    }
}
