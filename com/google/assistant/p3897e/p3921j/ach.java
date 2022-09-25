package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.e.j.ach */
/* compiled from: PG */
public final class ach extends C62934bn implements C63001dt {
    public ach() {
        super(aco.f134821t);
    }

    /* renamed from: a */
    public final void mo53672a(ack ack) {
        copyOnWrite();
        aco aco = (aco) this.instance;
        acl acl = (acl) ack.build();
        aco aco2 = aco.f134821t;
        acl.getClass();
        C62971cq cqVar = aco.f134840r;
        if (!cqVar.mo58948c()) {
            aco.f134840r = C62942bv.mutableCopy(cqVar);
        }
        aco.f134840r.add(acl);
    }
}
