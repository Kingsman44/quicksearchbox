package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b;

import com.google.android.apps.gsa.opa.smartspace.C83729aa;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83735ag;
import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83810z;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50853y;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.b.l */
/* compiled from: PG */
public final /* synthetic */ class C131277l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131278m f358935a;

    public /* synthetic */ C131277l(C131278m mVar) {
        this.f358935a = mVar;
    }

    public final Object apply(Object obj) {
        C50853y yVar;
        C131278m mVar = this.f358935a;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(C131266a.f358917a).filter(C131269d.f358920a).map(C131270e.f358921a).collect(C58370cn.f155946a);
        if (!mVar.f358941f) {
            ((C58970a) ((C58970a) mVar.f358936a.mo56224b()).mo56372aa(39185)).mo56386p("Combined card is disabled.");
            return guVar;
        } else if (guVar.size() != 2) {
            return guVar;
        } else {
            Optional findFirst = Collection.EL.stream(guVar).filter(C131272g.f358926a).findFirst();
            Optional findFirst2 = Collection.EL.stream(guVar).filter(C131273h.f358927a).findFirst();
            if (findFirst.isEmpty() || findFirst2.isEmpty()) {
                return guVar;
            }
            ((C58970a) ((C58970a) mVar.f358936a.mo56224b()).mo56372aa(39184)).mo56386p("Generating a combined card.");
            C83730ab abVar = (C83730ab) ((C83739ak) findFirst.get()).toBuilder();
            C50794cr crVar = C50794cr.AT_STORE_COMBINED_CARD;
            abVar.copyOnWrite();
            C83739ak akVar = (C83739ak) abVar.instance;
            akVar.f228239h = crVar.f132222T;
            akVar.f228232a |= 64;
            C83810z zVar = (C83810z) C83729aa.f228209e.createBuilder();
            C83738aj ajVar = ((C83739ak) findFirst2.get()).f228233b;
            if (ajVar == null) {
                ajVar = C83738aj.f228226c;
            }
            if (ajVar.f228228a == 10) {
                yVar = (C50853y) ajVar.f228229b;
            } else {
                yVar = C50853y.f132421c;
            }
            String str = yVar.f132424b;
            zVar.copyOnWrite();
            C83729aa aaVar = (C83729aa) zVar.instance;
            str.getClass();
            aaVar.f228211a |= 1;
            aaVar.f228212b = str;
            String str2 = ((C83739ak) findFirst2.get()).f228238g;
            zVar.copyOnWrite();
            C83729aa aaVar2 = (C83729aa) zVar.instance;
            str2.getClass();
            aaVar2.f228211a = 2 | aaVar2.f228211a;
            aaVar2.f228213c = str2;
            C83735ag agVar = (C83735ag) C83736ah.f228222c.createBuilder();
            C63088z zVar2 = ((C83739ak) findFirst2.get()).f228245n;
            agVar.copyOnWrite();
            C83736ah ahVar = (C83736ah) agVar.instance;
            zVar2.getClass();
            ahVar.f228224a = 3;
            ahVar.f228225b = zVar2;
            zVar.copyOnWrite();
            C83729aa aaVar3 = (C83729aa) zVar.instance;
            C83736ah ahVar2 = (C83736ah) agVar.build();
            ahVar2.getClass();
            aaVar3.f228214d = ahVar2;
            aaVar3.f228211a |= 4;
            abVar.copyOnWrite();
            C83739ak akVar2 = (C83739ak) abVar.instance;
            C83729aa aaVar4 = (C83729aa) zVar.build();
            aaVar4.getClass();
            C62971cq cqVar = akVar2.f228246o;
            if (!cqVar.mo58948c()) {
                akVar2.f228246o = C62942bv.mutableCopy(cqVar);
            }
            akVar2.f228246o.add(aaVar4);
            return C58485gu.m89846n((C83739ak) abVar.build());
        }
    }
}
