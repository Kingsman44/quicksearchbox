package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a.C129152e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c.p9799a.C129153f;
import com.google.android.libraries.home.p1940a.p1941a.C23344a;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.android.libraries.home.p1940a.p1943c.C23405ah;
import com.google.android.libraries.home.p1940a.p1943c.C23408ak;
import com.google.android.libraries.home.p1940a.p1943c.C23418au;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import com.google.android.libraries.home.p1948c.p1949a.C23626h;
import com.google.android.libraries.home.p1948c.p1949a.C23627i;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.assistant.p3897e.p3921j.p3926e.C52026hy;
import com.google.assistant.p3897e.p3921j.p3926e.C52027hz;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.c */
/* compiled from: PG */
public final class C129156c {

    /* renamed from: a */
    public static final C59071e f354794a = C59071e.m91331h();

    /* renamed from: b */
    public final C23627i f354795b;

    /* renamed from: c */
    public final C46801dp f354796c;

    /* renamed from: d */
    public final Map f354797d;

    /* renamed from: e */
    public final C129152e f354798e;

    /* renamed from: f */
    public C23626h f354799f;

    /* renamed from: g */
    public final C1291571 f354800g;

    public C129156c(C52027hz hzVar, C129153f fVar, C23627i iVar, C46801dp dpVar) {
        C69664n.m101061g(fVar, "dataServiceFactory");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        this.f354795b = iVar;
        this.f354796c = dpVar;
        C62971cq<C52026hy> cqVar = hzVar.f136552a;
        C69664n.m101060f(cqVar, "args.devicesAffectedList");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
        for (C52026hy hyVar : cqVar) {
            C69664n.m101060f(hyVar, "it");
            arrayList.add(C23344a.m43782a(hyVar));
        }
        int b = C69505av.m100860b(C69540x.m100804k(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(b < 16 ? 16 : b);
        for (Object next : arrayList) {
            linkedHashMap.put(((C23404ag) next).f63965a.f63989a, next);
        }
        this.f354797d = linkedHashMap;
        this.f354798e = fVar.mo108865a(linkedHashMap);
        this.f354800g = new C46792di() {
            /* renamed from: a */
            public final void mo18077a(Throwable th) {
                C69664n.m101061g(th, C42181t.f110467a);
                C23626h a = C129156c.this.mo108868a();
                Map a2 = C129156c.this.mo108868a().mo28942a();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(a2.size()));
                for (Map.Entry entry : a2.entrySet()) {
                    Object key = entry.getKey();
                    C23404ag agVar = (C23404ag) entry.getValue();
                    Map r = C69505av.m100876r(agVar.f63966b);
                    r.put(C23574eu.DEVICE_STATUS, new C23418au(C23405ah.m43825b(C23408ak.UNKNOWN.f63975f, true), 5));
                    linkedHashMap.put(key, new C23404ag(agVar.f63965a, r));
                }
                a.mo28943b(linkedHashMap);
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
                Map map = (Map) obj;
                C69664n.m101061g(map, "data");
                C129156c.this.mo108868a().mo28943b(map);
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18079c() {
            }
        };
    }

    /* renamed from: a */
    public final C23626h mo108868a() {
        C23626h hVar = this.f354799f;
        if (hVar != null) {
            return hVar;
        }
        C69664n.m101065k("deviceControlViewManager");
        return null;
    }
}
