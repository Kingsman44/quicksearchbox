package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124627at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124652br;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.cd */
/* compiled from: PG */
public final class C96572cd extends C96558bq {

    /* renamed from: a */
    public static final C59071e f270172a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.cd");

    /* renamed from: b */
    public final C21370a f270173b;

    /* renamed from: c */
    private final C96618u f270174c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96572cd(C22871g gVar, C96525ak akVar, C68214a aVar, C21370a aVar2, C96618u uVar, C96534at atVar, C96533as asVar, C95355bf bfVar) {
        super(gVar, akVar, aVar, atVar, asVar, uVar, bfVar);
        this.f270173b = aVar2;
        this.f270174c = uVar;
    }

    /* renamed from: m */
    private final void m160025m() {
        ((C89492cd) this.f270136n.mo27525b()).mo83365G(this.f270138p.mo89270k());
        mo90242q(this.f270140r.mo90205b(this.f270138p, this.f270134l.mo106514l(), this.f270133k), "Applying OTA.", new C96570cb(this), new C96571cc(this));
    }

    /* renamed from: w */
    private final void m160026w(C124629av avVar) {
        if (m160027x(avVar)) {
            C59104x b = f270172a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaStateWFA");
            ((C59052c) ((C59052c) b).mo56372aa(16673)).mo56389s("Ota apply waiting skipped for %s", this.f270138p.mo89270k());
            m160025m();
        }
    }

    /* renamed from: x */
    private static boolean m160027x(C124629av avVar) {
        int a = C124652br.m204310a(avVar.f343824k);
        if (a != 0 && a == 2) {
            return true;
        }
        int a2 = C124640bf.m204304a(avVar.f343818e);
        if (a2 != 0 && a2 == 2) {
            return true;
        }
        if (avVar.f343828o.size() != 1) {
            return false;
        }
        C124627at a3 = C124627at.m204292a(((C124650bp) avVar.f343828o.get(0)).f343906o);
        if (a3 == null) {
            a3 = C124627at.UNKNOWN_OTA_TYPE;
        }
        return a3.equals(C124627at.HOTWORD_MODEL_ONLY_OTA_TYPE);
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER;
    }

    /* renamed from: d */
    public final void mo90227d() {
        C59104x b = f270172a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OtaStateWFA");
        ((C59052c) ((C59052c) b).mo56372aa(16669)).mo56386p("Apply OTA requested");
        m160025m();
    }

    /* renamed from: e */
    public final void mo90228e(C124629av avVar, C124548d dVar) {
        super.mo90228e(avVar, dVar);
        if (!m160027x(avVar)) {
            this.f270174c.mo90281e();
        }
        m160026w(avVar);
    }

    /* renamed from: f */
    public final void mo90229f() {
        super.mo90229f();
        m160026w(this.f270133k);
    }

    /* renamed from: h */
    public final void mo90231h(Set set, C124548d dVar) {
        super.mo90231h(set, dVar);
        if (set.contains(6) || set.contains(1)) {
            C59104x b = f270172a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaStateWFA");
            ((C59052c) ((C59052c) b).mo56372aa(16672)).mo56386p("Connectivity or battery changed ");
            if (!this.f270137o.mo90223d()) {
                mo90240o(C124625ar.WAITING_FOR_APPLY_ACK_FROM_USER_UNVERIFIED);
            }
        }
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateWFA";
    }

    /* renamed from: l */
    public final void mo90238l() {
        this.f270174c.mo90283g();
    }
}
