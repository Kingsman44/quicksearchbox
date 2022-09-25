package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bx */
/* compiled from: PG */
final class C114827bx extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f318600a;

    public C114827bx(View view) {
        this.f318600a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f318600a.getLayoutParams() != null) {
            this.f318600a.getLayoutParams().height = -2;
            this.f318600a.requestLayout();
        }
        this.f318600a.setVisibility(0);
    }

    public final void onAnimationStart(Animator animator) {
        this.f318600a.setVisibility(4);
    }
}
