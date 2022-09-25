package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.db */
/* compiled from: PG */
final class C114036db extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f315718a;

    public C114036db(View view) {
        this.f315718a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.f315718a;
        view.setTranslationY((float) (-view.getHeight()));
        this.f315718a.setAlpha(0.0f);
        this.f315718a.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator) {
        this.f315718a.setVisibility(0);
    }
}
