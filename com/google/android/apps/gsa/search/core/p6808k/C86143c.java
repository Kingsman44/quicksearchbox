package com.google.android.apps.gsa.search.core.p6808k;

import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.k.c */
/* compiled from: PG */
public final class C86143c implements C68220f {
    /* renamed from: a */
    public static C118474ai m138547a() {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = TimeUnit.DAYS.toMillis(1);
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 8;
        aiVar2.f328836e = false;
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328834c = 0;
        aiVar3.f328832a |= 2;
        C118474ai aiVar4 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar4);
        return aiVar4;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
