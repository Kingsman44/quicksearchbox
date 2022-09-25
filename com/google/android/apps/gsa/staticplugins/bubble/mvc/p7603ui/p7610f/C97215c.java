package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.f.c */
/* compiled from: PG */
final class C97215c implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f271610a;

    /* renamed from: b */
    final /* synthetic */ View f271611b;

    public C97215c(Runnable runnable, View view) {
        this.f271610a = runnable;
        this.f271611b = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f271610a.run();
        this.f271611b.removeOnLayoutChangeListener(this);
    }
}
