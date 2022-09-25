package com.google.common.p4552o;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.common.o.aqp */
/* compiled from: PG */
public final class aqp extends C62936bp implements C62938br {
    public aqp() {
        super(aqs.f159780k);
    }

    /* renamed from: a */
    public final void mo57037a(int i) {
        copyOnWrite();
        aqs aqs = (aqs) this.instance;
        aqs aqs2 = aqs.f159780k;
        C62961ch chVar = aqs.f159785d;
        if (!chVar.mo58948c()) {
            aqs.f159785d = C62942bv.mutableCopy(chVar);
        }
        aqs.f159785d.mo58916g(i);
    }
}
