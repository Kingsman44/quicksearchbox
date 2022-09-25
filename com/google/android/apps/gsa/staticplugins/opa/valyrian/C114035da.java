package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.da */
/* compiled from: PG */
final class C114035da extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315717a;

    public C114035da(C114071eg egVar) {
        this.f315717a = egVar;
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f315717a.f315791A;
        textView.getClass();
        textView.setVisibility(0);
    }
}
