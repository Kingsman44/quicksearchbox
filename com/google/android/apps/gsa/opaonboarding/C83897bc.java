package com.google.android.apps.gsa.opaonboarding;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.opaonboarding.bc */
/* compiled from: PG */
public final class C83897bc {

    /* renamed from: a */
    public final C86124t f228529a;

    /* renamed from: b */
    private final SharedPreferences f228530b;

    /* renamed from: c */
    private final C58833ax f228531c;

    public C83897bc(SharedPreferences sharedPreferences, C58833ax axVar, C86124t tVar) {
        this.f228530b = sharedPreferences;
        this.f228531c = axVar;
        this.f228529a = tVar;
    }

    /* renamed from: a */
    public final boolean mo77283a(Account account, int i) {
        if (account == null) {
            return this.f228530b.getBoolean("opa_has_acknowledged_third_party_disclosures", false);
        }
        if (!this.f228531c.mo56113h()) {
            return false;
        }
        C83887au auVar = (C83887au) this.f228531c.mo56107c();
        boolean b = auVar.mo77272b(account, i);
        if (i != 6) {
            return b;
        }
        boolean b2 = auVar.mo77272b(account, 3);
        if (b || b2) {
            return true;
        }
        return false;
    }
}
