package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.d */
/* compiled from: PG */
final class C10760d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ SimpleSnackbar f35722a;

    public C10760d(SimpleSnackbar simpleSnackbar) {
        this.f35722a = simpleSnackbar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35722a.onViewShown();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
