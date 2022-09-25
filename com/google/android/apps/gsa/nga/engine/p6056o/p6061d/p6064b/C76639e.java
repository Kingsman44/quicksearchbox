package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6064b;

import com.google.assistant.p3825an.p3830c.p3831a.C49345v;
import com.google.assistant.p3825an.p3830c.p3831a.C49346w;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.b.e */
/* compiled from: PG */
public final /* synthetic */ class C76639e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C76639e f211899a = new C76639e();

    private /* synthetic */ C76639e() {
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C49345v vVar = (C49345v) C49346w.f127545b.createBuilder();
        vVar.copyOnWrite();
        C49346w wVar = (C49346w) vVar.instance;
        C62971cq cqVar = wVar.f127547a;
        if (!cqVar.mo58948c()) {
            wVar.f127547a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) wVar.f127547a);
        return (C49346w) vVar.build();
    }
}
