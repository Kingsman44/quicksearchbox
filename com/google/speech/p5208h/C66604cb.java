package com.google.speech.p5208h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.h.cb */
/* compiled from: PG */
public final class C66604cb extends C62934bn implements C63001dt {
    public C66604cb() {
        super(C66605cc.f181187b);
    }

    /* renamed from: a */
    public final void mo59685a(Iterable iterable) {
        copyOnWrite();
        C66605cc ccVar = (C66605cc) this.instance;
        C66605cc ccVar2 = C66605cc.f181187b;
        C62961ch chVar = ccVar.f181190a;
        if (!chVar.mo58948c()) {
            ccVar.f181190a = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) ccVar.f181190a);
    }
}
