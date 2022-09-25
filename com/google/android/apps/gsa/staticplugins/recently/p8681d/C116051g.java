package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1875j.C22831b;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.g */
/* compiled from: PG */
public final /* synthetic */ class C116051g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321799a;

    public /* synthetic */ C116051g(C116070z zVar) {
        this.f321799a = zVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116070z zVar = this.f321799a;
        C22831b bVar = (C22831b) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (zVar.f321848i.contains(zVar.f321850k)) {
            zVar.f321848i.remove(zVar.f321850k);
            ArrayList arrayList = new ArrayList(bVar.f62862a.size());
            for (int i = 0; i < bVar.f62862a.size(); i++) {
                arrayList.add(Long.valueOf(((C22845p) bVar.f62862a.get(i)).f62893b));
            }
            zVar.f321847h.put(zVar.f321850k, arrayList);
            zVar.f321846g.clear();
            zVar.f321849j.clear();
        }
        zVar.f321845f.put(zVar.f321850k, bVar);
        boolean z = true;
        for (Map.Entry entry : zVar.f321846g.entrySet()) {
            String str = (String) entry.getKey();
            for (C22845p pVar : (List) entry.getValue()) {
                z &= zVar.f321845f.get(str) == null;
                zVar.mo102436f(pVar, str);
            }
        }
        zVar.f321846g.clear();
        for (Map.Entry entry2 : zVar.f321847h.entrySet()) {
            String str2 = (String) entry2.getKey();
            str2.getClass();
            List list = (List) entry2.getValue();
            int size = list.size();
            long[] jArr = new long[size];
            for (int i2 = 0; i2 < size; i2++) {
                jArr[i2] = ((Long) list.get(i2)).longValue();
            }
            C22831b bVar2 = (C22831b) zVar.f321845f.get(str2);
            if (bVar2 != null) {
                zVar.mo102451u(jArr, bVar2, str2);
            } else {
                return;
            }
        }
        zVar.f321847h.clear();
        ArrayList arrayList2 = new ArrayList(zVar.f321849j);
        zVar.f321849j.clear();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            zVar.mo102439i((String) arrayList2.get(i3));
        }
        if (z) {
            zVar.mo102449s();
        }
        zVar.mo102452v(zVar.f321850k);
    }
}
