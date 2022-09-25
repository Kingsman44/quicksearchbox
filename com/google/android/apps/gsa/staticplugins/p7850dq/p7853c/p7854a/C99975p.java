package com.google.android.apps.gsa.staticplugins.p7850dq.p7853c.p7854a;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85334c;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85335d;
import com.google.android.libraries.p11016ak.C147621ab;
import com.google.android.libraries.p11016ak.C147631b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dq.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C99975p implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C99975p f279642a = new C99975p();

    private /* synthetic */ C99975p() {
    }

    public final Object apply(Object obj) {
        C147631b a = ((C147621ab) obj).mo124377a();
        C85334c cVar = (C85334c) C85335d.f231112d.createBuilder();
        C62971cq cqVar = a.f398467a;
        cVar.copyOnWrite();
        C85335d dVar = (C85335d) cVar.instance;
        C62971cq cqVar2 = dVar.f231115b;
        if (!cqVar2.mo58948c()) {
            dVar.f231115b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) dVar.f231115b);
        boolean z = a.f398468b;
        cVar.copyOnWrite();
        C85335d dVar2 = (C85335d) cVar.instance;
        dVar2.f231114a |= 1;
        dVar2.f231116c = z;
        return (C85335d) cVar.build();
    }
}
