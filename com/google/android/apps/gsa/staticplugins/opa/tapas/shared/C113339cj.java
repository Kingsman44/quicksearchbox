package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cj */
/* compiled from: PG */
public final class C113339cj {

    /* renamed from: a */
    public static final /* synthetic */ int f313864a = 0;

    /* renamed from: b */
    private static final Comparator f313865b = Comparator.EL.reversed(Comparator.EL.thenComparing(Comparator.EL.thenComparing(Comparator.CC.comparing(C113335cf.f313860a), (Function) C113336cg.f313861a), (Function) C113337ch.f313862a));

    /* renamed from: c */
    private static final java.util.Comparator f313866c = Comparator.EL.reversed(Comparator.EL.thenComparing(Comparator.CC.comparing(C113336cg.f313861a), (Function) C113337ch.f313862a));

    /* renamed from: a */
    public static C58485gu m187493a(Map map) {
        return (C58485gu) Collection.EL.stream(map.values()).flatMap(C113332cc.f313857a).sorted(f313865b).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public static C58485gu m187494b(Map map) {
        return (C58485gu) Collection.EL.stream(map.values()).flatMap(C113333cd.f313858a).sorted(f313865b).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public static C58495hd m187495c(Map map) {
        return (C58495hd) Collection.EL.stream(map.entrySet()).collect(C58370cn.m89403c(C113301bz.f313768a, C113330ca.f313855a, C113331cb.f313856a));
    }

    /* renamed from: d */
    public static Map m187496d(java.util.Collection collection) {
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C113415ez ezVar = (C113415ez) it.next();
            ((C113295bt) Map.EL.computeIfAbsent(hashMap, C113371dl.m187573c(ezVar.mo100204d()), C113334ce.f313859a)).f313760a.add(ezVar);
        }
        return hashMap;
    }

    /* renamed from: e */
    public static java.util.Map m187497e(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.EL.forEach(((C113408es) it.next()).mo100120c(), new C113338ci(hashMap));
        }
        for (C113295bt btVar : hashMap.values()) {
            Collections.sort(btVar.f313760a, f313866c);
        }
        return hashMap;
    }

    /* renamed from: f */
    public static void m187498f(java.util.Map map) {
        for (C113295bt btVar : map.values()) {
            Collections.sort(btVar.f313760a, f313866c);
        }
    }
}
