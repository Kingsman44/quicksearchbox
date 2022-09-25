package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.assistant.p3994s.p3995a.C53157dm;
import com.google.assistant.p3994s.p3995a.C53309jc;
import com.google.assistant.p3994s.p3995a.C53310jd;
import com.google.assistant.p3994s.p3995a.C53341kh;
import com.google.assistant.p3994s.p3995a.C53342ki;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cw */
/* compiled from: PG */
public final /* synthetic */ class C114853cw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318646a;

    public /* synthetic */ C114853cw(C114860dc dcVar) {
        this.f318646a = dcVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114860dc dcVar = this.f318646a;
        C53157dm dmVar = (C53157dm) obj;
        if (dmVar.f139325a != 0) {
            C58976aa aaVar = C58975e.f156826a;
            C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
            C53341kh khVar = (C53341kh) C53342ki.f139973d.createBuilder();
            C59326i iVar = C59326i.f157517e;
            C53309jc jcVar = (C53309jc) C53310jd.f139802c.createBuilder();
            jcVar.copyOnWrite();
            C53310jd jdVar = (C53310jd) jcVar.instance;
            dmVar.getClass();
            jdVar.f139805b = dmVar;
            jdVar.f139804a = 6;
            byte[] byteArray = ((C53310jd) jcVar.build()).toByteArray();
            String l = iVar.mo56837l(byteArray, byteArray.length);
            khVar.copyOnWrite();
            C53342ki kiVar = (C53342ki) khVar.instance;
            kiVar.f139975a |= 4;
            kiVar.f139977c = l;
            adVar.copyOnWrite();
            C87696ae aeVar = (C87696ae) adVar.instance;
            C53342ki kiVar2 = (C53342ki) khVar.build();
            kiVar2.getClass();
            aeVar.f237141h = kiVar2;
            aeVar.f237134a |= 128;
            C107698i iVar2 = dcVar.f318677j;
            C88489j jVar = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
            jVar.mo82014b(C87694ac.f237131a, (C87696ae) adVar.build());
            iVar2.mo96219b(jVar.mo82013a());
        }
    }
}
