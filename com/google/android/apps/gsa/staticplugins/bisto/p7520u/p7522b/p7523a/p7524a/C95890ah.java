package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89493ce;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ah */
/* compiled from: PG */
public final class C95890ah extends C95914i {

    /* renamed from: c */
    private static final C59071e f268480c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ah");

    /* renamed from: d */
    private final C95355bf f268481d;

    /* renamed from: e */
    private final C96023bs f268482e;

    /* renamed from: f */
    private final C89492cd f268483f;

    /* renamed from: g */
    private final C89493ce f268484g;

    public C95890ah(C95346ax axVar, C89492cd cdVar, C89493ce ceVar, C96023bs bsVar, C95848i iVar, C95850a aVar) {
        super(axVar, bsVar, "ReadyNoAudClassicState", cdVar, iVar, aVar);
        this.f268481d = axVar;
        this.f268482e = bsVar;
        this.f268483f = cdVar;
        this.f268484g = ceVar;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (set.contains(29)) {
            C59104x b = f268480c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ReadyNoAudClassicState");
            ((C59052c) ((C59052c) b).mo56372aa(15886)).mo56389s("OHD status change. Current status: %s", dVar.mo106461B());
            if (this.f268484g.mo83439a(dVar)) {
                mo89847j("OffHeadState", (Intent) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268482e.mo89831a();
        this.f268482e.mo89840j(true);
        this.f268482e.mo89842l();
        C124548d b = this.f268483f.mo83401b(this.f268481d.mo89270k());
        if (b == null) {
            C59104x c = f268480c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReadyNoAudClassicState");
            ((C59052c) ((C59052c) c).mo56372aa(15882)).mo56386p("Null BistoDeviceInfo");
        } else if (this.f268484g.mo83439a(b)) {
            mo89847j("OffHeadState", (Intent) null);
        }
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z || z2 || !z3) {
            C59104x b = f268480c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ReadyNoAudClassicState");
            ((C59052c) ((C59052c) b).mo56372aa(15884)).mo56386p("Incorrect audio route; staying in READY_NO_AUDIO");
            return;
        }
        this.f268481d.mo89263d();
        mo89847j("ReadyClassicState", (Intent) null);
    }
}
