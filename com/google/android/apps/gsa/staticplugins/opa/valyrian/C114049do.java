package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.do */
/* compiled from: PG */
final class C114049do implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315736a;

    public C114049do(C114071eg egVar) {
        this.f315736a = egVar;
    }

    public final void onGlobalLayout() {
        if (!this.f315736a.mo95399aj() || this.f315736a.mo101038dk()) {
            C114071eg egVar = this.f315736a;
            egVar.mo101033dD(0, egVar.f315909bs);
            C114071eg egVar2 = this.f315736a;
            egVar2.f315909bs = 3;
            egVar2.mo101034dE(3);
        }
        this.f315736a.f315985u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
