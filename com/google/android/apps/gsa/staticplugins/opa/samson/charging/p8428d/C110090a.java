package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.a */
/* compiled from: PG */
final class C110090a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f306729a;

    public C110090a(View view) {
        this.f306729a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f306729a.getAlpha() == 0.0f) {
            this.f306729a.setVisibility(8);
        }
    }
}
