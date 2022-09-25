package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.i.a.nl */
/* compiled from: PG */
public final class C51593nl extends C62934bn implements C63001dt {
    public C51593nl() {
        super(C51594nm.f134474f);
    }

    /* renamed from: a */
    public final void mo53647a(Iterable iterable) {
        copyOnWrite();
        C51594nm nmVar = (C51594nm) this.instance;
        C51594nm nmVar2 = C51594nm.f134474f;
        C62971cq cqVar = nmVar.f134479d;
        if (!cqVar.mo58948c()) {
            nmVar.f134479d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) nmVar.f134479d);
    }

    /* renamed from: b */
    public final void mo53648b(Iterable iterable) {
        copyOnWrite();
        C51594nm nmVar = (C51594nm) this.instance;
        C51594nm nmVar2 = C51594nm.f134474f;
        nmVar.mo53651a();
        C62947c.addAll(iterable, (List) nmVar.f134477b);
    }

    /* renamed from: c */
    public final void mo53649c(C51588ng ngVar) {
        copyOnWrite();
        C51594nm nmVar = (C51594nm) this.instance;
        C51592nk nkVar = (C51592nk) ngVar.build();
        C51594nm nmVar2 = C51594nm.f134474f;
        nkVar.getClass();
        nmVar.mo53651a();
        nmVar.f134477b.add(nkVar);
    }

    /* renamed from: d */
    public final void mo53650d(C51592nk nkVar) {
        copyOnWrite();
        C51594nm nmVar = (C51594nm) this.instance;
        C51594nm nmVar2 = C51594nm.f134474f;
        nkVar.getClass();
        nmVar.mo53651a();
        nmVar.f134477b.add(nkVar);
    }
}
