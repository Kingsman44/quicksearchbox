package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.h */
/* compiled from: PG */
final class C94833h implements C94840o {

    /* renamed from: a */
    final /* synthetic */ C94835j f265181a;

    public C94833h(C94835j jVar) {
        this.f265181a = jVar;
    }

    /* renamed from: a */
    public final int mo88648a() {
        return 5;
    }

    /* renamed from: b */
    public final void mo88649b() {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17466)).mo56387q("enter state: %s", 5);
        if (this.f265181a.f265192j != null) {
            this.f265181a.f265192j.cancel(false);
        }
        C94835j jVar = this.f265181a;
        jVar.f265192j = jVar.f265189g.mo29164d(new C94832g(this), C94835j.f265184b, TimeUnit.MILLISECONDS);
        this.f265181a.f265187e.mo88638g();
        this.f265181a.mo88656b();
    }

    /* renamed from: c */
    public final boolean mo88650c(int i) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17470)).mo56387q("about to exit state: %s", 5);
        return i != 4;
    }

    /* renamed from: d */
    public final void mo88651d(C94851z zVar) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17467)).mo56352E("Received gacs event %s in state %s", zVar.f265247a, 5);
        C94841p pVar = C94841p.GATT_CONNECTED;
        int ordinal = zVar.f265247a.ordinal();
        if (ordinal == 1) {
            this.f265181a.mo88659e(1);
        } else if (ordinal == 13) {
            C59104x c = C94835j.f265183a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17469)).mo56386p("Received Gatt error");
            this.f265181a.f265187e.mo88638g();
            C94835j jVar = this.f265181a;
            jVar.f265187e.mo88635d(new C94814ab(jVar.f265186d));
        } else if (ordinal == 4 || ordinal == 5 || ordinal == 6 || ordinal == 7) {
            this.f265181a.mo88656b();
        } else {
            C59104x c2 = C94835j.f265183a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
            ((C59052c) ((C59052c) c2).mo56372aa(17468)).mo56389s("Received unexpected gacs event: %s", zVar.f265247a);
        }
    }
}
