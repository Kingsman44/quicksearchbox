package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cd */
/* compiled from: PG */
final class C93580cd implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C93583cg f261275a;

    public C93580cd(C93583cg cgVar) {
        this.f261275a = cgVar;
    }

    public final void onGlobalLayout() {
        this.f261275a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f261275a.mo88000m(true);
    }
}
