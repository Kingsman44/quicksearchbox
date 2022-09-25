package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.e */
/* compiled from: PG */
final class C94830e implements C94840o {

    /* renamed from: a */
    final /* synthetic */ C94835j f265177a;

    public C94830e(C94835j jVar) {
        this.f265177a = jVar;
    }

    /* renamed from: a */
    public final int mo88648a() {
        return 2;
    }

    /* renamed from: b */
    public final void mo88649b() {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17458)).mo56387q("enter state: %s", 2);
        C94835j jVar = this.f265177a;
        jVar.f265190h.mo83384Z(jVar.f265186d.f265161b.f265818a.getAddress(), C124715m.GATT_CONNECTED);
        if (this.f265177a.f265186d.f265174o.get()) {
            C94821ai aiVar = this.f265177a.f265187e;
            C94835j jVar2 = this.f265177a;
            aiVar.mo88635d(new C94817ae(jVar2.f265186d, jVar2.f265189g));
        }
        this.f265177a.f265187e.mo88635d(new C94850y(this.f265177a.f265186d));
    }

    /* renamed from: c */
    public final boolean mo88650c(int i) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17461)).mo56387q("about to exit state: %s", 2);
        return !this.f265177a.f265186d.mo88647c() || i != 4;
    }

    /* renamed from: d */
    public final void mo88651d(C94851z zVar) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17459)).mo56352E("Received gacs event %s in state %s", zVar.f265247a, 2);
        C94841p pVar = C94841p.GATT_CONNECTED;
        int ordinal = zVar.f265247a.ordinal();
        if (ordinal == 13) {
            this.f265177a.mo88659e(5);
        } else if (ordinal != 24) {
            switch (ordinal) {
                case 1:
                    this.f265177a.mo88659e(1);
                    return;
                case 2:
                case 5:
                case 6:
                case 7:
                    return;
                case 3:
                    C94835j jVar = this.f265177a;
                    jVar.f265187e.mo88635d(new C94825am(jVar.f265186d, "389e8365-158f-4308-9204-756f29b6a87c", false));
                    C94835j jVar2 = this.f265177a;
                    jVar2.f265187e.mo88635d(new C94825am(jVar2.f265186d, "e90c4308-3984-41f3-be3c-7118093c3300", false));
                    C94835j jVar3 = this.f265177a;
                    jVar3.f265187e.mo88635d(new C94825am(jVar3.f265186d, "e991b170-ec9c-4574-83a4-fb929955b05e", true));
                    if (!this.f265177a.f265186d.mo88647c()) {
                        this.f265177a.mo88659e(4);
                        return;
                    }
                    C94835j jVar4 = this.f265177a;
                    jVar4.f265187e.mo88635d(new C94825am(jVar4.f265186d, "dd1d1206-568f-4b2d-a48c-969d8ad1f457", false));
                    return;
                case 4:
                    this.f265177a.mo88659e(3);
                    return;
                default:
                    C59104x c = C94835j.f265183a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
                    ((C59052c) ((C59052c) c).mo56372aa(17460)).mo56389s("Received unexpected gacs event: %s", zVar.f265247a);
                    return;
            }
        }
    }
}
