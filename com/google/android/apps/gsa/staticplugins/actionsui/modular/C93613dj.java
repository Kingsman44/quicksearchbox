package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dj */
/* compiled from: PG */
final class C93613dj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f261344a;

    /* renamed from: b */
    final /* synthetic */ int f261345b;

    public C93613dj(View view, int i) {
        this.f261344a = view;
        this.f261345b = i;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f261344a.setTranslationX(0.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261344a.setTranslationX(0.0f);
    }

    public final void onAnimationStart(Animator animator) {
        this.f261344a.setTranslationX((float) this.f261345b);
    }
}
