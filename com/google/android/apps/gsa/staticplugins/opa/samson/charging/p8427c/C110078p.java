package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.p */
/* compiled from: PG */
public final /* synthetic */ class C110078p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110080r f306689a;

    public /* synthetic */ C110078p(C110080r rVar) {
        this.f306689a = rVar;
    }

    public final void onClick(View view) {
        Account a;
        C110080r rVar = this.f306689a;
        if (rVar.f306697h && (a = rVar.f306695f.a()) != null) {
            rVar.f306696g.j(a.name);
        }
        rVar.mo77318iT().mo77312a();
    }
}
