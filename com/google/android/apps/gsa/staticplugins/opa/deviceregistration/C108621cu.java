package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cu */
/* compiled from: PG */
public final /* synthetic */ class C108621cu implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108623cw f302144a;

    /* renamed from: b */
    public final /* synthetic */ String f302145b;

    public /* synthetic */ C108621cu(C108623cw cwVar, String str) {
        this.f302144a = cwVar;
        this.f302145b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108623cw cwVar = this.f302144a;
        String str = this.f302145b;
        acz acz = (acz) obj;
        if (cwVar.f302150d.mo26871c() - cwVar.f302152f < ((long) ((int) cwVar.f302151e.mo79743a(C90053de.f248983p)))) {
            C59104x b = C108623cw.f302147a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceSetupRespCache");
            ((C59052c) ((C59052c) b).mo56372aa(24173)).mo56389s("Sync provider (%s) re-use result.", str);
            return C60856cj.m92900i(acz);
        }
        C59104x b2 = C108623cw.f302147a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "DeviceSetupRespCache");
        ((C59052c) ((C59052c) b2).mo56372aa(24172)).mo56389s("Re-Sync provider (%s) .", str);
        cwVar.f302152f = cwVar.f302150d.mo26871c();
        return cwVar.f302149c.mo97029d(str);
    }
}
