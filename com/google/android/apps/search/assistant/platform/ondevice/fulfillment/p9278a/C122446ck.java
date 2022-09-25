package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ck */
/* compiled from: PG */
public final class C122446ck extends C62934bn implements C63001dt {
    public C122446ck() {
        super(C122448cm.f339454i);
    }

    /* renamed from: a */
    public final void mo105627a(Iterable iterable) {
        copyOnWrite();
        C122448cm cmVar = (C122448cm) this.instance;
        C122448cm cmVar2 = C122448cm.f339454i;
        C62971cq cqVar = cmVar.f339457b;
        if (!cqVar.mo58948c()) {
            cmVar.f339457b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cmVar.f339457b);
    }

    /* renamed from: b */
    public final void mo105628b(Iterable iterable) {
        copyOnWrite();
        C122448cm cmVar = (C122448cm) this.instance;
        C122448cm cmVar2 = C122448cm.f339454i;
        C62971cq cqVar = cmVar.f339458c;
        if (!cqVar.mo58948c()) {
            cmVar.f339458c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cmVar.f339458c);
    }
}
