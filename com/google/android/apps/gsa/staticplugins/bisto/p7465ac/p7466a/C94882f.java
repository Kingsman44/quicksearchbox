package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.f */
/* compiled from: PG */
public final /* synthetic */ class C94882f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94886j f265360a;

    public /* synthetic */ C94882f(C94886j jVar) {
        this.f265360a = jVar;
    }

    public final void run() {
        C94886j jVar = this.f265360a;
        if (!jVar.f265364a.mo88762z() || jVar.f265364a.f265406w.f36213d.get() != 11) {
            C59104x b = C94887k.f265367a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) b).mo56372aa(17262)).mo56389s("[%s] TLS init complete", C94876ay.m156554c(jVar.f265364a.f265385b));
            C94887k kVar = jVar.f265364a;
            kVar.f265390g.mo83384Z(kVar.f265385b.f265818a.getAddress(), C124715m.GATT_CONNECTED);
            jVar.f265364a.mo88757r();
            if (!jVar.f265364a.f265372E.get()) {
                C94887k kVar2 = jVar.f265364a;
                if (!kVar2.mo88761y() || kVar2.f265406w.f36213d.get() == 11) {
                    jVar.f265364a.mo88747f();
                } else {
                    C94876ay.m156554c(jVar.f265364a.f265385b);
                }
            }
        } else {
            C59104x b2 = C94887k.f265367a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "BistoBleConnection");
            ((C59052c) ((C59052c) b2).mo56372aa(17263)).mo56389s("[%s] GACS already subscribed and ready, no need to subscribe again", C94876ay.m156554c(jVar.f265364a.f265385b));
        }
    }
}
