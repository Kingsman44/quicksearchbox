package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ba */
/* compiled from: PG */
public final /* synthetic */ class C9582ba implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33188a;

    public /* synthetic */ C9582ba(C9619ck ckVar) {
        this.f33188a = ckVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C9619ck ckVar = this.f33188a;
        C58976aa aaVar = C58975e.f156826a;
        if (ckVar.f33286t != null) {
            if (i == -1) {
                C59104x b = C9619ck.f33236i.mo56224b();
                b.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                ((C59052c) ((C59052c) b).mo56372aa(424)).mo56386p("VoiceMatchEnrollment succeeded hotword enabled.");
                ckVar.f33292z = 0;
                if (ckVar.mo17906O()) {
                    ckVar.mo17790D(false);
                    C89635f fVar = ckVar.f33239C;
                    C58833ax j = C58833ax.m90833j(ckVar.f33281o.mo79668a());
                    String str = ckVar.f33286t;
                    str.getClass();
                    C90875ai.m148465b(new C9587bf(ckVar), fVar.mo83521e(j, str, true), ckVar.f33278l, "refresh-ui").mo85223a(new C9588bg(ckVar));
                } else {
                    ckVar.f33279m.mo90176d(ckVar.f33286t, true);
                }
            } else if (!ckVar.f33240D) {
                C59104x b2 = C9619ck.f33236i.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                ((C59052c) ((C59052c) b2).mo56372aa(423)).mo56386p("VoiceMatchEnrollment failed hotword disabled.");
                ckVar.f33279m.mo90176d(ckVar.f33286t, false);
            }
        }
        return true;
    }
}
