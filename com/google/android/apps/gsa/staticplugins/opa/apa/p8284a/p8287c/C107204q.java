package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17304ac;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17305ad;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.q */
/* compiled from: PG */
public final /* synthetic */ class C107204q implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f298388a;

    public /* synthetic */ C107204q(C70862aj ajVar) {
        this.f298388a = ajVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C70862aj ajVar = this.f298388a;
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C107208u.f298393a;
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C107208u.f298393a.mo56226d()).mo56372aa(23529)).mo56386p("#sendSupportedClientOps: failed to get capabilities");
            ajVar.mo20122b(Status.f186908f.asException());
            return;
        }
        C51772cy cyVar = ((C51715bm) axVar.mo56107c()).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C62971cq cqVar = cyVar.f135827b;
        C17304ac acVar = (C17304ac) C17305ad.f50125b.createBuilder();
        acVar.copyOnWrite();
        C17305ad adVar = (C17305ad) acVar.instance;
        C62971cq cqVar2 = adVar.f50127a;
        if (!cqVar2.mo58948c()) {
            adVar.f50127a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) adVar.f50127a);
        ajVar.mo20123c((C17305ad) acVar.build());
        ajVar.mo20121a();
    }
}
