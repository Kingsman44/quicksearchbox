package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.da */
/* compiled from: PG */
public final /* synthetic */ class C108628da implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108634dg f302164a;

    public /* synthetic */ C108628da(C108634dg dgVar) {
        this.f302164a = dgVar;
    }

    public final void onClick(View view) {
        C108634dg dgVar = this.f302164a;
        if (dgVar.getArguments() == null || !dgVar.getArguments().getBoolean("exit", false)) {
            dgVar.mo77318iT().mo77312a();
        } else {
            dgVar.mo77318iT().mo77313b();
        }
    }
}
