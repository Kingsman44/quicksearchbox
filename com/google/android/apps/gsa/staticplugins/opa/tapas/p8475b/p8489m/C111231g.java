package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8489m;

import com.google.android.libraries.places.api.p2437b.C31862r;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48614bc;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48615bd;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.m.g */
/* compiled from: PG */
public final /* synthetic */ class C111231g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C111233i f309539a;

    public /* synthetic */ C111231g(C111233i iVar) {
        this.f309539a = iVar;
    }

    public final Object apply(Object obj) {
        long b = this.f309539a.f309542b.mo26870b();
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        C48614bc bcVar = (C48614bc) C48615bd.f125633b.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(((C31862r) obj).mo37443a()).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C111229e.f309537a))).map(new C111230f(b)).collect(C58370cn.f155946a);
        bcVar.copyOnWrite();
        C48615bd bdVar = (C48615bd) bcVar.instance;
        C62971cq cqVar = bdVar.f125635a;
        if (!cqVar.mo58948c()) {
            bdVar.f125635a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bdVar.f125635a);
        C48615bd bdVar2 = (C48615bd) bcVar.build();
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        bdVar2.getClass();
        bxVar.f125707b = bdVar2;
        bxVar.f125706a = 11;
        return (C48635bx) bvVar.build();
    }
}
