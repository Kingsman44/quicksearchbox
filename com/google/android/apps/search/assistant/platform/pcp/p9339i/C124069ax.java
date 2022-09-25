package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ax */
/* compiled from: PG */
public final /* synthetic */ class C124069ax implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C124081bi f342672a;

    /* renamed from: b */
    public final /* synthetic */ Map f342673b;

    /* renamed from: c */
    public final /* synthetic */ Map f342674c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f342675d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f342676e;

    /* renamed from: f */
    public final /* synthetic */ C53306j f342677f;

    public /* synthetic */ C124069ax(C124081bi biVar, Map map, Map map2, C60870cx cxVar, C60870cx cxVar2, C53306j jVar) {
        this.f342672a = biVar;
        this.f342673b = map;
        this.f342674c = map2;
        this.f342675d = cxVar;
        this.f342676e = cxVar2;
        this.f342677f = jVar;
    }

    public final Object call() {
        Map map;
        Map map2;
        C124081bi biVar = this.f342672a;
        Map map3 = this.f342673b;
        Map map4 = this.f342674c;
        C60870cx cxVar = this.f342675d;
        C60870cx cxVar2 = this.f342676e;
        C53306j jVar = this.f342677f;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : ((C58495hd) map3).entrySet()) {
            AccountId accountId = (AccountId) entry.getKey();
            for (C60870cx r : (List) entry.getValue()) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                concurrentHashMap2.putAll((Map) C60856cj.m92909r(r));
                if (concurrentHashMap.containsKey(accountId)) {
                    ((Map) concurrentHashMap.get(accountId)).putAll(concurrentHashMap2);
                } else {
                    concurrentHashMap.put(accountId, concurrentHashMap2);
                }
            }
        }
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        for (Map.Entry entry2 : ((C58495hd) map4).entrySet()) {
            concurrentHashMap3.put((AccountId) entry2.getKey(), (Map) C60856cj.m92909r((Future) entry2.getValue()));
        }
        Map map5 = (Map) C60856cj.m92909r(cxVar);
        Map map6 = (Map) C60856cj.m92909r(cxVar2);
        C59104x b = C124081bi.f342709a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.DataFetch");
        ((C59052c) ((C59052c) b).mo56372aa(35392)).mo56386p("#updateLastReturnedDatabase");
        C58480gp e = C58485gu.m89837e();
        for (Map.Entry entry3 : concurrentHashMap3.entrySet()) {
            C123623b a = C123624c.m202992a(biVar.f342710b, (AccountId) entry3.getKey());
            C58480gp e2 = C58485gu.m89837e();
            for (C123744bk bkVar : ((Map) entry3.getValue()).keySet()) {
                e2.mo55395g(C124089bo.m203513a(Integer.valueOf(bkVar.f341810e)));
            }
            if (concurrentHashMap.containsKey(entry3.getKey())) {
                map2 = (Map) concurrentHashMap.get(entry3.getKey());
                map2.getClass();
            } else {
                map2 = C58729pv.f156485a;
            }
            C60870cx b2 = a.f341552d.mo106058b(a.f341550b, jVar, e2.mo55394f());
            C124061ap apVar = new C124061ap(a, jVar, map2);
            e.mo55395g(C60922j.m93045h(b2, C47810es.m84966f(apVar), C60826bg.f164896a));
        }
        C123615ah b3 = C123624c.m202993b(biVar.f342710b);
        C58480gp e3 = C58485gu.m89837e();
        for (C123744bk bkVar2 : map6.keySet()) {
            e3.mo55395g(C124089bo.m203513a(Integer.valueOf(bkVar2.f341810e)));
        }
        C60870cx b4 = b3.f341542c.mo106058b(b3.f341541b, jVar, e3.mo55394f());
        C124062aq aqVar = new C124062aq(b3, jVar, map5);
        e.mo55395g(C60922j.m93045h(b4, C47810es.m84966f(aqVar), C60826bg.f164896a));
        C47638k.m84752c(e.mo55394f()).mo51520a(C124063ar.f342660a, C60826bg.f164896a);
        C123745bl blVar = (C123745bl) C123746bm.f341818b.createBuilder();
        for (Map.Entry entry4 : concurrentHashMap.entrySet()) {
            AccountId accountId2 = (AccountId) entry4.getKey();
            Map map7 = (Map) entry4.getValue();
            if (concurrentHashMap3.containsKey(accountId2)) {
                map = (Map) concurrentHashMap3.get(accountId2);
                map.getClass();
            } else {
                map = C58729pv.f156485a;
            }
            blVar.mo106124a(biVar.mo106277h(jVar, map7, map, Optional.m71637of(accountId2)));
        }
        blVar.mo106124a(biVar.mo106277h(jVar, map5, map6, Optional.empty()));
        return (C123746bm) blVar.build();
    }
}
