package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.d */
/* compiled from: PG */
final class C94829d implements C94840o {

    /* renamed from: a */
    final /* synthetic */ C94835j f265176a;

    public C94829d(C94835j jVar) {
        this.f265176a = jVar;
    }

    /* renamed from: e */
    private static final void m156422e() {
        C59104x d = C94835j.f265183a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) d).mo56372aa(17456)).mo56386p("No notification data!");
    }

    /* renamed from: a */
    public final int mo88648a() {
        return 4;
    }

    /* renamed from: b */
    public final void mo88649b() {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17449)).mo56387q("enter state: %s", 4);
        C94835j jVar = this.f265176a;
        jVar.f265187e.mo88635d(new C94824al(jVar.f265186d, "389e8365-158f-4308-9204-756f29b6a87c", false));
        C94835j jVar2 = this.f265176a;
        jVar2.f265187e.mo88635d(new C94824al(jVar2.f265186d, "e90c4308-3984-41f3-be3c-7118093c3300", false));
        C94835j jVar3 = this.f265176a;
        jVar3.f265187e.mo88635d(new C94824al(jVar3.f265186d, "e991b170-ec9c-4574-83a4-fb929955b05e", true));
        C94835j jVar4 = this.f265176a;
        jVar4.f265190h.mo83384Z(jVar4.f265186d.f265161b.f265818a.getAddress(), C124715m.FULLY_CONNECTED);
    }

    /* renamed from: c */
    public final boolean mo88650c(int i) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17457)).mo56387q("exit state: %s", 4);
        return true;
    }

    /* renamed from: d */
    public final void mo88651d(C94851z zVar) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17450)).mo56352E("Received gacs event %s in state %s", zVar.f265247a, 4);
        C94841p pVar = C94841p.GATT_CONNECTED;
        int ordinal = zVar.f265247a.ordinal();
        if (ordinal == 1) {
            this.f265176a.mo88659e(1);
        } else if (ordinal != 27) {
            switch (ordinal) {
                case 9:
                    this.f265176a.f265186d.f265173n.add("e90c4308-3984-41f3-be3c-7118093c3300");
                    return;
                case 10:
                    this.f265176a.f265186d.f265173n.add("389e8365-158f-4308-9204-756f29b6a87c");
                    return;
                case 11:
                    this.f265176a.f265186d.f265173n.add("e991b170-ec9c-4574-83a4-fb929955b05e");
                    return;
                default:
                    switch (ordinal) {
                        case 14:
                            C59104x b2 = C94835j.f265183a.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
                            ((C59052c) ((C59052c) b2).mo56372aa(17452)).mo56386p("Received control notification");
                            C94936d dVar = C94936d.CONTROL_INPUT;
                            m156422e();
                            return;
                        case 15:
                            return;
                        case 16:
                            C59104x b3 = C94835j.f265183a.mo56224b();
                            b3.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
                            ((C59052c) ((C59052c) b3).mo56372aa(17453)).mo56386p("Received audio notification");
                            C94936d dVar2 = C94936d.CONTROL_INPUT;
                            m156422e();
                            return;
                        case 17:
                            C59104x b4 = C94835j.f265183a.mo56224b();
                            b4.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
                            ((C59052c) ((C59052c) b4).mo56372aa(17454)).mo56386p("Received proxy notification");
                            C94936d dVar3 = C94936d.CONTROL_INPUT;
                            m156422e();
                            return;
                        default:
                            C59104x c = C94835j.f265183a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
                            ((C59052c) ((C59052c) c).mo56372aa(17451)).mo56389s("Received unexpected gacs event: %s", zVar.f265247a);
                            return;
                    }
            }
        } else {
            this.f265176a.mo88659e(5);
        }
    }
}
