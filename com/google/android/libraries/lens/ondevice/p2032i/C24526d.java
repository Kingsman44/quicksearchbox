package com.google.android.libraries.lens.ondevice.p2032i;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63228a;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63233f;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.ondevice.i.d */
/* compiled from: PG */
public final /* synthetic */ class C24526d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C24528f f67186a;

    public /* synthetic */ C24526d(C24528f fVar) {
        this.f67186a = fVar;
    }

    public final Object apply(Object obj) {
        C24528f fVar = this.f67186a;
        List list = (List) obj;
        C63228a aVar = (C63228a) C63233f.f170841d.createBuilder();
        boolean c = fVar.f67191d.mo29460c();
        aVar.copyOnWrite();
        C63233f fVar2 = (C63233f) aVar.instance;
        fVar2.f170843a |= 1;
        fVar2.f170844b = c;
        aVar.copyOnWrite();
        C63233f fVar3 = (C63233f) aVar.instance;
        C62971cq cqVar = fVar3.f170845c;
        if (!cqVar.mo58948c()) {
            fVar3.f170845c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) fVar3.f170845c);
        return (C63233f) aVar.build();
    }
}
