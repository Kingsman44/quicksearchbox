package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.ak */
/* compiled from: PG */
final class C30183ak extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Drawable f81617a;

    /* renamed from: b */
    final /* synthetic */ DrawableBadgeViewHolder f81618b;

    public C30183ak(DrawableBadgeViewHolder drawableBadgeViewHolder, Drawable drawable) {
        this.f81618b = drawableBadgeViewHolder;
        this.f81617a = drawable;
    }

    public final void onAnimationStart(Animator animator) {
        this.f81618b.f81583a.setImageDrawable(this.f81617a);
        this.f81618b.f81584b.setVisibility(0);
    }
}
