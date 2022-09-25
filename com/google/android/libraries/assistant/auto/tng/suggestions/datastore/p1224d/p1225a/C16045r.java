package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.r */
/* compiled from: PG */
public final /* synthetic */ class C16045r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47499a;

    /* renamed from: b */
    public final /* synthetic */ List f47500b;

    public /* synthetic */ C16045r(C16027ax axVar, List list) {
        this.f47499a = axVar;
        this.f47500b = list;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47499a;
        List<C16170n> list = this.f47500b;
        List list2 = (List) obj;
        HashSet v = C16027ax.m32837v(list2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C16170n nVar : list) {
            String f = nVar.mo22752f();
            C58976aa aaVar = C58975e.f156826a;
            if (v.contains(f)) {
                arrayList2.add(nVar);
            } else {
                arrayList.add(nVar);
            }
        }
        return C47633f.m84733g(axVar.f47454e.mo22687g(arrayList2)).mo51516i(new C16049v(axVar, arrayList), axVar.f47452c).mo51515h(new C16010ag(list2), axVar.f47452c);
    }
}
