package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.dh */
/* compiled from: PG */
final class C108774dh implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f302497a;

    /* renamed from: b */
    final /* synthetic */ C108775di f302498b;

    public C108774dh(C108775di diVar, View view) {
        this.f302498b = diVar;
        this.f302497a = view;
    }

    public final void onGlobalLayout() {
        this.f302498b.f302499a.mo97514bf(this.f302497a);
        this.f302497a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
