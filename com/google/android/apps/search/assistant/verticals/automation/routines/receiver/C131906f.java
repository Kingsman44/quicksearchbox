package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.afs;
import com.google.assistant.p3861at.afy;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.f */
/* compiled from: PG */
public final /* synthetic */ class C131906f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f360179a;

    public /* synthetic */ C131906f(String str) {
        this.f360179a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f360179a;
        act act = (act) obj;
        if ((act.f128894a & 512) == 0) {
            return afy.f129188g;
        }
        afs afs = act.f128903j;
        if (afs == null) {
            afs = afs.f129172b;
        }
        for (afy afy : afs.f129174a) {
            if (afy.f129191b.equals(str)) {
                C58976aa aaVar = C58975e.f156826a;
                String str2 = afy.f129191b;
                return afy;
            }
        }
        C59104x c = C131921u.f360205a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "RoutineGeofenceListener");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(new IllegalStateException(String.format("Failed to find matching workflow with id '%s' among the server workflows - this shouldn't happen", new Object[]{str})))).mo56372aa(39462)).mo56384n();
        return afy.f129188g;
    }
}
