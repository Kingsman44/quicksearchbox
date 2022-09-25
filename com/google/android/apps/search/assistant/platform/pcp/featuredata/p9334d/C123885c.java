package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.android.gms.common.data.C143864d;
import com.google.android.gms.reminders.model.C145854z;
import com.google.android.gms.reminders.model.Task;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.c */
/* compiled from: PG */
public final /* synthetic */ class C123885c implements C60931s {
    public final C60870cx apply(Object obj) {
        C145854z zVar = (C145854z) obj;
        ArrayList arrayList = new ArrayList();
        if (zVar != null) {
            try {
                C143864d dVar = new C143864d(zVar);
                while (dVar.hasNext()) {
                    arrayList.add(C123906x.m203206a((Task) dVar.next()));
                }
            } finally {
                zVar.mo119102b();
            }
        }
        C59104x b = C123886d.f342201a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.ReminderAccessor");
        ((C59052c) ((C59052c) b).mo56372aa(35327)).mo56387q("total reminders found is %d", arrayList.size());
        return C60856cj.m92900i(arrayList);
    }
}
