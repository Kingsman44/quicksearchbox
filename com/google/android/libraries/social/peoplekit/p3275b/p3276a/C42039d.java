package com.google.android.libraries.social.peoplekit.p3275b.p3276a;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.libraries.social.peoplekit.b.a.d */
/* compiled from: PG */
public final class C42039d extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ View f109838a;

    /* renamed from: b */
    final /* synthetic */ int f109839b;

    /* renamed from: c */
    final /* synthetic */ C42044i f109840c;

    public C42039d(C42044i iVar, View view, int i) {
        this.f109840c = iVar;
        this.f109838a = view;
        this.f109839b = i;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(-1)) {
            this.f109840c.f109852h.mo44493k(true);
            this.f109838a.setElevation(0.0f);
        } else if (i2 != 0) {
            this.f109840c.f109852h.mo44493k(false);
            this.f109838a.setElevation((float) this.f109839b);
        }
    }
}
