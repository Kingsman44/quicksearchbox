package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89682u;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96462at;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124640bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.p10712d.C142324bc;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bt */
/* compiled from: PG */
public final class C96561bt extends C96558bq {

    /* renamed from: a */
    public static final C59071e f270146a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.bt");

    /* renamed from: b */
    public final C89682u f270147b;

    /* renamed from: c */
    public final C89656k f270148c;

    /* renamed from: d */
    public final C89606ad f270149d;

    /* renamed from: e */
    public final C142324bc f270150e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96561bt(C22871g gVar, C96525ak akVar, C68214a aVar, C89682u uVar, C89606ad adVar, C89656k kVar, C96618u uVar2, C96534at atVar, C96533as asVar, C95355bf bfVar, C142324bc bcVar) {
        super(gVar, akVar, aVar, atVar, asVar, uVar2, bfVar);
        this.f270148c = kVar;
        this.f270149d = adVar;
        this.f270147b = uVar;
        this.f270150e = bcVar;
    }

    /* renamed from: a */
    public final C124625ar mo90224a() {
        return C124625ar.CHECKING_IF_OTA_NEEDED;
    }

    /* renamed from: e */
    public final void mo90228e(C124629av avVar, C124548d dVar) {
        super.mo90228e(avVar, dVar);
        int a = C124640bf.m204304a(this.f270133k.f343818e);
        boolean z = a != 0 && a == 2;
        if (!mo90245u(false)) {
            C59104x b = f270146a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaStateChecking");
            ((C59052c) ((C59052c) b).mo56372aa(16648)).mo56386p("OTA not available");
            mo90240o(C124625ar.UNKNOWN_INTERNAL_OTA_STATE);
            return;
        }
        mo90241p(this.f270140r.mo90208d(this.f270138p, this.f270134l.mo106514l(), this.f270133k, mo90239n()), "checkWhetherOtaRequired", new C96559br(this, z), new C96560bs(this));
    }

    /* renamed from: k */
    public final String mo90237k() {
        return "OtaStateChecking";
    }

    /* renamed from: m */
    public final boolean mo90247m(String str, C124650bp bpVar) {
        String e = C58837ba.m90856e(bpVar.f343894c);
        if (e == null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f270138p.mo89270k();
            this.f270134l.mo106481V();
            return false;
        } else if (str == null) {
            return true;
        } else {
            if (C96462at.m159831a(e, str, this.f270134l.mo106514l())) {
                C59104x b = f270146a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "OtaStateChecking");
                ((C59052c) ((C59052c) b).mo56372aa(16650)).mo56360M("OTA required. Device %s #%d; available version: %s, current version: %s", this.f270138p.mo89270k(), Integer.valueOf(bpVar.f343893b), e, str);
                return true;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            this.f270138p.mo89270k();
            return false;
        }
    }
}
