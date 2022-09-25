package com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.d.c.b */
/* compiled from: PG */
public final class C16867b extends C62934bn implements C63001dt {
    public C16867b() {
        super(C16868c.f49349j);
    }

    /* renamed from: a */
    public final void mo23064a(Iterable iterable) {
        copyOnWrite();
        C16868c cVar = (C16868c) this.instance;
        C16868c cVar2 = C16868c.f49349j;
        C62971cq cqVar = cVar.f49357g;
        if (!cqVar.mo58948c()) {
            cVar.f49357g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cVar.f49357g);
    }
}
