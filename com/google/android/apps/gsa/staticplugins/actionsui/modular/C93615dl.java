package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dl */
/* compiled from: PG */
final class C93615dl extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f261348a;

    public C93615dl(View view) {
        this.f261348a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261348a.setTranslationX(0.0f);
    }
}
