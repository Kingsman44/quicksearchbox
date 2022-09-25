package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.gb */
/* compiled from: PG */
final class C105636gb extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f294716a;

    /* renamed from: b */
    final /* synthetic */ C105638gd f294717b;

    public C105636gb(C105638gd gdVar, boolean z) {
        this.f294717b = gdVar;
        this.f294716a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f294717b.f294728i.setVisibility(4);
        C105638gd gdVar = this.f294717b;
        gdVar.f294726g = null;
        gdVar.f294723d.mo94703e(this.f294716a);
    }
}
