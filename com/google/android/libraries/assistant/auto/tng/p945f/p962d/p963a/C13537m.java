package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.m */
/* compiled from: PG */
public final class C13537m extends C62934bn implements C63001dt {
    public C13537m() {
        super(C13543s.f41500j);
    }

    /* renamed from: a */
    public final void mo21156a(Iterable iterable) {
        copyOnWrite();
        C13543s sVar = (C13543s) this.instance;
        C62962ci ciVar = C13543s.f41497c;
        C62971cq cqVar = sVar.f41502a;
        if (!cqVar.mo58948c()) {
            sVar.f41502a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) sVar.f41502a);
    }

    /* renamed from: b */
    public final void mo21157b(C13538n nVar) {
        copyOnWrite();
        C13543s sVar = (C13543s) this.instance;
        C13539o oVar = (C13539o) nVar.build();
        C62962ci ciVar = C13543s.f41497c;
        oVar.getClass();
        C62971cq cqVar = sVar.f41507i;
        if (!cqVar.mo58948c()) {
            sVar.f41507i = C62942bv.mutableCopy(cqVar);
        }
        sVar.f41507i.add(oVar);
    }

    /* renamed from: c */
    public final void mo21158c(C13461c cVar) {
        copyOnWrite();
        C13543s sVar = (C13543s) this.instance;
        C62962ci ciVar = C13543s.f41497c;
        cVar.getClass();
        sVar.mo21160b();
        sVar.f41506g.mo58916g(cVar.getNumber());
    }
}
