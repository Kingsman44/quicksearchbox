package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89493ce;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ai */
/* compiled from: PG */
public final class C95891ai extends C95914i {

    /* renamed from: c */
    private static final C59071e f268485c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ai");

    /* renamed from: d */
    private final C96023bs f268486d;

    /* renamed from: e */
    private final C89493ce f268487e;

    public C95891ai(C95346ax axVar, C89492cd cdVar, C89493ce ceVar, C96023bs bsVar, C95848i iVar, C95850a aVar) {
        super(axVar, bsVar, "ReadyClassicState", cdVar, iVar, aVar);
        this.f268486d = bsVar;
        this.f268487e = ceVar;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (set.contains(29)) {
            C59104x b = f268485c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ReadyClassicState");
            ((C59052c) ((C59052c) b).mo56372aa(15892)).mo56389s("OHD status change. Current status: %s", dVar.mo106461B());
            if (this.f268487e.mo83439a(dVar)) {
                mo89847j("OffHeadState", (Intent) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268486d.mo89831a();
        this.f268486d.mo89840j(true);
        this.f268486d.mo89842l();
        if (this.f268486d.mo89843m()) {
            C59104x b = f268485c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ReadyClassicState");
            ((C59052c) ((C59052c) b).mo56372aa(15888)).mo56386p("User interaction mode granted. Moving to DISPATCHING");
            mo89847j("DispatchingState", (Intent) null);
            return;
        }
        C59104x b2 = f268485c.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ReadyClassicState");
        ((C59052c) ((C59052c) b2).mo56372aa(15887)).mo56386p("User interaction mode denied. Staying in READY");
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z || z2 || !z3) {
            C59104x b = f268485c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ReadyClassicState");
            ((C59052c) ((C59052c) b).mo56372aa(15890)).mo56386p("Incorrect audio route; moving to READY_NO_AUDIO");
            mo89847j("ReadyNoAudClassicState", (Intent) null);
        }
    }

    /* renamed from: s */
    public final void mo89850s() {
        C59071e eVar = f268485c;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ReadyClassicState");
        ((C59052c) ((C59052c) b).mo56372aa(15893)).mo56386p("onUserInteractionModeAvailable");
        if (this.f268486d.mo89843m()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ReadyClassicState");
            ((C59052c) ((C59052c) b2).mo56372aa(15895)).mo56386p("User interaction mode granted. Moving to DISPATCHING");
            mo89847j("DispatchingState", (Intent) null);
            return;
        }
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "ReadyClassicState");
        ((C59052c) ((C59052c) b3).mo56372aa(15894)).mo56386p("User interaction mode denied. Staying in READY");
    }
}
