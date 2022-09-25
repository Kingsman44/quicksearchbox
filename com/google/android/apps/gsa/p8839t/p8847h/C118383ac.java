package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.t.h.ac */
/* compiled from: PG */
public final /* synthetic */ class C118383ac implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328606a;

    /* renamed from: b */
    public final /* synthetic */ List f328607b;

    /* renamed from: c */
    public final /* synthetic */ List f328608c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f328609d;

    public /* synthetic */ C118383ac(C118426bs bsVar, List list, List list2, C53306j jVar) {
        this.f328606a = bsVar;
        this.f328607b = list;
        this.f328608c = list2;
        this.f328609d = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118426bs bsVar = this.f328606a;
        List<C123728av> list = this.f328607b;
        List<ComponentName> list2 = this.f328608c;
        C53306j jVar = this.f328609d;
        Map map = (Map) obj;
        ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6994)).mo56387q("#getOnDeviceMediaForNewFetch(): queried total app size {%s}.", map.size());
        for (C123728av avVar : map.values()) {
            ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6997)).mo56359L("#getOnDeviceMediaForNewFetch(): queried {%s/%s} size {%s}.", avVar.f341756b, avVar.f341757c, Integer.valueOf(avVar.f341758d.size()));
        }
        HashMap hashMap = new HashMap();
        for (C123728av avVar2 : list) {
            hashMap.put(new ComponentName(avVar2.f341756b, avVar2.f341757c), avVar2);
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentName componentName : list2) {
            if (map.containsKey(componentName)) {
                C123728av avVar3 = (C123728av) map.get(componentName);
                long b = bsVar.f328697r.mo26870b() - (bsVar.f328696q.mo79743a(C90069du.f249709C) * 1000);
                ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6996)).mo56388r("#mergeOnDeviceMediaFromCacheAndNewFetch() validityCutoffTimestampMillis %s", b);
                if (!avVar3.f341758d.isEmpty() || !jVar.equals(C53306j.MORRIS) || !hashMap.containsKey(componentName) || ((C123728av) hashMap.get(componentName)).f341759e < b) {
                    arrayList.add(avVar3);
                } else {
                    arrayList.add((C123728av) hashMap.get(componentName));
                }
            } else if (hashMap.containsKey(componentName)) {
                arrayList.add((C123728av) hashMap.get(componentName));
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C123728av avVar4 = (C123728av) arrayList.get(i);
            ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6995)).mo56359L("#mergeOnDeviceMediaFromCacheAndNewFetch() merged on-device media {%s} {%s} size {%s}.", avVar4.f341756b, avVar4.f341757c, Integer.valueOf(avVar4.f341758d.size()));
        }
        return arrayList;
    }
}
