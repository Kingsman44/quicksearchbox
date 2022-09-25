package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.d */
/* compiled from: PG */
public final class C95983d extends C95980a {

    /* renamed from: c */
    public static final C59071e f268726c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.d");

    /* renamed from: d */
    private final C95355bf f268727d;

    /* renamed from: e */
    private final C22871g f268728e;

    /* renamed from: f */
    private final C96023bs f268729f;

    /* renamed from: g */
    private C60870cx f268730g;

    public C95983d(C96023bs bsVar, C22871g gVar, C95447t tVar, C95850a aVar) {
        super(bsVar, "WiredConnectingState", tVar, aVar);
        this.f268727d = tVar;
        this.f268728e = gVar;
        this.f268729f = bsVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268729f.mo89831a();
        if (this.f268727d.mo89278w()) {
            C59104x b = f268726c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredConnectingState");
            ((C59052c) ((C59052c) b).mo56372aa(15980)).mo56386p("Already connected, moving to INIT_WIRED");
            mo89847j("WiredInitState", (Intent) null);
            return;
        }
        C59104x b2 = f268726c.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "WiredConnectingState");
        ((C59052c) ((C59052c) b2).mo56372aa(15979)).mo56386p("Connecting");
        C60870cx e = this.f268727d.mo89264e();
        this.f268730g = e;
        C90875ai.m148465b(new C95981b(this), e, this.f268728e, "onConnected").mo85223a(new C95982c(this));
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        C60870cx cxVar = this.f268730g;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        this.f268730g = null;
    }
}
