package com.facebook.litho;

import android.view.View;

/* renamed from: com.facebook.litho.v */
/* compiled from: PG */
final class C6412v implements View.OnFocusChangeListener {

    /* renamed from: a */
    public C6154cb f19022a;

    public final void onFocusChange(View view, boolean z) {
        C6154cb cbVar = this.f19022a;
        if (cbVar != null) {
            C6349gb.m17045a();
            if (C6153ca.f18184b == null) {
                C6153ca.f18184b = new C6160ch();
            }
            C6160ch chVar = C6153ca.f18184b;
            chVar.f18206a = view;
            chVar.f18207b = z;
            cbVar.f18197b.mo13127l().mo12795N(cbVar, C6153ca.f18184b);
            C6153ca.f18184b.f18206a = null;
        }
    }
}
