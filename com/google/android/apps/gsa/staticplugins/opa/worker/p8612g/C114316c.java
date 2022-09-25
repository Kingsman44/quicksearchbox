package com.google.android.apps.gsa.staticplugins.opa.worker.p8612g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.C68214a;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.g.c */
/* compiled from: PG */
public final class C114316c implements C68220f {
    /* renamed from: a */
    public static C118474ai m189605a(C68214a aVar) {
        C86124t tVar = (C86124t) aVar.mo27525b();
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328834c = 1;
        aiVar.f328832a |= 2;
        long millis = Duration.ofHours(tVar.mo79743a(C90063do.f249626ha)).toMillis();
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a = 1 | aiVar2.f328832a;
        aiVar2.f328833b = millis;
        boolean e = tVar.mo79746e(C90063do.f249427dN);
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
