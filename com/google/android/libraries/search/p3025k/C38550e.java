package com.google.android.libraries.search.p3025k;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.k.e */
/* compiled from: PG */
public final /* synthetic */ class C38550e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38551f f101925a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f101926b;

    public /* synthetic */ C38550e(C38551f fVar, AccountId accountId) {
        this.f101925a = fVar;
        this.f101926b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C38551f fVar = this.f101925a;
        AccountId accountId = this.f101926b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(ValidationResult.m82127d());
        }
        C60870cx d = fVar.f101927a.mo50284d(accountId);
        C38549d dVar = C38549d.f101924a;
        return C60922j.m93044g(d, C47810es.m84963c(dVar), fVar.f101928b);
    }
}
