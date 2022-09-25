package com.facebook.litho.widget;

import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.facebook.litho.widget.de */
/* compiled from: PG */
final class C6500de implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f19270a;

    public C6500de(RecyclerView recyclerView) {
        this.f19270a = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.f19270a;
        if (!recyclerView.isComputingLayout()) {
            recyclerView.invalidateItemDecorations();
        }
    }
}
