package com.google.android.apps.gsa.staticplugins.opa.p8406p;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.C85637av;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7891nu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.p.a */
/* compiled from: PG */
public final /* synthetic */ class C109872a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109873b f306143a;

    /* renamed from: b */
    public final /* synthetic */ Account f306144b;

    public /* synthetic */ C109872a(C109873b bVar, Account account) {
        this.f306143a = bVar;
        this.f306144b = account;
    }

    public final void run() {
        C109873b bVar = this.f306143a;
        Account account = this.f306144b;
        C85637av avVar = bVar.f306148d;
        boolean u = bVar.f306149e.u();
        C58976aa aaVar = C58975e.f156826a;
        if (avVar.f231464c.mo79143d(account.name) == 1 && !avVar.f231464c.mo79128A(account.name)) {
            avVar.f231464c.mo79131D();
            avVar.mo79118d(account, 28, C7880nj.ACTIVATION, u ? C7891nu.OPA_ELIGIBLE_DEVICES : C7891nu.OPA_INELIGIBLE_DEVICES, false);
        }
    }
}
