package com.google.android.material.datepicker;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.as */
/* compiled from: PG */
class C44623as extends LinearLayoutManager {
    public C44623as(Context context, int i) {
        super(context, i, false);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        C44622ar arVar = new C44622ar(recyclerView.getContext());
        arVar.f2449g = i;
        startSmoothScroll(arVar);
    }
}
