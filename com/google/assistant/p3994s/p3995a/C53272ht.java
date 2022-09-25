package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.s.a.ht */
/* compiled from: PG */
public final class C53272ht extends C62934bn implements C63001dt {
    public C53272ht() {
        super(C53274hv.f139676c);
    }

    /* renamed from: a */
    public final void mo53975a(Iterable iterable) {
        copyOnWrite();
        C53274hv hvVar = (C53274hv) this.instance;
        C53274hv hvVar2 = C53274hv.f139676c;
        C62971cq cqVar = hvVar.f139678a;
        if (!cqVar.mo58948c()) {
            hvVar.f139678a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hvVar.f139678a);
    }

    /* renamed from: b */
    public final void mo53976b(String str, int i) {
        str.getClass();
        copyOnWrite();
        C53274hv hvVar = (C53274hv) this.instance;
        C53274hv hvVar2 = C53274hv.f139676c;
        C62995dn dnVar = hvVar.f139679b;
        if (!dnVar.f170058b) {
            hvVar.f139679b = dnVar.mo58980a();
        }
        hvVar.f139679b.put(str, Integer.valueOf(i));
    }
}
