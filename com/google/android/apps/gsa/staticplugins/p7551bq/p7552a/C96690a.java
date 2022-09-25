package com.google.android.apps.gsa.staticplugins.p7551bq.p7552a;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bq.a.a */
/* compiled from: PG */
public final class C96690a implements C68220f {
    /* renamed from: a */
    public static C118474ai m160226a(C84486a aVar, C84474e eVar) {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328834c = 1;
        aiVar.f328832a |= 2;
        long millis = TimeUnit.HOURS.toMillis(eVar.mo78082a());
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 1;
        aiVar2.f328833b = millis;
        boolean h = aVar.mo78201h();
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328832a |= 16;
        aiVar3.f328837f = h;
        C118474ai aiVar4 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar4);
        return aiVar4;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
