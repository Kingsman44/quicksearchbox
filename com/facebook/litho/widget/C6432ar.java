package com.facebook.litho.widget;

import android.view.ViewTreeObserver;

/* renamed from: com.facebook.litho.widget.ar */
/* compiled from: PG */
final class C6432ar implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C6533ek f19083a;

    /* renamed from: b */
    final /* synthetic */ LithoScrollView f19084b;

    public C6432ar(LithoScrollView lithoScrollView, C6533ek ekVar) {
        this.f19084b = lithoScrollView;
        this.f19083a = ekVar;
    }

    public final boolean onPreDraw() {
        this.f19084b.setScrollY(this.f19083a.f19455a);
        ViewTreeObserver viewTreeObserver = this.f19084b.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
