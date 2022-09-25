package com.google.android.libraries.web.weblayer.contrib.contactpicker.internal;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.f */
/* compiled from: PG */
final class C44178f implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C46175b f114934a;

    /* renamed from: b */
    final /* synthetic */ AccountId f114935b;

    /* renamed from: c */
    final /* synthetic */ C46128f f114936c;

    /* renamed from: d */
    final /* synthetic */ Executor f114937d;

    public C44178f(C46175b bVar, AccountId accountId, C46128f fVar, Executor executor) {
        this.f114934a = bVar;
        this.f114935b = accountId;
        this.f114936c = fVar;
        this.f114937d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx g = this.f114934a.mo50250g(this.f114935b);
        C44177e eVar = new C44177e(this.f114936c, this.f114935b);
        return C60922j.m93045h(g, C47810es.m84966f(eVar), this.f114937d);
    }
}
