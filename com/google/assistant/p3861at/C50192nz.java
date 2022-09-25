package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.at.nz */
/* compiled from: PG */
public final class C50192nz extends C62934bn implements C63001dt {
    public C50192nz() {
        super(C50194oa.f130485d);
    }

    /* renamed from: a */
    public final void mo53382a(C50183nq nqVar) {
        copyOnWrite();
        C50194oa oaVar = (C50194oa) this.instance;
        C50194oa oaVar2 = C50194oa.f130485d;
        nqVar.getClass();
        C62971cq cqVar = oaVar.f130487a;
        if (!cqVar.mo58948c()) {
            oaVar.f130487a = C62942bv.mutableCopy(cqVar);
        }
        oaVar.f130487a.add(nqVar);
    }
}
