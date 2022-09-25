package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.ai */
/* compiled from: PG */
final class C30181ai extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C30226z f81612a;

    /* renamed from: b */
    final /* synthetic */ DrawableBadgeViewHolder f81613b;

    public C30181ai(DrawableBadgeViewHolder drawableBadgeViewHolder, C30226z zVar) {
        this.f81613b = drawableBadgeViewHolder;
        this.f81612a = zVar;
    }

    public final void onAnimationEnd(Animator animator) {
        DrawableBadgeViewHolder drawableBadgeViewHolder = this.f81613b;
        drawableBadgeViewHolder.f81588f = null;
        drawableBadgeViewHolder.mo35609b(this.f81612a);
    }
}
