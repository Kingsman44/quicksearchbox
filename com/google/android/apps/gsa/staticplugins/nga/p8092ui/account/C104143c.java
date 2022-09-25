package com.google.android.apps.gsa.staticplugins.nga.p8092ui.account;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.account.c */
/* compiled from: PG */
public final /* synthetic */ class C104143c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ PrimaryAccountFixActivity f289698a;

    public /* synthetic */ C104143c(PrimaryAccountFixActivity primaryAccountFixActivity) {
        this.f289698a = primaryAccountFixActivity;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Account a = this.f289698a.f289691n.mo93963a();
        if (a != null) {
            return a;
        }
        throw new AssertionError("There is no current account.");
    }
}
