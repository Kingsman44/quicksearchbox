package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dk */
/* compiled from: PG */
final class C93614dk extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f261346a;

    /* renamed from: b */
    final /* synthetic */ int f261347b;

    public C93614dk(View view, int i) {
        this.f261346a = view;
        this.f261347b = i;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f261346a.setTranslationY(0.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261346a.setTranslationY(0.0f);
    }

    public final void onAnimationStart(Animator animator) {
        this.f261346a.setTranslationY((float) this.f261347b);
    }
}
