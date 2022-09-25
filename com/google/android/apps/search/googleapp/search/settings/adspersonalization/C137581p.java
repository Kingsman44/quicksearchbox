package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.p */
/* compiled from: PG */
public final class C137581p {

    /* renamed from: a */
    public final String f374215a;

    /* renamed from: b */
    private final AccountId f374216b;

    /* renamed from: c */
    private final C46175b f374217c;

    public C137581p(AccountId accountId, C46175b bVar, String str) {
        this.f374216b = accountId;
        this.f374217c = bVar;
        this.f374215a = str;
    }

    /* renamed from: a */
    public final C60870cx mo113834a() {
        C47633f h = C47633f.m84733g(this.f374217c.mo50246c(this.f374216b)).mo51515h(new C137579n(this), C60826bg.f164896a);
        C137580o oVar = C137580o.f374214a;
        return C60922j.m93044g(h, C47810es.m84963c(oVar), C60826bg.f164896a);
    }
}
