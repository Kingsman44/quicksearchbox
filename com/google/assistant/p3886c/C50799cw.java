package com.google.assistant.p3886c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.c.cw */
/* compiled from: PG */
public final class C50799cw extends C62934bn implements C63001dt {
    public C50799cw() {
        super(C50800cx.f132233b);
    }

    /* renamed from: a */
    public final void mo53463a(C50798cv cvVar) {
        copyOnWrite();
        C50800cx cxVar = (C50800cx) this.instance;
        C50800cx cxVar2 = C50800cx.f132233b;
        cvVar.getClass();
        C62971cq cqVar = cxVar.f132235a;
        if (!cqVar.mo58948c()) {
            cxVar.f132235a = C62942bv.mutableCopy(cqVar);
        }
        cxVar.f132235a.add(cvVar);
    }
}
