package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.s.a.kp */
/* compiled from: PG */
public final class C53349kp extends C62934bn implements C63001dt {
    public C53349kp() {
        super(C53350kq.f139991e);
    }

    /* renamed from: a */
    public final void mo53979a(Iterable iterable) {
        copyOnWrite();
        C53350kq kqVar = (C53350kq) this.instance;
        C53350kq kqVar2 = C53350kq.f139991e;
        C62971cq cqVar = kqVar.f139994b;
        if (!cqVar.mo58948c()) {
            kqVar.f139994b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) kqVar.f139994b);
    }
}
