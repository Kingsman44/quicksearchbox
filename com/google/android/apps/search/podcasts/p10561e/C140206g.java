package com.google.android.apps.search.podcasts.p10561e;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.e.g */
/* compiled from: PG */
final class C140206g implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C140201b f380915a;

    /* renamed from: b */
    final /* synthetic */ C140211l f380916b;

    /* renamed from: c */
    final /* synthetic */ Context f380917c;

    public C140206g(C140201b bVar, C140211l lVar, Context context) {
        this.f380915a = bVar;
        this.f380916b = lVar;
        this.f380917c = context;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        AccountId accountId = (AccountId) obj;
        C69664n.m101061g(accountId, "accountId");
        C140201b bVar = this.f380915a;
        C47633f f = bVar != null ? C47633f.m84733g(this.f380916b.mo115497a(this.f380917c, accountId, bVar)).mo51515h(new C140204e(accountId), C60826bg.f164896a).mo51514f(Throwable.class, new C140205f(accountId), C60826bg.f164896a) : null;
        return f == null ? C60856cj.m92900i(accountId) : f;
    }
}
