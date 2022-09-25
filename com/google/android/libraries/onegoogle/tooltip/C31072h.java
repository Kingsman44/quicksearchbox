package com.google.android.libraries.onegoogle.tooltip;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.ScaleAnimation;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2205a.C28497j;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.common.C30914an;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.h */
/* compiled from: PG */
public final /* synthetic */ class C31072h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31073i f83704a;

    public /* synthetic */ C31072h(C31073i iVar) {
        this.f83704a = iVar;
    }

    public final void run() {
        C31075k kVar = this.f83704a.f83706b;
        C31079o oVar = kVar.f83708b;
        if (oVar.f83720d != null) {
            AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) oVar.f83717a).f81902c;
            accountParticleDisc.addOnAttachStateChangeListener(oVar.f83718b);
            accountParticleDisc.getViewTreeObserver().addOnGlobalLayoutListener(oVar.f83718b);
            C31090z zVar = new C31090z(accountParticleDisc, new C31076l(oVar));
            TooltipView tooltipView = oVar.f83720d;
            tooltipView.f83671e.setOnDismissListener(new C31077m(oVar, zVar));
            TooltipView tooltipView2 = oVar.f83720d;
            tooltipView2.f83669c.set(tooltipView2.f83667a.mo35804b());
            tooltipView2.f83668b.addView(tooltipView2.f83677k);
            tooltipView2.f83671e.setClippingEnabled(false);
            tooltipView2.f83671e.setAnimationStyle(0);
            tooltipView2.f83671e.setTouchable(true);
            tooltipView2.f83671e.setBackgroundDrawable(new ColorDrawable(0));
            tooltipView2.measure(-2, -2);
            tooltipView2.mo36774b();
            tooltipView2.f83672f.setAlpha(0.0f);
            tooltipView2.setBubbleWidthScale(0.0f);
            Animator loadAnimator = AnimatorInflater.loadAnimator(tooltipView2.getContext(), R.animator.og_tooltip_enter_animator);
            loadAnimator.setTarget(tooltipView2);
            loadAnimator.start();
            Resources resources = tooltipView2.getContext().getResources();
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.83f, 1.05f, 0.83f, 1.05f, (float) (tooltipView2.f83675i - tooltipView2.f83673g), (float) (tooltipView2.f83676j - tooltipView2.f83674h));
            scaleAnimation.setDuration((long) resources.getInteger(R.integer.og_tooltip_pulse_expand_duration_ms));
            scaleAnimation.setInterpolator(C28497j.f77329a);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, (float) (tooltipView2.f83675i - tooltipView2.f83673g), (float) (tooltipView2.f83676j - tooltipView2.f83674h));
            scaleAnimation2.setDuration((long) resources.getInteger(R.integer.og_tooltip_pulse_expand_duration_ms));
            scaleAnimation2.setInterpolator(C28497j.f77331c);
            scaleAnimation2.setAnimationListener(new C31085u(tooltipView2));
            scaleAnimation.setAnimationListener(new C31086v(tooltipView2, scaleAnimation2));
            tooltipView2.setAnimation(scaleAnimation);
            tooltipView2.setClipChildren(false);
            C30914an.m57706a(new C31083s(tooltipView2));
        }
        kVar.f83707a = true;
    }
}
