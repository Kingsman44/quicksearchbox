package com.google.android.apps.gsa.nga.shared.android;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.os.Handler;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.o */
/* compiled from: PG */
final class C80959o implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ C80960p f221954a;

    public C80959o(C80960p pVar) {
        this.f221954a = pVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        boolean z = true;
        Account[] result = this.f221954a.f221957c.getAccountsByTypeAndFeatures("com.google", new String[]{C80960p.f221955a}, (AccountManagerCallback) null, (Handler) null).getResult();
        C69664n.m101060f(result, "unicornAccounts");
        if (result.length == 0) {
            z = false;
        }
        C59052c cVar = (C59052c) C80960p.f221956b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "UnicornAccountChecker");
        Boolean valueOf = Boolean.valueOf(z);
        cVar.mo56379ah(new C59094n(5794));
        cVar.mo56389s("isUnicornAccount: %b", valueOf);
        return valueOf;
    }
}
