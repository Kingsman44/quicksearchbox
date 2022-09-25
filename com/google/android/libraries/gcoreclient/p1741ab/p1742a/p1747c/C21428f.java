package com.google.android.libraries.gcoreclient.p1741ab.p1742a.p1747c;

import android.accounts.Account;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.wallet.firstparty.C146349a;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.C146381c;
import java.util.UUID;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.ab.a.c.f */
/* compiled from: PG */
public final class C21428f extends C21423a {

    /* renamed from: a */
    public final C146349a f59889a;

    public C21428f(C146349a aVar) {
        this.f59889a = aVar;
    }

    /* renamed from: a */
    public final Intent mo26928a() {
        C146349a aVar = this.f59889a;
        C146381c cVar = aVar.f395375a;
        ApplicationParameters applicationParameters = aVar.f395376b.f395412a;
        BuyFlowConfig buyFlowConfig = cVar.f395413a;
        buyFlowConfig.f395408b = applicationParameters;
        if (buyFlowConfig.f395407a == null) {
            buyFlowConfig.f395407a = UUID.randomUUID().toString();
        }
        BuyFlowConfig buyFlowConfig2 = cVar.f395413a;
        aVar.f395377c.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig2);
        Account account = buyFlowConfig2.f395408b.f395397b;
        C143919bh.m233971n(account, "Buyer account is required");
        aVar.f395377c.putExtra("com.google.android.gms.wallet.account", account);
        if (aVar.f395377c.getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0) == 0) {
            aVar.f395377c.putExtra("com.google.android.gms.wallet.intentBuildTimeMs", SystemClock.elapsedRealtime());
        }
        Intent intent = aVar.f395377c;
        aVar.mo122943a();
        return intent;
    }

    /* renamed from: b */
    public final void mo26929b(Account account) {
        this.f59889a.f395376b.f395412a.f395397b = account;
    }

    /* renamed from: c */
    public final void mo26930c(C21438p pVar) {
        this.f59889a.f395376b.f395412a.f395401f = pVar.f59896a;
    }

    /* renamed from: d */
    public final void mo26931d(int i) {
        this.f59889a.f395376b.f395412a.f395396a = i;
    }
}
