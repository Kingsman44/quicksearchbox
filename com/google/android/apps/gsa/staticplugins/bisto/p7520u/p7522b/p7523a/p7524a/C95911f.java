package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.f */
/* compiled from: PG */
public final class C95911f extends C95909d {

    /* renamed from: c */
    private static final C59071e f268543c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.f");

    /* renamed from: d */
    private final C96023bs f268544d;

    public C95911f(C96023bs bsVar, C95346ax axVar, C89492cd cdVar, C95850a aVar) {
        super(bsVar, "CarAccessoryOobeState", axVar, cdVar, aVar);
        this.f268544d = bsVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268544d.mo89831a();
        this.f268544d.mo89840j(false);
        this.f268544d.mo89842l();
    }

    /* renamed from: l */
    public final boolean mo89848l(Intent intent) {
        if ("ACTION_OOBE_STATUS_UPDATED".equals(intent.getAction())) {
            C124633az b = C89636g.m145896b(intent);
            if (b == null) {
                C59104x c = f268543c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CarAccessoryOobeState");
                ((C59052c) ((C59052c) c).mo56372aa(15817)).mo56386p("OobeState is null");
                return true;
            }
            C58976aa aaVar = C58975e.f156826a;
            if (b.equals(C124633az.OOBE_IN_PROGRESS)) {
                C59104x b2 = f268543c.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "CarAccessoryOobeState");
                ((C59052c) ((C59052c) b2).mo56372aa(15816)).mo56386p("OOBE_IN_PROGRESS");
                mo89847j("ClassicOobeState", (Intent) null);
                return true;
            }
            C59104x d = f268543c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CarAccessoryOobeState");
            ((C59052c) ((C59052c) d).mo56372aa(15815)).mo56389s("ACTION_OOBE_STATUS_UPDATED. OobeState: %s", b);
        }
        if (!"android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            return super.mo89848l(intent);
        }
        C59104x b3 = f268543c.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "CarAccessoryOobeState");
        ((C59052c) ((C59052c) b3).mo56372aa(15813)).mo56386p("ACTION_ACL_DISCONNECTED - ignoring");
        return true;
    }
}
