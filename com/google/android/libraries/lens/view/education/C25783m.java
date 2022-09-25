package com.google.android.libraries.lens.view.education;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.lens.view.education.m */
/* compiled from: PG */
final class C25783m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C25785o f70052a;

    public C25783m(C25785o oVar) {
        this.f70052a = oVar;
    }

    public final void onGlobalLayout() {
        ((C25784n) this.f70052a.f70042a).f70053e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C25785o oVar = this.f70052a;
        if (((C25784n) oVar.f70042a).f70053e.getWidth() > oVar.f70042a.f70037a.getWidth()) {
            oVar.f70042a.mo30917a(3);
        }
    }
}
