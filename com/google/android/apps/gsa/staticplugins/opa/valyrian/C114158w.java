package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.w */
/* compiled from: PG */
final class C114158w extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f316471a;

    /* renamed from: b */
    final /* synthetic */ C113926aa f316472b;

    public C114158w(C113926aa aaVar, View view) {
        this.f316472b = aaVar;
        this.f316471a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f316471a.setVisibility(8);
        C114034q.m188816l(this.f316471a);
    }

    public final void onAnimationEnd(Animator animator) {
        C113936ak akVar = this.f316472b.f315487A;
        this.f316471a.isShown();
        akVar.f315557a.mo95365G();
    }

    public final void onAnimationStart(Animator animator) {
        this.f316471a.setVisibility(0);
    }
}
