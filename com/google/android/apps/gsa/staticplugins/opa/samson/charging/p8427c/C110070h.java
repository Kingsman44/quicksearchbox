package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import android.view.View;
import com.google.android.material.bottomsheet.C44555f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.h */
/* compiled from: PG */
final class C110070h extends C44555f {

    /* renamed from: a */
    final /* synthetic */ C110071i f306657a;

    public C110070h(C110071i iVar) {
        this.f306657a = iVar;
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        int i2 = C110071i.f306658l;
        C58976aa aaVar = C58975e.f156826a;
        if (i == 5) {
            C110071i iVar = this.f306657a;
            C58833ax a = iVar.f306661d.mo77278a();
            if (a.mo56113h()) {
                iVar.f306660c.mo98630a(((Account) a.mo56107c()).name, false);
                iVar.f306660c.mo98637h(((Account) a.mo56107c()).name);
                if (iVar.f306665h.getVisibility() == 0) {
                    iVar.f306660c.mo98631b(((Account) a.mo56107c()).name, false);
                }
            }
            iVar.mo98351e();
        }
    }
}
