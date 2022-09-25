package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.f */
/* compiled from: PG */
final class C94831f implements C94840o {

    /* renamed from: a */
    final /* synthetic */ C94835j f265178a;

    /* renamed from: b */
    private final AtomicBoolean f265179b = new AtomicBoolean(false);

    public C94831f(C94835j jVar) {
        this.f265178a = jVar;
    }

    /* renamed from: a */
    public final int mo88648a() {
        return 3;
    }

    /* renamed from: b */
    public final void mo88649b() {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17462)).mo56387q("enter state: %s", 3);
        this.f265179b.set(false);
        C94835j jVar = this.f265178a;
        jVar.f265187e.mo88635d(new C94824al(jVar.f265186d, "dd1d1206-568f-4b2d-a48c-969d8ad1f457", false));
    }

    /* renamed from: c */
    public final boolean mo88650c(int i) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17465)).mo56387q("about to exit state: %s", 3);
        if (i == 4) {
            return this.f265179b.get();
        }
        return true;
    }

    /* renamed from: d */
    public final void mo88651d(C94851z zVar) {
        C59104x b = C94835j.f265183a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17463)).mo56352E("Received gacs event %s in state %s", zVar.f265247a, 3);
        C94841p pVar = C94841p.GATT_CONNECTED;
        int ordinal = zVar.f265247a.ordinal();
        if (ordinal == 1) {
            this.f265178a.mo88659e(1);
        } else if (ordinal == 8) {
            C94846u uVar = this.f265178a.f265188f;
            C59104x b2 = C94846u.f265236a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GacsCryptoHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(17512)).mo56386p("start crypto setup");
            uVar.mo88678b(2);
            uVar.mo88679e(C94848w.f265243a);
        } else if (ordinal == 15) {
        } else {
            if (ordinal == 25) {
                this.f265178a.mo88659e(5);
            } else if (ordinal != 26) {
                C59104x c = C94835j.f265183a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GacsBleConnHandler");
                ((C59052c) ((C59052c) c).mo56372aa(17464)).mo56389s("Received unexpected gacs event: %s", zVar.f265247a);
            } else {
                this.f265179b.set(true);
                if (this.f265178a.f265185c.get()) {
                    this.f265178a.mo88659e(4);
                }
            }
        }
    }
}
