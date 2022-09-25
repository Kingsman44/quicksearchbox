package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import android.view.View;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.f */
/* compiled from: PG */
public final /* synthetic */ class C110068f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110071i f306655a;

    public /* synthetic */ C110068f(C110071i iVar) {
        this.f306655a = iVar;
    }

    public final void onClick(View view) {
        C110071i iVar = this.f306655a;
        C58833ax a = iVar.f306661d.mo77278a();
        if (a.mo56113h()) {
            iVar.f306660c.mo98630a(((Account) a.mo56107c()).name, true);
            iVar.f306660c.mo98637h(((Account) a.mo56107c()).name);
            if (iVar.f306665h.getVisibility() == 0) {
                iVar.f306660c.mo98631b(((Account) a.mo56107c()).name, iVar.f306665h.isChecked());
            }
        }
        iVar.mo77318iT().mo77312a();
    }
}
