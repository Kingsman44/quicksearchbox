package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.i.a.k */
/* compiled from: PG */
public final class C51500k extends C62934bn implements C63001dt {
    public C51500k() {
        super(C51527l.f134273f);
    }

    /* renamed from: a */
    public final void mo53629a(C51473j jVar) {
        copyOnWrite();
        C51527l lVar = (C51527l) this.instance;
        C51527l lVar2 = C51527l.f134273f;
        jVar.getClass();
        lVar.mo53633a();
        lVar.f134276b.add(jVar);
    }

    /* renamed from: b */
    public final void mo53630b(Iterable iterable) {
        copyOnWrite();
        C51527l lVar = (C51527l) this.instance;
        C51527l lVar2 = C51527l.f134273f;
        lVar.mo53633a();
        C62947c.addAll(iterable, (List) lVar.f134276b);
    }

    /* renamed from: c */
    public final void mo53631c(Iterable iterable) {
        copyOnWrite();
        C51527l lVar = (C51527l) this.instance;
        C51527l lVar2 = C51527l.f134273f;
        C62971cq cqVar = lVar.f134278d;
        if (!cqVar.mo58948c()) {
            lVar.f134278d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) lVar.f134278d);
    }
}
