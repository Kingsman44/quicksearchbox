package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.q */
/* compiled from: PG */
final class C134912q implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C134904m f367342a;

    public C134912q(C134904m mVar) {
        this.f367342a = mVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C69664n.m101061g(view, "v");
        DiscoverRecyclerView q = this.f367342a.mo112060q();
        if (q != null) {
            this.f367342a.f367270S.mo112025a(q);
        }
    }
}
