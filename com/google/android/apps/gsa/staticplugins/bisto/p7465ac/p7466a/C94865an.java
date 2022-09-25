package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.an */
/* compiled from: PG */
final class C94865an implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f265279a;

    /* renamed from: b */
    final /* synthetic */ C94866ao f265280b;

    public C94865an(C94866ao aoVar, C60870cx cxVar) {
        this.f265280b = aoVar;
        this.f265279a = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C94868aq.f265285a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoGattHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(17374)).mo56386p("Could not complete RSSI read");
        this.f265280b.f265281a.f265307t.remove(this.f265279a);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        C59071e eVar = C94868aq.f265285a;
        C58976aa aaVar = C58975e.f156826a;
        this.f265280b.f265281a.f265307t.remove(this.f265279a);
    }
}
