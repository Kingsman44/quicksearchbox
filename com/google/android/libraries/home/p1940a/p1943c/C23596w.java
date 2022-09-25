package com.google.android.libraries.home.p1940a.p1943c;

import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.w */
/* compiled from: PG */
public final class C23596w implements C23570eq {
    /* renamed from: a */
    public final /* synthetic */ C23571er mo28847a(C23553e eVar, Map map) {
        Map map2 = eVar.f64463a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            if (C69664n.m101066l(str, "colorModel") || C69664n.m101066l(str, "colorTemperatureRange")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C23553e eVar2 = new C23553e(linkedHashMap);
        return new C23597x(C23574eu.COLOR_SETTING, (C23595v) C23569ep.m43989a(map, C23542dp.COLOR_RGB, C23595v.class, C23597x.f64618b), (C23599z) C23569ep.m43989a(map, C23542dp.COLOR_TEMPERATURE, C23599z.class, C23597x.f64619c), (C23593t) C23569ep.m43989a(map, C23542dp.SPECTRUM_HSV, C23593t.class, C23597x.f64620d), eVar2.f64463a.containsKey("colorModel"), eVar2.f64463a.containsKey("colorTemperatureRange"), eVar2);
    }
}
