package com.google.android.apps.search.podcasts.widgets.valueselector;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.search.podcasts.widgets.valueselector.c */
/* compiled from: PG */
final class C141285c extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ HorizontalValueSelector f383584a;

    public C141285c(HorizontalValueSelector horizontalValueSelector) {
        this.f383584a = horizontalValueSelector;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.f383584a.mo116313a(true);
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i != 0) {
            this.f383584a.mo116313a(false);
        }
    }
}
