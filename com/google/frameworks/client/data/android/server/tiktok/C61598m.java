package com.google.frameworks.client.data.android.server.tiktok;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.m */
/* compiled from: PG */
public final /* synthetic */ class C61598m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C61601p f166461a;

    public /* synthetic */ C61598m(C61601p pVar) {
        this.f166461a = pVar;
    }

    public final C60870cx apply(Object obj) {
        AccountId accountId = (AccountId) obj;
        C60870cx g = this.f166461a.f166469e.mo50250g(accountId);
        C61597l lVar = new C61597l(accountId);
        return C60922j.m93044g(g, C47810es.m84963c(lVar), C60826bg.f164896a);
    }
}
