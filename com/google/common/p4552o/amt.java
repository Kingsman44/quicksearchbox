package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.amt */
/* compiled from: PG */
public final class amt extends C62934bn implements C63001dt {
    public amt() {
        super(apd.f159555aA);
    }

    /* renamed from: a */
    public final void mo57025a(Iterable iterable) {
        copyOnWrite();
        apd apd = (apd) this.instance;
        apd apd2 = apd.f159555aA;
        C62971cq cqVar = apd.f159587ad;
        if (!cqVar.mo58948c()) {
            apd.f159587ad = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) apd.f159587ad);
    }

    /* renamed from: b */
    public final void mo57026b(aov aov) {
        copyOnWrite();
        apd apd = (apd) this.instance;
        apd apd2 = apd.f159555aA;
        aov.getClass();
        apd.mo57031a();
        apd.f159620l.add(aov);
    }
}
