package com.google.android.apps.search.assistant.verticals.reminders.p10075b;

import com.google.assistant.p3863av.p3875f.C50570c;
import com.google.assistant.p3863av.p3875f.C50571d;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.b.a */
/* compiled from: PG */
public final /* synthetic */ class C132541a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C132541a f361718a = new C132541a();

    private /* synthetic */ C132541a() {
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        int i = C132542b.f361719a;
        C50570c cVar = (C50570c) C50571d.f131608b.createBuilder();
        cVar.copyOnWrite();
        C50571d dVar = (C50571d) cVar.instance;
        C62971cq cqVar = dVar.f131610a;
        if (!cqVar.mo58948c()) {
            dVar.f131610a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) dVar.f131610a);
        return (C50571d) cVar.build();
    }
}
