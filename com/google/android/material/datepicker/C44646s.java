package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.s */
/* compiled from: PG */
final class C44646s implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C44649v f116313a;

    public C44646s(C44649v vVar) {
        this.f116313a = vVar;
    }

    public final void onClick(View view) {
        C44649v vVar = this.f116313a;
        int i = vVar.f116325h;
        if (i == 2) {
            vVar.mo47883d(1);
        } else if (i == 1) {
            vVar.mo47883d(2);
        }
    }
}
