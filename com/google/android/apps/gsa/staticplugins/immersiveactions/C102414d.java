package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.d */
/* compiled from: PG */
final class C102414d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ImageView f285833a;

    /* renamed from: b */
    final /* synthetic */ ImageView f285834b;

    public C102414d(ImageView imageView, ImageView imageView2) {
        this.f285833a = imageView;
        this.f285834b = imageView2;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f285834b.setAlpha(0.15f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f285833a.setVisibility(8);
        C102416f.m169816b();
    }

    public final void onAnimationStart(Animator animator) {
        this.f285833a.setVisibility(0);
        this.f285833a.setAlpha(0.0f);
    }
}
