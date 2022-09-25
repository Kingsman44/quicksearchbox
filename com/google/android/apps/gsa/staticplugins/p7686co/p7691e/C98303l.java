package com.google.android.apps.gsa.staticplugins.p7686co.p7691e;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58817ah;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.p375ai.p378b.C7669fo;
import com.google.p4283bv.p4354e.C57526k;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.e.l */
/* compiled from: PG */
public final class C98303l {

    /* renamed from: a */
    public final C42876ab f274410a;

    /* renamed from: b */
    public final C118827a f274411b;

    /* renamed from: c */
    public final C58881cr f274412c = C58886cw.m90973a(new C98299h(this));

    /* renamed from: d */
    public final C58881cr f274413d = C58886cw.m90973a(new C98300i(this));

    /* renamed from: e */
    public final C58881cr f274414e = C58886cw.m90973a(new C98301j(this));

    /* renamed from: f */
    public final C58881cr f274415f = C58886cw.m90973a(new C98302k(this));

    public C98303l(C42876ab abVar, C118827a aVar) {
        this.f274410a = abVar;
        this.f274411b = aVar;
    }

    /* renamed from: a */
    public static C98307p m162846a(C57526k kVar, C98307p pVar, C58817ah ahVar) {
        long j;
        C98304m mVar;
        ArrayList arrayList = new ArrayList(pVar.f274425a);
        C7669fo foVar = kVar.f153661a;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        if ((foVar.f26635a & 4) != 0) {
            C7669fo foVar2 = kVar.f153661a;
            if (foVar2 == null) {
                foVar2 = C7669fo.f26633e;
            }
            j = foVar2.f26638d;
        } else {
            j = C90734ar.m148198a(kVar.toByteArray());
        }
        C98305n nVar = (C98305n) Collection.EL.stream(arrayList).filter(new C98294c(j)).findFirst().orElse(null);
        if (nVar != null) {
            arrayList.remove(nVar);
            mVar = (C98304m) nVar.toBuilder();
        } else {
            mVar = (C98304m) C98305n.f274416f.createBuilder();
            mVar.copyOnWrite();
            C98305n nVar2 = (C98305n) mVar.instance;
            nVar2.f274418a |= 1;
            nVar2.f274419b = j;
        }
        C98304m mVar2 = (C98304m) ahVar.apply(mVar);
        arrayList.add(0, (C98305n) mVar.build());
        while (arrayList.size() > 4) {
            arrayList.remove(arrayList.size() - 1);
        }
        C98306o oVar = (C98306o) pVar.toBuilder();
        oVar.copyOnWrite();
        ((C98307p) oVar.instance).f274425a = C98307p.emptyProtobufList();
        oVar.copyOnWrite();
        C98307p pVar2 = (C98307p) oVar.instance;
        C62971cq cqVar = pVar2.f274425a;
        if (!cqVar.mo58948c()) {
            pVar2.f274425a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) pVar2.f274425a);
        return (C98307p) oVar.build();
    }
}
