package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.lens.view.filters.p2101e.C25987b;
import com.google.android.libraries.lens.view.p2067ak.C25203ai;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.e */
/* compiled from: PG */
final class C25949e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C25987b f70527a;

    /* renamed from: b */
    final /* synthetic */ C25951g f70528b;

    /* renamed from: c */
    private boolean f70529c;

    public C25949e(C25951g gVar, C25987b bVar) {
        this.f70528b = gVar;
        this.f70527a = bVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f70529c = false;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f70529c) {
            this.f70527a.f70633b = C58836b.f156633a;
            animator.setTarget((Object) null);
            this.f70528b.f70531b.setVisibility(8);
            this.f70528b.f70537h = null;
        }
    }

    public final void onAnimationStart(Animator animator) {
        C25987b bVar = this.f70527a;
        if (!((Boolean) bVar.f70641j.mo56109e(false)).booleanValue()) {
            bVar.f70637f.f68662a.mo30363c(C25203ai.f68645a);
        }
        bVar.f70641j = C58833ax.m90834k(true);
        this.f70529c = true;
    }
}
