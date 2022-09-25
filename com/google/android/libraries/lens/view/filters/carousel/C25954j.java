package com.google.android.libraries.lens.view.filters.carousel;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.j */
/* compiled from: PG */
final class C25954j extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ C25961q f70541a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25954j(C25961q qVar, Context context) {
        super(context, 0, false);
        this.f70541a = qVar;
    }

    public final boolean canScrollHorizontally() {
        return this.f70541a.f70556i;
    }
}
