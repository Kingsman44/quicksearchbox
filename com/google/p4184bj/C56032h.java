package com.google.p4184bj;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.bj.h */
/* compiled from: PG */
public final class C56032h extends C62936bp implements C62938br {
    public C56032h() {
        super(C56036l.f149228f);
    }

    /* renamed from: a */
    public final void mo54315a(Iterable iterable) {
        copyOnWrite();
        C56036l lVar = (C56036l) this.instance;
        C56036l lVar2 = C56036l.f149228f;
        C62971cq cqVar = lVar.f149231b;
        if (!cqVar.mo58948c()) {
            lVar.f149231b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) lVar.f149231b);
    }
}
