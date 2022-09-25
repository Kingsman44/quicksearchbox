package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.support.p033v7.widget.GridLayoutManager;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.o */
/* compiled from: PG */
public final class C140634o implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f381942a;

    /* renamed from: b */
    final /* synthetic */ int f381943b;

    /* renamed from: c */
    final /* synthetic */ GridLayoutManager f381944c;

    public C140634o(View view, int i, GridLayoutManager gridLayoutManager) {
        this.f381942a = view;
        this.f381943b = i;
        this.f381944c = gridLayoutManager;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C69664n.m101061g(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.f381944c.setSpanCount(Math.max(3, this.f381942a.getMeasuredWidth() / this.f381943b));
    }
}
