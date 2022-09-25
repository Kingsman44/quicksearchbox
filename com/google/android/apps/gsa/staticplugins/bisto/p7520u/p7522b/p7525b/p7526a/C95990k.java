package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95495l;
import com.google.android.apps.gsa.staticplugins.bisto.p7530v.C96511d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C95990k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95993n f268743a;

    public /* synthetic */ C95990k(C95993n nVar) {
        this.f268743a = nVar;
    }

    public final void run() {
        C95993n nVar = this.f268743a;
        C124548d b = ((C89492cd) nVar.f268751g.mo27525b()).mo83401b(nVar.f268749e.mo89270k());
        if (b == null) {
            C59104x c = C95993n.f268747c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WiredInitState");
            ((C59052c) ((C59052c) c).mo56372aa(15991)).mo56386p("Null BistoDeviceInfo");
            nVar.mo89847j("WiredDisconnectingState", (Intent) null);
        } else if (C124636bb.OPA_DISABLED_BY_USER.equals(b.mo106521s())) {
            C58976aa aaVar = C58975e.f156826a;
            nVar.mo89847j("WiredDisconnectingState", (Intent) null);
        } else {
            boolean equals = "wired".equals(nVar.f268749e.mo89270k());
            C124633az r = b.mo106520r();
            if (!equals && r == C124633az.OOBE_IN_PROGRESS) {
                nVar.mo89847j("WiredOobeState", (Intent) null);
            } else if (r == C124633az.OOBE_FINISHED) {
                ((C95495l) nVar.f268753i.mo27525b()).mo89391a(nVar.f268749e.mo89270k());
                nVar.mo89847j("WiredReadyNoAudioState", (Intent) null);
            } else {
                ((C96511d) nVar.f268750f.mo27525b()).mo90199b(nVar.f268749e.mo89270k(), b, b.mo106476Q());
                if (equals) {
                    ((C89492cd) nVar.f268751g.mo27525b()).mo83394aj(nVar.f268749e.mo89270k(), C124636bb.OPA_ENABLED, (C124633az) null);
                    nVar.mo89847j("WiredReadyNoAudioState", (Intent) null);
                    return;
                }
                nVar.mo89847j("WiredDisconnectingState", (Intent) null);
            }
        }
    }
}
