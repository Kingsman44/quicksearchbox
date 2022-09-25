package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.b.a */
/* compiled from: PG */
public final class C15471a extends C62936bp implements C62938br {
    public C15471a() {
        super(C15474b.f46404j);
    }

    /* renamed from: a */
    public final void mo22359a(Iterable iterable) {
        copyOnWrite();
        C15474b bVar = (C15474b) this.instance;
        C15474b bVar2 = C15474b.f46404j;
        C62971cq cqVar = bVar.f46409d;
        if (!cqVar.mo58948c()) {
            bVar.f46409d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bVar.f46409d);
    }
}
