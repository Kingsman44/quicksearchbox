package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* renamed from: com.google.android.libraries.material.opensearchbar.y */
/* compiled from: PG */
final class C28570y extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f77651a;

    /* renamed from: b */
    final /* synthetic */ C28571z f77652b;

    public C28570y(C28571z zVar, boolean z) {
        this.f77652b = zVar;
        this.f77651a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f77652b.mo34150c(true != this.f77651a ? 0.0f : 1.0f);
        if (this.f77651a) {
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f77652b.f77654b;
            clippableRoundedCornerLayout.f116514a = null;
            clippableRoundedCornerLayout.invalidate();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f77652b.mo34150c(true != this.f77651a ? 1.0f : 0.0f);
    }
}
