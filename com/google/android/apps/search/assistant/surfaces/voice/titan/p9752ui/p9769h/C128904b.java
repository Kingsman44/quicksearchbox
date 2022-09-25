package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.view.animation.Animation;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.b */
/* compiled from: PG */
public final class C128904b implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C128905c f354244a;

    /* renamed from: b */
    final /* synthetic */ boolean f354245b;

    public C128904b(C128905c cVar, boolean z) {
        this.f354244a = cVar;
        this.f354245b = z;
    }

    public final void onAnimationEnd(Animation animation) {
        C69664n.m101061g(animation, "animation");
        this.f354244a.mo108740b(this.f354245b);
        this.f354244a.f354246a = null;
    }

    public final void onAnimationRepeat(Animation animation) {
        C69664n.m101061g(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        C69664n.m101061g(animation, "animation");
    }
}
