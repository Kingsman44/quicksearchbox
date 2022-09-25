package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.d */
/* compiled from: PG */
final class C95934d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C95937g f268618a;

    public C95934d(C95937g gVar) {
        this.f268618a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95937g.f268622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15720)).mo56386p("Failed to get connected BT devices");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        for (C124539a aVar : (Collection) obj) {
            String address = aVar.f343619a.getAddress();
            if (!this.f268618a.f268630i.containsKey(address)) {
                this.f268618a.mo89860c(this.f268618a.f268624c.mo89302e(aVar));
                C95950t tVar = (C95950t) this.f268618a.f268631j.get(address);
                tVar.getClass();
                tVar.mo89895t();
            }
        }
    }
}
