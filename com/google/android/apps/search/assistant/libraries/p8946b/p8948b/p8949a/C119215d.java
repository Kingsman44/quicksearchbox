package com.google.android.apps.search.assistant.libraries.p8946b.p8948b.p8949a;

import android.accounts.Account;
import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.android.apps.search.assistant.libraries.p8946b.p8948b.C119223f;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C119215d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f332472a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f332473b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f332474c;

    /* renamed from: d */
    public final /* synthetic */ Account f332475d;

    public /* synthetic */ C119215d(C60870cx cxVar, C60870cx cxVar2, C65753ak akVar, Account account) {
        this.f332472a = cxVar;
        this.f332473b = cxVar2;
        this.f332474c = akVar;
        this.f332475d = account;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f332472a;
        C60870cx cxVar2 = this.f332473b;
        C65753ak akVar = this.f332474c;
        Account account = this.f332475d;
        C119223f fVar = (C119223f) C60856cj.m92909r(cxVar2);
        if (fVar.f332495e.equals((AccountId) C60856cj.m92909r(cxVar))) {
            return fVar.mo104249b(akVar);
        }
        String str = account.name;
        return C60856cj.m92900i(C119207d.SUCCESS);
    }
}
