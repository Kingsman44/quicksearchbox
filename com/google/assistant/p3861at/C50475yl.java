package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.yl */
/* compiled from: PG */
public final class C50475yl extends C62934bn implements C63001dt {
    public C50475yl() {
        super(C50476ym.f131367b);
    }

    /* renamed from: a */
    public final void mo53400a(C50471yh yhVar) {
        copyOnWrite();
        C50476ym ymVar = (C50476ym) this.instance;
        C50472yi yiVar = (C50472yi) yhVar.build();
        C50476ym ymVar2 = C50476ym.f131367b;
        yiVar.getClass();
        C62971cq cqVar = ymVar.f131369a;
        if (!cqVar.mo58948c()) {
            ymVar.f131369a = C62942bv.mutableCopy(cqVar);
        }
        ymVar.f131369a.add(yiVar);
    }
}
