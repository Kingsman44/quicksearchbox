package com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher;

import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.f */
/* compiled from: PG */
final class C138808f implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C138809g f377564a;

    public C138808f(C138809g gVar) {
        this.f377564a = gVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f377564a.f377569e.setDropDownHorizontalOffset(-(((i3 - i) - this.f377564a.f377569e.getWidth()) / 2));
        this.f377564a.notifyDataSetChanged();
    }
}
