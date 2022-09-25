package com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9163a;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9163a.C121120e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.a.d */
/* compiled from: PG */
public final /* synthetic */ class C121119d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C121120e f336554a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f336555b;

    public /* synthetic */ C121119d(C121120e eVar, AccountId accountId) {
        this.f336554a = eVar;
        this.f336555b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C121120e eVar = this.f336554a;
        AccountId accountId = this.f336555b;
        Optional map = Collection.EL.stream((C58485gu) obj).filter(C121116a.f336551a).findFirst().map(C121117b.f336552a);
        ((C59052c) ((C59052c) C121120e.f336556a.mo56224b()).mo56372aa(35717)).mo56389s("PR status onSyncCompleted updated in TNG to %s", map.get());
        return ((C121120e.C121121a) C47245e.m84045a(eVar.f336560e, C121120e.C121121a.class, accountId)).mo105056ao().mo105060a((Boolean) map.orElseThrow(), false);
    }
}
