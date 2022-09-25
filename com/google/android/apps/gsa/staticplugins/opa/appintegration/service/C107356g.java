package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17913o;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17918t;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17920v;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.g */
/* compiled from: PG */
public final /* synthetic */ class C107356g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107357h f298770a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f298771b;

    public /* synthetic */ C107356g(C107357h hVar, byte[] bArr) {
        this.f298770a = hVar;
        this.f298771b = bArr;
    }

    public final void run() {
        C107357h hVar = this.f298770a;
        byte[] bArr = this.f298771b;
        if (!hVar.f298775d) {
            try {
                C17881ak akVar = (C17881ak) C62942bv.parseFrom((C62942bv) C17881ak.f51231h, bArr);
                C58976aa aaVar = C58975e.f156826a;
                boolean z = false;
                if (akVar.f51239g.size() != 0) {
                    hVar.f298774c.clear();
                    for (int i = 0; i < akVar.f51239g.size(); i++) {
                        Set set = hVar.f298774c;
                        C17918t a = C17918t.m35111a(akVar.f51239g.mo58914d(i));
                        if (a == null) {
                            a = C17918t.UNSPECIFIED;
                        }
                        set.add(a);
                        akVar.f51239g.mo58914d(i);
                    }
                }
                if ((akVar.f51233a & 16) != 0) {
                    C17913o oVar = akVar.f51238f;
                    if (oVar == null) {
                        oVar = C17913o.f51320c;
                    }
                    int i2 = oVar.f51323b;
                    C17908j jVar = C17908j.UNKNOWN;
                    C17913o oVar2 = akVar.f51238f;
                    if (oVar2 == null) {
                        oVar2 = C17913o.f51320c;
                    }
                    int b = C17912n.m35110b(oVar2.f51323b);
                    if (b == 0) {
                        b = 1;
                    }
                    if (b - 1 == 100) {
                        hVar.f298776e.mo95977f();
                        return;
                    }
                }
                C17914p pVar = (C17914p) C17881ak.f51231h.createBuilder(akVar);
                if ((akVar.f51233a & 2) != 0) {
                    C17880aj ajVar = akVar.f51235c;
                    if (ajVar == null) {
                        ajVar = C17880aj.f51221i;
                    }
                    if ((ajVar.f51223a & 4) != 0) {
                        C17873ac acVar = hVar.f298772a;
                        acVar.copyOnWrite();
                        C17880aj ajVar2 = (C17880aj) acVar.instance;
                        ajVar2.f51226d = null;
                        ajVar2.f51223a &= -5;
                    }
                    if ((ajVar.f51223a & 64) != 0) {
                        C17873ac acVar2 = hVar.f298772a;
                        acVar2.copyOnWrite();
                        C17880aj ajVar3 = (C17880aj) acVar2.instance;
                        ajVar3.f51230h = null;
                        ajVar3.f51223a &= -65;
                    }
                    hVar.f298772a.mergeFrom(ajVar);
                    C17873ac acVar3 = hVar.f298772a;
                    pVar.copyOnWrite();
                    C17881ak akVar2 = (C17881ak) pVar.instance;
                    C17880aj ajVar4 = (C17880aj) acVar3.build();
                    ajVar4.getClass();
                    akVar2.f51235c = ajVar4;
                    akVar2.f51233a |= 2;
                }
                if ((akVar.f51233a & 1) != 0) {
                    C17873ac acVar4 = hVar.f298772a;
                    pVar.copyOnWrite();
                    C17881ak akVar3 = (C17881ak) pVar.instance;
                    C17880aj ajVar5 = (C17880aj) acVar4.build();
                    ajVar5.getClass();
                    akVar3.f51235c = ajVar5;
                    akVar3.f51233a |= 2;
                    C119533b bVar = hVar.f298776e.f298796s;
                    C119532a aVar = C119532a.MAESTRO;
                    String str = hVar.f298773b;
                    C17920v vVar = akVar.f51234b;
                    if (vVar == null) {
                        vVar = C17920v.f51335j;
                    }
                    if (1 == (vVar.f51337a & 1)) {
                        z = true;
                    }
                    bVar.mo104419b(aVar, str, z);
                }
                C107359j jVar2 = hVar.f298776e;
                C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
                alVar.copyOnWrite();
                C17883am amVar = (C17883am) alVar.instance;
                C17881ak akVar4 = (C17881ak) pVar.build();
                akVar4.getClass();
                amVar.f51246c = akVar4;
                amVar.f51245b = 3;
                String str2 = hVar.f298773b;
                alVar.copyOnWrite();
                C17883am amVar2 = (C17883am) alVar.instance;
                str2.getClass();
                amVar2.f51244a = 1 | amVar2.f51244a;
                amVar2.f51247d = str2;
                jVar2.mo95978g((C17883am) alVar.build());
            } catch (C62974ct unused) {
                C59104x d = C107359j.f298778a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
                ((C59052c) ((C59052c) d).mo56372aa(23719)).mo56386p("Failed to parse bytes to AppIntegrationServiceProto");
            }
        } else {
            C59104x b2 = C107359j.f298778a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) b2).mo56372aa(23715)).mo56386p("sendData is called while binder is being closed");
        }
    }
}
