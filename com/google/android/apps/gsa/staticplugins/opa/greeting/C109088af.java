package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.af */
/* compiled from: PG */
public final class C109088af extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f303717a;

    public C109088af(View view) {
        this.f303717a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f303717a.setTranslationY(0.0f);
    }
}
