package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.i.aq */
/* compiled from: PG */
public final class C59881aq extends C62934bn implements C63001dt {
    public C59881aq() {
        super(C59883as.f161820b);
    }

    /* renamed from: a */
    public final void mo57060a(int i) {
        copyOnWrite();
        C59883as asVar = (C59883as) this.instance;
        C59883as asVar2 = C59883as.f161820b;
        C62961ch chVar = asVar.f161822a;
        if (!chVar.mo58948c()) {
            asVar.f161822a = C62942bv.mutableCopy(chVar);
        }
        asVar.f161822a.mo58916g(i - 1);
    }
}
