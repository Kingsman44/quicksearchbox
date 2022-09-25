package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83764g;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83765h;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.d */
/* compiled from: PG */
public final /* synthetic */ class C110879d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f308891a;

    public /* synthetic */ C110879d(List list) {
        this.f308891a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f308891a;
        C83764g gVar = (C83764g) ((C83765h) obj).toBuilder();
        gVar.copyOnWrite();
        ((C83765h) gVar.instance).f228312a = C83765h.emptyProtobufList();
        gVar.copyOnWrite();
        C83765h hVar = (C83765h) gVar.instance;
        C62971cq cqVar = hVar.f228312a;
        if (!cqVar.mo58948c()) {
            hVar.f228312a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) hVar.f228312a);
        return (C83765h) gVar.build();
    }
}
