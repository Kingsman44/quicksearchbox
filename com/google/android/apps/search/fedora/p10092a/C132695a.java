package com.google.android.apps.search.fedora.p10092a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.fedora.a.a */
/* compiled from: PG */
public final /* synthetic */ class C132695a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C132699e f362101a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f362102b;

    public /* synthetic */ C132695a(C132699e eVar, AccountId accountId) {
        this.f362101a = eVar;
        this.f362102b = accountId;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C132699e eVar = this.f362101a;
        AccountId accountId = this.f362102b;
        C132717w wVar = eVar.f362112b;
        C132708n nVar = new C132708n(wVar, accountId);
        C47633f e = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(nVar), wVar.f362145e)).mo51515h(C132709o.f362130a, wVar.f362145e).mo51513e(Throwable.class, C132710p.f362131a, wVar.f362145e);
        C60870cx a = eVar.f362112b.mo110891a(accountId, "usm");
        C60870cx a2 = eVar.f362112b.mo110891a(accountId, "uca");
        C132717w wVar2 = eVar.f362112b;
        C132702h hVar = new C132702h(wVar2, accountId);
        C47633f i = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(hVar), wVar2.f362145e)).mo51515h(C132703i.f362119a, wVar2.f362145e).mo51516i(new C132704j(wVar2, accountId), wVar2.f362145e);
        return C47636i.m84746e(e, a, a2, i).mo51518a(new C132698d(e, a, a2, i), eVar.f362113c);
    }
}
