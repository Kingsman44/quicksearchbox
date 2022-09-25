package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34703m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68220f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.c */
/* compiled from: PG */
public final class C34271c implements C68220f {
    /* renamed from: a */
    public static C34217a m62925a(C34231an anVar) {
        C69664n.m101061g(anVar, "invocationSourceDefinitions");
        Map map = anVar.f91082a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry value : map.entrySet()) {
            C34703m mVar = (C34703m) value.getValue();
        }
        Set<C34043bf> keySet = linkedHashMap.keySet();
        C59052c cVar = (C59052c) C34244b.f91102a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.SourceDefinitions");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(keySet, 10));
        for (C34043bf name : keySet) {
            arrayList.add(name.name());
        }
        cVar.mo56379ah(new C59094n(51340));
        cVar.mo56389s("Sources to await state propagation: %s.", arrayList);
        return new C34217a(keySet);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
