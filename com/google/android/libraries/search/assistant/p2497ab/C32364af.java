package com.google.android.libraries.search.assistant.p2497ab;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.search.assistant.ab.af */
/* compiled from: PG */
public final class C32364af extends C62934bn implements C63001dt {
    public C32364af() {
        super(C32365ag.f86758h);
    }

    /* renamed from: a */
    public final void mo38050a(String str) {
        copyOnWrite();
        C32365ag agVar = (C32365ag) this.instance;
        C32365ag agVar2 = C32365ag.f86758h;
        str.getClass();
        C62971cq cqVar = agVar.f86764e;
        if (!cqVar.mo58948c()) {
            agVar.f86764e = C62942bv.mutableCopy(cqVar);
        }
        agVar.f86764e.add(str);
    }
}
