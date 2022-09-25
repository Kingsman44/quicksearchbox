package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.aw */
/* compiled from: PG */
final class C90647aw extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f253505a;

    /* renamed from: b */
    final /* synthetic */ View f253506b;

    /* renamed from: c */
    final /* synthetic */ C90649ay f253507c;

    public C90647aw(C90649ay ayVar, boolean z, View view) {
        this.f253507c = ayVar;
        this.f253505a = z;
        this.f253506b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f253507c.f253512d && this.f253505a) {
            this.f253506b.setAlpha(1.0f);
        }
        this.f253507c.f253509a.mo84933f(this.f253506b);
    }
}
