package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50581c;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50582d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.f */
/* compiled from: PG */
public final /* synthetic */ class C76218f implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C76218f f211227a = new C76218f();

    private /* synthetic */ C76218f() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return Optional.empty();
        }
        C50581c cVar = (C50581c) C50582d.f131626e.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(guVar).flatMap(C76215c.f211224a).collect(C58370cn.f155946a);
        cVar.copyOnWrite();
        C50582d dVar = (C50582d) cVar.instance;
        C62971cq cqVar = dVar.f131628a;
        if (!cqVar.mo58948c()) {
            dVar.f131628a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dVar.f131628a);
        return Optional.m71637of((C50582d) cVar.build());
    }
}
