package com.google.android.libraries.assistant.auto.ondevice.utils.p715a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.a.c */
/* compiled from: PG */
public final class C11935c extends C62934bn implements C63001dt {
    public C11935c() {
        super(C11936d.f38336i);
    }

    /* renamed from: a */
    public final void mo20312a(Iterable iterable) {
        copyOnWrite();
        C11936d dVar = (C11936d) this.instance;
        C11936d dVar2 = C11936d.f38336i;
        C62971cq cqVar = dVar.f38344g;
        if (!cqVar.mo58948c()) {
            dVar.f38344g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dVar.f38344g);
    }

    /* renamed from: b */
    public final void mo20313b(Iterable iterable) {
        copyOnWrite();
        C11936d dVar = (C11936d) this.instance;
        C11936d dVar2 = C11936d.f38336i;
        C62971cq cqVar = dVar.f38343f;
        if (!cqVar.mo58948c()) {
            dVar.f38343f = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) dVar.f38343f);
    }
}
