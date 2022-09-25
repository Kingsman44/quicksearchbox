package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.v */
/* compiled from: PG */
public final class C25966v extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C25967w f70572a;

    /* renamed from: b */
    private boolean f70573b;

    public C25966v(C25967w wVar) {
        this.f70572a = wVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f70573b = false;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f70573b) {
            this.f70573b = false;
            this.f70572a.f70575b.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f70573b = true;
    }
}
