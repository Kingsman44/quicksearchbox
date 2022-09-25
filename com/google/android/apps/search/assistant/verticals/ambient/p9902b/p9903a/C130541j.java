package com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9903a;

import com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9904b.C130546a;
import com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9904b.C130547b;
import com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9904b.C130548c;
import com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9904b.C130550e;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C130541j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f357590a;

    public /* synthetic */ C130541j(C58485gu guVar) {
        this.f357590a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f357590a;
        C130550e eVar = (C130550e) obj;
        if (guVar.isEmpty()) {
            C130548c cVar = (C130548c) eVar.toBuilder();
            cVar.copyOnWrite();
            ((C130550e) cVar.instance).mo109723a().remove(1);
            return (C130550e) cVar.build();
        }
        C130546a aVar = (C130546a) C130547b.f357600b.createBuilder();
        aVar.copyOnWrite();
        C130547b bVar = (C130547b) aVar.instance;
        C62971cq cqVar = bVar.f357602a;
        if (!cqVar.mo58948c()) {
            bVar.f357602a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) bVar.f357602a);
        C130547b bVar2 = (C130547b) aVar.build();
        C130548c cVar2 = (C130548c) eVar.toBuilder();
        bVar2.getClass();
        cVar2.copyOnWrite();
        ((C130550e) cVar2.instance).mo109723a().put(1, bVar2);
        return (C130550e) cVar2.build();
    }
}
