package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32954a;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32971d;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32972e;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32974g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33183h;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2557b.C33186b;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.y */
/* compiled from: PG */
public final class C33211y implements C33183h {

    /* renamed from: a */
    public final C46801dp f88813a;

    /* renamed from: b */
    public final C33186b f88814b;

    /* renamed from: c */
    public final Map f88815c = new LinkedHashMap();

    public C33211y(C46801dp dpVar, C33186b bVar) {
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(bVar, "deviceSettingDataService");
        this.f88813a = dpVar;
        this.f88814b = bVar;
    }

    /* renamed from: a */
    public final boolean mo38582a(C32971d dVar, C32974g gVar) {
        Map map = this.f88815c;
        String dVar2 = dVar.toString();
        Object obj = map.get(dVar2);
        if (obj == null) {
            obj = new ArrayList();
            map.put(dVar2, obj);
        }
        ((List) obj).add(gVar);
        C33186b bVar = this.f88814b;
        if (bVar.f88757c.containsKey(dVar.toString())) {
            C58976aa aaVar = C58975e.f156826a;
            return true;
        }
        C59104x b = C33186b.f88755a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
        ((C59052c) ((C59052c) b).mo56372aa(50937)).mo56389s("Subscribing to data change for setting: %s", ((C32954a) dVar).f88287a);
        Optional a = bVar.f88759e.mo38405a(dVar, bVar);
        if (!a.isPresent()) {
            List list = (List) this.f88815c.get(dVar.toString());
            if (list == null) {
                return false;
            }
            C32974g gVar2 = (C32974g) C69540x.m100810q(list);
            return false;
        }
        bVar.f88757c.put(dVar.toString(), (C32972e) a.get());
        return true;
    }
}
