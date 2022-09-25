package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.animation.Animator;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.a */
/* compiled from: PG */
final class C10713a implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ BottomViewGroup f35636a;

    public C10713a(BottomViewGroup bottomViewGroup) {
        this.f35636a = bottomViewGroup;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f35636a.onUpdatePosition();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35636a.onUpdatePosition();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f35636a.onUpdatePosition();
    }
}
