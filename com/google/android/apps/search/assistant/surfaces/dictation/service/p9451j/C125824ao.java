package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119268ad;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119269ae;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58373cq;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.ao */
/* compiled from: PG */
public final /* synthetic */ class C125824ao implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C125824ao f346750a = new C125824ao();

    private /* synthetic */ C125824ao() {
    }

    public final Object apply(Object obj) {
        C119268ad adVar = (C119268ad) C119269ae.f332610b.createBuilder();
        C58373cq cqVar = new C58373cq((Set) obj, C125815af.f346739a);
        adVar.copyOnWrite();
        C119269ae aeVar = (C119269ae) adVar.instance;
        C62971cq cqVar2 = aeVar.f332612a;
        if (!cqVar2.mo58948c()) {
            aeVar.f332612a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) aeVar.f332612a);
        return (C119269ae) adVar.build();
    }
}
