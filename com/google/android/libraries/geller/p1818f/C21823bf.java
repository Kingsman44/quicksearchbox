package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.f.bf */
/* compiled from: PG */
public final /* synthetic */ class C21823bf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f60213a;

    public /* synthetic */ C21823bf(Map map) {
        this.f60213a = map;
    }

    public final Object apply(Object obj) {
        C21850cf cfVar;
        Map map = this.f60213a;
        Map map2 = (Map) obj;
        HashMap hashMap = new HashMap();
        for (C65753ak akVar : map.keySet()) {
            if (map2.containsKey(akVar)) {
                cfVar = ((C21850cf) map.get(akVar)).mo27155e((C21850cf) map2.get(akVar));
            } else {
                cfVar = (C21850cf) map.get(akVar);
            }
            hashMap.put(akVar, cfVar);
        }
        return hashMap;
    }
}
