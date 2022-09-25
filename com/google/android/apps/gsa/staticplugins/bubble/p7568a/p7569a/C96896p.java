package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C96896p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f270879a;

    public /* synthetic */ C96896p(C58528ij ijVar) {
        this.f270879a = ijVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f270879a;
        C96874a aVar = (C96874a) ((C96882b) obj).toBuilder();
        aVar.copyOnWrite();
        ((C96882b) aVar.instance).f270858c = C96882b.emptyProtobufList();
        aVar.copyOnWrite();
        C96882b bVar = (C96882b) aVar.instance;
        C62971cq cqVar = bVar.f270858c;
        if (!cqVar.mo58948c()) {
            bVar.f270858c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) ijVar, (List) bVar.f270858c);
        return (C96882b) aVar.build();
    }
}
