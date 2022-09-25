package com.google.android.apps.gsa.staticplugins.opaonboarding.p8654a;

import android.accounts.Account;
import android.accounts.AccountsException;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.a.c */
/* compiled from: PG */
public final class C115846c implements C83893b {

    /* renamed from: a */
    private static final C59071e f321250a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.a.c");

    /* renamed from: b */
    private final C86054o f321251b;

    public C115846c(C86054o oVar) {
        this.f321251b = oVar;
    }

    /* renamed from: a */
    public final C58833ax mo77278a() {
        return C58833ax.m90833j(this.f321251b.mo79668a());
    }

    /* renamed from: b */
    public final void mo77279b(Account account) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            this.f321251b.mo79680n();
            this.f321251b.mo79686t(account.name);
        } catch (AccountsException e) {
            C59104x c = f321250a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaAccountContr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30111)).mo56389s("setAccount: could not find account with name = %s", account.name);
        }
    }

    /* renamed from: c */
    public final void mo77280c(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C58833ax.m90834k(str);
    }

    /* renamed from: d */
    public final boolean mo77281d() {
        return true;
    }
}
