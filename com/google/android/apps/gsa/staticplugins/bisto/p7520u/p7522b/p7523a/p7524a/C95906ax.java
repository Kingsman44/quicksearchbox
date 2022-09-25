package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ax */
/* compiled from: PG */
public final class C95906ax extends C95909d {

    /* renamed from: c */
    public static final C59071e f268524c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ax");

    /* renamed from: d */
    static final long f268525d = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: e */
    public final C95355bf f268526e;

    /* renamed from: f */
    private final C22871g f268527f;

    /* renamed from: g */
    private C60870cx f268528g;

    public C95906ax(C96023bs bsVar, C22871g gVar, C95346ax axVar, C89492cd cdVar, C95850a aVar) {
        super(bsVar, "WaitingToReconnectState", axVar, cdVar, aVar);
        this.f268526e = axVar;
        this.f268527f = gVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        C60870cx cxVar = this.f268528g;
        if (cxVar != null) {
            C59104x c = f268524c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WaitingToReconnectState");
            ((C59052c) ((C59052c) c).mo56372aa(15937)).mo56386p("waitFuture is not null");
            if (!cxVar.isDone()) {
                cxVar.cancel(false);
            }
        }
        C60870cx h = this.f268527f.mo28208h("WaitBeforeReconnect", f268525d, C95903au.f268521a);
        this.f268528g = h;
        C90875ai.m148465b(new C95904av(this), h, this.f268527f, "reconnecting").mo85223a(C95905aw.f268523a);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C60870cx cxVar = this.f268528g;
        if (cxVar != null && !cxVar.isDone()) {
            this.f268528g.cancel(false);
        }
        this.f268528g = null;
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
    }
}
