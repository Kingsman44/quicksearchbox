package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cj */
/* compiled from: PG */
final class C108493cj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ List f301882a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f301883b;

    public C108493cj(C109040fj fjVar, List list) {
        this.f301883b = fjVar;
        this.f301882a = list;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f301883b.mo97476al(this.f301882a);
    }

    public final void onAnimationStart(Animator animator) {
        this.f301883b.f303225K.mo95259k(0);
    }
}
