package com.google.android.libraries.search.assistant.proactive.p2774f;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.proactive.f.g */
/* compiled from: PG */
public final class C36268g extends C62934bn implements C63001dt {
    public C36268g() {
        super(C36269h.f94733k);
    }

    /* renamed from: a */
    public final void mo40075a(Iterable iterable) {
        copyOnWrite();
        C36269h hVar = (C36269h) this.instance;
        C36269h hVar2 = C36269h.f94733k;
        C62971cq cqVar = hVar.f94736b;
        if (!cqVar.mo58948c()) {
            hVar.f94736b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hVar.f94736b);
    }
}
