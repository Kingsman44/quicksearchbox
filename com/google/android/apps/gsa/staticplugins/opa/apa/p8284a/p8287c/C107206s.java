package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17307c;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17308d;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.s */
/* compiled from: PG */
public final /* synthetic */ class C107206s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f298390a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f298391b;

    public /* synthetic */ C107206s(C70862aj ajVar, C58485gu guVar) {
        this.f298390a = ajVar;
        this.f298391b = guVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C70862aj ajVar = this.f298390a;
        C58485gu guVar = this.f298391b;
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C107208u.f298393a;
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C107208u.f298393a.mo56226d()).mo56372aa(23527)).mo56386p("#sendContext: failed to get capabilities");
            ajVar.mo20122b(Status.f186908f.asException());
            return;
        }
        C51772cy cyVar = ((C51715bm) axVar.mo56107c()).f135671h;
        if (cyVar == null) {
            cyVar = C51772cy.f135824p;
        }
        C62971cq cqVar = cyVar.f135827b;
        C17307c cVar = (C17307c) C17308d.f50130c.createBuilder();
        cVar.copyOnWrite();
        C17308d dVar = (C17308d) cVar.instance;
        C62971cq cqVar2 = dVar.f50132a;
        if (!cqVar2.mo58948c()) {
            dVar.f50132a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) dVar.f50132a);
        cVar.copyOnWrite();
        C17308d dVar2 = (C17308d) cVar.instance;
        C62971cq cqVar3 = dVar2.f50133b;
        if (!cqVar3.mo58948c()) {
            dVar2.f50133b = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) guVar, (List) dVar2.f50133b);
        ajVar.mo20123c((C17308d) cVar.build());
        ajVar.mo20121a();
    }
}
