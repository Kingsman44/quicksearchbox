package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ap */
/* compiled from: PG */
final class C109098ap extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f303731a;

    public C109098ap(View view) {
        this.f303731a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f303731a.setVisibility(8);
        C114034q.m188816l(this.f303731a);
    }

    public final void onAnimationStart(Animator animator) {
        this.f303731a.setVisibility(0);
    }
}
