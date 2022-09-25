package com.google.android.apps.gsa.staticplugins.opa.worker.p8612g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.C68214a;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.g.a */
/* compiled from: PG */
public final class C114314a implements C68220f {
    /* renamed from: a */
    public static C118474ai m189601a(C68214a aVar) {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = Duration.ofSeconds(((C86124t) aVar.mo27525b()).mo79743a(C90063do.f249567fv)).toMillis();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        boolean e = ((C86124t) aVar.mo27525b()).mo79746e(C90063do.f249377cQ);
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
