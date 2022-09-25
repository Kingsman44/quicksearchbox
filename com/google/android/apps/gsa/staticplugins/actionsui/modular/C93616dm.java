package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dm */
/* compiled from: PG */
final class C93616dm extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f261349a;

    public C93616dm(View view) {
        this.f261349a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261349a.setTranslationY(0.0f);
    }
}
