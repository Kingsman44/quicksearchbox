package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.j */
/* compiled from: PG */
public final /* synthetic */ class C123521j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123522k f341327a;

    public /* synthetic */ C123521j(C123522k kVar) {
        this.f341327a = kVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58485gu) obj).filter(new C123288f(this.f341327a)).collect(C58370cn.f155946a);
        C123529r rVar = (C123529r) C123530s.f341348b.createBuilder();
        rVar.copyOnWrite();
        C123530s sVar = (C123530s) rVar.instance;
        C62971cq cqVar = sVar.f341350a;
        if (!cqVar.mo58948c()) {
            sVar.f341350a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) sVar.f341350a);
        return (C123530s) rVar.build();
    }
}
