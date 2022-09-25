package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.x */
/* compiled from: PG */
final class C114159x extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f316473a;

    /* renamed from: b */
    final /* synthetic */ C113926aa f316474b;

    public C114159x(C113926aa aaVar, View view) {
        this.f316474b = aaVar;
        this.f316473a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        C114034q.m188816l(this.f316473a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f316473a.setVisibility(8);
        C114034q.m188816l(this.f316473a);
        C113936ak akVar = this.f316474b.f315487A;
        this.f316473a.isShown();
        akVar.f315557a.mo95365G();
    }
}
