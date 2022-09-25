package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.p4017at.p4082j.p4083a.C54400cz;
import com.google.p4017at.p4082j.p4083a.C54402da;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.b.a.n */
/* compiled from: PG */
final class C140001n extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Map f380522a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140001n(Map map) {
        super(1);
        this.f380522a = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Map map = (Map) obj;
        C69664n.m101061g(map, "it");
        Map map2 = this.f380522a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Collection collection = (Collection) entry.getValue();
            if (!map.containsKey(str)) {
                linkedHashMap.put(str, collection);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object next : collection) {
                    Object obj2 = map.get(str);
                    C69664n.m101058d(obj2);
                    if (true ^ ((C54402da) obj2).mo54116b((String) next)) {
                        arrayList.add(next);
                    }
                }
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    linkedHashMap.put(str, arrayList);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            int b = C54400cz.m87377b(((C54402da) entry2.getValue()).f142890a);
            if (b != 0 && b == 6) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C69505av.m100860b(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            C63113l lVar = ((C54402da) entry3.getValue()).f142891b;
            if (lVar == null) {
                lVar = C63113l.f170365p;
            }
            linkedHashMap3.put(key, lVar.f170373g);
        }
        return new C140003p(linkedHashMap, linkedHashMap3);
    }
}
