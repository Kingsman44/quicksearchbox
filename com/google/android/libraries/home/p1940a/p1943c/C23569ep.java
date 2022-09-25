package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ep */
/* compiled from: PG */
public final class C23569ep {
    /* renamed from: a */
    public static final C23544dr m43989a(Map map, C23542dp dpVar, Class cls, C23544dr drVar) {
        C69664n.m101061g(dpVar, "key");
        C69664n.m101061g(drVar, "defaultValue");
        Object obj = map.get(dpVar);
        if (obj == null) {
            obj = null;
        }
        C23544dr drVar2 = (C23544dr) obj;
        if (drVar2 == null || !cls.isInstance(drVar2)) {
            return drVar;
        }
        Object cast = cls.cast(drVar2);
        C69664n.m101058d(cast);
        return (C23544dr) cast;
    }
}
