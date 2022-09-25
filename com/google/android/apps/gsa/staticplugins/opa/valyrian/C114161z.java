package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.z */
/* compiled from: PG */
class C114161z extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f316477a;

    /* renamed from: b */
    private final C113926aa f316478b;

    /* renamed from: c */
    private final boolean f316479c;

    public C114161z(View view, C113926aa aaVar, boolean z) {
        this.f316477a = view;
        this.f316478b = aaVar;
        this.f316479c = z;
    }

    public final void onAnimationCancel(Animator animator) {
        C114034q.m188816l(this.f316477a);
    }

    public void onAnimationEnd(Animator animator) {
        this.f316477a.setVisibility(true != this.f316479c ? 4 : 8);
        if (!this.f316478b.mo100800x()) {
            this.f316478b.mo100786j(true);
        }
    }
}
