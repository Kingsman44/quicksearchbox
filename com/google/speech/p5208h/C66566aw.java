package com.google.speech.p5208h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.h.aw */
/* compiled from: PG */
public final class C66566aw extends C62934bn implements C63001dt {
    public C66566aw() {
        super(C66567ax.f181069f);
    }

    /* renamed from: a */
    public final void mo59676a(Iterable iterable) {
        copyOnWrite();
        C66567ax axVar = (C66567ax) this.instance;
        C66567ax axVar2 = C66567ax.f181069f;
        C62971cq cqVar = axVar.f181074c;
        if (!cqVar.mo58948c()) {
            axVar.f181074c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) axVar.f181074c);
    }

    /* renamed from: b */
    public final void mo59677b(Iterable iterable) {
        copyOnWrite();
        C66567ax axVar = (C66567ax) this.instance;
        C66567ax axVar2 = C66567ax.f181069f;
        axVar.mo59679a();
        C62947c.addAll(iterable, (List) axVar.f181075d);
    }

    /* renamed from: c */
    public final void mo59678c(C66563at atVar) {
        copyOnWrite();
        C66567ax axVar = (C66567ax) this.instance;
        C66567ax axVar2 = C66567ax.f181069f;
        atVar.getClass();
        axVar.mo59679a();
        axVar.f181075d.add(atVar);
    }
}
