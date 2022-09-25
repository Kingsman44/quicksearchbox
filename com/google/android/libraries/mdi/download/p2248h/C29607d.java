package com.google.android.libraries.mdi.download.p2248h;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.h.d */
/* compiled from: PG */
public final /* synthetic */ class C29607d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29409fd f80195a;

    /* renamed from: b */
    public final /* synthetic */ Account f80196b;

    public /* synthetic */ C29607d(C29409fd fdVar, Account account) {
        this.f80195a = fdVar;
        this.f80196b = account;
    }

    public final C60870cx apply(Object obj) {
        C29409fd fdVar = this.f80195a;
        Account account = this.f80196b;
        C29343e eVar = new C29343e();
        eVar.f79533b = C58833ax.m90834k(account);
        eVar.mo34326b((C28708an) obj);
        return fdVar.mo34712a(eVar.mo34325a());
    }
}
