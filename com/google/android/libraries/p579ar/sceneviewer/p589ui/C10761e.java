package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.e */
/* compiled from: PG */
final class C10761e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ SimpleSnackbar f35723a;

    public C10761e(SimpleSnackbar simpleSnackbar) {
        this.f35723a = simpleSnackbar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35723a.onViewHidden();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
