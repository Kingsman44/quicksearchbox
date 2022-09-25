package com.google.android.apps.search.assistant.p8941b;

import com.google.android.apps.gsa.assistant.shared.j.a;
import com.google.android.apps.gsa.assistant.shared.j.b;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.b.a */
/* compiled from: PG */
final class C119186a implements C121011a {

    /* renamed from: a */
    private final AccountId f332388a;

    /* renamed from: b */
    private final b f332389b;

    public C119186a(AccountId accountId, b bVar) {
        this.f332388a = accountId;
        this.f332389b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo104231a() {
        b bVar = this.f332389b;
        return C60922j.m93044g(bVar.b.mo79697b(), C47810es.m84963c(new a(bVar, this.f332388a)), bVar.c);
    }

    /* renamed from: b */
    public final C60870cx mo104232b() {
        return C60856cj.m92900i(Boolean.valueOf(this.f332389b.a.w()));
    }
}
