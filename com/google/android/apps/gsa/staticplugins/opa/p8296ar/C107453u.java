package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83684c;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83685d;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.u */
/* compiled from: PG */
public final /* synthetic */ class C107453u implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f299010a;

    /* renamed from: b */
    public final /* synthetic */ C48838be f299011b;

    /* renamed from: c */
    public final /* synthetic */ List f299012c;

    public /* synthetic */ C107453u(C107458z zVar, C48838be beVar, List list) {
        this.f299010a = zVar;
        this.f299011b = beVar;
        this.f299012c = list;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C107458z zVar = this.f299010a;
        C48838be beVar = this.f299011b;
        List<C48865h> list = this.f299012c;
        if (!((Boolean) obj).booleanValue()) {
            return C118826c.f331423b;
        }
        C83693b bVar = zVar.f299023f;
        C83684c cVar = (C83684c) C83685d.f228113f.createBuilder();
        cVar.copyOnWrite();
        C83685d dVar = (C83685d) cVar.instance;
        beVar.getClass();
        dVar.f228117c = beVar;
        dVar.f228116b = 1;
        cVar.copyOnWrite();
        C83685d dVar2 = (C83685d) cVar.instance;
        dVar2.f228119e = 0;
        dVar2.f228115a |= 8;
        C60870cx f = bVar.mo77020f((C83685d) cVar.build());
        C59104x b = C107458z.f299018a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
        ((C59052c) ((C59052c) b).mo56372aa(25368)).mo56386p("#processClientActionsListForStartJourney");
        ArrayList arrayList = new ArrayList();
        for (C48865h hVar : list) {
            C59104x b2 = C107458z.f299018a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
            C59052c cVar2 = (C59052c) ((C59052c) b2).mo56372aa(25369);
            C48864g a = C48864g.m85285a(hVar.f126460d);
            if (a == null) {
                a = C48864g.TYPE_UNSPECIFIED;
            }
            cVar2.mo56389s("#processClientActionsListForStartJourney, action type %s", a.name());
            if ((hVar.f126457a & 2) != 0) {
                cxVar = zVar.f299019b.mo96005a(hVar);
            } else {
                cxVar = zVar.mo96006a(hVar);
            }
            C22871g gVar = zVar.f299021d;
            arrayList.add(gVar.mo28206f(gVar.mo28210j(cxVar, "handleStartJourneyAction#handleResultFuture", C107456x.f299016a), "catch exceptions in handleStartJourneyAction#handleResultFuture", Exception.class, C107457y.f299017a));
        }
        return C118826c.m197212b(C58485gu.m89847o(C118826c.m197212b(arrayList), f));
    }
}
