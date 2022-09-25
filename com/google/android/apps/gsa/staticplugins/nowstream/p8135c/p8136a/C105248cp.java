package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.cp */
/* compiled from: PG */
final class C105248cp extends C86052m {

    /* renamed from: a */
    final /* synthetic */ C105263dd f293521a;

    public C105248cp(C105263dd ddVar) {
        this.f293521a = ddVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        C59071e eVar = C105263dd.f293540a;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f293521a.f293543B.mo78233a() || account != null) {
            this.f293521a.f293612e.mo28212l("handleSignedInAccountChange", new C105247co(this));
        } else {
            this.f293521a.f293612e.mo28212l("handleSignedOutAccountChange", new C105246cn(this));
        }
    }
}
