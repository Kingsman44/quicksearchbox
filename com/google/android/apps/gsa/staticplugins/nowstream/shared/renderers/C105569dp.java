package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dp */
/* compiled from: PG */
final class C105569dp implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C105574du f294500a;

    public C105569dp(C105574du duVar) {
        this.f294500a = duVar;
    }

    public final void onAnimationCancel(Animator animator) {
        ((C105499b) this.f294500a.f294521j).f294313l.setVisibility(8);
    }

    public final void onAnimationEnd(Animator animator) {
        ((C105499b) this.f294500a.f294521j).f294313l.setVisibility(8);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        ((C105499b) this.f294500a.f294521j).f294313l.setVisibility(0);
    }
}
