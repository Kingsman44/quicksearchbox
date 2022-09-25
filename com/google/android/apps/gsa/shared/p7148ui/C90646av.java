package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.av */
/* compiled from: PG */
final class C90646av implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ boolean f253502a;

    /* renamed from: b */
    final /* synthetic */ View f253503b;

    /* renamed from: c */
    final /* synthetic */ C90649ay f253504c;

    public C90646av(C90649ay ayVar, boolean z, View view) {
        this.f253504c = ayVar;
        this.f253502a = z;
        this.f253503b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f253504c.f253509a.mo84932e();
        if (this.f253504c.f253512d && this.f253502a) {
            View view = this.f253503b;
            view.setAlpha(C90649ay.m148000c(view));
        }
    }
}
