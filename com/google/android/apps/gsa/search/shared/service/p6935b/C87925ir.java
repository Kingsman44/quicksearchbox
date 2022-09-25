package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ir */
/* compiled from: PG */
public final class C87925ir extends C62934bn implements C63001dt {
    public C87925ir() {
        super(C87928iu.f237839b);
    }

    /* renamed from: a */
    public final void mo81982a(C87926is isVar) {
        copyOnWrite();
        C87928iu iuVar = (C87928iu) this.instance;
        C87927it itVar = (C87927it) isVar.build();
        C87928iu iuVar2 = C87928iu.f237839b;
        itVar.getClass();
        C62971cq cqVar = iuVar.f237841a;
        if (!cqVar.mo58948c()) {
            iuVar.f237841a = C62942bv.mutableCopy(cqVar);
        }
        iuVar.f237841a.add(itVar);
    }
}
