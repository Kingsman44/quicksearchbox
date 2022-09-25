package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.u */
/* compiled from: PG */
final class C44648u implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44616al f116316a;

    /* renamed from: b */
    final /* synthetic */ C44649v f116317b;

    public C44648u(C44649v vVar, C44616al alVar) {
        this.f116317b = vVar;
        this.f116316a = alVar;
    }

    public final void onClick(View view) {
        int findLastVisibleItemPosition = this.f116317b.mo47881b().findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            this.f116317b.mo47882c(this.f116316a.mo47858b(findLastVisibleItemPosition));
        }
    }
}
