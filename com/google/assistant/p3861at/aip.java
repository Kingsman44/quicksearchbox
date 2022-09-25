package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.assistant.at.aip */
/* compiled from: PG */
public final class aip extends C62934bn implements C63001dt {
    public aip() {
        super(aiu.f129431f);
    }

    /* renamed from: a */
    public final void mo53363a(Iterable iterable) {
        copyOnWrite();
        aiu aiu = (aiu) this.instance;
        aiu aiu2 = aiu.f129431f;
        C62961ch chVar = aiu.f129437e;
        if (!chVar.mo58948c()) {
            aiu.f129437e = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aiu.f129437e.mo58916g(((air) it.next()).f129426e);
        }
    }
}
