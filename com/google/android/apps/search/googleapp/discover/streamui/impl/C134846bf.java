package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.support.p033v7.widget.RecyclerView;
import com.facebook.litho.widget.C6474cf;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.bf */
/* compiled from: PG */
public final class C134846bf {

    /* renamed from: a */
    public int f367105a;

    /* renamed from: b */
    public int f367106b;

    /* renamed from: c */
    private final C6474cf f367107c;

    public C134846bf(C6474cf cfVar) {
        C69664n.m101061g(cfVar, "recyclerBinder");
        this.f367107c = cfVar;
    }

    /* renamed from: a */
    public final void mo112025a(RecyclerView recyclerView) {
        C69664n.m101061g(recyclerView, "view");
        if (recyclerView.getWidth() > 0 && recyclerView.getHeight() > 0 && !(this.f367105a == recyclerView.getWidth() && this.f367106b == recyclerView.getHeight())) {
            C69664n.m101061g(recyclerView, "view");
            this.f367105a = recyclerView.getWidth();
            this.f367106b = recyclerView.getHeight();
            this.f367107c.mo13324V(recyclerView.getWidth(), recyclerView.getHeight());
        }
        this.f367107c.mo13323U(recyclerView);
    }
}
