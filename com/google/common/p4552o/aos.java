package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.aos */
/* compiled from: PG */
public final class aos extends C62934bn implements C63001dt {
    public aos() {
        super(aov.f159510u);
    }

    /* renamed from: a */
    public final void mo57029a(Iterable iterable) {
        copyOnWrite();
        aov aov = (aov) this.instance;
        aov aov2 = aov.f159510u;
        C62961ch chVar = aov.f159515d;
        if (!chVar.mo58948c()) {
            aov.f159515d = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) aov.f159515d);
    }
}
