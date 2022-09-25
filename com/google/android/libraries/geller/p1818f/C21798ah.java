package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5131b.C65744ab;
import com.google.protos.p5129p.p5131b.C65856y;
import java.util.List;

/* renamed from: com.google.android.libraries.geller.f.ah */
/* compiled from: PG */
public final /* synthetic */ class C21798ah implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C21798ah f60129a = new C21798ah();

    private /* synthetic */ C21798ah() {
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        C65856y yVar = (C65856y) C65744ab.f178605b.createBuilder();
        yVar.copyOnWrite();
        C65744ab abVar = (C65744ab) yVar.instance;
        C62971cq cqVar = abVar.f178607a;
        if (!cqVar.mo58948c()) {
            abVar.f178607a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) abVar.f178607a);
        return (C65744ab) yVar.build();
    }
}
