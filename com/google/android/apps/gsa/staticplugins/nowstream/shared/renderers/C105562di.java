package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.di */
/* compiled from: PG */
final class C105562di implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C105574du f294493a;

    public C105562di(C105574du duVar) {
        this.f294493a = duVar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        ((C105499b) this.f294493a.f294521j).f294310i.sendAccessibilityEvent(8);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
