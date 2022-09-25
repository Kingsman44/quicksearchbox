package com.google.android.apps.search.assistant.verticals.p10050e.p10051a;

import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50585g;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50586h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.e.a.c */
/* compiled from: PG */
public final /* synthetic */ class C132089c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C132089c f360473a = new C132089c();

    private /* synthetic */ C132089c() {
    }

    public final Object apply(Object obj) {
        int i = C132090d.f360474a;
        C50585g gVar = (C50585g) C50586h.f131635b.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream((C58485gu) obj).flatMap(C132087a.f360471a).collect(Collectors.toCollection(C132088b.f360472a));
        gVar.copyOnWrite();
        C50586h hVar = (C50586h) gVar.instance;
        C62971cq cqVar = hVar.f131637a;
        if (!cqVar.mo58948c()) {
            hVar.f131637a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hVar.f131637a);
        return (C50586h) gVar.build();
    }
}
