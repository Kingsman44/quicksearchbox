package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.apa */
/* compiled from: PG */
public final class C59590apa extends C62934bn implements C63001dt {
    public C59590apa() {
        super(apb.f159548e);
    }

    /* renamed from: a */
    public final void mo57030a(Iterable iterable) {
        copyOnWrite();
        apb apb = (apb) this.instance;
        apb apb2 = apb.f159548e;
        C62961ch chVar = apb.f159552c;
        if (!chVar.mo58948c()) {
            apb.f159552c = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) apb.f159552c);
    }
}
