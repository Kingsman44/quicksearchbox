package com.google.android.apps.search.assistant.verticals.automation.routines.p10034g;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131869l;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131872o;
import com.google.assistant.p3861at.afy;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.g.d */
/* compiled from: PG */
public final class C131898d {
    /* renamed from: a */
    public static C131872o m214362a(afy afy, Optional optional) {
        C131869l lVar = (C131869l) C131872o.f360114d.createBuilder();
        lVar.copyOnWrite();
        C131872o oVar = (C131872o) lVar.instance;
        afy.getClass();
        oVar.f360117b = afy;
        oVar.f360116a |= 1;
        optional.ifPresent(new C131897c(lVar));
        return (C131872o) lVar.build();
    }
}
