package com.google.android.apps.gsa.speech.p7272e.p7274b;

import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.e.b.t */
/* compiled from: PG */
public final class C92258t {
    /* renamed from: a */
    public static C8476as m151487a(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8476as asVar = (C8476as) it.next();
            if (asVar.f29421f.equals(str)) {
                return asVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Map m151488b(Map map, List list, List list2, int i) {
        HashMap hashMap = new HashMap();
        for (C8476as c : map.values()) {
            m151489c(hashMap, new HashMap(), c, list2, i);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m151489c(hashMap, new HashMap(), (C8476as) it.next(), list2, i);
        }
        return hashMap;
    }

    /* renamed from: c */
    public static void m151489c(HashMap hashMap, HashMap hashMap2, C8476as asVar, List list, int i) {
        if (m151490d(asVar, list, i)) {
            String str = asVar.f29417b;
            if (hashMap.containsKey(str) && ((C8476as) hashMap.get(str)).f29419d >= asVar.f29419d) {
                return;
            }
            if (!hashMap2.containsKey(str) || ((C8476as) hashMap2.get(str)).f29419d < asVar.f29419d) {
                hashMap.put(str, asVar);
            }
        }
    }

    /* renamed from: d */
    public static boolean m151490d(C8476as asVar, List list, int i) {
        int size = asVar.f29422g.size();
        if (size == 0) {
            return false;
        }
        int d = asVar.f29422g.mo58914d(size - 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next()).intValue() == d) {
                if (i >= asVar.f29423h || (asVar.f29416a & 64) == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
