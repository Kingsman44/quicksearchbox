package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ct */
/* compiled from: PG */
final class C114010ct implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ boolean f315653a;

    /* renamed from: b */
    final /* synthetic */ C114071eg f315654b;

    public C114010ct(C114071eg egVar, boolean z) {
        this.f315654b = egVar;
        this.f315653a = z;
    }

    public final void onGlobalLayout() {
        this.f315654b.f315985u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f315654b.mo101020cU(this.f315653a);
    }
}
