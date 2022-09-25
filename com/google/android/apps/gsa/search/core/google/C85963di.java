package com.google.android.apps.gsa.search.core.google;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6796f.C85979a;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;

/* renamed from: com.google.android.apps.gsa.search.core.google.di */
/* compiled from: PG */
public final class C85963di extends C85979a {

    /* renamed from: a */
    private final C86054o f232473a;

    /* renamed from: b */
    private final cb f232474b;

    public C85963di(C86054o oVar, cb cbVar) {
        this.f232473a = oVar;
        this.f232474b = cbVar;
    }

    /* renamed from: a */
    public final void mo79491a(C85981c cVar) {
        Account a = this.f232473a.mo79668a();
        if (a != null) {
            int b = this.f232474b.b(a);
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            cVar.mo79637c(cVar.f232497e, "X-AGSA-User-Is-Unicorn", sb.toString());
        }
    }
}
