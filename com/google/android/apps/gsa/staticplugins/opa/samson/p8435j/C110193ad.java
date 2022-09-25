package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.t;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8443o.C110308s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.ad */
/* compiled from: PG */
public final /* synthetic */ class C110193ad implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110197ah f307056a;

    public /* synthetic */ C110193ad(C110197ah ahVar) {
        this.f307056a = ahVar;
    }

    public final void onClick(View view) {
        C110197ah ahVar = this.f307056a;
        Account account = (Account) ahVar.f307062c.mo77278a().mo56107c();
        C110308s sVar = (C110308s) ahVar.f307063d.mo27525b();
        t tVar = ahVar.f307068i.f307073b;
        if (tVar == null) {
            tVar = t.d;
        }
        sVar.mo98553a(account, tVar);
        ahVar.mo77318iT().mo77312a();
    }
}
