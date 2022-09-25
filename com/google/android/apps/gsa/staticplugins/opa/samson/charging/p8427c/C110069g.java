package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.accounts.Account;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2383n;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.g */
/* compiled from: PG */
public final /* synthetic */ class C110069g implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C110071i f306656a;

    public /* synthetic */ C110069g(C110071i iVar) {
        this.f306656a = iVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C110071i iVar = this.f306656a;
        Long l = (Long) obj;
        if (iVar.f306668k.f6612c == C2383n.RESUMED) {
            C58976aa aaVar = C58975e.f156826a;
            C58833ax a = iVar.f306661d.mo77278a();
            if (a.mo56113h()) {
                iVar.f306660c.mo98642r(((Account) a.mo56107c()).name);
            }
            iVar.mo98351e();
        }
    }
}
