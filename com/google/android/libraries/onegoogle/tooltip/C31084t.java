package com.google.android.libraries.onegoogle.tooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.t */
/* compiled from: PG */
final class C31084t extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TooltipView f83729a;

    public C31084t(TooltipView tooltipView) {
        this.f83729a = tooltipView;
    }

    public final void onAnimationEnd(Animator animator) {
        TooltipView tooltipView = this.f83729a;
        Animator a = tooltipView.mo36773a();
        a.addListener(new C31087w(tooltipView));
        a.start();
    }
}
