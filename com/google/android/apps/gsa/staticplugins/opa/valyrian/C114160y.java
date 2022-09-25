package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.y */
/* compiled from: PG */
class C114160y extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f316475a;

    /* renamed from: b */
    private final boolean f316476b;

    public C114160y(View view, boolean z) {
        this.f316475a = view;
        this.f316476b = z;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f316475a.setVisibility(true != this.f316476b ? 4 : 8);
        C114034q.m188816l(this.f316475a);
    }

    public final void onAnimationStart(Animator animator) {
        this.f316475a.setVisibility(0);
    }
}
