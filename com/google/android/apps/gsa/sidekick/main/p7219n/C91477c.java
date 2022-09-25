package com.google.android.apps.gsa.sidekick.main.p7219n;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91272l;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.n.c */
/* compiled from: PG */
public final /* synthetic */ class C91477c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C91479e f255161a;

    /* renamed from: b */
    public final /* synthetic */ Account f255162b;

    public /* synthetic */ C91477c(C91479e eVar, Account account) {
        this.f255161a = eVar;
        this.f255162b = account;
    }

    public final void run() {
        C91479e eVar = this.f255161a;
        Account account = this.f255162b;
        boolean x = ((C85651bb) eVar.f255164a.mo27525b()).mo79161x(account);
        ((C91480f) eVar.f255165b.mo27525b()).mo85825e();
        ((C85651bb) eVar.f255164a.mo27525b()).mo79150m();
        if (x) {
            ((C91480f) eVar.f255165b.mo27525b()).mo85824d();
        }
        ((C91272l) eVar.f255166c.mo27525b()).mo85549b(account);
    }
}
