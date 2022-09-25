package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9173a.p9174a;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9173a.C121190d;
import com.google.android.libraries.assistant.p1594s.p1597b.p1598a.C19133a;
import com.google.android.libraries.assistant.p1594s.p1597b.p1598a.C19138f;
import com.google.android.libraries.assistant.p1594s.p1597b.p1598a.C19139g;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.a.a.a */
/* compiled from: PG */
public final class C121186a extends C19133a {

    /* renamed from: a */
    private final C121190d f336694a;

    public C121186a(C121190d dVar) {
        this.f336694a = dVar;
    }

    /* renamed from: b */
    public final void mo24296b(C70862aj ajVar) {
        C19138f fVar = (C19138f) C19139g.f53609b.createBuilder();
        C58485gu e = this.f336694a.mo105077e();
        fVar.copyOnWrite();
        C19139g gVar = (C19139g) fVar.instance;
        C62971cq cqVar = gVar.f53611a;
        if (!cqVar.mo58948c()) {
            gVar.f53611a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) e, (List) gVar.f53611a);
        ajVar.mo20123c((C19139g) fVar.build());
        ajVar.mo20121a();
    }
}
