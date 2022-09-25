package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.aj */
/* compiled from: PG */
final class C30182aj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ DrawableBadgeViewHolder.AlphaLayerDrawable f81614a;

    /* renamed from: b */
    final /* synthetic */ Drawable f81615b;

    /* renamed from: c */
    final /* synthetic */ DrawableBadgeViewHolder f81616c;

    public C30182aj(DrawableBadgeViewHolder drawableBadgeViewHolder, DrawableBadgeViewHolder.AlphaLayerDrawable alphaLayerDrawable, Drawable drawable) {
        this.f81616c = drawableBadgeViewHolder;
        this.f81614a = alphaLayerDrawable;
        this.f81615b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f81616c.f81583a.setImageDrawable(this.f81615b);
    }

    public final void onAnimationStart(Animator animator) {
        this.f81616c.f81583a.setImageDrawable(this.f81614a);
    }
}
