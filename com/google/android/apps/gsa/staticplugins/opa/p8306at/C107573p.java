package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.p */
/* compiled from: PG */
final class C107573p extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f299291a;

    public C107573p(View view) {
        this.f299291a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f299291a.setVisibility(8);
        super.onAnimationEnd(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f299291a.setVisibility(0);
        this.f299291a.setAlpha(1.0f);
        super.onAnimationStart(animator);
    }
}
