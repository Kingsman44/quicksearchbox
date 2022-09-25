package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ag */
/* compiled from: PG */
public final class C109089ag extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f303718a;

    public C109089ag(View view) {
        this.f303718a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f303718a.setTranslationY(0.0f);
    }
}
