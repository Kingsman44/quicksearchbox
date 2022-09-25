package com.google.android.apps.gsa.shared.p7066m;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.m.j */
/* compiled from: PG */
public final class C90131j {

    /* renamed from: a */
    private static Map f251806a;

    /* renamed from: a */
    public static synchronized Map m146672a() {
        Map map;
        synchronized (C90131j.class) {
            map = f251806a;
            if (map == null) {
                map = new HashMap();
                ArrayList<C90130i> arrayList = new ArrayList<>();
                m146673b(arrayList, C90126fx.class);
                Class[] clsArr = C90123fu.f250882a;
                for (int i = 0; i < 166; i++) {
                    m146673b(arrayList, clsArr[i]);
                }
                for (C90130i iVar : arrayList) {
                    map.put(Integer.valueOf(iVar.f251804a), iVar);
                }
                f251806a = map;
            }
        }
        return map;
    }

    /* renamed from: b */
    private static void m146673b(List list, Class cls) {
        C90130i iVar;
        cls.getSimpleName();
        for (Field field : cls.getDeclaredFields()) {
            try {
                field.getName();
                Object obj = field.get((Object) null);
                obj.getClass();
                if (field.getType() == C90102f.class) {
                    C90102f fVar = (C90102f) obj;
                    iVar = new C90130i(fVar.f250556a, fVar);
                } else if (field.getType() == C90048d.class) {
                    C90048d dVar = (C90048d) obj;
                    iVar = new C90130i(dVar.f248757a, dVar);
                } else if (field.getType() == C90075e.class) {
                    C90075e eVar = (C90075e) obj;
                    iVar = new C90130i(eVar.f249778a, eVar);
                } else if (field.getType() == C90129h.class) {
                    C90129h hVar = (C90129h) obj;
                    iVar = new C90130i(hVar.f251802a, hVar);
                } else if (field.getType() == C90128g.class) {
                    C90128g gVar = (C90128g) obj;
                    iVar = new C90130i(gVar.f251801a, gVar);
                } else {
                    throw new AssertionError("Unknown field type: ".concat(String.valueOf(String.valueOf(field.getType()))));
                }
                list.add(iVar);
            } catch (IllegalAccessException unused) {
            }
        }
    }
}
