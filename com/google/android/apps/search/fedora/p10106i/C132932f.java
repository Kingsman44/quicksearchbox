package com.google.android.apps.search.fedora.p10106i;

import com.google.android.apps.search.fedora.p10092a.C132696b;
import com.google.android.apps.search.fedora.p10092a.C132697c;
import com.google.android.apps.search.fedora.p10092a.C132699e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.fedora.i.f */
/* compiled from: PG */
public final /* synthetic */ class C132932f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C132934h f362605a;

    public /* synthetic */ C132932f(C132934h hVar) {
        this.f362605a = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C132934h hVar = this.f362605a;
        C132699e eVar = hVar.f362610d;
        AccountId accountId = hVar.f362608b;
        C132696b bVar = new C132696b(eVar, accountId);
        C47633f i = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bVar), eVar.f362113c)).mo51516i(new C132697c(eVar, accountId), eVar.f362113c);
        C47633f h = C47633f.m84733g(hVar.f362609c.mo110914b()).mo51515h(C132911a.f362569a, hVar.f362612f);
        return C47636i.m84746e(i, h).mo51519b(new C132928b(hVar, i, h), hVar.f362612f).mo51514f(Throwable.class, C132929c.f362601a, hVar.f362612f);
    }
}
