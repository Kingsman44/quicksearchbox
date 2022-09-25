package com.google.android.apps.search.weather.suggestions.p10696c;

import com.google.android.apps.search.weather.suggestions.p10697d.C142144c;
import com.google.android.apps.search.weather.suggestions.p10697d.C142145d;
import com.google.common.base.C58817ah;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.weather.suggestions.c.e */
/* compiled from: PG */
public final /* synthetic */ class C142139e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C142139e f385595a = new C142139e();

    private /* synthetic */ C142139e() {
    }

    public final Object apply(Object obj) {
        List list = (List) Collection.EL.stream(((C54229ar) obj).f142355b).map(C142136b.f385592a).collect(Collectors.toCollection(C142137c.f385593a));
        C142144c cVar = (C142144c) C142145d.f385604b.createBuilder();
        cVar.copyOnWrite();
        C142145d dVar = (C142145d) cVar.instance;
        C62971cq cqVar = dVar.f385606a;
        if (!cqVar.mo58948c()) {
            dVar.f385606a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) dVar.f385606a);
        return (C142145d) cVar.build();
    }
}
