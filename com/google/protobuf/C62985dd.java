package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.dd */
/* compiled from: PG */
final class C62985dd extends C62986de {
    /* renamed from: a */
    public final List mo58971a(Object obj, long j) {
        C62971cq cqVar = (C62971cq) C63054fs.f170169a.mo59138p(obj, j);
        if (cqVar.mo58948c()) {
            return cqVar;
        }
        int size = cqVar.size();
        C62971cq e = cqVar.mo58798e(size == 0 ? 10 : size + size);
        C63054fs.f170169a.mo59141s(obj, j, e);
        return e;
    }

    /* renamed from: b */
    public final void mo58972b(Object obj, long j) {
        ((C62971cq) C63054fs.f170169a.mo59138p(obj, j)).mo58947b();
    }

    /* renamed from: c */
    public final void mo58973c(Object obj, Object obj2, long j) {
        C62971cq cqVar = (C62971cq) C63054fs.f170169a.mo59138p(obj, j);
        C62971cq cqVar2 = (C62971cq) C63054fs.f170169a.mo59138p(obj2, j);
        int size = cqVar.size();
        int size2 = cqVar2.size();
        if (size > 0 && size2 > 0) {
            if (!cqVar.mo58948c()) {
                cqVar = cqVar.mo58798e(size2 + size);
            }
            cqVar.addAll(cqVar2);
        }
        if (size > 0) {
            cqVar2 = cqVar;
        }
        C63054fs.f170169a.mo59141s(obj, j, cqVar2);
    }
}
