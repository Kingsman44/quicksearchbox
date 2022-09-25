package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ab */
/* compiled from: PG */
final class C109084ab extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f303713a;

    public C109084ab(View view) {
        this.f303713a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f303713a.setVisibility(8);
        C114034q.m188816l(this.f303713a);
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f303713a.setVisibility(0);
    }
}
