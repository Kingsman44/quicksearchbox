package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48627bp;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48630bs;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.e */
/* compiled from: PG */
public final /* synthetic */ class C111119e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111122h f309370a;

    public /* synthetic */ C111119e(C111122h hVar) {
        this.f309370a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111122h hVar = this.f309370a;
        List list = (List) Collection.EL.stream((C58485gu) obj).filter(C111120f.f309371a).map(C111121g.f309372a).collect(Collectors.toList());
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        C48627bp bpVar = (C48627bp) C48630bs.f125672b.createBuilder();
        bpVar.copyOnWrite();
        C48630bs bsVar = (C48630bs) bpVar.instance;
        C62971cq cqVar = bsVar.f125674a;
        if (!cqVar.mo58948c()) {
            bsVar.f125674a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) bsVar.f125674a);
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        C48630bs bsVar2 = (C48630bs) bpVar.build();
        bsVar2.getClass();
        bxVar.f125707b = bsVar2;
        bxVar.f125706a = 7;
        long b = hVar.f309373a.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return (C48635bx) bvVar.build();
    }
}
