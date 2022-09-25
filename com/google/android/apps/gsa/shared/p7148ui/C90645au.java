package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.au */
/* compiled from: PG */
final class C90645au implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ boolean f253499a;

    /* renamed from: b */
    final /* synthetic */ View f253500b;

    /* renamed from: c */
    final /* synthetic */ C90649ay f253501c;

    public C90645au(C90649ay ayVar, boolean z, View view) {
        this.f253501c = ayVar;
        this.f253499a = z;
        this.f253500b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f253501c.f253509a.mo84932e();
        if (this.f253501c.f253512d && this.f253499a) {
            View view = this.f253500b;
            view.setAlpha(C90649ay.m148000c(view));
        }
    }
}
