package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.g */
/* compiled from: PG */
public final /* synthetic */ class C131907g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131921u f360180a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f360181b;

    public /* synthetic */ C131907g(C131921u uVar, AccountId accountId) {
        this.f360180a = uVar;
        this.f360181b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C131921u uVar = this.f360180a;
        AccountId accountId = this.f360181b;
        if (((C46108a) obj).mo50211c() == 1) {
            return uVar.f360207c.mo50282b(accountId);
        }
        return C60866ct.f164955a;
    }
}
