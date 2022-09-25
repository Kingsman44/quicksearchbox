package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.pcp.m.x */
/* compiled from: PG */
public final class C18994x extends C62934bn implements C63001dt {
    public C18994x() {
        super(C18995y.f53366e);
    }

    /* renamed from: a */
    public final void mo24236a(Iterable iterable) {
        copyOnWrite();
        C18995y yVar = (C18995y) this.instance;
        C18995y yVar2 = C18995y.f53366e;
        C62971cq cqVar = yVar.f53371d;
        if (!cqVar.mo58948c()) {
            yVar.f53371d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) yVar.f53371d);
    }
}
