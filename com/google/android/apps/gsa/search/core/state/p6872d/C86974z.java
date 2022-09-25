package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6546am.C84711c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58800sl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.z */
/* compiled from: PG */
public final /* synthetic */ class C86974z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C86910ad f234915a;

    /* renamed from: b */
    public final /* synthetic */ long f234916b;

    public /* synthetic */ C86974z(C86910ad adVar, long j) {
        this.f234915a = adVar;
        this.f234916b = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        boolean z;
        C86910ad adVar = this.f234915a;
        long j = this.f234916b;
        C84711c cVar = (C84711c) obj;
        if (cVar.mo78429a().isEmpty()) {
            z = false;
        } else {
            C58800sl lA = cVar.mo78429a().iterator();
            while (lA.hasNext()) {
                int intValue = ((Integer) lA.next()).intValue();
                Map map = adVar.f234705c;
                Integer valueOf = Integer.valueOf(intValue);
                if (!map.containsKey(valueOf)) {
                    adVar.f234705c.put(valueOf, new ArrayList());
                }
                List list = (List) adVar.f234705c.get(valueOf);
                list.getClass();
                list.add(cVar.mo78430b());
            }
            adVar.mo80591ar();
            z = true;
        }
        adVar.f234704b.mo78436c(j, z);
    }
}
