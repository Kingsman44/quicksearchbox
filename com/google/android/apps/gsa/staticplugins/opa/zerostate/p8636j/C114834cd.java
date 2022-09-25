package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cd */
/* compiled from: PG */
final class C114834cd extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LinearLayout f318607a;

    /* renamed from: b */
    final /* synthetic */ View f318608b;

    public C114834cd(LinearLayout linearLayout, View view) {
        this.f318607a = linearLayout;
        this.f318608b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f318607a.removeView(this.f318608b);
    }
}
