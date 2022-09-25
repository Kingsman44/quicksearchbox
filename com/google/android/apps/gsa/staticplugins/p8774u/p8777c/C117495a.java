package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.animation.Animation;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.a */
/* compiled from: PG */
final class C117495a implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C117501af f326131a;

    /* renamed from: b */
    final /* synthetic */ C117507d f326132b;

    public C117495a(C117507d dVar, C117501af afVar) {
        this.f326132b = dVar;
        this.f326131a = afVar;
    }

    public final void onAnimationEnd(Animation animation) {
        C117494j jVar;
        if (this.f326132b.f326188c == C117494j.ANIMATE_SLIDE_DOWN || (jVar = this.f326132b.f326188c) == C117494j.ANIMATE_FADE_OUT || jVar == C117494j.ANIMATE_FADE_OUT_SLIDE_DOWN) {
            this.f326132b.f326189d.setVisibility(4);
        }
        this.f326131a.mo103347a();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        C117494j jVar;
        if (this.f326132b.f326188c == C117494j.ANIMATE_FADE_IN || (jVar = this.f326132b.f326188c) == C117494j.ANIMATE_FADE_IN_SLIDE_UP || jVar == C117494j.ANIMATE_SLIDE_UP) {
            this.f326132b.f326189d.setVisibility(0);
        }
    }
}
