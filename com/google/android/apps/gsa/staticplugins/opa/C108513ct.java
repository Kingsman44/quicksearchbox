package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ct */
/* compiled from: PG */
final class C108513ct extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C109040fj f301922a;

    public C108513ct(C109040fj fjVar) {
        this.f301922a = fjVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f301922a.f303225K.mo95259k(8);
        this.f301922a.f303230P.setVisibility(0);
        C109040fj fjVar = this.f301922a;
        fjVar.f303232R.f301323c = true;
        fjVar.f303343bx = false;
    }
}
