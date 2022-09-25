package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17882al;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17883am;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17912n;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17913o;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17918t;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17920v;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.t */
/* compiled from: PG */
public final /* synthetic */ class C107369t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107371v f298824a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f298825b;

    public /* synthetic */ C107369t(C107371v vVar, byte[] bArr) {
        this.f298824a = vVar;
        this.f298825b = bArr;
    }

    public final void run() {
        C107371v vVar = this.f298824a;
        byte[] bArr = this.f298825b;
        vVar.f298828a.f298835g.mo95994b();
        try {
            C17881ak akVar = (C17881ak) C62942bv.parseFrom((C62942bv) C17881ak.f51231h, bArr);
            boolean z = false;
            if (akVar.f51239g.size() != 0) {
                vVar.f298828a.f298838j.clear();
                for (int i = 0; i < akVar.f51239g.size(); i++) {
                    Set set = vVar.f298828a.f298838j;
                    C17918t a = C17918t.m35111a(akVar.f51239g.mo58914d(i));
                    if (a == null) {
                        a = C17918t.UNSPECIFIED;
                    }
                    set.add(a);
                }
            }
            if ((akVar.f51233a & 16) != 0) {
                C17913o oVar = akVar.f51238f;
                if (oVar == null) {
                    oVar = C17913o.f51320c;
                }
                int b = C17912n.m35110b(oVar.f51323b);
                if (b == 0) {
                    b = 1;
                }
                if (b - 1 == 100) {
                    C107372w wVar = vVar.f298828a;
                    wVar.f298835g.mo95993a(wVar);
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
                    C17873ac acVar = vVar.f298828a.f298839k;
                    acVar.copyOnWrite();
                    C17880aj ajVar2 = (C17880aj) acVar.instance;
                    ajVar2.f51226d = null;
                    ajVar2.f51223a &= -5;
                }
                if ((ajVar.f51223a & 64) != 0) {
                    C17873ac acVar2 = vVar.f298828a.f298839k;
                    acVar2.copyOnWrite();
                    C17880aj ajVar3 = (C17880aj) acVar2.instance;
                    ajVar3.f51230h = null;
                    ajVar3.f51223a &= -65;
                }
                vVar.f298828a.f298839k.mergeFrom(ajVar);
                C17873ac acVar3 = vVar.f298828a.f298839k;
                pVar.copyOnWrite();
                C17881ak akVar2 = (C17881ak) pVar.instance;
                C17880aj ajVar4 = (C17880aj) acVar3.build();
                ajVar4.getClass();
                akVar2.f51235c = ajVar4;
                akVar2.f51233a |= 2;
            }
            if ((akVar.f51233a & 1) != 0) {
                C17873ac acVar4 = vVar.f298828a.f298839k;
                pVar.copyOnWrite();
                C17881ak akVar3 = (C17881ak) pVar.instance;
                C17880aj ajVar5 = (C17880aj) acVar4.build();
                ajVar5.getClass();
                akVar3.f51235c = ajVar5;
                akVar3.f51233a |= 2;
                C119533b bVar = vVar.f298828a.f298836h;
                C119532a aVar = C119532a.MAESTRO;
                String str = vVar.f298828a.f298831c;
                C17920v vVar2 = akVar.f51234b;
                if (vVar2 == null) {
                    vVar2 = C17920v.f51335j;
                }
                if (1 == (vVar2.f51337a & 1)) {
                    z = true;
                }
                bVar.mo104419b(aVar, str, z);
            } else if (!vVar.f298828a.f298837i) {
                pVar.copyOnWrite();
                C17881ak akVar4 = (C17881ak) pVar.instance;
                akVar4.f51235c = null;
                akVar4.f51233a &= -3;
            }
            C107367r rVar = vVar.f298828a.f298833e;
            C17882al alVar = (C17882al) C17883am.f51242f.createBuilder();
            alVar.copyOnWrite();
            C17883am amVar = (C17883am) alVar.instance;
            C17881ak akVar5 = (C17881ak) pVar.build();
            akVar5.getClass();
            amVar.f51246c = akVar5;
            amVar.f51245b = 3;
            String str2 = vVar.f298828a.f298831c;
            alVar.copyOnWrite();
            C17883am amVar2 = (C17883am) alVar.instance;
            str2.getClass();
            amVar2.f51244a = 1 | amVar2.f51244a;
            amVar2.f51247d = str2;
            rVar.mo95987b((C17883am) alVar.build());
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) C107372w.f298829a.mo56226d()).mo56372aa(23758)).mo56386p("Failed to parse bytes to AppIntegrationServiceProto");
        }
    }
}
