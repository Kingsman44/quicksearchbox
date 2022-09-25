package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.a */
/* compiled from: PG */
public final /* synthetic */ class C131901a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131921u f360172a;

    public /* synthetic */ C131901a(C131921u uVar) {
        this.f360172a = uVar;
    }

    public final C60870cx apply(Object obj) {
        C131921u uVar = this.f360172a;
        AccountId accountId = (AccountId) obj;
        return C47633f.m84733g(C47633f.m84733g(uVar.f360207c.mo50284d(accountId)).mo51516i(new C131907g(uVar, accountId), uVar.f360209e)).mo51516i(new C131908h(uVar, accountId), uVar.f360209e).mo51515h(new C131909i(accountId), uVar.f360209e);
    }
}
