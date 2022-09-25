package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8669b.C115957b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.n */
/* compiled from: PG */
public final /* synthetic */ class C115971n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115973p f321583a;

    /* renamed from: b */
    public final /* synthetic */ Account f321584b;

    /* renamed from: c */
    public final /* synthetic */ C115957b f321585c;

    public /* synthetic */ C115971n(C115973p pVar, Account account, C115957b bVar) {
        this.f321583a = pVar;
        this.f321584b = account;
        this.f321585c = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115973p pVar = this.f321583a;
        Account account = this.f321584b;
        C115957b bVar = this.f321585c;
        String str = (String) obj;
        if (!pVar.f321593g) {
            if (C58837ba.m90859h(str)) {
                ((C59052c) ((C59052c) C115973p.f321587a.mo56225c()).mo56372aa(30214)).mo56386p("Error retrieving auth token, can't do reauth");
                pVar.mo102387e();
                return;
            }
            new C90873ag(pVar.f321590d.mo78694a(account.name, bVar.f321527b, str), pVar.f321589c, "call reauth worker", new C115969l(pVar)).mo85223a(new C115970m(pVar));
        }
    }
}
