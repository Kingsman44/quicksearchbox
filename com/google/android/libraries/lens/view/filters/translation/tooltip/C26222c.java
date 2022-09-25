package com.google.android.libraries.lens.view.filters.translation.tooltip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.lens.view.filters.translation.C26111cv;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.tooltip.c */
/* compiled from: PG */
final class C26222c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f71261a;

    /* renamed from: b */
    final /* synthetic */ C26223d f71262b;

    public C26222c(C26223d dVar, Runnable runnable) {
        this.f71262b = dVar;
        this.f71261a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f71262b.f71263a.setVisibility(8);
        Runnable runnable = this.f71261a;
        if (runnable != null) {
            ((C26111cv) runnable).f70950a.mo31301d();
        }
    }
}
