package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.cn */
/* compiled from: PG */
public final /* synthetic */ class C103719cn implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103721cp f288857a;

    public /* synthetic */ C103719cn(C103721cp cpVar) {
        this.f288857a = cpVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103721cp cpVar = this.f288857a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) C103721cp.f288859a.mo56224b()).mo56372aa(21659)).mo56389s("Getting token details for account: %s.", axVar.mo56107c());
        return cpVar.f288861c.mo93964b(cpVar.f288860b.mo83887ag(), (Account) axVar.mo56107c(), new C91032p());
    }
}
