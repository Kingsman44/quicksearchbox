package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ap */
/* compiled from: PG */
public final class C95898ap extends C95909d {

    /* renamed from: c */
    public static final C59071e f268501c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ap");

    /* renamed from: d */
    public C60870cx f268502d;

    /* renamed from: e */
    private final C95346ax f268503e;

    /* renamed from: f */
    private final C22871g f268504f;

    public C95898ap(C96023bs bsVar, C22871g gVar, C95346ax axVar, C89492cd cdVar, C95850a aVar) {
        super(bsVar, "TwsReconnectingNonInteractingState", axVar, cdVar, aVar);
        this.f268503e = axVar;
        this.f268504f = gVar;
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        C60870cx cxVar = this.f268502d;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f268502d = null;
        }
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C59104x b = f268501c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TwsRecNonInteractState");
        ((C59052c) ((C59052c) b).mo56372aa(15914)).mo56360M("Ignored: onAudioRouteChange: route: %s, BT: %b, Usb: %b, Local: %b", routeInfo, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: l */
    public final boolean mo89848l(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            C59104x c = f268501c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TwsRecNonInteractState");
            ((C59052c) ((C59052c) c).mo56372aa(15917)).mo56386p("Null action");
            return false;
        } else if (!action.equals("bisto_force_role_change")) {
            return super.mo89848l(intent);
        } else {
            long longExtra = intent.getLongExtra("bisto_role_change_delay", 0);
            C59104x b = f268501c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TwsRecNonInteractState");
            ((C59052c) ((C59052c) b).mo56372aa(15916)).mo56388r("TWS role change request. Delay: %d", longExtra);
            C60870cx g = this.f268503e.mo89266g(longExtra);
            this.f268502d = g;
            C90875ai.m148465b(new C95896an(this), g, this.f268504f, "onReconnect").mo85223a(new C95897ao(this));
            return true;
        }
    }
}
