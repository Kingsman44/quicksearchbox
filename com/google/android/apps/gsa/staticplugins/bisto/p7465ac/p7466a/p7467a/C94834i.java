package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.i */
/* compiled from: PG */
final class C94834i implements C94840o {

    /* renamed from: a */
    final /* synthetic */ C94835j f265182a;

    public C94834i(C94835j jVar) {
        this.f265182a = jVar;
    }

    /* renamed from: a */
    public final int mo88648a() {
        return 1;
    }

    /* renamed from: b */
    public final void mo88649b() {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17471)).mo56387q("enter state: %s", 1);
        C94835j jVar = this.f265182a;
        jVar.f265190h.mo83384Z(jVar.f265186d.f265161b.f265818a.getAddress(), C124715m.NOT_CONNECTED);
        C94828c cVar = this.f265182a.f265186d;
        cVar.f265167h = 608;
        cVar.f265162c = C58836b.f156633a;
        cVar.f265173n.clear();
        this.f265182a.f265188f.mo88677a();
        this.f265182a.f265187e.mo88638g();
        if (this.f265182a.f265192j != null) {
            this.f265182a.f265192j.cancel(false);
        }
    }

    /* renamed from: c */
    public final boolean mo88650c(int i) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17474)).mo56387q("about to exit state: %s", 1);
        return i != 4;
    }

    /* renamed from: d */
    public final void mo88651d(C94851z zVar) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17472)).mo56352E("Received gacs event %s in state %s", zVar.f265247a, 1);
        C94841p pVar = C94841p.GATT_CONNECTED;
        int ordinal = zVar.f265247a.ordinal();
        if (ordinal == 0) {
            this.f265182a.mo88659e(2);
        } else if (ordinal != 1) {
            C59104x c = C94835j.f265183a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17473)).mo56389s("Ignored unexpected gacs event: %s", zVar.f265247a);
        }
    }
}
