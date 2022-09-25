package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cz */
/* compiled from: PG */
final class C114016cz extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315660a;

    public C114016cz(C114071eg egVar) {
        this.f315660a = egVar;
    }

    public final void onAnimationEnd(Animator animator) {
        TextView textView = this.f315660a.f315791A;
        textView.getClass();
        textView.setVisibility(8);
        TextView textView2 = this.f315660a.f315791A;
        textView2.getClass();
        textView2.setAlpha(1.0f);
    }
}
