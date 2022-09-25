package com.google.apps.tiktok.account.data.p3613b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.account.data.b.e */
/* compiled from: PG */
public final class C46180e {

    /* renamed from: a */
    private final C46175b f121106a;

    /* renamed from: b */
    private final AccountId f121107b;

    public C46180e(C46175b bVar, AccountId accountId) {
        this.f121106a = bVar;
        this.f121107b = accountId;
    }

    /* renamed from: b */
    public static boolean m82417b(C46108a aVar) {
        return "incognito".equals(aVar.mo50210b().f121165j);
    }

    /* renamed from: a */
    public final C60870cx mo50251a() {
        C60870cx c = this.f121106a.mo50246c(this.f121107b);
        C46179d dVar = C46179d.f121105a;
        return C60922j.m93044g(c, C47810es.m84963c(dVar), C60826bg.f164896a);
    }
}
