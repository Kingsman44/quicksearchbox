package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.aby */
/* compiled from: PG */
public final class aby extends C62934bn implements C63001dt {
    public aby() {
        super(acd.f128836g);
    }

    /* renamed from: a */
    public final void mo53348a(int i) {
        copyOnWrite();
        acd acd = (acd) this.instance;
        acd acd2 = acd.f128836g;
        C62961ch chVar = acd.f128842e;
        if (!chVar.mo58948c()) {
            acd.f128842e = C62942bv.mutableCopy(chVar);
        }
        acd.f128842e.mo58916g(i - 1);
    }
}
