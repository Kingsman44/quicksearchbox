package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cm */
/* compiled from: PG */
final class C108496cm extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ String f301888a;

    /* renamed from: b */
    final /* synthetic */ List f301889b;

    /* renamed from: c */
    final /* synthetic */ C109040fj f301890c;

    public C108496cm(C109040fj fjVar, String str, List list) {
        this.f301890c = fjVar;
        this.f301888a = str;
        this.f301889b = list;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f301890c.mo97476al(this.f301889b);
    }

    public final void onAnimationStart(Animator animator) {
        this.f301890c.mo97477am(this.f301888a);
    }
}
