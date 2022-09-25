package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.p10712d.C142467gk;
import com.google.android.p10712d.C142468gl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.x */
/* compiled from: PG */
public final /* synthetic */ class C96621x implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C142467gk f270309a;

    /* renamed from: b */
    public final /* synthetic */ C90919bp f270310b;

    /* renamed from: c */
    public final /* synthetic */ C22869e f270311c;

    public /* synthetic */ C96621x(C142467gk gkVar, C90919bp bpVar, C22869e eVar) {
        this.f270309a = gkVar;
        this.f270310b = bpVar;
        this.f270311c = eVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C142467gk gkVar = this.f270309a;
        C90919bp bpVar = this.f270310b;
        C22869e eVar = this.f270311c;
        Map map = (Map) obj;
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            Integer valueOf = Integer.valueOf(intValue2);
            C142468gl glVar = (C142468gl) map.get(valueOf);
            C142467gk a = C142467gk.m231089a(glVar.f386623b);
            if (a == null) {
                a = C142467gk.OTA_UNKNOWN;
            }
            if (!a.equals(gkVar)) {
                C59104x c = C96525ak.f270048a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OtaRunner");
                C59052c cVar = (C59052c) ((C59052c) c).mo56372aa(16582);
                int i = glVar.f386623b;
                C142467gk a2 = C142467gk.m231089a(i);
                if (a2 == null) {
                    a2 = C142467gk.OTA_UNKNOWN;
                }
                Integer valueOf2 = Integer.valueOf(a2.f386619k);
                C142467gk a3 = C142467gk.m231089a(i);
                if (a3 == null) {
                    a3 = C142467gk.OTA_UNKNOWN;
                }
                cVar.mo56359L("Incorrect transfer state on device #%d: %d %s; aborting OTA", valueOf, valueOf2, a3);
                C142467gk a4 = C142467gk.m231089a(glVar.f386623b);
                if (a4 == null) {
                    a4 = C142467gk.OTA_UNKNOWN;
                }
                int i2 = a4.f386619k;
                int i3 = gkVar.f386619k;
                bpVar.mo17870a(new C96584cp("After upload device # " + intValue2 + "is in " + i2 + "state instead of " + i3));
                return;
            }
        }
        eVar.run();
    }
}
