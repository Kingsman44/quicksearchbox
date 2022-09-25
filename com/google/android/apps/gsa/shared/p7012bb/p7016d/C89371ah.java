package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import android.util.LruCache;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90087el;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.p4522b.C58373cq;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.ah */
/* compiled from: PG */
public final class C89371ah implements C90991b {

    /* renamed from: a */
    public final LruCache f242311a;

    public C89371ah(C90021c cVar) {
        this.f242311a = new LruCache((int) cVar.mo79743a(C90087el.f250533e));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C58373cq cqVar = new C58373cq(this.f242311a.snapshot().values(), C89370ag.f242310a);
        C59795fw fwVar = fVar.f254236a;
        fwVar.copyOnWrite();
        C59796fx fxVar = C59796fx.f161580r;
        ((C59796fx) fwVar.instance).f161592k = C59796fx.emptyProtobufList();
        fwVar.copyOnWrite();
        C59796fx fxVar2 = (C59796fx) fwVar.instance;
        C62971cq cqVar2 = fxVar2.f161592k;
        if (!cqVar2.mo58948c()) {
            fxVar2.f161592k = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) fxVar2.f161592k);
    }
}
