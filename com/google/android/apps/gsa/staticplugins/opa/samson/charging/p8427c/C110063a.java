package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110095f;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.a */
/* compiled from: PG */
public final /* synthetic */ class C110063a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110067e f306640a;

    public /* synthetic */ C110063a(C110067e eVar) {
        this.f306640a = eVar;
    }

    public final void onClick(View view) {
        C110067e eVar = this.f306640a;
        C58976aa aaVar = C58975e.f156826a;
        for (Account account : eVar.f306644b.mo77278a().mo56112g()) {
            for (C73845bq d : C58833ax.m90833j((C73845bq) eVar.f306647e.mo6453a()).mo56112g()) {
                for (String str : C58833ax.m90833j(d.mo65330d()).mo56112g()) {
                    if (eVar.f306652j) {
                        ((C110361bt) eVar.f306645c.mo27525b()).mo98590g(account.name, str, false);
                    }
                    if (eVar.f306653k) {
                        ((C110095f) eVar.f306646d.mo27525b()).mo98372b(account.name, str, true);
                    } else {
                        ((C110095f) eVar.f306646d.mo27525b()).mo98372b(account.name, str, false);
                    }
                }
            }
        }
        eVar.mo77318iT().mo77312a();
    }
}
