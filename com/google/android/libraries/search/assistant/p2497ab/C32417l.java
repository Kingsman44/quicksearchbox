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

/* renamed from: com.google.android.libraries.search.assistant.ab.l */
/* compiled from: PG */
public final /* synthetic */ class C32417l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f86877a;

    /* renamed from: b */
    public final /* synthetic */ String f86878b;

    public /* synthetic */ C32417l(Map map, String str) {
        this.f86877a = map;
        this.f86878b = str;
    }

    public final Object apply(Object obj) {
        Map map = this.f86877a;
        String str = this.f86878b;
        List list = (List) Collection.EL.stream(C58485gu.m89836F(new C32408c(), (C58485gu) obj)).filter(C32418m.f86879a).filter(new C32419n(map)).map(new C32420o(map, str)).filter(C32421p.f86883a).distinct().collect(Collectors.toCollection(C32429x.f86893a));
        C32368aj ajVar = (C32368aj) C32369ak.f86776c.createBuilder();
        ajVar.copyOnWrite();
        C32369ak akVar = (C32369ak) ajVar.instance;
        C62971cq cqVar = akVar.f86779b;
        if (!cqVar.mo58948c()) {
            akVar.f86779b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) akVar.f86779b);
        return (C32369ak) ajVar.build();
    }
}
