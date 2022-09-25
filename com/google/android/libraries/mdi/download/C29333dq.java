package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.dq */
/* compiled from: PG */
public final class C29333dq extends C62934bn implements C63001dt {
    public C29333dq() {
        super(C29334dr.f79497w);
    }

    /* renamed from: a */
    public final void mo34654a(Iterable iterable) {
        copyOnWrite();
        C29334dr drVar = (C29334dr) this.instance;
        C29334dr drVar2 = C29334dr.f79497w;
        C62971cq cqVar = drVar.f79512n;
        if (!cqVar.mo58948c()) {
            drVar.f79512n = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) drVar.f79512n);
    }
}
