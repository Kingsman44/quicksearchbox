package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.t.h.bn */
/* compiled from: PG */
public final /* synthetic */ class C118421bn implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328670a;

    /* renamed from: b */
    public final /* synthetic */ List f328671b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f328672c;

    /* renamed from: d */
    public final /* synthetic */ List f328673d;

    public /* synthetic */ C118421bn(C118426bs bsVar, List list, C53306j jVar, List list2) {
        this.f328670a = bsVar;
        this.f328671b = list;
        this.f328672c = jVar;
        this.f328673d = list2;
    }

    public final Object apply(Object obj) {
        C58485gu guVar;
        C118426bs bsVar = this.f328670a;
        List list = this.f328671b;
        C53306j jVar = this.f328672c;
        List list2 = this.f328673d;
        List list3 = (List) obj;
        HashMap hashMap = new HashMap();
        int i = 0;
        int i2 = 0;
        while (i2 < list.size() && i2 < list3.size()) {
            if (((C58833ax) list3.get(i2)).mo56113h()) {
                hashMap.put((ComponentName) list.get(i2), (C123728av) ((C58833ax) list3.get(i2)).mo56107c());
            }
            i2++;
        }
        C58485gu j = C58485gu.m89842j(list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = j.size();
        while (i < size) {
            ComponentName componentName = (ComponentName) j.get(i);
            if (!hashMap.containsKey(componentName)) {
                ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6985)).mo56389s("#getOnDeviceMediaAppsForNewFetch() cache not available %s", componentName);
                linkedHashSet.add(componentName);
                guVar = j;
            } else {
                C123728av avVar = (C123728av) hashMap.get(componentName);
                String str = avVar.f341756b;
                String str2 = avVar.f341757c;
                Map map = bsVar.f328701v;
                ComponentName componentName2 = new ComponentName(str, str2);
                C86124t tVar = bsVar.f328696q;
                C90102f fVar = (C90102f) C118426bs.f328684f.get(9);
                fVar.getClass();
                long b = bsVar.f328697r.mo26870b() - (((Long) Map.EL.getOrDefault(map, componentName2, Long.valueOf(tVar.mo79743a(fVar)))).longValue() * 1000);
                ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6970)).mo56388r("#getCutoffTimeByProvider() cutoff time %s", b);
                if (avVar.f341759e >= b || bsVar.mo103696h(jVar, 9)) {
                    guVar = j;
                    ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6983)).mo56359L("#getOnDeviceMediaAppsForNewFetch() cache available {%s %s} size %s ", avVar.f341756b, avVar.f341757c, Integer.valueOf(avVar.f341758d.size()));
                    list2.add(avVar);
                } else {
                    guVar = j;
                }
                if (avVar.f341759e < b) {
                    ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6984)).mo56389s("#getOnDeviceMediaAppsForNewFetch() cache expired %s", componentName);
                    linkedHashSet.add(componentName);
                }
            }
            i++;
            j = guVar;
        }
        ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6982)).mo56389s("#getOnDeviceMediaAppsForNewFetch() componentNamesForNewFetch %s", linkedHashSet);
        return linkedHashSet;
    }
}
