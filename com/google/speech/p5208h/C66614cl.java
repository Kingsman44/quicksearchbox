package com.google.speech.p5208h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.h.cl */
/* compiled from: PG */
public final class C66614cl extends C62934bn implements C63001dt {
    public C66614cl() {
        super(C66615cm.f181220j);
    }

    /* renamed from: a */
    public final void mo59687a(Iterable iterable) {
        copyOnWrite();
        C66615cm cmVar = (C66615cm) this.instance;
        C66615cm cmVar2 = C66615cm.f181220j;
        cmVar.mo59692b();
        C62947c.addAll(iterable, (List) cmVar.f181227e);
    }

    /* renamed from: b */
    public final void mo59688b(Iterable iterable) {
        copyOnWrite();
        C66615cm cmVar = (C66615cm) this.instance;
        C66615cm cmVar2 = C66615cm.f181220j;
        cmVar.mo59691a();
        C62947c.addAll(iterable, (List) cmVar.f181224b);
    }

    /* renamed from: c */
    public final void mo59689c(C66592br brVar) {
        copyOnWrite();
        C66615cm cmVar = (C66615cm) this.instance;
        C66615cm cmVar2 = C66615cm.f181220j;
        brVar.getClass();
        cmVar.mo59691a();
        cmVar.f181224b.add(brVar);
    }

    /* renamed from: d */
    public final void mo59690d(C66595bu buVar) {
        copyOnWrite();
        C66615cm cmVar = (C66615cm) this.instance;
        C66615cm cmVar2 = C66615cm.f181220j;
        buVar.getClass();
        C62971cq cqVar = cmVar.f181225c;
        if (!cqVar.mo58948c()) {
            cmVar.f181225c = C62942bv.mutableCopy(cqVar);
        }
        cmVar.f181225c.add(buVar);
    }
}
