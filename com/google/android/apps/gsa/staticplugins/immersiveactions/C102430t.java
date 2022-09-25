package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.animation.Animator;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.t */
/* compiled from: PG */
final class C102430t implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ boolean f285864a;

    /* renamed from: b */
    final /* synthetic */ ImmersiveActionsHeader f285865b;

    public C102430t(ImmersiveActionsHeader immersiveActionsHeader, boolean z) {
        this.f285865b = immersiveActionsHeader;
        this.f285864a = z;
    }

    public final void onAnimationCancel(Animator animator) {
        ImmersiveActionsHeader immersiveActionsHeader = this.f285865b;
        immersiveActionsHeader.f285736h = false;
        int i = 1;
        if (true == this.f285864a) {
            i = 2;
        }
        immersiveActionsHeader.mo93188g(i);
        this.f285865b.f285729a.setAlpha(1.0f);
        this.f285865b.f285732d.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        ImmersiveActionsHeader immersiveActionsHeader = this.f285865b;
        immersiveActionsHeader.f285736h = false;
        int i = 1;
        if (true == this.f285864a) {
            i = 2;
        }
        immersiveActionsHeader.mo93188g(i);
        this.f285865b.f285729a.setAlpha(1.0f);
        this.f285865b.f285732d.setAlpha(1.0f);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f285865b.f285732d.setVisibility(0);
        this.f285865b.f285729a.setVisibility(0);
        this.f285865b.f285730b.setAlpha(1.0f);
        if (this.f285864a) {
            this.f285865b.f285729a.setAlpha(0.0f);
        } else {
            this.f285865b.f285732d.setAlpha(0.0f);
        }
        this.f285865b.f285736h = true;
    }
}
