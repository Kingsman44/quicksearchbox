package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.p1219a.p1220a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.C15987a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1218c.C15992b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.c.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C15990c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f47396a;

    public /* synthetic */ C15990c(C58528ij ijVar) {
        this.f47396a = ijVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f47396a;
        C15992b bVar = (C15992b) obj;
        C15987a aVar = (C15987a) C15992b.f47400b.createBuilder();
        aVar.copyOnWrite();
        C15992b bVar2 = (C15992b) aVar.instance;
        C62971cq cqVar = bVar2.f47402a;
        if (!cqVar.mo58948c()) {
            bVar2.f47402a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) ijVar, (List) bVar2.f47402a);
        return (C15992b) aVar.build();
    }
}
