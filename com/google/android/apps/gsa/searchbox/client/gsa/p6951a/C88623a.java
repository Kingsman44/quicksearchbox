package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.a */
/* compiled from: PG */
final class C88623a extends C86052m {

    /* renamed from: a */
    final /* synthetic */ C88630c f239585a;

    public C88623a(C88630c cVar) {
        this.f239585a = cVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        if (!C58832aw.m90831a(this.f239585a.f239591b, account)) {
            C88630c cVar = this.f239585a;
            C90931ca caVar = cVar.f239592c;
            if (caVar != null) {
                C58976aa aaVar = C58975e.f156826a;
                caVar.mo85139d(new C88629b(cVar));
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
        this.f239585a.f239591b = account;
    }
}
