package com.google.android.libraries.search.p3025k;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45964ab;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.k.f */
/* compiled from: PG */
public final class C38551f implements C45964ab {

    /* renamed from: a */
    public final C46325t f101927a;

    /* renamed from: b */
    public final Executor f101928b;

    /* renamed from: c */
    private final C38558m f101929c;

    public C38551f(C46325t tVar, C38558m mVar, Executor executor) {
        this.f101927a = tVar;
        this.f101929c = mVar;
        this.f101928b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo37987a(AccountId accountId) {
        C60870cx b = this.f101929c.mo41486b();
        C38550e eVar = new C38550e(this, accountId);
        return C60922j.m93045h(b, C47810es.m84966f(eVar), this.f101928b);
    }
}
