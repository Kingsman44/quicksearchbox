package com.google.android.libraries.search.p2476a.p2479c.p2481b;

import com.google.android.libraries.search.p2476a.C32160b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45964ab;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.a.c.b.k */
/* compiled from: PG */
public final class C32186k implements C45964ab {

    /* renamed from: a */
    public final C46128f f86389a;

    /* renamed from: b */
    private final C32160b f86390b;

    /* renamed from: c */
    private final C46325t f86391c;

    /* renamed from: d */
    private final C60887da f86392d;

    public C32186k(C32160b bVar, C46325t tVar, C60887da daVar, C46128f fVar) {
        this.f86390b = bVar;
        this.f86391c = tVar;
        this.f86392d = daVar;
        this.f86389a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo37987a(AccountId accountId) {
        C60870cx b = this.f86390b.mo37974b();
        C60870cx d = this.f86391c.mo50284d(accountId);
        return C47638k.m84753d(b, d).mo51520a(new C32185j(this, d, b), this.f86392d);
    }
}
