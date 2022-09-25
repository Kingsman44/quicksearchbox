package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import com.google.android.libraries.search.assistant.p2803u.p2804a.p2805a.C36625a;
import com.google.android.libraries.search.assistant.p2803u.p2819c.C36769c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.s */
/* compiled from: PG */
public final /* synthetic */ class C36655s implements C46464p {

    /* renamed from: a */
    public final /* synthetic */ C36656t f95512a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f95513b;

    /* renamed from: c */
    public final /* synthetic */ C36769c f95514c;

    public /* synthetic */ C36655s(C36656t tVar, AccountId accountId, C36769c cVar) {
        this.f95512a = tVar;
        this.f95513b = accountId;
        this.f95514c = cVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        C36656t tVar = this.f95512a;
        AccountId accountId = this.f95513b;
        C36769c cVar = this.f95514c;
        C60870cx a = tVar.f95521g.mo104231a();
        C36644h hVar = new C36644h(tVar, accountId);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(hVar), tVar.f95517c);
        C36647k kVar = new C36647k(tVar, cVar);
        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(kVar), tVar.f95517c);
        C60870cx a2 = tVar.f95518d.mo50214a(accountId);
        C36625a aVar = tVar.f95516b;
        Objects.requireNonNull(aVar);
        C36648l lVar = new C36648l(aVar);
        return new C46463o(new C60817ay(C47638k.m84751b(h2, C60922j.m93045h(a2, C47810es.m84966f(lVar), C60826bg.f164896a)).mo51520a(new C36649m(h2), C60826bg.f164896a)));
    }
}
