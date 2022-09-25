package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50181no;
import com.google.assistant.p3861at.C50189nw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cr */
/* compiled from: PG */
public final /* synthetic */ class C108618cr implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108623cw f302140a;

    public /* synthetic */ C108618cr(C108623cw cwVar) {
        this.f302140a = cwVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C50189nw nwVar = (C50189nw) obj;
        String str = this.f302140a.f302148b;
        if (str == null) {
            return C58836b.f156633a;
        }
        for (C50181no noVar : nwVar.f130474a) {
            if (C90772bp.m148275B(noVar.f130446a, str)) {
                return C58833ax.m90834k(noVar);
            }
        }
        C59104x c = C108623cw.f302147a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DeviceSetupRespCache");
        ((C59052c) ((C59052c) c).mo56372aa(24166)).mo56354G("#findProviderWithPantheonId: Could not find provider with id %s in response=%s", str, nwVar);
        return C58836b.f156633a;
    }
}
