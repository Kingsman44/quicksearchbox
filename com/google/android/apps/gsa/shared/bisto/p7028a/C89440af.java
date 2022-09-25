package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124609ab;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124716n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124717o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62963cj;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.af */
/* compiled from: PG */
final class C89440af extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ C124707e f242457a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89440af(C89474bm bmVar, String str, C124707e eVar) {
        super(bmVar, str, 18);
        this.f242457a = eVar;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        if (gVar != null) {
            C124644bj bjVar = gVar.f344053c;
            if (bjVar == null) {
                bjVar = C124644bj.f343868n;
            }
            C124609ab abVar = bjVar.f343879j;
            if (abVar == null) {
                abVar = C124609ab.f343726f;
            }
            C62963cj cjVar = new C62963cj(abVar.f343730c, C124609ab.f343725d);
            if (!cjVar.isEmpty()) {
                if (!cjVar.contains(this.f242457a)) {
                    C59104x c2 = C89474bm.f242494a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                    ((C59052c) ((C59052c) c2).mo56372aa(10340)).mo56395y("%s mode is not supported. Supported modes: %s", this.f242457a.f344048d, cjVar);
                    return (C124709g) c.build();
                }
            } else if (!C124707e.INPUT_OUTPUT_MODE.equals(this.f242457a)) {
                C59104x c3 = C89474bm.f242494a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) c3).mo56372aa(10339)).mo56393w("%s mode is not supported. Default devices only support %s", this.f242457a.f344048d, C124707e.INPUT_OUTPUT_MODE.f344048d);
                return (C124709g) c.build();
            }
        }
        C124621an f = C89474bm.m145536f(c);
        C124716n d = C89474bm.m145534d(f);
        C124707e eVar = this.f242457a;
        d.copyOnWrite();
        C124717o oVar = (C124717o) d.instance;
        C124717o oVar2 = C124717o.f344082m;
        oVar.f344086c = eVar.f344048d;
        oVar.f344084a |= 2;
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
}
