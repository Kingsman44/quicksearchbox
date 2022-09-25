package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.j */
/* compiled from: PG */
final class C102484j extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f286035a;

    public C102484j(View view) {
        this.f286035a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f286035a.getAlpha() < 0.05f) {
            this.f286035a.setVisibility(4);
        }
    }
}
