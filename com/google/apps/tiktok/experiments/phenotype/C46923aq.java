package com.google.apps.tiktok.experiments.phenotype;

import java.util.Map;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.aq */
/* compiled from: PG */
public final class C46923aq {
    /* renamed from: a */
    public static final String m83576a(Map map, C46969ci ciVar) {
        String a = ciVar.mo50945a();
        if (!C69764m.m101205y(a, "#", false)) {
            String str = (String) map.get(a);
            if (str == null) {
                return a;
            }
            return a + "#" + str;
        }
        throw new IllegalStateException("Subpackages should be provided without their base package: ".concat(String.valueOf(a)));
    }
}
