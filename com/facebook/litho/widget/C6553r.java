package com.facebook.litho.widget;

import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.facebook.litho.widget.r */
/* compiled from: PG */
final class C6553r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f19520a;

    public C6553r(RecyclerView recyclerView) {
        this.f19520a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.f19520a;
        if (!recyclerView.isComputingLayout()) {
            recyclerView.invalidateItemDecorations();
        }
    }
}
