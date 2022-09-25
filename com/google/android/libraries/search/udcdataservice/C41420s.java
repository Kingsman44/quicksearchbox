package com.google.android.libraries.search.udcdataservice;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.udcdataservice.s */
/* compiled from: PG */
public final class C41420s {

    /* renamed from: a */
    private final C60887da f108200a;

    /* renamed from: b */
    private final C46175b f108201b;

    public C41420s(C60887da daVar, C46175b bVar) {
        this.f108200a = daVar;
        this.f108201b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo43952a(AccountId accountId) {
        C60870cx c = this.f108201b.mo50246c(accountId);
        C41419r rVar = C41419r.f108199a;
        return C60922j.m93044g(c, C47810es.m84963c(rVar), this.f108200a);
    }
}
