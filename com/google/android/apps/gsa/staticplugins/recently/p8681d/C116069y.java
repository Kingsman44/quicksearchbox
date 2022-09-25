package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.y */
/* compiled from: PG */
final class C116069y extends C86052m {

    /* renamed from: a */
    final /* synthetic */ C116070z f321839a;

    public C116069y(C116070z zVar) {
        this.f321839a = zVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        if (account != null) {
            C58976aa aaVar = C58975e.f156826a;
            String str = account.name;
            this.f321839a.f321850k = (String) C58831av.m90830c(account.name, "notLoggedIn");
            this.f321839a.mo102450t();
        }
    }
}
