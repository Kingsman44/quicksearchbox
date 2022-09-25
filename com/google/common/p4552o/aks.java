package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.aks */
/* compiled from: PG */
public final class aks extends C62934bn implements C63001dt {
    public aks() {
        super(akt.f158984b);
    }

    /* renamed from: a */
    public final void mo57017a(int i) {
        copyOnWrite();
        akt akt = (akt) this.instance;
        akt akt2 = akt.f158984b;
        C62961ch chVar = akt.f158986a;
        if (!chVar.mo58948c()) {
            akt.f158986a = C62942bv.mutableCopy(chVar);
        }
        akt.f158986a.mo58916g(i - 1);
    }
}
