package com.google.android.libraries.onegoogle.tooltip;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2205a.C28497j;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.x */
/* compiled from: PG */
final class C31088x extends PopupWindow {

    /* renamed from: a */
    final /* synthetic */ TooltipView f83734a;

    /* renamed from: b */
    private boolean f83735b = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31088x(TooltipView tooltipView, View view) {
        super(view, -2, -2);
        this.f83734a = tooltipView;
    }

    /* renamed from: a */
    public final void mo36820a() {
        super.dismiss();
        this.f83735b = false;
    }

    public final void dismiss() {
        if (!this.f83735b) {
            this.f83735b = true;
            TooltipView tooltipView = this.f83734a;
            Animator loadAnimator = AnimatorInflater.loadAnimator(tooltipView.getContext(), R.animator.og_tooltip_exit_animator);
            loadAnimator.addListener(new C31084t(tooltipView));
            loadAnimator.setTarget(tooltipView);
            loadAnimator.start();
            Resources resources = tooltipView.getContext().getResources();
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.83f, 1.0f, 0.83f, (float) (tooltipView.f83675i - tooltipView.f83673g), (float) (tooltipView.f83676j - tooltipView.f83674h));
            scaleAnimation.setDuration((long) resources.getInteger(R.integer.og_tooltip_pulse_expand_duration_ms));
            scaleAnimation.setStartOffset((long) resources.getInteger(R.integer.og_content_alpha_duration_ms));
            scaleAnimation.setInterpolator(C28497j.f77329a);
            tooltipView.startAnimation(scaleAnimation);
        }
    }
}
