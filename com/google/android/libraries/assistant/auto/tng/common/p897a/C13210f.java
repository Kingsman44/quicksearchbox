package com.google.android.libraries.assistant.auto.tng.common.p897a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.a.f */
/* compiled from: PG */
public final /* synthetic */ class C13210f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13213i f40854a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f40855b;

    public /* synthetic */ C13210f(C13213i iVar, AccountId accountId) {
        this.f40854a = iVar;
        this.f40855b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C13213i iVar = this.f40854a;
        AccountId accountId = this.f40855b;
        if (((C46108a) obj).mo50210b().f121165j.equals("pseudonymous")) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx b = iVar.f40858a.mo50215b(accountId);
        C13208d dVar = C13208d.f40852a;
        return C60922j.m93044g(b, C47810es.m84963c(dVar), C60826bg.f164896a);
    }
}
