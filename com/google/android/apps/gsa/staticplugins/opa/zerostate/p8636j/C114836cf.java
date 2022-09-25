package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cf */
/* compiled from: PG */
final class C114836cf extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f318610a;

    /* renamed from: b */
    final /* synthetic */ C114839ci f318611b;

    public C114836cf(C114839ci ciVar, View view) {
        this.f318611b = ciVar;
        this.f318610a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        ((ViewGroup) this.f318610a).removeViewAt(1);
        this.f318610a.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator) {
        ((ViewGroup) this.f318610a).addView(new LinearLayout(this.f318611b.f318615b), 1, new ViewGroup.LayoutParams(this.f318610a.getMeasuredWidth(), this.f318610a.getMeasuredHeight()));
        ((ViewGroup) this.f318610a).getChildAt(0).setVisibility(8);
    }
}
