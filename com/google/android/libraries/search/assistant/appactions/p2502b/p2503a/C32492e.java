package com.google.android.libraries.search.assistant.appactions.p2502b.p2503a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.appactions.b.a.e */
/* compiled from: PG */
public final class C32492e extends C62934bn implements C63001dt {
    public C32492e() {
        super(C32493f.f87067d);
    }

    /* renamed from: a */
    public final void mo38111a(Iterable iterable) {
        copyOnWrite();
        C32493f fVar = (C32493f) this.instance;
        C32493f fVar2 = C32493f.f87067d;
        C62971cq cqVar = fVar.f87071b;
        if (!cqVar.mo58948c()) {
            fVar.f87071b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f87071b);
    }
}
