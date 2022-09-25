package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bw */
/* compiled from: PG */
final class C114826bw extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f318598a;

    /* renamed from: b */
    final /* synthetic */ C114839ci f318599b;

    public C114826bw(C114839ci ciVar, View view) {
        this.f318599b = ciVar;
        this.f318598a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        ((ViewGroup) this.f318598a).removeViewAt(1);
        ((ViewGroup) this.f318598a).getChildAt(0).setVisibility(0);
        this.f318598a.setVisibility(0);
    }

    public final void onAnimationStart(Animator animator) {
        this.f318598a.setVisibility(4);
        ((ViewGroup) this.f318598a).addView(new LinearLayout(this.f318599b.f318615b), 1, new ViewGroup.LayoutParams(this.f318598a.getMeasuredWidth(), 0));
    }
}
