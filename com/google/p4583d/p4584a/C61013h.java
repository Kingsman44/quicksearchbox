package com.google.p4583d.p4584a;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4535g.C59203do;
import com.google.p4583d.p4584a.p4588d.C60975b;
import com.google.p4583d.p4584a.p4588d.C60976c;
import com.google.p4583d.p4584a.p4588d.C60977d;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60984k;
import com.google.p4583d.p4584a.p4588d.C60985l;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60991r;
import com.google.p4583d.p4584a.p4588d.C60992s;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.d.a.h */
/* compiled from: PG */
public final class C61013h {
    /* renamed from: a */
    public static double m93259a(double d) {
        if (Double.isNaN(d)) {
            return C59203do.f157270a;
        }
        if (Double.isInfinite(d) || d == C59203do.f157270a || d == C59203do.f157270a) {
            return d;
        }
        double d2 = (double) (d > C59203do.f157270a ? 1 : -1);
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return d2 * floor;
    }

    /* renamed from: b */
    public static int m93260b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == C59203do.f157270a) {
            return 0;
        }
        double d2 = (double) (d > C59203do.f157270a ? 1 : -1);
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((long) ((d2 * floor) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static long m93261c(double d) {
        return ((long) m93260b(d)) & 4294967295L;
    }

    /* renamed from: d */
    public static C61011a m93262d(String str) {
        C61011a aVar = null;
        if (str != null && !str.isEmpty()) {
            aVar = (C61011a) C61011a.f165186ao.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: e */
    public static Object m93263e(C60987n nVar) {
        if (C60987n.f165115g.equals(nVar)) {
            return null;
        }
        if (C60987n.f165114f.equals(nVar)) {
            return BuildConfig.FLAVOR;
        }
        if (nVar instanceof C60984k) {
            return m93264f((C60984k) nVar);
        }
        if (nVar instanceof C60976c) {
            ArrayList arrayList = new ArrayList();
            C60975b bVar = new C60975b((C60976c) nVar);
            while (bVar.hasNext()) {
                Object e = m93263e(bVar.next());
                if (e != null) {
                    arrayList.add(e);
                }
            }
            return arrayList;
        } else if (!nVar.mo57473h().isNaN()) {
            return nVar.mo57473h();
        } else {
            return nVar.mo57475i();
        }
    }

    /* renamed from: f */
    public static Map m93264f(C60984k kVar) {
        HashMap hashMap = new HashMap();
        for (String str : new ArrayList(kVar.f165110a.keySet())) {
            Object e = m93263e(kVar.mo57471f(str));
            if (e != null) {
                hashMap.put(str, e);
            }
        }
        return hashMap;
    }

    /* renamed from: g */
    public static void m93265g(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: h */
    public static void m93266h(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m93267i(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static boolean m93268j(C60987n nVar) {
        if (nVar == null) {
            return false;
        }
        Double h = nVar.mo57473h();
        if (h.isNaN() || h.doubleValue() < C59203do.f157270a || !h.equals(Double.valueOf(Math.floor(h.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m93269k(C60987n nVar, C60987n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof C60992s) || (nVar instanceof C60985l)) {
            return true;
        }
        if (nVar instanceof C60979f) {
            if (Double.isNaN(nVar.mo57473h().doubleValue()) || Double.isNaN(nVar2.mo57473h().doubleValue())) {
                return false;
            }
            return nVar.mo57473h().equals(nVar2.mo57473h());
        } else if (nVar instanceof C60991r) {
            return nVar.mo57475i().equals(nVar2.mo57475i());
        } else {
            if (nVar instanceof C60977d) {
                return nVar.mo57472g().equals(nVar2.mo57472g());
            }
            if (nVar == nVar2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: l */
    public static void m93270l(C61012g gVar) {
        int b = m93260b(gVar.mo57527c("runtime.counter").mo57473h().doubleValue() + 1.0d);
        if (b <= 1000000) {
            gVar.mo57530f("runtime.counter", new C60979f(Double.valueOf((double) b)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
}
