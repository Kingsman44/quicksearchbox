package com.google.android.apps.gsa.staticplugins.nga.p8066i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90034cm;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.i.h */
/* compiled from: PG */
public final class C103305h implements C68220f {
    /* renamed from: a */
    public static C118474ai m171202a(C86124t tVar) {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = TimeUnit.HOURS.toMillis(12);
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328834c = 2;
        aiVar2.f328832a = 2 | aiVar2.f328832a;
        boolean e = tVar.mo79746e(C90034cm.f248359j);
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328832a |= 16;
        aiVar3.f328837f = e;
        C118474ai aiVar4 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar4);
        return aiVar4;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
