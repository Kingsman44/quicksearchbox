package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.ca */
/* compiled from: PG */
final class C114831ca extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f318603a;

    /* renamed from: b */
    final /* synthetic */ View f318604b;

    public C114831ca(View view, View view2) {
        this.f318603a = view;
        this.f318604b = view2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f318603a.setVisibility(8);
        this.f318604b.setVisibility(0);
    }
}
