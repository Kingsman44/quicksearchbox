package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.al */
/* compiled from: PG */
final class C30184al extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ DrawableBadgeViewHolder f81619a;

    public C30184al(DrawableBadgeViewHolder drawableBadgeViewHolder) {
        this.f81619a = drawableBadgeViewHolder;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f81619a.f81584b.setVisibility(8);
        this.f81619a.f81583a.setImageDrawable((Drawable) null);
    }
}
