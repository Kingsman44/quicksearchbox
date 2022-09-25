package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.accounts.Account;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.ag */
/* compiled from: PG */
public final /* synthetic */ class C101083ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101092ap f282263a;

    /* renamed from: b */
    public final /* synthetic */ Account f282264b;

    public /* synthetic */ C101083ag(C101092ap apVar, Account account) {
        this.f282263a = apVar;
        this.f282264b = account;
    }

    public final C60870cx apply(Object obj) {
        C101092ap apVar = this.f282263a;
        Account account = this.f282264b;
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C101092ap.f282277a.mo56224b()).mo56372aa(19789)).mo56386p("Server state has Unified disabled -> cleared training cache on this device");
        return apVar.mo92136a(account.name, false, false);
    }
}
