package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.u */
/* compiled from: PG */
public final /* synthetic */ class C101070u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Account f282232a;

    public /* synthetic */ C101070u(Account account) {
        this.f282232a = account;
    }

    public final Object apply(Object obj) {
        Account account = this.f282232a;
        C59104x c = C101071v.f282233a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedAssEligibility");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) obj)).mo56372aa(19734)).mo56386p("Failed to get dasher status from GMS.");
        boolean z = false;
        if (!account.name.endsWith("@gmail.com") && !account.name.endsWith("@googlemail.com")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
