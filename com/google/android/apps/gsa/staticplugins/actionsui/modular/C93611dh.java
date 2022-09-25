package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dh */
/* compiled from: PG */
final class C93611dh extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f261339a;

    /* renamed from: b */
    final /* synthetic */ int f261340b;

    /* renamed from: c */
    final /* synthetic */ int f261341c;

    /* renamed from: d */
    final /* synthetic */ C93612di f261342d;

    public C93611dh(C93612di diVar, View view, int i, int i2) {
        this.f261342d = diVar;
        this.f261339a = view;
        this.f261340b = i;
        this.f261341c = i2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f261339a.setVisibility(this.f261341c);
        this.f261339a.setScaleX(this.f261342d.f261343a);
        this.f261339a.setScaleY(this.f261342d.f261343a);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261339a.setVisibility(this.f261341c);
        this.f261339a.setScaleX(this.f261342d.f261343a);
        this.f261339a.setScaleY(this.f261342d.f261343a);
    }

    public final void onAnimationStart(Animator animator) {
        this.f261339a.setVisibility(this.f261340b);
        this.f261339a.setScaleX(1.0f);
        this.f261339a.setScaleY(1.0f);
    }
}
