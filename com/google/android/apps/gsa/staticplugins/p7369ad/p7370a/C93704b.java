package com.google.android.apps.gsa.staticplugins.p7369ad.p7370a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90134m;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ad.a.b */
/* compiled from: PG */
public final class C93704b implements C68220f {
    /* renamed from: a */
    public static C118474ai m154650a(C86124t tVar) {
        C118474ai aiVar = (C118474ai) tVar.mo79754t(C90134m.f251810b, C118474ai.f328830g.getParserForType());
        if (aiVar == null || aiVar.equals(C118474ai.f328830g)) {
            C58976aa aaVar = C58975e.f156826a;
            C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
            long millis = TimeUnit.DAYS.toMillis(1);
            ahVar.copyOnWrite();
            C118474ai aiVar2 = (C118474ai) ahVar.instance;
            aiVar2.f328832a |= 1;
            aiVar2.f328833b = millis;
            ahVar.copyOnWrite();
            C118474ai aiVar3 = (C118474ai) ahVar.instance;
            aiVar3.f328832a |= 8;
            aiVar3.f328836e = true;
            aiVar = (C118474ai) ahVar.build();
        }
        C68225k.m98532d(aiVar);
        return aiVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
