package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cu */
/* compiled from: PG */
final class C114011cu extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315655a;

    public C114011cu(C114071eg egVar) {
        this.f315655a = egVar;
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.f315655a.f315793C;
        view.getClass();
        view.setVisibility(0);
    }
}
