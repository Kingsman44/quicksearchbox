package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.x */
/* compiled from: PG */
final class C135204x implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C135135ag f368295a;

    public C135204x(C135135ag agVar) {
        this.f368295a = agVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C135133ae aeVar = (C135133ae) obj;
        C69664n.m101060f(aeVar, "data");
        C135135ag agVar = this.f368295a;
        C62934bn builder = aeVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C135132ad adVar = (C135132ad) builder;
        C69664n.m101061g(adVar, "builder");
        List N = C69540x.m100832N(C69540x.m100839U(C135131ac.m219164a(adVar), 9), agVar);
        C135131ac.m219164a(adVar);
        adVar.copyOnWrite();
        ((C135133ae) adVar.instance).f368061a = C135133ae.emptyProtobufList();
        C135131ac.m219164a(adVar);
        C69664n.m101061g(N, "values");
        adVar.copyOnWrite();
        C135133ae aeVar2 = (C135133ae) adVar.instance;
        C62971cq cqVar = aeVar2.f368061a;
        if (!cqVar.mo58948c()) {
            aeVar2.f368061a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) N, (List) aeVar2.f368061a);
        C62942bv build = adVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C135133ae) build;
    }
}
