package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.search.core.preferences.C86337q;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.f */
/* compiled from: PG */
final class C116905f extends C86052m {

    /* renamed from: a */
    final /* synthetic */ C116909g f324573a;

    public C116905f(C116909g gVar) {
        this.f324573a = gVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        if (account != null) {
            C86337q b = this.f324573a.f324586a.mo80076b();
            b.mo80075j("signed_out_search");
            b.mo80075j("previous_query");
            b.mo80075j("previous_query_ms");
            b.apply();
        }
        this.f324573a.mo82241j();
    }
}
