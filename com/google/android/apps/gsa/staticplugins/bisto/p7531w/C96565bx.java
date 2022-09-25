package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.io.File;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bx */
/* compiled from: PG */
public final class C96565bx extends C96558bq {

    /* renamed from: a */
    public static final C59071e f270160a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.bx");

    /* renamed from: b */
    public final C89606ad f270161b;

    public C96565bx(C22871g gVar, C96525ak akVar, C68214a aVar, C96618u uVar, C96534at atVar, C96533as asVar, C95355bf bfVar, C89606ad adVar) {
        super(gVar, akVar, aVar, atVar, asVar, uVar, bfVar);
        this.f270161b = adVar;
    }

    /* renamed from: m */
    private final void m160009m() {
        if (C124633az.OOBE_FINISHED.equals(this.f270134l.mo106520r())) {
            C58976aa aaVar = C58975e.f156826a;
            mo90240o(C124625ar.CHECKING_IF_OTA_NEEDED);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
    }

    /* renamed from: e */
    public final void mo90228e(C124629av avVar, C124548d dVar) {
        super.mo90228e(avVar, dVar);
        for (C124650bp bpVar : dVar.mo106519q().f343828o) {
            File file = new File(bpVar.f343897f);
            if (file.exists() && !file.delete()) {
                C59104x c = f270160a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OtaStateIdle");
                ((C59052c) ((C59052c) c).mo56372aa(16655)).mo56389s("Failed to clean up builds for %s", bpVar.f343897f);
            }
        }
        C124628au auVar = (C124628au) C124629av.f343812r.createBuilder();
        int e = dVar.mo106505e();
        auVar.copyOnWrite();
        C124629av avVar2 = (C124629av) auVar.instance;
        avVar2.f343814a |= 32768;
        avVar2.f343829p = e;
        mo90243r(auVar);
    }

    /* renamed from: f */
    public final void mo90229f() {
        super.mo90229f();
        m160009m();
    }

    /* renamed from: h */
    public final void mo90231h(Set set, C124548d dVar) {
        super.mo90231h(set, dVar);
        if (set.contains(6) || set.contains(1) || set.contains(12)) {
            m160009m();
        }
    }

    /* renamed from: i */
    public final void mo90232i(boolean z, boolean z2, boolean z3, Collection collection) {
        if (!mo90245u(z)) {
            C59104x c = f270160a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaStateIdle");
            ((C59052c) ((C59052c) c).mo56372aa(16664)).mo56389s("Unable to start manual OTA for %s.", this.f270138p.mo89270k());
        } else if (collection.isEmpty()) {
            C59104x c2 = f270160a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OtaStateIdle");
            ((C59052c) ((C59052c) c2).mo56372aa(16663)).mo56386p("Requested empty manual OTA");
        } else {
            C59104x b = f270160a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaStateIdle");
            ((C59052c) ((C59052c) b).mo56372aa(16662)).mo56386p("Manual OTA requested. ");
            mo90241p(this.f270140r.mo90208d(this.f270138p, this.f270134l.mo106514l(), this.f270133k, mo90239n()), "getDevicesState", new C96563bv(this, collection, z, z2, z3), C96564bw.f270159a);
        }
    }

    /* renamed from: j */
    public final void mo90233j() {
        C59104x b = f270160a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaStateIdle");
        ((C59052c) ((C59052c) b).mo56372aa(16665)).mo56386p("Zero-day OTA requested");
        C124628au auVar = (C124628au) this.f270133k.toBuilder();
        auVar.copyOnWrite();
        C124629av avVar = (C124629av) auVar.instance;
        avVar.f343818e = 1;
        avVar.f343814a |= 8;
        mo90243r(auVar);
        mo90240o(C124625ar.CHECKING_IF_OTA_NEEDED);
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateIdle";
    }
}
