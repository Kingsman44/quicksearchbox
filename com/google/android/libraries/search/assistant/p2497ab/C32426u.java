package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.ab.u */
/* compiled from: PG */
public final /* synthetic */ class C32426u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f86889a;

    /* renamed from: b */
    public final /* synthetic */ String f86890b;

    public /* synthetic */ C32426u(Map map, String str) {
        this.f86889a = map;
        this.f86890b = str;
    }

    public final Object apply(Object obj) {
        Map map = this.f86889a;
        String str = this.f86890b;
        List list = (List) Collection.EL.stream(C58485gu.m89836F(new C32385b(), (C58485gu) obj)).filter(C32422q.f86884a).filter(new C32423r(map)).map(new C32424s(map, str)).filter(C32421p.f86883a).distinct().collect(Collectors.toCollection(C32429x.f86893a));
        C32368aj ajVar = (C32368aj) C32369ak.f86776c.createBuilder();
        ajVar.copyOnWrite();
        C32369ak akVar = (C32369ak) ajVar.instance;
        C62971cq cqVar = akVar.f86778a;
        if (!cqVar.mo58948c()) {
            akVar.f86778a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) akVar.f86778a);
        return (C32369ak) ajVar.build();
    }
}
