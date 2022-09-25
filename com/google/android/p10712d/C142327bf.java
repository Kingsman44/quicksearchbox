package com.google.android.p10712d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.d.bf */
/* compiled from: PG */
public final class C142327bf extends C62934bn implements C63001dt {
    public C142327bf() {
        super(C142328bg.f386139f);
    }

    /* renamed from: a */
    public final void mo117125a(String str) {
        copyOnWrite();
        C142328bg bgVar = (C142328bg) this.instance;
        C142328bg bgVar2 = C142328bg.f386139f;
        str.getClass();
        C62971cq cqVar = bgVar.f386142b;
        if (!cqVar.mo58948c()) {
            bgVar.f386142b = C62942bv.mutableCopy(cqVar);
        }
        bgVar.f386142b.add(str);
    }
}
