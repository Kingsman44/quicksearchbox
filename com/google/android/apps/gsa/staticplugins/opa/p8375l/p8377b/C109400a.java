package com.google.android.apps.gsa.staticplugins.opa.p8375l.p8377b;

import com.google.android.apps.gsa.assistant.shared.d.k;
import com.google.android.apps.gsa.assistant.shared.d.l;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.b.a */
/* compiled from: PG */
public final /* synthetic */ class C109400a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f304693a;

    public /* synthetic */ C109400a(List list) {
        this.f304693a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f304693a;
        k builder = ((l) obj).toBuilder();
        builder.copyOnWrite();
        builder.instance.b = C62942bv.emptyProtobufList();
        builder.copyOnWrite();
        l lVar = builder.instance;
        C62971cq cqVar = lVar.b;
        if (!cqVar.mo58948c()) {
            lVar.b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) lVar.b);
        return builder.build();
    }
}
