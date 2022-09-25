package com.google.android.apps.gsa.shared.util.debug.p7163a;

import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.h */
/* compiled from: PG */
public final class C91008h implements C90991b {

    /* renamed from: a */
    private final C90479a f254247a;

    public C91008h(C90479a aVar) {
        this.f254247a = aVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        List asList = Arrays.asList(this.f254247a.mo84236k());
        C59795fw fwVar = fVar.f254236a;
        fwVar.copyOnWrite();
        C59796fx fxVar = C59796fx.f161580r;
        ((C59796fx) fwVar.instance).f161585d = C62942bv.emptyProtobufList();
        List k = C58701ou.f156429a.mo55816k(asList);
        fwVar.copyOnWrite();
        C59796fx fxVar2 = (C59796fx) fwVar.instance;
        C62971cq cqVar = fxVar2.f161585d;
        if (!cqVar.mo58948c()) {
            fxVar2.f161585d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) k, (List) fxVar2.f161585d);
    }
}
