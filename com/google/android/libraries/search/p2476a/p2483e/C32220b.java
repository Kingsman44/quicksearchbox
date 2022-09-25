package com.google.android.libraries.search.p2476a.p2483e;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.a.e.b */
/* compiled from: PG */
public final class C32220b {

    /* renamed from: a */
    public final C46128f f86431a;

    /* renamed from: b */
    private final AccountId f86432b;

    /* renamed from: c */
    private final C46175b f86433c;

    /* renamed from: d */
    private final Executor f86434d;

    public C32220b(AccountId accountId, C46175b bVar, C46128f fVar, Executor executor) {
        this.f86432b = accountId;
        this.f86433c = bVar;
        this.f86431a = fVar;
        this.f86434d = executor;
    }

    /* renamed from: a */
    public final void mo38000a(String str) {
        C60870cx c = this.f86433c.mo50246c(this.f86432b);
        C32217a aVar = new C32217a(this, str);
        C46459k.m82829b(C60922j.m93044g(c, C47810es.m84963c(aVar), this.f86434d), "Cookie update propagation failed", new Object[0]);
    }
}
