package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.android.apps.gsa.p8839t.p8845f.C118362d;
import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123727au;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123729aw;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.t.h.am */
/* compiled from: PG */
public final /* synthetic */ class C118393am implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328622a;

    /* renamed from: b */
    public final /* synthetic */ List f328623b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f328624c;

    public /* synthetic */ C118393am(C118426bs bsVar, List list, C53306j jVar) {
        this.f328622a = bsVar;
        this.f328623b = list;
        this.f328624c = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118426bs bsVar = this.f328622a;
        List<ComponentName> list = this.f328623b;
        C53306j jVar = this.f328624c;
        List<C123728av> list2 = (List) obj;
        if (list2 == null || list2.isEmpty()) {
            return C58836b.f156633a;
        }
        HashMap hashMap = new HashMap();
        for (C123728av avVar : list2) {
            hashMap.put(new ComponentName(avVar.f341756b, avVar.f341757c), avVar);
            ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6974)).mo56359L("#filterAndSortOnDeviceMedia() available on-device media {%s} {%s} size {%s}.", avVar.f341756b, avVar.f341757c, Integer.valueOf(avVar.f341758d.size()));
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentName componentName : list) {
            if (hashMap.containsKey(componentName)) {
                C123728av avVar2 = (C123728av) hashMap.get(componentName);
                ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6973)).mo56359L("#filterAndSortOnDeviceMedia() on-device media in result {%s} {%s} size {%s}.", avVar2.f341756b, avVar2.f341757c, Integer.valueOf(avVar2.f341758d.size()));
                if (bsVar.f328698s.contains(jVar.name())) {
                    C123727au auVar = (C123727au) avVar2.toBuilder();
                    auVar.copyOnWrite();
                    ((C123728av) auVar.instance).f341758d = C123728av.emptyProtobufList();
                    auVar.mo106112a((Iterable) Collection.EL.stream(avVar2.f341758d).filter(C118384ad.f328610a).collect(Collectors.toList()));
                    arrayList.add((C123728av) auVar.build());
                } else {
                    arrayList.add(avVar2);
                }
            }
        }
        C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
        C118362d dVar = (C118362d) C118363e.f328532h.createBuilder();
        dVar.copyOnWrite();
        C118363e eVar = (C118363e) dVar.instance;
        eVar.f328534a |= 1;
        eVar.f328537d = 9;
        C123729aw awVar = (C123729aw) C123730ax.f341767b.createBuilder();
        awVar.mo106114a(arrayList);
        dVar.copyOnWrite();
        C118363e eVar2 = (C118363e) dVar.instance;
        C123730ax axVar = (C123730ax) awVar.build();
        axVar.getClass();
        eVar2.f328536c = axVar;
        eVar2.f328535b = 5;
        fVar.mo103680b(dVar);
        return C58833ax.m90834k((C118365g) fVar.build());
    }
}
