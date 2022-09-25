package com.google.android.libraries.onegoogle.tooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.w */
/* compiled from: PG */
final class C31087w extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TooltipView f83733a;

    public C31087w(TooltipView tooltipView) {
        this.f83733a = tooltipView;
    }

    public final void onAnimationEnd(Animator animator) {
        Activity activity = (Activity) ((SelectedAccountDisc) this.f83733a.f83667a).f81909j.get();
        if (activity == null || !activity.isFinishing()) {
            this.f83733a.f83671e.mo36820a();
            TooltipView tooltipView = this.f83733a;
            tooltipView.f83668b.removeView(tooltipView.f83677k);
        }
    }
}
