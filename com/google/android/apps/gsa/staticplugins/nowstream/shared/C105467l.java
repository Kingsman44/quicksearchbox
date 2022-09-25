package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90272a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91791ao;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91792ap;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1863e.C22801b;
import com.google.android.libraries.gsa.p1863e.C22803d;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.l */
/* compiled from: PG */
public final class C105467l {
    /* renamed from: a */
    public static C91792ap m175245a(C22803d dVar) {
        C8142xb a = C8142xb.m22954a(dVar.f62777e);
        if (a == null) {
            a = C8142xb.UNKNOWN_SURFACE;
        }
        C91791ao aoVar = (C91791ao) C91792ap.f255967i.createBuilder();
        boolean z = dVar.f62774b;
        aoVar.copyOnWrite();
        C91792ap apVar = (C91792ap) aoVar.instance;
        apVar.f255969a |= 1;
        apVar.f255970b = z;
        boolean z2 = dVar.f62776d;
        aoVar.copyOnWrite();
        C91792ap apVar2 = (C91792ap) aoVar.instance;
        apVar2.f255969a |= 4;
        apVar2.f255972d = z2;
        boolean z3 = dVar.f62775c;
        aoVar.copyOnWrite();
        C91792ap apVar3 = (C91792ap) aoVar.instance;
        apVar3.f255969a |= 64;
        apVar3.f255976h = z3;
        aoVar.copyOnWrite();
        C91792ap apVar4 = (C91792ap) aoVar.instance;
        apVar4.f255973e = a.f28649u;
        apVar4.f255969a |= 8;
        aoVar.copyOnWrite();
        C91792ap apVar5 = (C91792ap) aoVar.instance;
        apVar5.f255969a |= 2;
        apVar5.f255971c = true;
        if ((dVar.f62773a & 128) != 0) {
            C7669fo foVar = dVar.f62778f;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
            aoVar.copyOnWrite();
            C91792ap apVar6 = (C91792ap) aoVar.instance;
            foVar.getClass();
            apVar6.f255974f = foVar;
            apVar6.f255969a |= 32;
        }
        ArrayList arrayList = new ArrayList();
        for (C22801b bVar : dVar.f62779g) {
            C90272a aVar = (C90272a) C90273b.f252145d.createBuilder();
            C7718hj hjVar = bVar.f62768b;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            aVar.copyOnWrite();
            C90273b bVar2 = (C90273b) aVar.instance;
            hjVar.getClass();
            bVar2.f252148b = hjVar;
            bVar2.f252147a |= 1;
            C7681g a2 = C7681g.m22802a(bVar.f62769c);
            if (a2 == null) {
                a2 = C7681g.INVALID;
            }
            aVar.copyOnWrite();
            C90273b bVar3 = (C90273b) aVar.instance;
            bVar3.f252149c = a2.f26835cv;
            bVar3.f252147a |= 2;
            arrayList.add((C90273b) aVar.build());
        }
        if (!arrayList.isEmpty()) {
            aoVar.copyOnWrite();
            C91792ap apVar7 = (C91792ap) aoVar.instance;
            C62971cq cqVar = apVar7.f255975g;
            if (!cqVar.mo58948c()) {
                apVar7.f255975g = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) apVar7.f255975g);
        }
        return (C91792ap) aoVar.build();
    }

    /* renamed from: b */
    public static C22803d m175246b(ProtoParcelable protoParcelable) {
        C22803d dVar = (C22803d) C23245b.m43557b(protoParcelable, C22803d.f62771k.getParserForType(), C62921ba.m95368a(), true);
        dVar.getClass();
        return dVar;
    }
}
