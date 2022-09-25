package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.r */
/* compiled from: PG */
final class C107575r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f299293a;

    public C107575r(View view) {
        this.f299293a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f299293a.getLayoutParams().height = -2;
        View view = this.f299293a;
        view.setLayoutParams(view.getLayoutParams());
        super.onAnimationEnd(animator);
    }
}
