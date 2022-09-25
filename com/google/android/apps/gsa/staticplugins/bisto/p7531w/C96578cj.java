package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124638bd;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.cj */
/* compiled from: PG */
public final class C96578cj extends C96558bq {

    /* renamed from: a */
    private static final C59071e f270183a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.cj");

    public C96578cj(C22871g gVar, C96525ak akVar, C68214a aVar, C96618u uVar, C96534at atVar, C96533as asVar, C95355bf bfVar) {
        super(gVar, akVar, aVar, atVar, asVar, uVar, bfVar);
    }

    /* renamed from: m */
    private final void m160047m() {
        int a;
        if (!this.f270137o.mo90222c() && ((a = C124638bd.m204303a(this.f270133k.f343817d)) == 0 || a != 2)) {
            C59104x b = f270183a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaStateWTU");
            ((C59052c) ((C59052c) b).mo56372aa(16680)).mo56386p("BatteryLevelAcceptableForOta: false");
        } else if (!this.f270137o.mo90223d()) {
            C59104x b2 = f270183a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "OtaStateWTU");
            ((C59052c) ((C59052c) b2).mo56372aa(16679)).mo56386p("ConnectionAcceptableForOta: false");
        } else {
            mo90240o(C124625ar.UPLOADING_DFU_TO_HEADSET);
        }
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.READY_TO_UPLOAD_TO_HEADSET;
    }

    /* renamed from: e */
    public final void mo90228e(C124629av avVar, C124548d dVar) {
        super.mo90228e(avVar, dVar);
        m160047m();
    }

    /* renamed from: f */
    public final void mo90229f() {
        super.mo90229f();
        m160047m();
    }

    /* renamed from: h */
    public final void mo90231h(Set set, C124548d dVar) {
        super.mo90231h(set, dVar);
        m160047m();
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateWTU";
    }
}
