package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dr */
/* compiled from: PG */
final class C105571dr implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ View f294502a;

    public C105571dr(View view) {
        this.f294502a = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f294502a.setVisibility(0);
    }
}
