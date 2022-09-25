package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.p3805a.C48788h;
import com.google.assistant.p3803ag.p3804a.p3805a.C48789i;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.k */
/* compiled from: PG */
public final /* synthetic */ class C107443k implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f298992a;

    /* renamed from: b */
    public final /* synthetic */ C48855bv f298993b;

    public /* synthetic */ C107443k(C107458z zVar, C48855bv bvVar) {
        this.f298992a = zVar;
        this.f298993b = bvVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107458z zVar = this.f298992a;
        C48855bv bvVar = this.f298993b;
        if (C107431k.m178348f((C58833ax) obj)) {
            return C118826c.f331423b;
        }
        ArrayList<C48855bv> arrayList = new ArrayList<>();
        arrayList.add(bvVar);
        C83679a aVar = zVar.f299024g;
        C59104x b = C83679a.f228102a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
        ((C59052c) ((C59052c) b).mo56372aa(6796)).mo56386p("#sendStartSyncRequestIntent");
        C59104x b2 = C83679a.f228102a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ProactiveapiIntUtils");
        ((C59052c) ((C59052c) b2).mo56372aa(6792)).mo56386p("#getClientEventDataForSyncRequest");
        C48788h hVar = (C48788h) C48789i.f126241e.createBuilder();
        for (C48855bv bvVar2 : arrayList) {
            hVar.copyOnWrite();
            C48789i iVar = (C48789i) hVar.instance;
            bvVar2.getClass();
            C62971cq cqVar = iVar.f126245c;
            if (!cqVar.mo58948c()) {
                iVar.f126245c = C62942bv.mutableCopy(cqVar);
            }
            iVar.f126245c.add(bvVar2);
        }
        C48789i iVar2 = (C48789i) hVar.build();
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        iVar2.getClass();
        aeVar.f237142i = iVar2;
        aeVar.f237134a |= 256;
        C74445c.m120396c(aVar.f228104c, C83679a.m133247a((C87696ae) adVar.build()));
        return C118826c.f331423b;
    }
}
