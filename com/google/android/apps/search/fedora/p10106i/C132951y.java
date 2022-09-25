package com.google.android.apps.search.fedora.p10106i;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.apps.search.fedora.i.y */
/* compiled from: PG */
public final /* synthetic */ class C132951y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132924am f362637a;

    public /* synthetic */ C132951y(C132924am amVar) {
        this.f362637a = amVar;
    }

    public final C60870cx apply(Object obj) {
        C132924am amVar = this.f362637a;
        ArrayList arrayList = new ArrayList();
        C47633f g = C47633f.m84733g(C60866ct.f164955a);
        for (AccountId aiVar : (Set) obj) {
            g = g.mo51514f(Throwable.class, C132919ah.f362578a, amVar.f362594k).mo51516i(new C132920ai(amVar, aiVar), amVar.f362594k);
            arrayList.add(g);
        }
        return C47638k.m84752c(arrayList).mo51521b(C132921aj.f362581a, amVar.f362594k);
    }
}
