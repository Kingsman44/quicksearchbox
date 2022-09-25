package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.assistant.p3803ag.p3804a.p3805a.C48782b;
import com.google.assistant.p3803ag.p3804a.p3805a.C48783c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.q */
/* compiled from: PG */
public final /* synthetic */ class C107449q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f299003a;

    /* renamed from: b */
    public final /* synthetic */ C48865h f299004b;

    public /* synthetic */ C107449q(C107458z zVar, C48865h hVar) {
        this.f299003a = zVar;
        this.f299004b = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C48851br brVar;
        C107458z zVar = this.f299003a;
        C48865h hVar = this.f299004b;
        C118826c cVar = (C118826c) obj;
        ArrayList<C48851br> arrayList = new ArrayList<>();
        if (hVar.f126458b == 3) {
            brVar = (C48851br) hVar.f126459c;
        } else {
            brVar = C48851br.f126412f;
        }
        arrayList.add(brVar);
        C83679a aVar = zVar.f299024g;
        C59104x b = C83679a.f228102a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
        ((C59052c) ((C59052c) b).mo56372aa(6794)).mo56386p("#sendGetContentRequest");
        C59104x b2 = C83679a.f228102a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
        ((C59052c) ((C59052c) b2).mo56372aa(6791)).mo56386p("#getClientEventDataForContentRequest");
        C48782b bVar = (C48782b) C48783c.f126226d.createBuilder();
        for (C48851br brVar2 : arrayList) {
            bVar.copyOnWrite();
            C48783c cVar2 = (C48783c) bVar.instance;
            brVar2.getClass();
            C62971cq cqVar = cVar2.f126230c;
            if (!cqVar.mo58948c()) {
                cVar2.f126230c = C62942bv.mutableCopy(cqVar);
            }
            cVar2.f126230c.add(brVar2);
        }
        C48783c cVar3 = (C48783c) bVar.build();
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        cVar3.getClass();
        aeVar.f237143j = cVar3;
        aeVar.f237134a |= 512;
        C74445c.m120396c(aVar.f228104c, C83679a.m133247a((C87696ae) adVar.build()));
        return C60866ct.f164955a;
    }
}
