package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bv */
/* compiled from: PG */
final class C15040bv extends C0658ft {

    /* renamed from: a */
    private final View f45109a;

    public C15040bv(View view) {
        this.f45109a = view;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.f45109a.getVisibility() != 0 && i2 > 0) {
            this.f45109a.setVisibility(0);
        }
        if (this.f45109a.getVisibility() == 0 && !recyclerView.canScrollVertically(-1)) {
            this.f45109a.setVisibility(8);
        }
    }
}
