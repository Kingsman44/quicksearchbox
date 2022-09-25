package com.google.android.apps.gsa.staticplugins.p7391an.p7397e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.m */
/* compiled from: PG */
final class C94014m extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f262590a;

    /* renamed from: b */
    final /* synthetic */ C94015n f262591b;

    public C94014m(C94015n nVar, View view) {
        this.f262591b = nVar;
        this.f262590a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f262591b.f262592a.post(new C94013l(this));
    }
}
