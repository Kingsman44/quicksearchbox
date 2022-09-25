package com.google.android.apps.gsa.staticplugins.p7433ba.p7434a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.ba.a.b */
/* compiled from: PG */
public final class C94446b implements C68220f {
    /* renamed from: a */
    public static C118474ai m155778a(C86124t tVar) {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = Duration.ofDays(1).toMillis();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        boolean e = tVar.mo79746e(C89972ak.f246534I);
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 16;
        aiVar2.f328837f = e;
        C118474ai aiVar3 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar3);
        return aiVar3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
