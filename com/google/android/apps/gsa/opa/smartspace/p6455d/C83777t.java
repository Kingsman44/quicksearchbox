package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.t */
/* compiled from: PG */
public final class C83777t extends C62934bn implements C63001dt {
    public C83777t() {
        super(C83778u.f228339k);
    }

    /* renamed from: a */
    public final void mo77098a(Iterable iterable) {
        copyOnWrite();
        C83778u uVar = (C83778u) this.instance;
        C83778u uVar2 = C83778u.f228339k;
        C62971cq cqVar = uVar.f228344d;
        if (!cqVar.mo58948c()) {
            uVar.f228344d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) uVar.f228344d);
    }
}
