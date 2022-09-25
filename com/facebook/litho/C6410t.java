package com.facebook.litho;

import android.view.View;

/* renamed from: com.facebook.litho.t */
/* compiled from: PG */
final class C6410t implements View.OnClickListener {

    /* renamed from: a */
    public C6154cb f19007a;

    public final void onClick(View view) {
        C6154cb cbVar = this.f19007a;
        if (cbVar != null) {
            C6349gb.m17045a();
            if (C6153ca.f18183a == null) {
                C6153ca.f18183a = new C6284g();
            }
            C6153ca.f18183a.f18550a = view;
            cbVar.f18197b.mo13127l().mo12795N(cbVar, C6153ca.f18183a);
            C6153ca.f18183a.f18550a = null;
        }
    }
}
