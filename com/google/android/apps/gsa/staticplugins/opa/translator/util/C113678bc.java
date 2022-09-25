package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.bc */
/* compiled from: PG */
final class C113678bc implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ float f314867a;

    /* renamed from: b */
    final /* synthetic */ Animation f314868b;

    /* renamed from: c */
    final /* synthetic */ C113679bd f314869c;

    public C113678bc(C113679bd bdVar, float f, Animation animation) {
        this.f314869c = bdVar;
        this.f314867a = f;
        this.f314868b = animation;
    }

    public final void onAnimationEnd(Animation animation) {
        C59071e eVar = ModeTogglePlateView.f314785a;
        C113679bd bdVar = this.f314869c.f314870a.f314793h;
        bdVar.f314870a.setX(this.f314867a);
        this.f314868b.cancel();
    }

    public final void onAnimationRepeat(Animation animation) {
        C59071e eVar = ModeTogglePlateView.f314785a;
    }

    public final void onAnimationStart(Animation animation) {
        C59071e eVar = ModeTogglePlateView.f314785a;
    }
}
