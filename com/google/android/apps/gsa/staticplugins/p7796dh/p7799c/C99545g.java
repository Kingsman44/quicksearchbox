package com.google.android.apps.gsa.staticplugins.p7796dh.p7799c;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.dh.c.g */
/* compiled from: PG */
final class C99545g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C99546h f278518a;

    public C99545g(C99546h hVar) {
        this.f278518a = hVar;
    }

    public final void onGlobalLayout() {
        if (this.f278518a.f278523d.getVisibility() == 0) {
            this.f278518a.f278523d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f278518a.mo91493h();
        }
    }
}
