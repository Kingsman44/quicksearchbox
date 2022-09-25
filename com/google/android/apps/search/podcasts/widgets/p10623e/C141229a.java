package com.google.android.apps.search.podcasts.widgets.p10623e;

import android.support.p033v7.widget.C0594dj;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import java.util.List;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.search.podcasts.widgets.e.a */
/* compiled from: PG */
public final class C141229a extends C0594dj {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f383423a;

    /* renamed from: b */
    final /* synthetic */ List f383424b;

    /* renamed from: c */
    final /* synthetic */ GridLayoutManager f383425c;

    public C141229a(RecyclerView recyclerView, List list, GridLayoutManager gridLayoutManager) {
        this.f383423a = recyclerView;
        this.f383424b = list;
        this.f383425c = gridLayoutManager;
    }

    public final int getSpanSize(int i) {
        C0640fb fbVar = this.f383423a.mAdapter;
        if (C69540x.m100848ad(this.f383424b, fbVar != null ? Integer.valueOf(fbVar.getItemViewType(i)) : null)) {
            return 1;
        }
        return this.f383425c.mSpanCount;
    }
}
