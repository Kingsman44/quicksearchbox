package com.google.android.apps.gsa.shared.p7038f.p7039a;

import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58744qj;
import com.google.common.p4522b.C58745qk;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.shared.f.a.j */
/* compiled from: PG */
public final /* synthetic */ class C89750j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f242933a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f242934b;

    public /* synthetic */ C89750j(C60870cx cxVar, C60870cx cxVar2) {
        this.f242933a = cxVar;
        this.f242934b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f242933a;
        C60870cx cxVar2 = this.f242934b;
        Map hashMap = new HashMap();
        try {
            hashMap = (Map) Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar)).map(C89751k.f242935a).filter(C89752l.f242936a).map(C89753m.f242937a).collect(Collectors.groupingBy(C89754n.f242938a));
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) C89756p.f242940a.mo56225c()).mo56382g(e)).mo56372aa(10201)).mo56386p("Failed to fetch Android shortcuts");
        }
        Map hashMap2 = new HashMap();
        try {
            hashMap2 = (Map) Collection.EL.stream(((C49337n) C60856cj.m92909r(cxVar2)).f127529a).map(C89755o.f242939a).collect(Collectors.groupingBy(C89754n.f242938a));
        } catch (ExecutionException e2) {
            ((C58970a) ((C58970a) ((C58970a) C89756p.f242940a.mo56225c()).mo56382g(e2)).mo56372aa(10200)).mo56386p("Failed to fetch Icing results");
        }
        C58490gz gzVar = new C58490gz(4);
        C58744qj qjVar = new C58744qj((C58745qk) C58758qx.m90647e(hashMap2.keySet(), hashMap.keySet()));
        while (qjVar.hasNext()) {
            String str = (String) qjVar.next();
            HashSet hashSet = new HashSet();
            C58480gp gpVar = new C58480gp(4);
            if (hashMap2.containsKey(str)) {
                for (C49330g gVar : (List) hashMap2.get(str)) {
                    if (hashSet.add(gVar.f127496g)) {
                        gpVar.mo55395g(gVar);
                    }
                }
            }
            if (hashMap.containsKey(str)) {
                for (C49330g gVar2 : (List) hashMap.get(str)) {
                    if (hashSet.add(gVar2.f127496g)) {
                        gpVar.mo55395g(gVar2);
                    }
                }
            }
            C58485gu f = gpVar.mo55394f();
            if (!f.isEmpty()) {
                gzVar.mo55429h(str, f);
            }
        }
        return gzVar.mo55427f(false);
    }
}
