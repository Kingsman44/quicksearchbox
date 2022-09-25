package com.google.android.libraries.assistant.p1481f.p1483b;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.f.b.i */
/* compiled from: PG */
public final /* synthetic */ class C17954i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f51417a;

    public /* synthetic */ C17954i(List list) {
        this.f51417a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f51417a;
        C17952g gVar = (C17952g) ((C17953h) obj).toBuilder();
        gVar.copyOnWrite();
        ((C17953h) gVar.instance).f51416a = C17953h.emptyProtobufList();
        gVar.copyOnWrite();
        C17953h hVar = (C17953h) gVar.instance;
        C62971cq cqVar = hVar.f51416a;
        if (!cqVar.mo58948c()) {
            hVar.f51416a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) hVar.f51416a);
        return (C17953h) gVar.build();
    }
}
