package com.google.android.libraries.assistant.auto.tng.common.p897a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.a.i */
/* compiled from: PG */
public final class C13213i {

    /* renamed from: a */
    public final C46128f f40858a;

    /* renamed from: b */
    private final Executor f40859b;

    /* renamed from: c */
    private final C46175b f40860c;

    public C13213i(Executor executor, C46175b bVar, C46128f fVar) {
        this.f40859b = executor;
        this.f40860c = bVar;
        this.f40858a = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo20978a(AccountId accountId) {
        C60870cx c = this.f40860c.mo50246c(accountId);
        C13210f fVar = new C13210f(this, accountId);
        return C60922j.m93045h(c, C47810es.m84966f(fVar), this.f40859b);
    }

    /* renamed from: b */
    public final C60870cx mo20979b(AccountId accountId) {
        C60870cx a = mo20978a(accountId);
        C13209e eVar = C13209e.f40853a;
        return C60922j.m93044g(a, C47810es.m84963c(eVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo20980c(AccountId accountId) {
        C60870cx a = this.f40858a.mo50214a(accountId);
        C13211g gVar = C13211g.f40856a;
        Class<IllegalArgumentException> cls = IllegalArgumentException.class;
        C60870cx g = C60846c.m92878g(a, cls, C47810es.m84963c(gVar), C60826bg.f164896a);
        C13212h hVar = C13212h.f40857a;
        return C60922j.m93044g(g, C47810es.m84963c(hVar), C60826bg.f164896a);
    }
}
