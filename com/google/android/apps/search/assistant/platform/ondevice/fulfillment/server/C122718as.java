package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122402au;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122403av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122446ck;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122865j;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.as */
/* compiled from: PG */
public final /* synthetic */ class C122718as implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122720au f340012a;

    public /* synthetic */ C122718as(C122720au auVar) {
        this.f340012a = auVar;
    }

    public final Object apply(Object obj) {
        C122720au auVar = this.f340012a;
        C122719at atVar = (C122719at) obj;
        ((C59052c) auVar.f340019g.mo105767f(C59071e.f157037b).mo56372aa(34813)).mo56386p("Received intent response");
        if (auVar.f340023k) {
            ((C59052c) auVar.f340019g.mo105767f(C59071e.f157037b).mo56372aa(34816)).mo56386p("Ignoring intent results because already finalized.");
            return null;
        }
        ((C59052c) auVar.f340019g.mo105764c().mo56372aa(34814)).mo56389s("Intent request finished with response %s", C122865j.m202185b((C65196fc) atVar.mo105663a().mo105839b()));
        ((C59052c) auVar.f340019g.mo105767f(C59071e.f157037b).mo56372aa(34815)).mo56389s("Result response: %s", atVar.mo105663a());
        C17597g gVar = auVar.f340018f;
        C122446ck ckVar = (C122446ck) C122448cm.f339454i.createBuilder();
        int a = atVar.mo105663a().mo105838a();
        ckVar.copyOnWrite();
        ((C122448cm) ckVar.instance).f339456a = a;
        ckVar.mo105627a((Iterable) Collection.EL.stream(auVar.f340025m.mo105672a()).map(C122717ar.f340011a).collect(C58370cn.f155946a));
        ckVar.mo105628b(auVar.f340020h.mo105818a());
        C122448cm cmVar = (C122448cm) ckVar.build();
        C122402au auVar2 = (C122402au) C122403av.f339344c.createBuilder();
        C65196fc fcVar = (C65196fc) atVar.mo105663a().mo105839b();
        auVar2.copyOnWrite();
        fcVar.getClass();
        ((C122403av) auVar2.instance).f339346a = fcVar;
        auVar2.copyOnWrite();
        cmVar.getClass();
        ((C122403av) auVar2.instance).f339347b = cmVar;
        gVar.mo20123c((C122403av) auVar2.build());
        auVar.f340018f.mo20121a();
        return null;
    }
}
