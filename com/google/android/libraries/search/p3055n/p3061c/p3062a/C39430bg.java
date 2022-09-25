package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39521d;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C39430bg implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103803a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f103804b;

    public /* synthetic */ C39430bg(C39479cu cuVar, AccountId accountId) {
        this.f103803a = cuVar;
        this.f103804b = accountId;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39479cu cuVar = this.f103803a;
        AccountId accountId = this.f103804b;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53593)).mo56389s("Receive Accountid: %s", accountId);
        AccountId accountId2 = cuVar.f103941C;
        if (accountId2 != null && accountId.equals(accountId2)) {
            return C60866ct.f164955a;
        }
        AccountId accountId3 = cuVar.f103941C;
        if (accountId3 != null && !accountId.equals(accountId3)) {
            C59104x b2 = C39479cu.f103938a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b2).mo56372aa(53594)).mo56354G("Account changed from old : %s to new: %s,", cuVar.f103941C, accountId);
        }
        cuVar.f103941C = accountId;
        C39526i iVar = cuVar.f103970u;
        return iVar.f104080b.mo51511a(new C39521d(iVar, cuVar.f103941C), iVar.f104082d);
    }
}
