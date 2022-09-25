package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.x */
/* compiled from: PG */
public final class C60630x extends C62934bn implements C63001dt {
    public C60630x() {
        super(C59573ac.f158248m);
    }

    /* renamed from: a */
    public final void mo57119a(int i) {
        copyOnWrite();
        C59573ac acVar = (C59573ac) this.instance;
        C59573ac acVar2 = C59573ac.f158248m;
        C62961ch chVar = acVar.f158258i;
        if (!chVar.mo58948c()) {
            acVar.f158258i = C62942bv.mutableCopy(chVar);
        }
        acVar.f158258i.mo58916g(i - 1);
    }
}
