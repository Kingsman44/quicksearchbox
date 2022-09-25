package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cl */
/* compiled from: PG */
final class C108495cl extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ String f301886a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f301887b;

    public C108495cl(C109040fj fjVar, String str) {
        this.f301887b = fjVar;
        this.f301886a = str;
    }

    public final void onAnimationStart(Animator animator) {
        this.f301887b.f303230P.setVisibility(8);
        this.f301887b.mo97477am(this.f301886a);
        this.f301887b.f303225K.mo95259k(0);
    }
}
