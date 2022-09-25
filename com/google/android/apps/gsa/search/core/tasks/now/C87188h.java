package com.google.android.apps.gsa.search.core.tasks.now;

import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.tasks.now.h */
/* compiled from: PG */
public final class C87188h implements C68220f {
    /* renamed from: a */
    public static C118474ai m140999a() {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = TimeUnit.DAYS.toMillis(1);
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328834c = 1;
        aiVar2.f328832a |= 2;
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328832a |= 4;
        aiVar3.f328835d = true;
        ahVar.copyOnWrite();
        C118474ai aiVar4 = (C118474ai) ahVar.instance;
        aiVar4.f328832a |= 8;
        aiVar4.f328836e = true;
        C118474ai aiVar5 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar5);
        return aiVar5;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
