package com.google.android.apps.gsa.staticplugins.nga.p8092ui.account;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.account.d */
/* compiled from: PG */
public final /* synthetic */ class C104144d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ PrimaryAccountFixActivity f289699a;

    public /* synthetic */ C104144d(PrimaryAccountFixActivity primaryAccountFixActivity) {
        this.f289699a = primaryAccountFixActivity;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        PrimaryAccountFixActivity primaryAccountFixActivity = this.f289699a;
        Account account = (Account) obj;
        ((C59052c) ((C59052c) PrimaryAccountFixActivity.f289688k.mo56224b()).mo56372aa(21826)).mo56389s("Getting token details for account: %s.", account);
        return primaryAccountFixActivity.f289691n.mo93964b(primaryAccountFixActivity.f289690m.mo83887ag(), account, new C91032p());
    }
}
