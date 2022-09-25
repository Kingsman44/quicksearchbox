package com.google.android.apps.search.assistant.verticals.p9880a.p9890f;

import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32493f;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65393l;
import com.google.protos.p4985f.p5048z.p5049a.p5050a.C65394m;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.f.f */
/* compiled from: PG */
public final /* synthetic */ class C130389f implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C130389f f357324a = new C130389f();

    private /* synthetic */ C130389f() {
    }

    public final Object apply(Object obj) {
        int i = C130390g.f357325a;
        C65393l lVar = (C65393l) C65394m.f177809b.createBuilder();
        C62971cq cqVar = ((C32493f) obj).f87071b;
        lVar.copyOnWrite();
        C65394m mVar = (C65394m) lVar.instance;
        C62971cq cqVar2 = mVar.f177811a;
        if (!cqVar2.mo58948c()) {
            mVar.f177811a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) mVar.f177811a);
        return (C65394m) lVar.build();
    }
}
