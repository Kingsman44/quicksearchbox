package com.google.android.libraries.search.p2476a;

import android.accounts.Account;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.a.d */
/* compiled from: PG */
public final /* synthetic */ class C32211d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C32234h f86420a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f86421b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f86422c;

    public /* synthetic */ C32211d(C32234h hVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f86420a = hVar;
        this.f86421b = cxVar;
        this.f86422c = cxVar2;
    }

    public final Object call() {
        C32234h hVar = this.f86420a;
        C60870cx cxVar = this.f86421b;
        C60870cx cxVar2 = this.f86422c;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar2);
        if (!axVar.mo56113h()) {
            return C58836b.f156633a;
        }
        String str = (String) axVar.mo56107c();
        Account[] accountsByType = hVar.f86448b.getAccountsByType("com.google");
        for (Account account : accountsByType) {
            if (str.equalsIgnoreCase(account.name)) {
                if (C32234h.m60014e(account, axVar2)) {
                    return C58833ax.m90834k(account);
                }
                hVar.f86450d.mo41699n("CURRENT_ACCOUNT_NAME");
            }
        }
        for (Account account2 : accountsByType) {
            if (str.equalsIgnoreCase(hVar.f86448b.getPreviousName(account2))) {
                if (C32234h.m60014e(account2, axVar2)) {
                    return C58833ax.m90834k(account2);
                }
                hVar.f86450d.mo41699n("PREVIOUS_ACCOUNT_NAME");
            }
        }
        return C58836b.f156633a;
    }
}
