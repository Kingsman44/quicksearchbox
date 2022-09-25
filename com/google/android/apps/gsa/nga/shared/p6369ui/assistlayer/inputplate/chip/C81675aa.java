package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.aa */
/* compiled from: PG */
final class C81675aa extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ ChipsCarousel f223387a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81675aa(ChipsCarousel chipsCarousel, Context context) {
        super(context, 0, false);
        this.f223387a = chipsCarousel;
    }

    public final void onLayoutCompleted(C0670ge geVar) {
        super.onLayoutCompleted(geVar);
        if (this.f223387a.f223379i.isPresent()) {
            ((Runnable) this.f223387a.f223379i.get()).run();
            this.f223387a.f223379i = Optional.empty();
        }
    }
}
