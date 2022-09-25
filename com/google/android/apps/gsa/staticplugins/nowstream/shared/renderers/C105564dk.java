package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.animation.Animation;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.dk */
/* compiled from: PG */
final class C105564dk implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C105574du f294494a;

    public C105564dk(C105574du duVar) {
        this.f294494a = duVar;
    }

    public final void onAnimationEnd(Animation animation) {
        ((C105499b) this.f294494a.f294521j).f294304c.setVisibility(8);
        C105574du duVar = this.f294494a;
        duVar.f294517f = 0;
        duVar.f294518g = 0;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
