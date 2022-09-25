package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.r */
/* compiled from: PG */
public final class C83858r extends C62934bn implements C63001dt {
    public C83858r() {
        super(C83859s.f228499b);
    }

    /* renamed from: a */
    public final void mo77205a(Iterable iterable) {
        copyOnWrite();
        C83859s sVar = (C83859s) this.instance;
        C83859s sVar2 = C83859s.f228499b;
        C62971cq cqVar = sVar.f228501a;
        if (!cqVar.mo58948c()) {
            sVar.f228501a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) sVar.f228501a);
    }
}
