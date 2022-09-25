package com.google.lens.p4707j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.lens.j.bw */
/* compiled from: PG */
public final class C62446bw extends C62934bn implements C63001dt {
    public C62446bw() {
        super(C62447bx.f168624b);
    }

    /* renamed from: a */
    public final void mo58497a(Iterable iterable) {
        copyOnWrite();
        C62447bx bxVar = (C62447bx) this.instance;
        C62447bx bxVar2 = C62447bx.f168624b;
        C62960cg cgVar = bxVar.f168626a;
        if (!cgVar.mo58948c()) {
            bxVar.f168626a = C62942bv.mutableCopy(cgVar);
        }
        C62947c.addAll(iterable, (List) bxVar.f168626a);
    }
}
