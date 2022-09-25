package com.google.assistant.p4016z;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.z.az */
/* compiled from: PG */
public final class C53701az extends C62934bn implements C63001dt {
    public C53701az() {
        super(C53703ba.f140978d);
    }

    /* renamed from: a */
    public final void mo54006a(Iterable iterable) {
        copyOnWrite();
        C53703ba baVar = (C53703ba) this.instance;
        C53703ba baVar2 = C53703ba.f140978d;
        C62971cq cqVar = baVar.f140981b;
        if (!cqVar.mo58948c()) {
            baVar.f140981b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) baVar.f140981b);
    }
}
