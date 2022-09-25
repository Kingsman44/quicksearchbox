package com.google.android.apps.gsa.staticplugins.p7391an.p7393b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.b.a */
/* compiled from: PG */
public final class C93956a implements C68220f {
    /* renamed from: a */
    public static C118474ai m154996a(C86124t tVar) {
        long millis = TimeUnit.HOURS.toMillis(4);
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328834c = 1;
        aiVar2.f328832a |= 2;
        boolean e = tVar.mo79746e(C90085ej.f250150aa);
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
