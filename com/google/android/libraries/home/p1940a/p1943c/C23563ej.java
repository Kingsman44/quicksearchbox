package com.google.android.libraries.home.p1940a.p1943c;

import java.util.List;
import java.util.Map;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ej */
/* compiled from: PG */
public final class C23563ej implements C23570eq {
    /* renamed from: a */
    public final /* synthetic */ C23571er mo28847a(C23553e eVar, Map map) {
        Class<C23562ei> cls = C23562ei.class;
        Class<C23566em> cls2 = C23566em.class;
        Object orElse = eVar.mo28920c("pausable", Boolean.class).orElse(false);
        C69664n.m101060f(orElse, "attributes\n        .getV… )\n        .orElse(false)");
        boolean booleanValue = ((Boolean) orElse).booleanValue();
        Object orElse2 = eVar.mo28918a("availableZones", String.class).orElse(C69496am.f185918a);
        C69664n.m101060f(orElse2, "attributes\n        .getL…     .orElse(emptyList())");
        return new C23564ek(booleanValue, (List) orElse2, C23574eu.START_STOP, (C23562ei) C23569ep.m43989a(map, C23542dp.START_STOP, cls, C23564ek.f64484b), (C23566em) C23569ep.m43989a(map, C23542dp.START_STOP_ZONE, cls2, C23566em.f64491b));
    }
}
