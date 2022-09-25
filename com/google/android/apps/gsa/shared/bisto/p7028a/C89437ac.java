package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124544b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124716n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124717o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.ac */
/* compiled from: PG */
final class C89437ac extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ boolean f242450a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89437ac(C89474bm bmVar, String str, boolean z) {
        super(bmVar, str, 31);
        this.f242450a = z;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        if ((gVar == null || !this.f242450a || new C124544b(gVar).mo106497ak()) && gVar != null) {
            C124621an f = C89474bm.m145536f(c);
            C124716n d = C89474bm.m145534d(f);
            boolean z = this.f242450a;
            d.copyOnWrite();
            C124717o oVar = (C124717o) d.instance;
            C124717o oVar2 = C124717o.f344082m;
            oVar.f344084a |= 4;
            oVar.f344087d = z;
            f.copyOnWrite();
            C124623ap apVar = (C124623ap) f.instance;
            C124717o oVar3 = (C124717o) d.build();
            C124623ap apVar2 = C124623ap.f343769w;
            oVar3.getClass();
            apVar.f343778h = oVar3;
            apVar.f343771a |= 64;
            c.copyOnWrite();
            C124709g gVar2 = (C124709g) c.instance;
            C124623ap apVar3 = (C124623ap) f.build();
            C124709g gVar3 = C124709g.f344049g;
            apVar3.getClass();
            gVar2.f344052b = apVar3;
            gVar2.f344051a |= 1;
            return (C124709g) c.build();
        }
        C59104x d2 = C89474bm.f242494a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
        ((C59052c) ((C59052c) d2).mo56372aa(10338)).mo56386p("Hotword is not supported; HOTWORD_ENABLED is not set");
        return (C124709g) c.build();
    }
}
