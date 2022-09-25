package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.z */
/* compiled from: PG */
final class C15372z implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f46145a;

    /* renamed from: b */
    final /* synthetic */ boolean f46146b;

    /* renamed from: c */
    final /* synthetic */ int f46147c;

    /* renamed from: d */
    final /* synthetic */ C15109ac f46148d;

    public C15372z(C15109ac acVar, ViewGroup viewGroup, boolean z, int i) {
        this.f46148d = acVar;
        this.f46145a = viewGroup;
        this.f46146b = z;
        this.f46147c = i;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f46145a.setVisibility(8);
        this.f46145a.removeAllViews();
        this.f46145a.scrollTo(0, 0);
        this.f46148d.mo21971a(this.f46146b, this.f46147c, false);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
