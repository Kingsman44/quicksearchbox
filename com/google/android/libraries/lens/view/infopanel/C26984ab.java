package com.google.android.libraries.lens.view.infopanel;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ab */
/* compiled from: PG */
final class C26984ab implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f73580a;

    /* renamed from: b */
    final /* synthetic */ InfoPanelView f73581b;

    public C26984ab(InfoPanelView infoPanelView, Runnable runnable) {
        this.f73581b = infoPanelView;
        this.f73580a = runnable;
    }

    public final boolean onPreDraw() {
        this.f73581b.getViewTreeObserver().removeOnPreDrawListener(this);
        ((C27123e) this.f73580a).f74114a.mo32631j();
        return true;
    }
}
