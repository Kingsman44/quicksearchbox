package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.view.animation.Animation;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.continuation.a */
/* compiled from: PG */
final class C108499a implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ AcpPlateLayout f301894a;

    public C108499a(AcpPlateLayout acpPlateLayout) {
        this.f301894a = acpPlateLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f301894a.setVisibility(8);
        this.f301894a.clearAnimation();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
