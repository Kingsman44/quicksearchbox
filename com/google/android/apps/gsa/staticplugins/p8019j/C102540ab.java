package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C51697ay;
import com.google.assistant.p3897e.p3921j.C51704bb;
import com.google.assistant.p3897e.p3921j.C51705bc;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51718bp;
import com.google.assistant.p3897e.p3921j.C51753cf;
import com.google.assistant.p3897e.p3921j.C51754cg;
import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ab */
/* compiled from: PG */
public final /* synthetic */ class C102540ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Query f286171a;

    public /* synthetic */ C102540ab(Query query) {
        this.f286171a = query;
    }

    public final C60870cx apply(Object obj) {
        C51753cf cfVar;
        Query query = this.f286171a;
        C51714bl blVar = (C51714bl) obj;
        C51705bc bcVar = ((C51715bm) blVar.instance).f135668e;
        if (bcVar == null) {
            bcVar = C51705bc.f135639e;
        }
        C51704bb bbVar = (C51704bb) bcVar.toBuilder();
        C51697ay ayVar = C51697ay.SURROUNDING_USERS;
        bbVar.copyOnWrite();
        C51705bc bcVar2 = (C51705bc) bbVar.instance;
        bcVar2.f135643c = ayVar.f135627c;
        bcVar2.f135641a |= 2;
        C51705bc bcVar3 = (C51705bc) bbVar.build();
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        bcVar3.getClass();
        bmVar.f135668e = bcVar3;
        bmVar.f135664a |= 8;
        C51772cy cyVar = bmVar.f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C51771cx cxVar = (C51771cx) cyVar.toBuilder();
        byte[] dU = query.mo84440dU("android.opa.extra.QUERY_GACS_CAPABILITIES");
        if (dU != null) {
            try {
                C51718bp bpVar = (C51718bp) C62942bv.parseFrom((C62942bv) C51718bp.f135685d, dU, C62921ba.f169869a);
                cxVar.copyOnWrite();
                C51772cy cyVar2 = (C51772cy) cxVar.instance;
                bpVar.getClass();
                cyVar2.f135838m = bpVar;
                cyVar2.f135826a |= 4096;
            } catch (IOException e) {
                C59104x c = C102550al.f286195a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(13969)).mo56386p("Unable to parse request config");
            }
        }
        blVar.copyOnWrite();
        C51715bm bmVar2 = (C51715bm) blVar.instance;
        C51772cy cyVar3 = (C51772cy) cxVar.build();
        cyVar3.getClass();
        bmVar2.f135671h = cyVar3;
        bmVar2.f135664a |= 128;
        if (!query.mo84363bw("android.opa.extra.EXTRA_BISTO_PR_DISALLOWED")) {
            cfVar = (C51753cf) C51754cg.f135778e.createBuilder();
            C51756ci ciVar = C51756ci.ALL_PERSONAL_DATA;
            cfVar.copyOnWrite();
            C51754cg cgVar = (C51754cg) cfVar.instance;
            cgVar.f135781b = ciVar.f135790e;
            cgVar.f135780a |= 1;
        } else {
            cfVar = (C51753cf) C51754cg.f135778e.createBuilder();
            C51756ci ciVar2 = C51756ci.NO_PERSONAL_DATA;
            cfVar.copyOnWrite();
            C51754cg cgVar2 = (C51754cg) cfVar.instance;
            cgVar2.f135781b = ciVar2.f135790e;
            cgVar2.f135780a |= 1;
        }
        blVar.copyOnWrite();
        C51715bm bmVar3 = (C51715bm) blVar.instance;
        C51754cg cgVar3 = (C51754cg) cfVar.build();
        cgVar3.getClass();
        bmVar3.f135672i = cgVar3;
        bmVar3.f135664a |= 256;
        return C60856cj.m92900i(blVar);
    }
}
