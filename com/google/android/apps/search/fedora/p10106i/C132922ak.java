package com.google.android.apps.search.fedora.p10106i;

import com.google.android.apps.search.fedora.p10096d.p10097a.C132754m;
import com.google.android.apps.search.fedora.p10106i.C132924am;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.fedora.i.ak */
/* compiled from: PG */
public final /* synthetic */ class C132922ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132924am f362582a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f362583b;

    public /* synthetic */ C132922ak(C132924am amVar, AccountId accountId) {
        this.f362582a = amVar;
        this.f362583b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C132924am amVar = this.f362582a;
        AccountId accountId = this.f362583b;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C132924am.C132925a aVar = (C132924am.C132925a) C47245e.m84045a(amVar.f362585b, C132924am.C132925a.class, accountId);
        C132754m bD = aVar.mo110937bD();
        C132934h bG = aVar.mo110938bG();
        C132940n bH = aVar.mo110939bH();
        C132932f fVar = new C132932f(bG);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(fVar), bG.f362612f)).mo51516i(new C132952z(bH), amVar.f362594k).mo51516i(new C132912aa(amVar, bD), amVar.f362594k).mo51516i(new C132913ab(bD), amVar.f362594k);
    }
}
