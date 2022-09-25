package com.facebook.litho;

import android.view.View;

/* renamed from: com.facebook.litho.ac */
/* compiled from: PG */
final class C6092ac implements View.OnLongClickListener {

    /* renamed from: a */
    public C6154cb f17991a;

    public final boolean onLongClick(View view) {
        C6154cb cbVar = this.f17991a;
        if (cbVar != null) {
            C6349gb.m17045a();
            if (C6153ca.f18185c == null) {
                C6153ca.f18185c = new C6232ef();
            }
            C6153ca.f18185c.f18408a = view;
            Object N = cbVar.f18197b.mo13127l().mo12795N(cbVar, C6153ca.f18185c);
            C6153ca.f18185c.f18408a = null;
            if (N == null || !((Boolean) N).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
