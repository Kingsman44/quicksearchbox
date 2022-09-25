package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cw */
/* compiled from: PG */
final class C114013cw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315657a;

    public C114013cw(C114071eg egVar) {
        this.f315657a = egVar;
    }

    public final void onGlobalLayout() {
        this.f315657a.f315985u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f315657a.mo101003bO();
    }
}
