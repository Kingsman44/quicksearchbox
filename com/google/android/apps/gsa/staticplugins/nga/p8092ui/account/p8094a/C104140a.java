package com.google.android.apps.gsa.staticplugins.nga.p8092ui.account.p8094a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.account.a.a */
/* compiled from: PG */
public final class C104140a {

    /* renamed from: a */
    private static final C59071e f289693a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.ui.account.a.a");

    /* renamed from: b */
    private final C86054o f289694b;

    public C104140a(C86054o oVar) {
        this.f289694b = oVar;
    }

    /* renamed from: a */
    public final Account mo93963a() {
        ((C59052c) ((C59052c) f289693a.mo56224b()).mo56372aa(21830)).mo56386p("#getAccount.");
        return this.f289694b.mo79668a();
    }

    /* renamed from: b */
    public final C60870cx mo93964b(String str, Account account, C91032p pVar) {
        ((C59052c) ((C59052c) f289693a.mo56224b()).mo56372aa(21831)).mo56386p("#getTokenDetails.");
        return this.f289694b.mo79672f(str, account, false, pVar);
    }
}
