package com.google.android.apps.gsa.staticplugins.opa;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ce */
/* compiled from: PG */
final class C108131ce implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C109040fj f300760a;

    public C108131ce(C109040fj fjVar) {
        this.f300760a = fjVar;
    }

    public final void onGlobalLayout() {
        if (this.f300760a.f303449n.isLaidOut()) {
            this.f300760a.f303449n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
