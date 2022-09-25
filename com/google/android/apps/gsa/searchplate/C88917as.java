package com.google.android.apps.gsa.searchplate;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.searchplate.as */
/* compiled from: PG */
final class C88917as implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C88923ay f240871a;

    public C88917as(C88923ay ayVar) {
        this.f240871a = ayVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f240871a.f240882e.setDropDownHorizontalOffset(-(((i3 - i) - this.f240871a.f240882e.getWidth()) / 2));
        this.f240871a.notifyDataSetChanged();
    }
}
