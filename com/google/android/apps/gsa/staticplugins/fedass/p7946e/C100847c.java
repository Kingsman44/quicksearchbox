package com.google.android.apps.gsa.staticplugins.fedass.p7946e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.e.c */
/* compiled from: PG */
public final class C100847c implements C68220f {
    /* renamed from: a */
    public static C118474ai m167069a(C86124t tVar) {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 4;
        aiVar.f328835d = true;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 8;
        aiVar2.f328836e = true;
        long millis = TimeUnit.HOURS.toMillis(8);
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328832a = 1 | aiVar3.f328832a;
        aiVar3.f328833b = millis;
        boolean e = tVar.mo79746e(C89978aq.f246602a);
        ahVar.copyOnWrite();
        C118474ai aiVar4 = (C118474ai) ahVar.instance;
        aiVar4.f328832a |= 16;
        aiVar4.f328837f = e;
        C118474ai aiVar5 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar5);
        return aiVar5;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
