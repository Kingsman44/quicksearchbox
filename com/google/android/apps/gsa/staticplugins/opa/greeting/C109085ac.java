package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d.C114034q;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ac */
/* compiled from: PG */
final class C109085ac extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f303714a;

    public C109085ac(View view) {
        this.f303714a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        C114034q.m188816l(this.f303714a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f303714a.setVisibility(8);
        C114034q.m188816l(this.f303714a);
    }
}
