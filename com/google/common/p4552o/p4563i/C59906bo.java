package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.i.bo */
/* compiled from: PG */
public final class C59906bo extends C62934bn implements C63001dt {
    public C59906bo() {
        super(C59915bx.f161935i);
    }

    /* renamed from: a */
    public final void mo57061a(int i) {
        copyOnWrite();
        C59915bx bxVar = (C59915bx) this.instance;
        C59915bx bxVar2 = C59915bx.f161935i;
        C62961ch chVar = bxVar.f161939c;
        if (!chVar.mo58948c()) {
            bxVar.f161939c = C62942bv.mutableCopy(chVar);
        }
        bxVar.f161939c.mo58916g(i);
    }
}
