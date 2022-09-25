package com.google.common.p4522b;

import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97112h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58839bc;
import com.google.common.base.C58841be;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.ni */
/* compiled from: PG */
public final class C58662ni {
    /* renamed from: a */
    static int m90342a(int i) {
        if (i < 3) {
            C58371co.m89408c(i, "expectedSize");
            return i + 1;
        } else if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        } else {
            double d = (double) i;
            Double.isNaN(d);
            return (int) Math.ceil(d / 0.75d);
        }
    }

    /* renamed from: b */
    public static C58495hd m90343b(Map map) {
        if (map instanceof C58474gj) {
            return (C58474gj) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C58729pv.f156485a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum enumR = (Enum) entry.getKey();
        Object value = entry.getValue();
        C58371co.m89406a(enumR, value);
        EnumMap enumMap = new EnumMap(enumR.getDeclaringClass());
        enumMap.put(enumR, value);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum enumR2 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            C58371co.m89406a(enumR2, value2);
            enumMap.put(enumR2, value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return C58729pv.f156485a;
        }
        if (size != 1) {
            return new C58474gj(enumMap);
        }
        Map.Entry entry3 = (Map.Entry) C58557jl.m90133n(enumMap.entrySet());
        return C58495hd.m89900n((Enum) entry3.getKey(), entry3.getValue());
    }

    /* renamed from: c */
    public static C58495hd m90344c(Collection collection) {
        C58490gz gzVar = new C58490gz(collection.size());
        int i = 0;
        for (Object h : collection) {
            gzVar.mo55429h(h, Integer.valueOf(i));
            i++;
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: d */
    public static C58495hd m90345d(Iterable iterable, C58817ah ahVar) {
        if (iterable instanceof Collection) {
            return m90359r(iterable.iterator(), ahVar, C58495hd.m89896j(((Collection) iterable).size()));
        }
        return m90359r(iterable.iterator(), ahVar, new C58490gz(4));
    }

    /* renamed from: e */
    public static C58650mx m90346e(C58817ah ahVar) {
        ahVar.getClass();
        return new C58644mr(ahVar);
    }

    /* renamed from: f */
    static Object m90347f(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* renamed from: i */
    public static String m90350i(Map map) {
        StringBuilder a = C58374cr.m89409a(map.size());
        a.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            a.append(entry.getKey());
            a.append('=');
            a.append(entry.getValue());
            z = false;
        }
        a.append('}');
        return a.toString();
    }

    /* renamed from: j */
    public static HashMap m90351j(int i) {
        return new HashMap(m90342a(i));
    }

    /* renamed from: k */
    static Iterator m90352k(Set set, C58817ah ahVar) {
        return new C58640mn(set.iterator(), ahVar);
    }

    /* renamed from: l */
    public static LinkedHashMap m90353l(int i) {
        return new LinkedHashMap(m90342a(i));
    }

    /* renamed from: m */
    static Map.Entry m90354m(Map.Entry entry) {
        entry.getClass();
        return new C58642mp(entry);
    }

    /* renamed from: o */
    public static boolean m90356o(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: q */
    public static C58495hd m90358q(Iterable iterable) {
        C58490gz gzVar = new C58490gz(4);
        for (Object next : iterable) {
            gzVar.mo55429h(next, ((C97112h) next).f271343l.mo90473b());
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: r */
    private static C58495hd m90359r(Iterator it, C58817ah ahVar, C58490gz gzVar) {
        while (it.hasNext()) {
            Object next = it.next();
            gzVar.mo55429h(ahVar.apply(next), next);
        }
        try {
            return gzVar.mo55427f(true);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    /* renamed from: g */
    static Object m90348g(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Object m90349h(Map map, Object obj) {
        map.getClass();
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: p */
    static boolean m90357p(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static Map m90355n(Map map, C58839bc bcVar) {
        bcVar.getClass();
        C58841be beVar = new C58841be(bcVar, C58648mv.KEY);
        map.getClass();
        return new C58651my(map, bcVar, beVar);
    }
}
