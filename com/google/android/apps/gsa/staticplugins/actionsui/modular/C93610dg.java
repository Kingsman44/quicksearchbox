package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dg */
/* compiled from: PG */
final class C93610dg extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f261337a;

    /* renamed from: b */
    final /* synthetic */ C93612di f261338b;

    public C93610dg(C93612di diVar, View view) {
        this.f261338b = diVar;
        this.f261337a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f261337a.setScaleX(1.0f);
        this.f261337a.setScaleY(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261337a.setScaleX(1.0f);
        this.f261337a.setScaleY(1.0f);
    }

    public final void onAnimationStart(Animator animator) {
        this.f261337a.setScaleX(this.f261338b.f261343a);
        this.f261337a.setScaleY(this.f261338b.f261343a);
    }
}
