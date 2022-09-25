package com.google.android.libraries.componentview.components.p1689c;

import android.view.animation.Animation;

/* renamed from: com.google.android.libraries.componentview.components.c.ad */
/* compiled from: PG */
final class C20184ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Animation.AnimationListener f56645a;

    /* renamed from: b */
    final /* synthetic */ C20185ae f56646b;

    public C20184ad(C20185ae aeVar, Animation.AnimationListener animationListener) {
        this.f56646b = aeVar;
        this.f56645a = animationListener;
    }

    public final void run() {
        this.f56645a.onAnimationEnd(this.f56646b);
    }
}
