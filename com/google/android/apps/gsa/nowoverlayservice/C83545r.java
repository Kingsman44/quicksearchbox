package com.google.android.apps.gsa.nowoverlayservice;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.r */
/* compiled from: PG */
final class C83545r extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C83553y f227772a;

    public C83545r(C83553y yVar) {
        this.f227772a = yVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.f227772a.f62639aa.setStatusBarColor(this.f227772a.mo76882a(recyclerView));
    }
}
