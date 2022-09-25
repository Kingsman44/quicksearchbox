package com.google.assistant.p3745ab;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.ab.bo */
/* compiled from: PG */
public final class C48258bo extends C62934bn implements C63001dt {
    public C48258bo() {
        super(C48260bq.f124825o);
    }

    /* renamed from: a */
    public final void mo53150a(Iterable iterable) {
        copyOnWrite();
        C48260bq bqVar = (C48260bq) this.instance;
        C48260bq bqVar2 = C48260bq.f124825o;
        C62971cq cqVar = bqVar.f124838l;
        if (!cqVar.mo58948c()) {
            bqVar.f124838l = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bqVar.f124838l);
    }
}
