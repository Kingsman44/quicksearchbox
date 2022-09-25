package com.google.android.libraries.search.p2476a.p2479c.p2481b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45964ab;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.a.c.b.b */
/* compiled from: PG */
public final class C32177b implements C45964ab {

    /* renamed from: a */
    private final C46325t f86378a;

    /* renamed from: b */
    private final C60887da f86379b;

    public C32177b(C46325t tVar, C60887da daVar) {
        this.f86378a = tVar;
        this.f86379b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo37987a(AccountId accountId) {
        C60870cx d = this.f86378a.mo50284d(accountId);
        C32172a aVar = C32172a.f86365a;
        return C60922j.m93044g(d, C47810es.m84963c(aVar), this.f86379b);
    }
}
