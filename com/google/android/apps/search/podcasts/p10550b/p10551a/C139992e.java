package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.p4017at.p4082j.p4083a.C54398cx;
import com.google.p4017at.p4082j.p4083a.C54402da;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.b.a.e */
/* compiled from: PG */
final class C139992e extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C139992e f380501a = new C139992e();

    public C139992e() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List<Map> list = (List) obj;
        C69664n.m101061g(list, "successfulQueries");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map map : list) {
            C69664n.m101058d(map);
            for (Map.Entry entry : map.entrySet()) {
                Map.EL.merge(linkedHashMap, entry.getKey(), entry.getValue(), C139991d.f380500a);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C69505av.m100860b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), (C54402da) ((C54398cx) entry2.getValue()).build());
        }
        return linkedHashMap2;
    }
}
