package com.google.android.libraries.p590as.p611d.p613b.p614a.p615a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.as.d.b.a.a.b */
/* compiled from: PG */
public final class C10975b extends C62934bn implements C63001dt {
    public C10975b() {
        super(C10976c.f36107e);
    }

    /* renamed from: a */
    public final void mo19351a(Iterable iterable) {
        copyOnWrite();
        C10976c cVar = (C10976c) this.instance;
        C10976c cVar2 = C10976c.f36107e;
        C62971cq cqVar = cVar.f36112d;
        if (!cqVar.mo58948c()) {
            cVar.f36112d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cVar.f36112d);
    }
}
