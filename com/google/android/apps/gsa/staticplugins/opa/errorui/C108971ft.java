package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ft */
/* compiled from: PG */
public final /* synthetic */ class C108971ft implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108980gb f303020a;

    public /* synthetic */ C108971ft(C108980gb gbVar) {
        this.f303020a = gbVar;
    }

    public final void onClick(View view) {
        C108980gb gbVar = this.f303020a;
        gbVar.f303044i.edit().putInt("opa_wakeup_routine_opt_in_status", 1).apply();
        gbVar.mo77318iT().mo77312a();
    }
}
