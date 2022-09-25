package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.animation.Animator;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.b */
/* compiled from: PG */
final class C102434b implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ boolean f285896a;

    /* renamed from: b */
    final /* synthetic */ ValyrianImmersiveActionsHeader f285897b;

    public C102434b(ValyrianImmersiveActionsHeader valyrianImmersiveActionsHeader, boolean z) {
        this.f285897b = valyrianImmersiveActionsHeader;
        this.f285896a = z;
    }

    public final void onAnimationCancel(Animator animator) {
        ValyrianImmersiveActionsHeader valyrianImmersiveActionsHeader = this.f285897b;
        valyrianImmersiveActionsHeader.f285874f = false;
        int i = 1;
        if (true == this.f285896a) {
            i = 2;
        }
        valyrianImmersiveActionsHeader.mo93235g(i);
        this.f285897b.f285869a.setAlpha(1.0f);
        this.f285897b.f285871c.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        ValyrianImmersiveActionsHeader valyrianImmersiveActionsHeader = this.f285897b;
        valyrianImmersiveActionsHeader.f285874f = false;
        int i = 1;
        if (true == this.f285896a) {
            i = 2;
        }
        valyrianImmersiveActionsHeader.mo93235g(i);
        this.f285897b.f285869a.setAlpha(1.0f);
        this.f285897b.f285871c.setAlpha(1.0f);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f285897b.f285871c.setVisibility(0);
        this.f285897b.f285869a.setVisibility(0);
        this.f285897b.f285870b.setAlpha(1.0f);
        if (this.f285896a) {
            this.f285897b.f285869a.setAlpha(0.0f);
        } else {
            this.f285897b.f285871c.setAlpha(0.0f);
        }
        this.f285897b.f285874f = true;
    }
}
