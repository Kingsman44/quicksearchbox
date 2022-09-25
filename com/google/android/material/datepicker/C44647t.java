package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.t */
/* compiled from: PG */
final class C44647t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44616al f116314a;

    /* renamed from: b */
    final /* synthetic */ C44649v f116315b;

    public C44647t(C44649v vVar, C44616al alVar) {
        this.f116315b = vVar;
        this.f116314a = alVar;
    }

    public final void onClick(View view) {
        int findFirstVisibleItemPosition = this.f116315b.mo47881b().findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < this.f116315b.f116323f.mAdapter.getItemCount()) {
            this.f116315b.mo47882c(this.f116314a.mo47858b(findFirstVisibleItemPosition));
        }
    }
}
