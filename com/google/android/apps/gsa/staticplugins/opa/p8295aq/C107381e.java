package com.google.android.apps.gsa.staticplugins.opa.p8295aq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aq.e */
/* compiled from: PG */
public final class C107381e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C107383g f298858a;

    public C107381e(C107383g gVar) {
        this.f298858a = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f298858a.f298866c.setVisibility(8);
        this.f298858a.f298866c.setAlpha(1.0f);
        this.f298858a.f298871h.mo5708l(C107382f.DISMISSED);
        this.f298858a.f298865b.mo95376R(true);
    }
}
