package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.k */
/* compiled from: PG */
public final class C15357k implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f46095a;

    /* renamed from: b */
    final /* synthetic */ int f46096b;

    /* renamed from: c */
    final /* synthetic */ C15360n f46097c;

    public C15357k(C15360n nVar, ViewGroup viewGroup, int i) {
        this.f46097c = nVar;
        this.f46095a = viewGroup;
        this.f46096b = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f46095a.setVisibility(8);
        this.f46095a.removeAllViews();
        ((C15113ag) this.f46097c.f46105c.mo17428b()).mo21986f(this.f46096b, false);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
