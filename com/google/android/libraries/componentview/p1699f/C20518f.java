package com.google.android.libraries.componentview.p1699f;

import com.google.android.libraries.componentview.p1675a.C19739a;
import com.google.android.libraries.componentview.p1675a.p1676a.C19740a;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20594bu;
import com.google.android.libraries.componentview.services.application.C20595bv;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.android.libraries.componentview.services.p1701a.C20538g;
import com.google.android.libraries.componentview.services.p1701a.C20539h;
import com.google.android.libraries.componentview.services.p1701a.C20540i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54190g;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62921ba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.f.f */
/* compiled from: PG */
public final class C20518f implements C19739a {

    /* renamed from: a */
    public final C20601ca f57638a;

    /* renamed from: b */
    private final C20537f f57639b;

    /* renamed from: c */
    private final C20540i f57640c;

    /* renamed from: d */
    private final C20514b f57641d;

    /* renamed from: e */
    private final Executor f57642e;

    /* renamed from: f */
    private final C20594bu f57643f;

    public C20518f(C20537f fVar, C20514b bVar, C20601ca caVar, C20540i iVar, C20594bu buVar, Executor executor) {
        this.f57638a = caVar;
        this.f57639b = fVar;
        this.f57641d = bVar;
        this.f57640c = iVar;
        this.f57642e = executor;
        this.f57643f = buVar;
    }

    /* renamed from: a */
    public final C19740a mo25092a(C54201r rVar) {
        C20517e eVar = null;
        if ((rVar.f142245a & 1) != 0) {
            try {
                C56425d dVar = rVar.f142246b;
                if (dVar == null) {
                    dVar = C56425d.f150537g;
                }
                if ((rVar.f142245a & 4) != 0) {
                    C56425d dVar2 = rVar.f142246b;
                    if (dVar2 == null) {
                        dVar2 = C56425d.f150537g;
                    }
                    C56424c cVar = (C56424c) dVar2.toBuilder();
                    String str = rVar.f142249e;
                    cVar.copyOnWrite();
                    C56425d dVar3 = (C56425d) cVar.instance;
                    str.getClass();
                    dVar3.f150539a |= 8;
                    dVar3.f150544f = str;
                    dVar = (C56425d) cVar.build();
                }
                C20470a c = this.f57639b.mo25452c(dVar);
                if (c == null) {
                    return null;
                }
                eVar = new C20517e(this, c, this.f57642e);
            } catch (Exception e) {
                C20614e eVar2 = new C20614e();
                eVar2.mo25535e(C19742a.COMPONENT_INFLATION_FAILURE);
                eVar2.f57822b = "Failed to inflate component from RenderedCard with cause: ".concat(e.toString());
                C56425d dVar4 = rVar.f142246b;
                if (dVar4 == null) {
                    dVar4 = C56425d.f150537g;
                }
                eVar2.f57825e = dVar4.toString();
                eVar2.f57821a = e;
                C20520h.m38498c("ComponentView", eVar2.mo25531a(), this.f57638a, new Object[0]);
            }
        }
        if (rVar.f142247c.size() != 0) {
            try {
                mo25094c(rVar.f142247c);
            } catch (Exception e2) {
                C20614e eVar3 = new C20614e();
                eVar3.mo25535e(C19742a.COMPONENT_INFLATION_FAILURE);
                eVar3.f57822b = "Failed to load deferred images with cause: ".concat(e2.toString());
                eVar3.f57825e = rVar.f142247c.toString();
                eVar3.f57821a = e2;
                C20520h.m38498c("ComponentView", eVar3.mo25531a(), this.f57638a, new Object[0]);
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public final C62921ba mo25093b() {
        return this.f57641d.mo25101b();
    }

    /* renamed from: c */
    public final List mo25094c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C54190g gVar = (C54190g) it.next();
            C20540i iVar = this.f57640c;
            String str = gVar.f142217a;
            byte[] N = gVar.f142218b.mo59174N();
            ArrayList arrayList2 = new ArrayList();
            synchronized (iVar.f57692a) {
                C20539h hVar = (C20539h) iVar.f57692a.get(str);
                if (hVar == null) {
                    hVar = new C20539h();
                    iVar.f57692a.put(str, hVar);
                }
                hVar.f57689a = gVar.f142219c;
                hVar.f57690b = N;
                if (!hVar.f57691c.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(hVar.f57691c);
                    hVar.f57691c.clear();
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        C20538g gVar2 = (C20538g) arrayList3.get(i);
                        if (gVar.f142219c) {
                            C20482m.m38443k(iVar.mo25453a(gVar2.f57688c).mo25521b(str, gVar2.f57686a), gVar2.f57687b, iVar.f57693b);
                        } else {
                            C20482m.m38443k(iVar.mo25454b(str, N, gVar2.f57686a, gVar2.f57688c), gVar2.f57687b, iVar.f57693b);
                        }
                        arrayList2.add(gVar2.f57687b);
                    }
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo25095d() {
        C20540i iVar = this.f57640c;
        synchronized (iVar.f57692a) {
            for (Map.Entry value : iVar.f57692a.entrySet()) {
                for (C20538g gVar : ((C20539h) value.getValue()).f57691c) {
                    gVar.f57687b.cancel(false);
                }
            }
            iVar.f57692a.clear();
        }
        for (C20595bv a : this.f57643f.f57800a) {
            a.mo25525a();
        }
    }
}
