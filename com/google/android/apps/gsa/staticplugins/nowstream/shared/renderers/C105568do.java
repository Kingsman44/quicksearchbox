package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.do */
/* compiled from: PG */
final class C105568do implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ View f294499a;

    public C105568do(View view) {
        this.f294499a = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f294499a.setVisibility(0);
    }
}
