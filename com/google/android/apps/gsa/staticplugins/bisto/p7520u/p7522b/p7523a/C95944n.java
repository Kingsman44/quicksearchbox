package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.n */
/* compiled from: PG */
final class C95944n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C124633az f268648a;

    /* renamed from: b */
    final /* synthetic */ C95950t f268649b;

    public C95944n(C95950t tVar, C124633az azVar) {
        this.f268649b = tVar;
        this.f268648a = azVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95950t.f268659c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15766)).mo56386p("Failed to send enable opa");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        C59104x b = C95950t.f268659c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ClassicDeviceLCManager");
        ((C59052c) ((C59052c) b).mo56372aa(15767)).mo56386p("Enable opa OK");
        if (this.f268648a != null) {
            C95950t tVar = this.f268649b;
            tVar.f268663g.mo83394aj(tVar.f268660d.mo89270k(), C124636bb.OPA_ENABLED, this.f268648a);
        }
    }
}
