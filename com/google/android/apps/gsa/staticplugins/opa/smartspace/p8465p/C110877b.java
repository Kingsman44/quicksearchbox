package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83770m;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83771n;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.b */
/* compiled from: PG */
public final /* synthetic */ class C110877b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f308889a;

    public /* synthetic */ C110877b(List list) {
        this.f308889a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f308889a;
        C83770m mVar = (C83770m) ((C83771n) obj).toBuilder();
        mVar.copyOnWrite();
        ((C83771n) mVar.instance).f228326a = C83771n.emptyProtobufList();
        mVar.copyOnWrite();
        C83771n nVar = (C83771n) mVar.instance;
        C62971cq cqVar = nVar.f228326a;
        if (!cqVar.mo58948c()) {
            nVar.f228326a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) nVar.f228326a);
        return (C83771n) mVar.build();
    }
}
