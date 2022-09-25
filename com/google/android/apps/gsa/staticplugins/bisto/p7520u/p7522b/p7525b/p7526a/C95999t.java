package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.t */
/* compiled from: PG */
public final class C95999t extends C95980a {

    /* renamed from: c */
    private static final C59071e f268776c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.t");

    /* renamed from: d */
    private final C96023bs f268777d;

    /* renamed from: e */
    private final C95447t f268778e;

    public C95999t(C96023bs bsVar, C95447t tVar, C95850a aVar) {
        super(bsVar, "WiredReadyState", tVar, aVar);
        this.f268777d = bsVar;
        this.f268778e = tVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268777d.mo89831a();
        this.f268777d.mo89840j(true);
        if (this.f268777d.mo89843m()) {
            C59104x b = f268776c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredReadyState");
            ((C59052c) ((C59052c) b).mo56372aa(16008)).mo56386p("User interaction mode granted. Moving to INTERACTING_WIRED");
            mo89847j("WiredInteractingState", (Intent) null);
            return;
        }
        C59104x b2 = f268776c.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "WiredReadyState");
        ((C59052c) ((C59052c) b2).mo56372aa(16007)).mo56386p("User interaction mode denied. Staying in READY_WIRED");
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f268778e.mo89310v(z, z2, z3)) {
            C59104x b = f268776c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredReadyState");
            ((C59052c) ((C59052c) b).mo56372aa(16011)).mo56386p("Incorrect audio route; moving to READY_NO_AUDIO_WIRED");
            mo89847j("WiredReadyNoAudioState", (Intent) null);
        }
    }

    /* renamed from: s */
    public final void mo89850s() {
        C59071e eVar = f268776c;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WiredReadyState");
        ((C59052c) ((C59052c) b).mo56372aa(16012)).mo56386p("onUserInteractionModeAvailable");
        if (this.f268777d.mo89843m()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "WiredReadyState");
            ((C59052c) ((C59052c) b2).mo56372aa(16014)).mo56386p("User interaction mode granted. Moving to INTERACTING_WIRED");
            mo89847j("WiredInteractingState", (Intent) null);
            return;
        }
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "WiredReadyState");
        ((C59052c) ((C59052c) b3).mo56372aa(16013)).mo56386p("User interaction mode denied. Staying in READY_WIRED");
    }
}
