package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.e */
/* compiled from: PG */
final class C95935e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f268619a;

    /* renamed from: b */
    final /* synthetic */ C95937g f268620b;

    public C95935e(C95937g gVar, long j) {
        this.f268620b = gVar;
        this.f268619a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95937g.f268622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15721)).mo56386p("Unable to receive all device infos");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        for (C124548d dVar : (List) obj) {
            for (C124650bp bpVar : dVar.mo106519q().f343828o) {
                if (bpVar.f343898g == this.f268619a) {
                    String P = dVar.mo106475P();
                    if (this.f268620b.f268630i.containsKey(P)) {
                        C95950t tVar = (C95950t) this.f268620b.f268630i.get(P);
                        long j = this.f268619a;
                        if (tVar.f268857a) {
                            C58976aa aaVar = C58975e.f156826a;
                        } else {
                            C60856cj.m92911t(tVar.mo89868u(), new C95940j(tVar, j), tVar.f268664h);
                        }
                    } else {
                        C59104x c = C95937g.f268622a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "BistoClassicManager");
                        ((C59052c) ((C59052c) c).mo56372aa(15722)).mo56389s("Downloading device is not active: %s", P);
                    }
                }
            }
        }
    }
}
